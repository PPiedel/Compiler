package main;

import main.ir_generator.IRGenerator;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import util.Util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static main.ir_generator.IRTemplate.*;

public class Front {
    private static final String LL_FILE_NAME = "code.ll";
    public static final String INT = "int";
    public static final String FLOAT = "float";
    private static int COUNTER = 1;


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
        public abstract String getIRCode();
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
        public String getIRCode() {
            return "";
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
        public String getIRCode() {
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
        public String getIRCode() {
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
        public String getIRCode() {
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
        public String getIRCode() {
            return String.format(RETURN_FLOAT, Float.parseFloat(value));
        }

        @Override
        public String toString() {
            return "ReturnFloat{" +
                    "value='" + value + '\'' +
                    '}';
        }
    }

    static class PrintIDStatement extends PrintStatement {
        private final String id;

        public PrintIDStatement(String id) {
            this.id = id;
        }

        @Override
        public String getIRCode() {
            int counterState = COUNTER;
            String ir = String.format(PRINT_ID, counterState, id, COUNTER + 1, counterState);
            COUNTER += 2;
            return ir;
        }

        @Override
        public String toString() {
            return "PrintIDStatement{" +
                    "id='" + id + '\'' +
                    '}';
        }
    }

    static abstract class VariableDeclaration extends Statement {
    }

    static public class IntVariableDeclaration extends VariableDeclaration {
        private final String name;
        private final String value;

        public IntVariableDeclaration(String name, String value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "IntVariableDeclaration{" +
                    "name='" + name + '\'' +
                    ", value='" + value + '\'' +
                    '}';
        }

        @Override
        public String getIRCode() {
            return String.format(LOCAL_VARIABLE_INT_DECLARATION, name).concat(String.format(LOCAL_VARIABLE_INT_ASSIGMENT, Integer.parseInt(value), name));
        }
    }

    static public class FloatVariableDeclaration extends VariableDeclaration {
        private final String name;
        private final String value;

        public FloatVariableDeclaration(String name, String value) {
            this.name = name;
            this.value = value;
        }

        @Override
        public String toString() {
            return "FloatVariableDeclaration{" +
                    "name='" + name + '\'' +
                    ", value='" + value + '\'' +
                    '}';
        }

        @Override
        public String getIRCode() {
            return String.format(LOCAL_VARIABLE_FLOAT_DECLARATION, name).concat(String.format(LOCAL_VARIABLE_FLOAT_ASSIGMENT, Float.parseFloat(value), name));
        }
    }

    static abstract class Expression {
        public abstract String getIRCode();
    }

    static public class IntExpression extends Expression {
        private final String m_data;

        public IntExpression(String data) {
            m_data = data;
        }

        public String getData() {
            return m_data;
        }

        @Override
        public String toString() {
            return "IntExpression{" +
                    "m_data='" + m_data + '\'' +
                    '}';
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
            return null;
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

    public static void run(String filePath) throws IOException {
        PLexer lexer = new PLexer(new org.antlr.v4.runtime.ANTLRInputStream(new FileReader(filePath)));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PParser parser = new PParser(tokens);


        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new PBaseListener(), tree);


        PParser.ProgramContext program = (PParser.ProgramContext) tree;
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

        generateLL(program.val);

    }

    private static void generateLL(Program program) {
        IRGenerator irGenerator = new IRGenerator(program);
        String intermediateRepresentation = irGenerator.generateIR();

        Util.writeIRToFile(intermediateRepresentation, new File(LL_FILE_NAME));
    }
}