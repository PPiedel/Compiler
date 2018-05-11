package main;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IRGenerator {

    static class Program {
        List<Statement> statements = new ArrayList<Statement>();
    }


    static abstract class Statement {
    }

    static public class StatementExpression extends Statement {
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

    public static void parse(String filePath) throws IOException {
        PLexer lexer = new PLexer(new org.antlr.v4.runtime.ANTLRInputStream(new FileReader(filePath)));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PParser parser = new PParser(tokens);


        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new PBaseListener(), tree);

        System.out.println("Program statements : ");
        for (Statement statement : ((PParser.ProgramContext) tree).val.statements) {
            System.out.println(statement);
        }


    }
}