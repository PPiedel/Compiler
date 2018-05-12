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
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, NUMBER = 5, NUMBER_FLOAT = 6, INT = 7, FLOAT = 8,
            STRING = 9, STRING_LITERAL = 10, PRINT = 11, READ_INT = 12, READ_FLOAT = 13, FUN = 14,
            RETURN = 15, ID = 16, EQUALS = 17, COLON = 18, DOUBLE_QUOTE = 19, ADD = 20, MINUS = 21,
            MUTLIPLY = 22, DIVIDE = 23, LEFT_BRACKET = 24, RIGHT_BRACKET = 25, WS = 26, COMMENT = 27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
            "T__0", "T__1", "T__2", "T__3", "NUMBER", "NUMBER_FLOAT", "DIGIT", "INT",
            "FLOAT", "STRING", "STRING_LITERAL", "StringCharacters", "StringCharacter",
            "PRINT", "READ_INT", "READ_FLOAT", "FUN", "RETURN", "ID", "EQUALS", "COLON",
            "DOUBLE_QUOTE", "ADD", "MINUS", "MUTLIPLY", "DIVIDE", "LEFT_BRACKET",
            "RIGHT_BRACKET", "WS", "COMMENT"
    };
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00dc\b\1\4\2" +
                    "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4" +
                    "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22" +
                    "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31" +
                    "\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2" +
                    "\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\6\6I\n\6\r\6\16\6J\3\7\6\7N\n\7\r\7\16" +
                    "\7O\3\7\3\7\7\7T\n\7\f\7\16\7W\13\7\3\7\3\7\6\7[\n\7\r\7\16\7\\\5\7_\n" +
                    "\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13" +
                    "\3\13\3\13\3\13\3\f\3\f\5\fv\n\f\3\f\3\f\3\r\6\r{\n\r\r\r\16\r|\3\16\3" +
                    "\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3" +
                    "\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3" +
                    "\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\7\24\u00a6\n\24\f\24" +
                    "\16\24\u00a9\13\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3" +
                    "\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3" +
                    "\37\3\37\7\37\u00c5\n\37\f\37\16\37\u00c8\13\37\3\37\5\37\u00cb\n\37\3" +
                    "\37\3\37\3\37\3\37\3\37\7\37\u00d2\n\37\f\37\16\37\u00d5\13\37\3\37\3" +
                    "\37\5\37\u00d9\n\37\3\37\3\37\3\u00d3\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\2" +
                    "\21\t\23\n\25\13\27\f\31\2\33\2\35\r\37\16!\17#\20%\21\'\22)\23+\24-\25" +
                    "/\26\61\27\63\30\65\31\67\329\33;\34=\35\3\2\7\6\2\f\f\17\17$$^^\4\2C" +
                    "\\c|\5\2\62;C\\c|\5\2\f\f\17\17\"\"\4\2\f\f\17\17\2\u00e4\2\3\3\2\2\2" +
                    "\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\21\3\2" +
                    "\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2" +
                    "\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2" +
                    "-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2" +
                    "\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7C\3\2\2\2\t" +
                    "E\3\2\2\2\13H\3\2\2\2\r^\3\2\2\2\17`\3\2\2\2\21b\3\2\2\2\23f\3\2\2\2\25" +
                    "l\3\2\2\2\27s\3\2\2\2\31z\3\2\2\2\33~\3\2\2\2\35\u0080\3\2\2\2\37\u0086" +
                    "\3\2\2\2!\u008e\3\2\2\2#\u0098\3\2\2\2%\u009c\3\2\2\2\'\u00a3\3\2\2\2" +
                    ")\u00aa\3\2\2\2+\u00ac\3\2\2\2-\u00ae\3\2\2\2/\u00b0\3\2\2\2\61\u00b2" +
                    "\3\2\2\2\63\u00b4\3\2\2\2\65\u00b6\3\2\2\2\67\u00b8\3\2\2\29\u00ba\3\2" +
                    "\2\2;\u00bc\3\2\2\2=\u00d8\3\2\2\2?@\7=\2\2@\4\3\2\2\2AB\7}\2\2B\6\3\2" +
                    "\2\2CD\7\177\2\2D\b\3\2\2\2EF\7.\2\2F\n\3\2\2\2GI\5\17\b\2HG\3\2\2\2I" +
                    "J\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\f\3\2\2\2LN\5\17\b\2ML\3\2\2\2NO\3\2\2" +
                    "\2OM\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QU\7\60\2\2RT\5\17\b\2SR\3\2\2\2TW\3\2" +
                    "\2\2US\3\2\2\2UV\3\2\2\2V_\3\2\2\2WU\3\2\2\2XZ\7\60\2\2Y[\5\17\b\2ZY\3" +
                    "\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^M\3\2\2\2^X\3\2\2\2" +
                    "_\16\3\2\2\2`a\4\62;\2a\20\3\2\2\2bc\7k\2\2cd\7p\2\2de\7v\2\2e\22\3\2" +
                    "\2\2fg\7h\2\2gh\7n\2\2hi\7q\2\2ij\7c\2\2jk\7v\2\2k\24\3\2\2\2lm\7U\2\2" +
                    "mn\7v\2\2no\7t\2\2op\7k\2\2pq\7p\2\2qr\7i\2\2r\26\3\2\2\2su\7$\2\2tv\5" +
                    "\31\r\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\7$\2\2x\30\3\2\2\2y{\5\33\16\2" +
                    "zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\32\3\2\2\2~\177\n\2\2\2\177" +
                    "\34\3\2\2\2\u0080\u0081\7r\2\2\u0081\u0082\7t\2\2\u0082\u0083\7k\2\2\u0083" +
                    "\u0084\7p\2\2\u0084\u0085\7v\2\2\u0085\36\3\2\2\2\u0086\u0087\7t\2\2\u0087" +
                    "\u0088\7g\2\2\u0088\u0089\7c\2\2\u0089\u008a\7f\2\2\u008a\u008b\7K\2\2" +
                    "\u008b\u008c\7p\2\2\u008c\u008d\7v\2\2\u008d \3\2\2\2\u008e\u008f\7t\2" +
                    "\2\u008f\u0090\7g\2\2\u0090\u0091\7c\2\2\u0091\u0092\7f\2\2\u0092\u0093" +
                    "\7H\2\2\u0093\u0094\7n\2\2\u0094\u0095\7q\2\2\u0095\u0096\7c\2\2\u0096" +
                    "\u0097\7v\2\2\u0097\"\3\2\2\2\u0098\u0099\7h\2\2\u0099\u009a\7w\2\2\u009a" +
                    "\u009b\7p\2\2\u009b$\3\2\2\2\u009c\u009d\7t\2\2\u009d\u009e\7g\2\2\u009e" +
                    "\u009f\7v\2\2\u009f\u00a0\7w\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7p\2\2" +
                    "\u00a2&\3\2\2\2\u00a3\u00a7\t\3\2\2\u00a4\u00a6\t\4\2\2\u00a5\u00a4\3" +
                    "\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8" +
                    "(\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7?\2\2\u00ab*\3\2\2\2\u00ac" +
                    "\u00ad\7<\2\2\u00ad,\3\2\2\2\u00ae\u00af\7$\2\2\u00af.\3\2\2\2\u00b0\u00b1" +
                    "\7-\2\2\u00b1\60\3\2\2\2\u00b2\u00b3\7/\2\2\u00b3\62\3\2\2\2\u00b4\u00b5" +
                    "\7,\2\2\u00b5\64\3\2\2\2\u00b6\u00b7\7\61\2\2\u00b7\66\3\2\2\2\u00b8\u00b9" +
                    "\7*\2\2\u00b98\3\2\2\2\u00ba\u00bb\7+\2\2\u00bb:\3\2\2\2\u00bc\u00bd\t" +
                    "\5\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\b\36\2\2\u00bf<\3\2\2\2\u00c0\u00c1" +
                    "\7\61\2\2\u00c1\u00c2\7\61\2\2\u00c2\u00c6\3\2\2\2\u00c3\u00c5\n\6\2\2" +
                    "\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7" +
                    "\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00cb\7\17\2\2" +
                    "\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00d9" +
                    "\7\f\2\2\u00cd\u00ce\7\61\2\2\u00ce\u00cf\7,\2\2\u00cf\u00d3\3\2\2\2\u00d0" +
                    "\u00d2\13\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d4\3" +
                    "\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6" +
                    "\u00d7\7,\2\2\u00d7\u00d9\7\61\2\2\u00d8\u00c0\3\2\2\2\u00d8\u00cd\3\2" +
                    "\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\b\37\2\2\u00db>\3\2\2\2\17\2JOU\\" +
                    "^u|\u00a7\u00c6\u00ca\u00d3\u00d8\3\b\2\2";
	private static final String[] _LITERAL_NAMES = {
            null, "';'", "'{'", "'}'", "','", null, null, "'int'", "'float'", "'String'",
            null, "'print'", "'readInt'", "'readFloat'", "'fun'", "'return'", null,
            "'='", "':'", "'\"'", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, null, null, null, null, "NUMBER", "NUMBER_FLOAT", "INT", "FLOAT",
            "STRING", "STRING_LITERAL", "PRINT", "READ_INT", "READ_FLOAT", "FUN",
            "RETURN", "ID", "EQUALS", "COLON", "DOUBLE_QUOTE", "ADD", "MINUS", "MUTLIPLY",
            "DIVIDE", "LEFT_BRACKET", "RIGHT_BRACKET", "WS", "COMMENT"
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
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}