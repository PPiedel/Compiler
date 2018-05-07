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
        private final Expression m_expr;

        public StatementExpression(Expression expr) {
            m_expr = expr;
        }

        @Override
        public String toString() {
            return "StatementExpression{" +
                    "m_expr=" + m_expr +
                    '}';
        }
    }

    static public class VariableDefinition extends Statement {
        private final String m_name;

        public VariableDefinition(String name) {
            m_name = name;
        }

        public String getName() {
            return m_name;
        }

        @Override
        public String toString() {
            return "VariableDefinition{" +
                    "m_name='" + m_name + '\'' +
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

            PLexer lexer = new PLexer(new org.antlr.v4.runtime.ANTLRInputStream(new FileReader("test.txt")));
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