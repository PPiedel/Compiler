package main;

import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Compiler {

    static public class Program {
        public List<Statement> statements = new ArrayList<Statement>();
    }



    static public abstract class Statement {

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

    public static abstract class VariableDefinition extends Statement{

    }


    static public class IntVariableDefinition extends VariableDefinition{
        private final String varName;

        public IntVariableDefinition(String varName) {
            this.varName = varName;
        }

        public String getVarName() {
            return varName;
        }

        @Override
        public String toString() {
            return "IntVariableDefinition{" +
                    "varName='" + varName + '\'' +
                    '}';
        }
    }

    static public class FloatVariableDefinition extends VariableDefinition{
        private final String varName;

        public FloatVariableDefinition(String varName) {
            this.varName = varName;
        }

        @Override
        public String toString() {
            return "FloatVariableDefinition{" +
                    "varName='" + varName + '\'' +
                    '}';
        }
    }


    static public abstract class Expression {}

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

        public void add(Statement stmt) {
            statements.add(stmt);
        }
    }

    public static void main(String[] args) {
        try {

            PLexer lexer = new PLexer(new org.antlr.v4.runtime.ANTLRInputStream(new FileReader("code.P")));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PParser parser = new PParser(tokens);
            Program def = parser.program().val;
            for (Statement statement : def.statements){
                System.out.println(statement);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}