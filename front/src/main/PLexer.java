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
            FLOAT = 9, STRING = 10, STRING_LITERAL = 11, PRINT = 12, READ_INT = 13, READ_FLOAT = 14,
            FUN = 15, RETURN = 16, ID = 17, EQUALS = 18, COLON = 19, DOUBLE_QUOTE = 20, ADD = 21,
            MINUS = 22, MUTLIPLY = 23, DIVIDE = 24, LEFT_BRACKET = 25, RIGHT_BRACKET = 26, LEFT_SQUARE_BRACKET = 27,
            RIGHT_SQUARE_BRACKET = 28, WS = 29, COMMENT = 30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
            "T__0", "T__1", "T__2", "T__3", "NEW", "NUMBER", "NUMBER_FLOAT", "DIGIT",
            "INT", "FLOAT", "STRING", "STRING_LITERAL", "StringCharacters", "StringCharacter",
            "PRINT", "READ_INT", "READ_FLOAT", "FUN", "RETURN", "ID", "EQUALS", "COLON",
            "DOUBLE_QUOTE", "ADD", "MINUS", "MUTLIPLY", "DIVIDE", "LEFT_BRACKET",
            "RIGHT_BRACKET", "LEFT_SQUARE_BRACKET", "RIGHT_SQUARE_BRACKET", "WS",
            "COMMENT"
    };
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00ea\b\1\4\2\t" +
                    "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\6\7S\n" +
                    "\7\r\7\16\7T\3\b\6\bX\n\b\r\b\16\bY\3\b\3\b\7\b^\n\b\f\b\16\ba\13\b\3" +
                    "\b\3\b\6\be\n\b\r\b\16\bf\5\bi\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3" +
                    "\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\5\r\u0080\n\r\3" +
                    "\r\3\r\3\16\6\16\u0085\n\16\r\16\16\16\u0086\3\17\3\17\3\20\3\20\3\20" +
                    "\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22" +
                    "\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24" +
                    "\3\24\3\24\3\24\3\24\3\25\3\25\7\25\u00b0\n\25\f\25\16\25\u00b3\13\25" +
                    "\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34" +
                    "\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\7\"\u00d3" +
                    "\n\"\f\"\16\"\u00d6\13\"\3\"\5\"\u00d9\n\"\3\"\3\"\3\"\3\"\3\"\7\"\u00e0" +
                    "\n\"\f\"\16\"\u00e3\13\"\3\"\3\"\5\"\u00e7\n\"\3\"\3\"\3\u00e1\2#\3\3" +
                    "\5\4\7\5\t\6\13\7\r\b\17\t\21\2\23\n\25\13\27\f\31\r\33\2\35\2\37\16!" +
                    "\17#\20%\21\'\22)\23+\24-\25/\26\61\27\63\30\65\31\67\329\33;\34=\35?" +
                    "\36A\37C \3\2\7\6\2\f\f\17\17$$^^\4\2C\\c|\5\2\62;C\\c|\5\2\f\f\17\17" +
                    "\"\"\4\2\f\f\17\17\2\u00f2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2" +
                    "\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2" +
                    "\27\3\2\2\2\2\31\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2" +
                    "\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2" +
                    "\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2" +
                    "\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5G\3\2\2\2\7I\3\2\2\2\t" +
                    "K\3\2\2\2\13M\3\2\2\2\rR\3\2\2\2\17h\3\2\2\2\21j\3\2\2\2\23l\3\2\2\2\25" +
                    "p\3\2\2\2\27v\3\2\2\2\31}\3\2\2\2\33\u0084\3\2\2\2\35\u0088\3\2\2\2\37" +
                    "\u008a\3\2\2\2!\u0090\3\2\2\2#\u0098\3\2\2\2%\u00a2\3\2\2\2\'\u00a6\3" +
                    "\2\2\2)\u00ad\3\2\2\2+\u00b4\3\2\2\2-\u00b6\3\2\2\2/\u00b8\3\2\2\2\61" +
                    "\u00ba\3\2\2\2\63\u00bc\3\2\2\2\65\u00be\3\2\2\2\67\u00c0\3\2\2\29\u00c2" +
                    "\3\2\2\2;\u00c4\3\2\2\2=\u00c6\3\2\2\2?\u00c8\3\2\2\2A\u00ca\3\2\2\2C" +
                    "\u00e6\3\2\2\2EF\7=\2\2F\4\3\2\2\2GH\7}\2\2H\6\3\2\2\2IJ\7\177\2\2J\b" +
                    "\3\2\2\2KL\7.\2\2L\n\3\2\2\2MN\7p\2\2NO\7g\2\2OP\7y\2\2P\f\3\2\2\2QS\5" +
                    "\21\t\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\16\3\2\2\2VX\5\21\t\2" +
                    "WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[_\7\60\2\2\\^\5\21" +
                    "\t\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`i\3\2\2\2a_\3\2\2\2bd\7" +
                    "\60\2\2ce\5\21\t\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2h" +
                    "W\3\2\2\2hb\3\2\2\2i\20\3\2\2\2jk\4\62;\2k\22\3\2\2\2lm\7k\2\2mn\7p\2" +
                    "\2no\7v\2\2o\24\3\2\2\2pq\7h\2\2qr\7n\2\2rs\7q\2\2st\7c\2\2tu\7v\2\2u" +
                    "\26\3\2\2\2vw\7U\2\2wx\7v\2\2xy\7t\2\2yz\7k\2\2z{\7p\2\2{|\7i\2\2|\30" +
                    "\3\2\2\2}\177\7$\2\2~\u0080\5\33\16\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080" +
                    "\u0081\3\2\2\2\u0081\u0082\7$\2\2\u0082\32\3\2\2\2\u0083\u0085\5\35\17" +
                    "\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087" +
                    "\3\2\2\2\u0087\34\3\2\2\2\u0088\u0089\n\2\2\2\u0089\36\3\2\2\2\u008a\u008b" +
                    "\7r\2\2\u008b\u008c\7t\2\2\u008c\u008d\7k\2\2\u008d\u008e\7p\2\2\u008e" +
                    "\u008f\7v\2\2\u008f \3\2\2\2\u0090\u0091\7t\2\2\u0091\u0092\7g\2\2\u0092" +
                    "\u0093\7c\2\2\u0093\u0094\7f\2\2\u0094\u0095\7K\2\2\u0095\u0096\7p\2\2" +
                    "\u0096\u0097\7v\2\2\u0097\"\3\2\2\2\u0098\u0099\7t\2\2\u0099\u009a\7g" +
                    "\2\2\u009a\u009b\7c\2\2\u009b\u009c\7f\2\2\u009c\u009d\7H\2\2\u009d\u009e" +
                    "\7n\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7v\2\2\u00a1" +
                    "$\3\2\2\2\u00a2\u00a3\7h\2\2\u00a3\u00a4\7w\2\2\u00a4\u00a5\7p\2\2\u00a5" +
                    "&\3\2\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7v\2\2\u00a9" +
                    "\u00aa\7w\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7p\2\2\u00ac(\3\2\2\2\u00ad" +
                    "\u00b1\t\3\2\2\u00ae\u00b0\t\4\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2" +
                    "\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2*\3\2\2\2\u00b3\u00b1" +
                    "\3\2\2\2\u00b4\u00b5\7?\2\2\u00b5,\3\2\2\2\u00b6\u00b7\7<\2\2\u00b7.\3" +
                    "\2\2\2\u00b8\u00b9\7$\2\2\u00b9\60\3\2\2\2\u00ba\u00bb\7-\2\2\u00bb\62" +
                    "\3\2\2\2\u00bc\u00bd\7/\2\2\u00bd\64\3\2\2\2\u00be\u00bf\7,\2\2\u00bf" +
                    "\66\3\2\2\2\u00c0\u00c1\7\61\2\2\u00c18\3\2\2\2\u00c2\u00c3\7*\2\2\u00c3" +
                    ":\3\2\2\2\u00c4\u00c5\7+\2\2\u00c5<\3\2\2\2\u00c6\u00c7\7]\2\2\u00c7>" +
                    "\3\2\2\2\u00c8\u00c9\7_\2\2\u00c9@\3\2\2\2\u00ca\u00cb\t\5\2\2\u00cb\u00cc" +
                    "\3\2\2\2\u00cc\u00cd\b!\2\2\u00cdB\3\2\2\2\u00ce\u00cf\7\61\2\2\u00cf" +
                    "\u00d0\7\61\2\2\u00d0\u00d4\3\2\2\2\u00d1\u00d3\n\6\2\2\u00d2\u00d1\3" +
                    "\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5" +
                    "\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d9\7\17\2\2\u00d8\u00d7\3" +
                    "\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00e7\7\f\2\2\u00db" +
                    "\u00dc\7\61\2\2\u00dc\u00dd\7,\2\2\u00dd\u00e1\3\2\2\2\u00de\u00e0\13" +
                    "\2\2\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e1" +
                    "\u00df\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\7," +
                    "\2\2\u00e5\u00e7\7\61\2\2\u00e6\u00ce\3\2\2\2\u00e6\u00db\3\2\2\2\u00e7" +
                    "\u00e8\3\2\2\2\u00e8\u00e9\b\"\2\2\u00e9D\3\2\2\2\17\2TY_fh\177\u0086" +
                    "\u00b1\u00d4\u00d8\u00e1\u00e6\3\b\2\2";
	private static final String[] _LITERAL_NAMES = {
            null, "';'", "'{'", "'}'", "','", "'new'", null, null, "'int'", "'float'",
            "'String'", null, "'print'", "'readInt'", "'readFloat'", "'fun'", "'return'",
            null, "'='", "':'", "'\"'", "'+'", "'-'", "'*'", "'/'", "'('", "')'",
            "'['", "']'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, null, null, null, null, "NEW", "NUMBER", "NUMBER_FLOAT", "INT",
            "FLOAT", "STRING", "STRING_LITERAL", "PRINT", "READ_INT", "READ_FLOAT",
            "FUN", "RETURN", "ID", "EQUALS", "COLON", "DOUBLE_QUOTE", "ADD", "MINUS",
            "MUTLIPLY", "DIVIDE", "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_SQUARE_BRACKET",
            "RIGHT_SQUARE_BRACKET", "WS", "COMMENT"
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

    public Vocabulary getVocabulary() {
        return VOCABULARY;
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