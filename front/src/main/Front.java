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

public class Front {
    public static final String LL_FILE_NAME = "code.ll";

    static class Program {
        List<Statement> statements = new ArrayList<Statement>();
    }


    public static abstract class Statement {
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
    }

    static abstract class VariableDeclaration extends Statement {
    }

    static public class IntVariableDeclaration extends VariableDeclaration {
        private final String varName;

        public IntVariableDeclaration(String varName) {
            this.varName = varName;
        }

        public String getVarName() {
            return varName;
        }

        @Override
        public String toString() {
            return "IntVariableDeclaration{" +
                    "varName='" + varName + '\'' +
                    '}';
        }
    }

    static public class FloatVariableDeclaration extends VariableDeclaration {
        private final String varName;

        public FloatVariableDeclaration(String varName) {
            this.varName = varName;
        }

        @Override
        public String toString() {
            return "FloatVariableDeclaration{" +
                    "varName='" + varName + '\'' +
                    '}';
        }
    }

    static abstract class Expression {
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
    }

    static public class Body {
        private List<Statement> statements = new ArrayList<Statement>();

        public Body() {

        }

        void add(Statement stmt) {
            statements.add(stmt);
        }
    }

    public static void run(String filePath) throws IOException {
        PLexer lexer = new PLexer(new org.antlr.v4.runtime.ANTLRInputStream(new FileReader(filePath)));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PParser parser = new PParser(tokens);


        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new PBaseListener(), tree);

        System.out.println("Program statements : ");
        PParser.ProgramContext program = (PParser.ProgramContext) tree;
        List<Statement> statements = program.val.statements;
        for (Statement statement : statements) {
            System.out.println(statement);
        }

        generateLL(program.val);

    }

    private static void generateLL(Program program) {
        IRGenerator irGenerator = new IRGenerator(program.statements);
        String intermediateRepresentation = irGenerator.generateIR();

        Util.writeIRToFile(intermediateRepresentation,new File(LL_FILE_NAME));
    }
}