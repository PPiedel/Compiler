package main;

import main.ir_generator.IRGenerator;
import main.ir_generator.IRTemplate;
import org.antlr.v4.runtime.CommonTokenStream;
import util.Util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static main.ir_generator.IRTemplate.*;

public class Front {
    private static final String LL_FILE_NAME = "code.ll";
    private static final String INT = "int";
    private static final String FLOAT = "float";
    private static final String STRING = "String";
    private static final String INT_ARRAY = "INT_ARRAY";
    private static final String FLOAT_ARRAY = "FLOAT_ARRAY";

    private static int COUNTER = 1;
    private static Map<String, String> typesMemory = new HashMap<>();
    private static Map<String, Integer> addCounterMemory = new HashMap<>();
    private static Map<String, String> strings = new HashMap<>();
    private static Map<String, Array> arrays = new HashMap<>();


    public static class Program {
        List<Statement> statements = new ArrayList<Statement>();
        List<Function> functions = new ArrayList<Function>();

        public List<Statement> getStatements() {
            return statements;
        }

        public List<Function> getFunctions() {
            return functions;
        }
    }

    static public class Function {
        private final String name;
        List<String> m_arguments = new ArrayList<String>();
        Body body;
        String returnType;

        public Function(String name, String returnType) {
            this.name = name;
            this.returnType = returnType;
        }

        public void addArg(String name) {
            m_arguments.add(name);
        }

        public void setBody(Body b) {
            body = b;
        }

        public Body getBody() {
            return body;
        }

        public String getName() {
            return name;
        }

        public List<String> getM_arguments() {
            return m_arguments;
        }

        public String getReturnType() {
            return returnType;
        }

        @Override
        public String toString() {
            return "Function{" +
                    "name='" + name + '\'' +
                    ", m_arguments=" + m_arguments +
                    ", body=" + body +
                    ", returnType='" + returnType + '\'' +
                    '}';
        }
    }


    public static abstract class Statement {
        public abstract String getIRCode(String functionName);
    }

    public static class StatementExpression extends Statement {
        private final Expression expr;

        public StatementExpression(Expression expr) {
            this.expr = expr;
        }

        @Override
        public String toString() {
            return "StatementExpression{" +
                    "expr=" + expr +
                    '}';
        }

        @Override
        public String getIRCode(String functionName) {
            return expr.getIRCode();
        }
    }

    static abstract class Read extends Statement {

    }

    static class ReadInt extends Read {
        private final String reference;

        public ReadInt(String reference) {
            this.reference = reference;
        }

        @Override
        public String getIRCode(String functionName) {
            int counterState = COUNTER;
            String ir = String.format(READ_INT, counterState, reference);
            COUNTER += 1;
            return ir;
        }

        @Override
        public String toString() {
            return "ReadInt{" +
                    "reference='" + reference + '\'' +
                    '}';
        }
    }

    static class ReadFloat extends Read {
        private final String reference;

        public ReadFloat(String reference) {
            this.reference = reference;
        }

        @Override
        public String getIRCode(String functionName) {
            int counterState = COUNTER;
            String ir = String.format(READ_FLOAT, counterState, reference);
            COUNTER += 1;
            return ir;
        }

        @Override
        public String toString() {
            return "ReadFloat{" +
                    "reference='" + reference + '\'' +
                    '}';
        }
    }

    static abstract class PrintStatement extends Statement {

    }

    static abstract class ReturnStatement extends Statement {

    }

    static class ReturnInt extends ReturnStatement {
        private final String value;

        public ReturnInt(String value) {
            this.value = value;
        }

        @Override
        public String getIRCode(String functionName) {
            return String.format(RETURN_INT, Integer.parseInt(value));
        }

        @Override
        public String toString() {
            return "ReturnInt{" +
                    "value='" + value + '\'' +
                    '}';
        }
    }

    static class ReturnFloat extends ReturnStatement {
        private final String value;

        public ReturnFloat(String value) {
            this.value = value;
        }

        @Override
        public String getIRCode(String functionName) {
            return String.format(RETURN_FLOAT, Float.parseFloat(value));
        }

        @Override
        public String toString() {
            return "ReturnFloat{" +
                    "value='" + value + '\'' +
                    '}';
        }
    }

    public static class PrintIndex extends PrintStatement {
        private final String id;
        private final String index;

        public PrintIndex(String id, String index) {
            this.id = id;
            this.index = index;
        }

        @Override
        public String getIRCode(String functionName) {
            Array array = arrays.get(id);
            int size = Integer.parseInt(array.getSize());
            int index = Integer.parseInt(this.index);
            StringBuilder iR = new StringBuilder();
            int counterState = COUNTER;
            switch (typesMemory.get(id)) {
                case (INT_ARRAY): {
                    iR.append(String.format(PRINT_INT_INDEX, counterState, size, size, id, index, counterState + 1, counterState, counterState + 2, counterState + 1));
                    break;
                }
            }

            return iR.toString();
        }

        @Override
        public String toString() {
            return "PrintIndex{" +
                    "id='" + id + '\'' +
                    ", index='" + index + '\'' +
                    '}';
        }
    }

    static class PrintIDStatement extends PrintStatement {
        private final String id;

        public PrintIDStatement(String id) {
            this.id = id;
        }

        @Override
        public String getIRCode(String functionName) {
            StringBuilder iR = new StringBuilder();

            int counterState = COUNTER;

            switch (typesMemory.get(id)) {
                case (INT): {
                    iR.append(String.format(LOAD_INT_EXPRESSION, counterState, id));
                    iR.append(String.format(PRINT_INT_ID, COUNTER + 1, counterState));

                    break;
                }
                case (STRING): {
                    String value = strings.get(id);
                    iR.append(String.format(LOAD_STRING, counterState, value.length() + 1, value.length() + 1, id));
                    iR.append(String.format(PRINT_STRING_ID, COUNTER + 1, counterState));
                    break;
                }
            }



            COUNTER += 2;
            return iR.toString();
        }

        @Override
        public String toString() {
            return "PrintIDStatement{" +
                    "id='" + id + '\'' +
                    '}';
        }
    }

    static abstract class VariableDeclaration extends Statement {
        public abstract void addToMemory();
    }

    public static abstract class Array extends VariableDeclaration {
        protected final String name;
        protected final String size;

        public Array(String name, String size) {
            this.name = name;
            this.size = size;
            addToMemory();
        }

        public String getName() {
            return name;
        }

        public String getSize() {
            return size;
        }
    }

    public static class ArrayInt extends Array {

        public ArrayInt(String name, String size) {
            super(name, size);
        }

        @Override
        public String getIRCode(String functionName) {
            int counterState = COUNTER;
            String iR = String.format(ARRAY_DECLARATION, counterState, counterState, name, Integer.parseInt(size), IRTemplate.INT);
            COUNTER++;
            return iR;
        }

        @Override
        public void addToMemory() {
            typesMemory.put(name, INT_ARRAY);
            arrays.put(name, this);
        }

        @Override
        public String toString() {
            return "ArrayInt{" +
                    "name='" + name + '\'' +
                    ", size='" + size + '\'' +
                    '}';
        }
    }

    public static class ArrayFloat extends Array {

        public ArrayFloat(String name, String size) {
            super(name, size);
        }

        @Override
        public String getIRCode(String functionName) {
            int counterState = COUNTER;
            String iR = String.format(ARRAY_DECLARATION, counterState, counterState, name, Integer.parseInt(size), IRTemplate.FLOAT);
            COUNTER++;
            return iR;
        }

        @Override
        public void addToMemory() {
            typesMemory.put(name, FLOAT_ARRAY);
            arrays.put(name, this);
        }

        @Override
        public String toString() {
            return "ArrayFloat{" +
                    "name='" + name + '\'' +
                    ", size='" + size + '\'' +
                    '}';
        }
    }


    public static class IndexingExpression extends Expression {
        private final String to;
        private final String index;
        private final String value;

        public IndexingExpression(String to, String index, String value) {
            this.to = to;
            this.index = index;
            this.value = value;
        }

        @Override
        public String getIRCode() {
            StringBuilder iR = new StringBuilder();

            Array array = arrays.get(to);
            int counterState = COUNTER;
            switch (typesMemory.get(to)) {
                case (INT_ARRAY): {
                    int size = Integer.parseInt(array.getSize());
                    iR.append(String.format(IRTemplate.INT_ARRAY_INDEX_ASSIGN, counterState, size, size, to, Integer.parseInt(index), Integer.parseInt(value), counterState));
                    break;
                }
                case (FLOAT_ARRAY): {
                    int size = Integer.parseInt(array.getSize());
                    iR.append(String.format(IRTemplate.FLOAT_ARRAY_INDEX_ASSIGN, counterState, size, size, to, Integer.parseInt(index), Float.parseFloat(value), counterState));
                    break;
                }
            }
            COUNTER++;

            return iR.toString();
        }

        @Override
        public String toString() {
            return "IndexingExpression{" +
                    "to='" + to + '\'' +
                    ", index='" + index + '\'' +
                    ", value='" + value + '\'' +
                    '}';
        }
    }


    public static class StringVariableDeclaration extends VariableDeclaration {
        private final String name;
        private final String value;

        public StringVariableDeclaration(String name, String value) {
            this.name = name;
            this.value = value.substring(1, value.length() - 1);
            addToMemory();
        }

        @Override
        public String getIRCode(String functionName) {
            IRGenerator.generatedGlobalStatements.add(String.format(NEW_STRING_CONSTANT, functionName, name, value.length() + 1, value));

            int counterState = COUNTER;
            String ir = String.format(IRTemplate.STRING, counterState, name, value.length() + 1, counterState, counterState + 1, value.length() + 1, name, counterState + 1, value.length() + 1, value.length() + 1, functionName, name, value.length() + 1);
            COUNTER += 2;
            return ir;
        }

        @Override
        public void addToMemory() {
            typesMemory.put(name, STRING);
            strings.put(name, value);
        }

        @Override
        public String toString() {
            return "StringVariableDeclaration{" +
                    "name='" + name + '\'' +
                    ", value='" + value + '\'' +
                    '}';
        }
    }

    static public class IntVariableDeclaration extends VariableDeclaration {
        private final String name;
        private final String value;

        public IntVariableDeclaration(String name, String value) {
            this.name = name;
            this.value = value;
            addToMemory();
        }

        @Override
        public void addToMemory() {
            typesMemory.put(name, INT);
        }

        @Override
        public String toString() {
            return "IntVariableDeclaration{" +
                    "name='" + name + '\'' +
                    ", value='" + value + '\'' +
                    '}';
        }

        @Override
        public String getIRCode(String functionName) {
            return String.format(LOCAL_VARIABLE_INT_DECLARATION, name).concat(String.format(LOCAL_VARIABLE_INT_ASSIGMENT, Integer.parseInt(value), name));
        }
    }

    static public class FloatVariableDeclaration extends VariableDeclaration {
        private final String name;
        private final String value;

        public FloatVariableDeclaration(String name, String value) {
            this.name = name;
            this.value = value;
            addToMemory();
        }

        @Override
        public String toString() {
            return "FloatVariableDeclaration{" +
                    "name='" + name + '\'' +
                    ", value='" + value + '\'' +
                    '}';
        }

        @Override
        public String getIRCode(String functionName) {
            return String.format(LOCAL_VARIABLE_FLOAT_DECLARATION, name).concat(String.format(LOCAL_VARIABLE_FLOAT_ASSIGMENT, Float.parseFloat(value), name));
        }

        @Override
        public void addToMemory() {
            typesMemory.put(name, FLOAT);
        }
    }


    static abstract class Expression {
        public abstract String getIRCode();
    }

    static public class IdExpression extends Expression {
        private final String id;

        public IdExpression(String id) {
            this.id = id;
        }

        @Override
        public String getIRCode() {
            int counterState = COUNTER;
            StringBuilder iR = new StringBuilder();
            addCounterMemory.put(id, counterState);
            switch (typesMemory.get(id)) {
                case (INT): {
                    iR.append(String.format(LOAD_INT_EXPRESSION, counterState, id));
                    break;
                }
                case (FLOAT): {
                    iR.append(String.format(LOAD_FLOAT_EXPRESSION, counterState, id));
                    break;
                }

            }
            COUNTER++;
            return iR.toString();
        }

        @Override
        public String toString() {
            return id;
        }

    }

    static public class NumberExpression extends Expression {
        private final String number;

        public NumberExpression(String data) {
            number = data;
        }

        public String getData() {
            return number;
        }

        @Override
        public String toString() {
            return number;
        }

        @Override
        public String getIRCode() {
            return null;
        }
    }

    static public class Assignment extends Expression {
        private final String to;
        private final Expression mWhat;


        public Assignment(String to, Expression what) {
            this.to = to;
            mWhat = what;
        }

        @Override
        public String toString() {
            return "Assignment{" +
                    "to='" + to + '\'' +
                    ", mWhat=" + mWhat +
                    '}';
        }

        @Override
        public String getIRCode() {
            StringBuilder iR = new StringBuilder();
            iR.append(mWhat.getIRCode());

            switch (typesMemory.get(to)) {
                case (INT):
                    iR.append(String.format(STORE_INT, COUNTER, to));
                    break;
                case (FLOAT): {
                    iR.append(String.format(STORE_FLOAT, COUNTER, to));
                    break;
                }
            }
            COUNTER++;
            return iR.toString();
        }
    }

    public static class AddExpression extends Expression {
        private final Expression left;
        private final Expression right;

        public AddExpression(Expression left, Expression right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public String getIRCode() {
            StringBuilder iR = new StringBuilder();

            String leftIRCode = left.getIRCode();
            iR.append(leftIRCode);

            String rightIRCode = right.getIRCode();
            iR.append(rightIRCode);

            int counterState = COUNTER;
            switch (typesMemory.get(left.toString())) {
                case (INT): {
                    iR.append(String.format(ADD_INT, counterState, addCounterMemory.get(left.toString()), addCounterMemory.get(right.toString())));
                    break;
                }
                case (FLOAT): {
                    iR.append(String.format(ADD_FLOAT, counterState, addCounterMemory.get(left.toString()), addCounterMemory.get(right.toString())));
                    break;
                }
            }

            return iR.toString();
        }

        @Override
        public String toString() {
            return "AddExpression{" +
                    "left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    public static class MinusExpression extends Expression {
        private final Expression left;
        private final Expression right;

        public MinusExpression(Expression left, Expression right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public String getIRCode() {
            StringBuilder iR = new StringBuilder();

            String leftIRCode = left.getIRCode();
            iR.append(leftIRCode);

            String rightIRCode = right.getIRCode();
            iR.append(rightIRCode);

            int counterState = COUNTER;
            switch (typesMemory.get(left.toString())) {
                case (INT): {
                    iR.append(String.format(MINUS_INT, counterState, addCounterMemory.get(left.toString()), addCounterMemory.get(right.toString())));
                    break;
                }
                case (FLOAT): {
                    iR.append(String.format(MINUS_FLOAT, counterState, addCounterMemory.get(left.toString()), addCounterMemory.get(right.toString())));
                    break;
                }
            }

            return iR.toString();
        }

        @Override
        public String toString() {
            return "MinusExpression{" +
                    "left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    public static class MultiplyExpression extends Expression {
        private final Expression left;
        private final Expression right;

        public MultiplyExpression(Expression left, Expression right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public String getIRCode() {
            StringBuilder iR = new StringBuilder();

            String leftIRCode = left.getIRCode();
            iR.append(leftIRCode);

            String rightIRCode = right.getIRCode();
            iR.append(rightIRCode);

            int counterState = COUNTER;
            switch (typesMemory.get(left.toString())) {
                case (INT): {
                    iR.append(String.format(MULTIPLY_INT, counterState, addCounterMemory.get(left.toString()), addCounterMemory.get(right.toString())));
                    break;
                }
                case (FLOAT): {
                    iR.append(String.format(MULTIPLY_FLOAT, counterState, addCounterMemory.get(left.toString()), addCounterMemory.get(right.toString())));
                    break;
                }
            }

            return iR.toString();
        }

        @Override
        public String toString() {
            return "MultiplyExpression{" +
                    "left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    public static class DivideExpression extends Expression {
        private final Expression left;
        private final Expression right;

        public DivideExpression(Expression left, Expression right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public String getIRCode() {
            StringBuilder iR = new StringBuilder();

            String leftIRCode = left.getIRCode();
            iR.append(leftIRCode);

            String rightIRCode = right.getIRCode();
            iR.append(rightIRCode);

            int counterState = COUNTER;
            switch (typesMemory.get(left.toString())) {
                case (INT): {
                    iR.append(String.format(DIVIDE_INT, counterState, addCounterMemory.get(left.toString()), addCounterMemory.get(right.toString())));
                    break;
                }
                case (FLOAT): {
                    iR.append(String.format(DIVIDE_FLOAT, counterState, addCounterMemory.get(left.toString()), addCounterMemory.get(right.toString())));
                    break;
                }
            }

            return iR.toString();
        }

        @Override
        public String toString() {
            return "DivideExpression{" +
                    "left=" + left +
                    ", right=" + right +
                    '}';
        }
    }


    static public class Body {
        private List<Statement> statements = new ArrayList<Statement>();

        public Body() {

        }

        void add(Statement stmt) {
            statements.add(stmt);
        }

        public List<Statement> getStatements() {
            return statements;
        }

        public void setStatements(List<Statement> statements) {
            this.statements = statements;
        }

        @Override
        public String toString() {
            return "Body{" +
                    "statements=" + statements +
                    '}';
        }
    }

    public static void run(String firstFile, String... anotherFiles) throws IOException {
        StringBuilder iR = new StringBuilder();

        iR.append(IRGenerator.beginFile());

        PLexer lexer = new PLexer(new org.antlr.v4.runtime.ANTLRInputStream(new FileReader(firstFile)));
        lexer.removeErrorListeners();
        lexer.addErrorListener(ThrowingErrorListener.INSTANCE);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        PParser parser = new PParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(ThrowingErrorListener.INSTANCE);


        PParser.ProgramContext program = parser.program();

        List<Statement> statements = program.val.statements;
        System.out.println("Program statements : ");
        for (Statement statement : statements) {
            System.out.println(statement);
        }

        List<Function> functions = program.val.functions;
        System.out.println("Program functions : ");
        for (Function fun : functions) {
            System.out.println(fun.toString());
        }

        iR.append(generateLL(program.val)).append(NEW_LINE);

        for (String anotherFile : anotherFiles) {
            lexer = new PLexer(new org.antlr.v4.runtime.ANTLRInputStream(new FileReader(anotherFile)));
            lexer.removeErrorListeners();
            lexer.addErrorListener(ThrowingErrorListener.INSTANCE);

            tokens = new CommonTokenStream(lexer);

            parser = new PParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(ThrowingErrorListener.INSTANCE);


            program = parser.program();

            statements = program.val.statements;
            System.out.println("Program statements : ");
            for (Statement statement : statements) {
                System.out.println(statement);
            }

            functions = program.val.functions;
            System.out.println("Program functions : ");
            for (Function fun : functions) {
                System.out.println(fun.toString());
            }

            iR.append(generateLL(program.val)).append(NEW_LINE);
        }

        iR.append(IRGenerator.endFile());

        Util.writeIRToFile(iR.toString(), new File(LL_FILE_NAME));

    }

    private static String generateLL(Program program) {
        IRGenerator irGenerator = new IRGenerator(program);
        return irGenerator.generateIR();
    }
}