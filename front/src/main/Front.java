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
import java.util.Arrays;
import java.util.List;

import static main.ir_generator.IRTemplate.GLOBAL_FLOAT;
import static main.ir_generator.IRTemplate.GLOBAL_INT;
import static main.ir_generator.IRTemplate.PRINT_ID;

public class Front {
    private static final String LL_FILE_NAME = "code.ll";
    public static final String INT = "int";
    public static final String FLOAT = "float";




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
        private List<String> m_arguments = new ArrayList<String>();
        private Body m_body;
        private String returnType;

        public Function(String name, String returnType) {
            this.name = name;
            this.returnType = returnType;
        }

        public void addArg(String name) {
            m_arguments.add(name);
        }

        public void setBody(Body b) {
            m_body = b;
        }

        public Body getM_body() {
            return m_body;
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
                    ", m_body=" + m_body +
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

    static abstract class PrintStatement  extends Statement{

    }

    static class PrintIDStatement extends PrintStatement {
        private final String id;

        public PrintIDStatement(String id) {
            this.id = id;
        }

        @Override
        public String getIRCode() {
            return String.format(PRINT_ID,id);
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
            return String.format(GLOBAL_INT,name,Integer.parseInt(value));
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
            return String.format(GLOBAL_FLOAT, name,Float.parseFloat(value));
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
        for (Function fun : functions){
            System.out.println(fun.toString());
        }

        generateLL(program.val);

    }

    private static void generateLL(Program program) {
        IRGenerator irGenerator = new IRGenerator(program);
        String intermediateRepresentation = irGenerator.generateIR();

        Util.writeIRToFile(intermediateRepresentation,new File(LL_FILE_NAME));
    }
}