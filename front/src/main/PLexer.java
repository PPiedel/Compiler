// Generated from /home/ppiedel/IdeaProjects/Compiler/front/src/main/P.g4 by ANTLR 4.7
package main;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, NEW = 5, NUMBER = 6, NUMBER_FLOAT = 7, INT = 8,
            FLOAT = 9, STATIC = 10, STRING = 11, STRING_LITERAL = 12, PRINT = 13, READ_INT = 14,
            READ_FLOAT = 15, FUN = 16, IF = 17, RETURN = 18, ID = 19, EQUALS = 20, COLON = 21, DOUBLE_QUOTE = 22,
            ADD = 23, MINUS = 24, BOOL_OPERATOR = 25, MUTLIPLY = 26, DIVIDE = 27, LEFT_BRACKET = 28,
            RIGHT_BRACKET = 29, LEFT_SQUARE_BRACKET = 30, RIGHT_SQUARE_BRACKET = 31, WS = 32,
            COMMENT = 33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
            "T__0", "T__1", "T__2", "T__3", "NEW", "NUMBER", "NUMBER_FLOAT", "DIGIT",
            "INT", "FLOAT", "STATIC", "STRING", "STRING_LITERAL", "StringCharacters",
            "StringCharacter", "PRINT", "READ_INT", "READ_FLOAT", "FUN", "IF", "RETURN",
            "ID", "EQUALS", "COLON", "DOUBLE_QUOTE", "ADD", "MINUS", "BOOL_OPERATOR",
            "MUTLIPLY", "DIVIDE", "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_SQUARE_BRACKET",
            "RIGHT_SQUARE_BRACKET", "WS", "COMMENT"
    };
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u0103\b\1\4\2\t" +
                    "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6" +
                    "\3\6\3\6\3\7\6\7Y\n\7\r\7\16\7Z\3\b\6\b^\n\b\r\b\16\b_\3\b\3\b\7\bd\n" +
                    "\b\f\b\16\bg\13\b\3\b\3\b\6\bk\n\b\r\b\16\bl\5\bo\n\b\3\t\3\t\3\n\3\n" +
                    "\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r" +
                    "\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u008d\n\16\3\16\3\16\3\17\6\17" +
                    "\u0092\n\17\r\17\16\17\u0093\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3" +
                    "\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3" +
                    "\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3" +
                    "\26\3\26\3\26\3\26\3\27\3\27\7\27\u00c0\n\27\f\27\16\27\u00c3\13\27\3" +
                    "\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3" +
                    "\35\3\35\3\35\5\35\u00d6\n\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"" +
                    "\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\7%\u00ec\n%\f%\16%\u00ef\13%\3%\5%\u00f2" +
                    "\n%\3%\3%\3%\3%\3%\7%\u00f9\n%\f%\16%\u00fc\13%\3%\3%\5%\u0100\n%\3%\3" +
                    "%\3\u00fa\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\2\23\n\25\13\27\f\31\r\33" +
                    "\16\35\2\37\2!\17#\20%\21\'\22)\23+\24-\25/\26\61\27\63\30\65\31\67\32" +
                    "9\33;\34=\35?\36A\37C E!G\"I#\3\2\b\6\2\f\f\17\17$$^^\4\2C\\c|\5\2\62" +
                    ";C\\c|\4\2>>@@\5\2\f\f\17\17\"\"\4\2\f\f\17\17\2\u010e\2\3\3\2\2\2\2\5" +
                    "\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2" +
                    "\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2!\3" +
                    "\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2" +
                    "\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2" +
                    "9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3" +
                    "\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5M\3\2\2\2\7O\3\2\2\2\tQ\3\2\2" +
                    "\2\13S\3\2\2\2\rX\3\2\2\2\17n\3\2\2\2\21p\3\2\2\2\23r\3\2\2\2\25v\3\2" +
                    "\2\2\27|\3\2\2\2\31\u0083\3\2\2\2\33\u008a\3\2\2\2\35\u0091\3\2\2\2\37" +
                    "\u0095\3\2\2\2!\u0097\3\2\2\2#\u009d\3\2\2\2%\u00a5\3\2\2\2\'\u00af\3" +
                    "\2\2\2)\u00b3\3\2\2\2+\u00b6\3\2\2\2-\u00bd\3\2\2\2/\u00c4\3\2\2\2\61" +
                    "\u00c6\3\2\2\2\63\u00c8\3\2\2\2\65\u00ca\3\2\2\2\67\u00cc\3\2\2\29\u00d5" +
                    "\3\2\2\2;\u00d7\3\2\2\2=\u00d9\3\2\2\2?\u00db\3\2\2\2A\u00dd\3\2\2\2C" +
                    "\u00df\3\2\2\2E\u00e1\3\2\2\2G\u00e3\3\2\2\2I\u00ff\3\2\2\2KL\7=\2\2L" +
                    "\4\3\2\2\2MN\7}\2\2N\6\3\2\2\2OP\7\177\2\2P\b\3\2\2\2QR\7.\2\2R\n\3\2" +
                    "\2\2ST\7p\2\2TU\7g\2\2UV\7y\2\2V\f\3\2\2\2WY\5\21\t\2XW\3\2\2\2YZ\3\2" +
                    "\2\2ZX\3\2\2\2Z[\3\2\2\2[\16\3\2\2\2\\^\5\21\t\2]\\\3\2\2\2^_\3\2\2\2" +
                    "_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2ae\7\60\2\2bd\5\21\t\2cb\3\2\2\2dg\3\2\2" +
                    "\2ec\3\2\2\2ef\3\2\2\2fo\3\2\2\2ge\3\2\2\2hj\7\60\2\2ik\5\21\t\2ji\3\2" +
                    "\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2n]\3\2\2\2nh\3\2\2\2o\20\3" +
                    "\2\2\2pq\4\62;\2q\22\3\2\2\2rs\7k\2\2st\7p\2\2tu\7v\2\2u\24\3\2\2\2vw" +
                    "\7h\2\2wx\7n\2\2xy\7q\2\2yz\7c\2\2z{\7v\2\2{\26\3\2\2\2|}\7u\2\2}~\7v" +
                    "\2\2~\177\7c\2\2\177\u0080\7v\2\2\u0080\u0081\7k\2\2\u0081\u0082\7e\2" +
                    "\2\u0082\30\3\2\2\2\u0083\u0084\7U\2\2\u0084\u0085\7v\2\2\u0085\u0086" +
                    "\7t\2\2\u0086\u0087\7k\2\2\u0087\u0088\7p\2\2\u0088\u0089\7i\2\2\u0089" +
                    "\32\3\2\2\2\u008a\u008c\7$\2\2\u008b\u008d\5\35\17\2\u008c\u008b\3\2\2" +
                    "\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7$\2\2\u008f\34" +
                    "\3\2\2\2\u0090\u0092\5\37\20\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2" +
                    "\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\36\3\2\2\2\u0095\u0096" +
                    "\n\2\2\2\u0096 \3\2\2\2\u0097\u0098\7r\2\2\u0098\u0099\7t\2\2\u0099\u009a" +
                    "\7k\2\2\u009a\u009b\7p\2\2\u009b\u009c\7v\2\2\u009c\"\3\2\2\2\u009d\u009e" +
                    "\7t\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7f\2\2\u00a1" +
                    "\u00a2\7K\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7v\2\2\u00a4$\3\2\2\2\u00a5" +
                    "\u00a6\7t\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7f\2\2" +
                    "\u00a9\u00aa\7H\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad" +
                    "\7c\2\2\u00ad\u00ae\7v\2\2\u00ae&\3\2\2\2\u00af\u00b0\7h\2\2\u00b0\u00b1" +
                    "\7w\2\2\u00b1\u00b2\7p\2\2\u00b2(\3\2\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5" +
                    "\7h\2\2\u00b5*\3\2\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9" +
                    "\7v\2\2\u00b9\u00ba\7w\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7p\2\2\u00bc" +
                    ",\3\2\2\2\u00bd\u00c1\t\3\2\2\u00be\u00c0\t\4\2\2\u00bf\u00be\3\2\2\2" +
                    "\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2.\3" +
                    "\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7?\2\2\u00c5\60\3\2\2\2\u00c6\u00c7" +
                    "\7<\2\2\u00c7\62\3\2\2\2\u00c8\u00c9\7$\2\2\u00c9\64\3\2\2\2\u00ca\u00cb" +
                    "\7-\2\2\u00cb\66\3\2\2\2\u00cc\u00cd\7/\2\2\u00cd8\3\2\2\2\u00ce\u00d6" +
                    "\t\5\2\2\u00cf\u00d0\7?\2\2\u00d0\u00d6\7?\2\2\u00d1\u00d2\7>\2\2\u00d2" +
                    "\u00d6\7?\2\2\u00d3\u00d4\7@\2\2\u00d4\u00d6\7?\2\2\u00d5\u00ce\3\2\2" +
                    "\2\u00d5\u00cf\3\2\2\2\u00d5\u00d1\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6:" +
                    "\3\2\2\2\u00d7\u00d8\7,\2\2\u00d8<\3\2\2\2\u00d9\u00da\7\61\2\2\u00da" +
                    ">\3\2\2\2\u00db\u00dc\7*\2\2\u00dc@\3\2\2\2\u00dd\u00de\7+\2\2\u00deB" +
                    "\3\2\2\2\u00df\u00e0\7]\2\2\u00e0D\3\2\2\2\u00e1\u00e2\7_\2\2\u00e2F\3" +
                    "\2\2\2\u00e3\u00e4\t\6\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\b$\2\2\u00e6" +
                    "H\3\2\2\2\u00e7\u00e8\7\61\2\2\u00e8\u00e9\7\61\2\2\u00e9\u00ed\3\2\2" +
                    "\2\u00ea\u00ec\n\7\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb" +
                    "\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0" +
                    "\u00f2\7\17\2\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3" +
                    "\2\2\2\u00f3\u0100\7\f\2\2\u00f4\u00f5\7\61\2\2\u00f5\u00f6\7,\2\2\u00f6" +
                    "\u00fa\3\2\2\2\u00f7\u00f9\13\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3" +
                    "\2\2\2\u00fa\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc" +
                    "\u00fa\3\2\2\2\u00fd\u00fe\7,\2\2\u00fe\u0100\7\61\2\2\u00ff\u00e7\3\2" +
                    "\2\2\u00ff\u00f4\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\b%\2\2\u0102" +
                    "J\3\2\2\2\20\2Z_eln\u008c\u0093\u00c1\u00d5\u00ed\u00f1\u00fa\u00ff\3" +
                    "\b\2\2";
	private static final String[] _LITERAL_NAMES = {
            null, "';'", "'{'", "'}'", "','", "'new'", null, null, "'int'", "'float'",
            "'static'", "'String'", null, "'print'", "'readInt'", "'readFloat'", "'fun'",
            "'if'", "'return'", null, "'='", "':'", "'\"'", "'+'", "'-'", null, "'*'",
            "'/'", "'('", "')'", "'['", "']'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, null, null, null, null, "NEW", "NUMBER", "NUMBER_FLOAT", "INT",
            "FLOAT", "STATIC", "STRING", "STRING_LITERAL", "PRINT", "READ_INT", "READ_FLOAT",
            "FUN", "IF", "RETURN", "ID", "EQUALS", "COLON", "DOUBLE_QUOTE", "ADD",
            "MINUS", "BOOL_OPERATOR", "MUTLIPLY", "DIVIDE", "LEFT_BRACKET", "RIGHT_BRACKET",
            "LEFT_SQUARE_BRACKET", "RIGHT_SQUARE_BRACKET", "WS", "COMMENT"
    };
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    public PLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

	@Override
	public String getGrammarFileName() { return "P.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}