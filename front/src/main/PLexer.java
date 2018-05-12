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
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, COMMENT = 5, NUMBER = 6, NUMBER_FLOAT = 7, INT = 8,
            FLOAT = 9, STRING = 10, STRING_LITERAL = 11, PRINT = 12, READ_INT = 13, READ_FLOAT = 14,
            FUN = 15, RETURN = 16, ID = 17, TEXT = 18, EQUALS = 19, COLON = 20, DOUBLE_QUOTE = 21,
            ADD = 22, MINUS = 23, MUTLIPLY = 24, DIVIDE = 25, LEFT_BRACKET = 26, RIGHT_BRACKET = 27,
            WS = 28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
            "T__0", "T__1", "T__2", "T__3", "COMMENT", "NUMBER", "NUMBER_FLOAT", "DIGIT",
            "INT", "FLOAT", "STRING", "STRING_LITERAL", "StringCharacters", "StringCharacter",
            "PRINT", "READ_INT", "READ_FLOAT", "FUN", "RETURN", "ID", "TEXT", "EQUALS",
            "COLON", "DOUBLE_QUOTE", "ADD", "MINUS", "MUTLIPLY", "DIVIDE", "LEFT_BRACKET",
		"RIGHT_BRACKET", "WS"
	};
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00e2\b\1\4\2" +
                    "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4" +
                    "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22" +
                    "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31" +
                    "\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t" +
                    " \3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\7\6N\n\6\f\6\16\6Q\13" +
                    "\6\3\6\5\6T\n\6\3\6\3\6\3\6\3\6\3\6\7\6[\n\6\f\6\16\6^\13\6\3\6\3\6\5" +
                    "\6b\n\6\3\6\3\6\3\7\6\7g\n\7\r\7\16\7h\3\b\6\bl\n\b\r\b\16\bm\3\b\3\b" +
                    "\7\br\n\b\f\b\16\bu\13\b\3\b\3\b\6\by\n\b\r\b\16\bz\5\b}\n\b\3\t\3\t\3" +
                    "\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3" +
                    "\f\3\r\3\r\5\r\u0094\n\r\3\r\3\r\3\16\6\16\u0099\n\16\r\16\16\16\u009a" +
                    "\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21" +
                    "\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23" +
                    "\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\7\25\u00c4\n\25" +
                    "\f\25\16\25\u00c7\13\25\3\26\3\26\5\26\u00cb\n\26\3\27\3\27\3\30\3\30" +
                    "\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37" +
                    "\3 \3 \3 \3 \3\\\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\2\23\n\25\13\27\f" +
                    "\31\r\33\2\35\2\37\16!\17#\20%\21\'\22)\23+\24-\25/\26\61\27\63\30\65" +
                    "\31\67\329\33;\34=\35?\36\3\2\7\4\2\f\f\17\17\6\2\13\f\17\17$$^^\4\2C" +
                    "\\c|\5\2\62;C\\c|\5\2\f\f\17\17\"\"\2\u00eb\2\3\3\2\2\2\2\5\3\2\2\2\2" +
                    "\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\23\3\2" +
                    "\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2" +
                    "#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3" +
                    "\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2" +
                    "\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5C\3\2\2\2\7E\3\2\2\2\tG" +
                    "\3\2\2\2\13a\3\2\2\2\rf\3\2\2\2\17|\3\2\2\2\21~\3\2\2\2\23\u0080\3\2\2" +
                    "\2\25\u0084\3\2\2\2\27\u008a\3\2\2\2\31\u0091\3\2\2\2\33\u0098\3\2\2\2" +
                    "\35\u009c\3\2\2\2\37\u009e\3\2\2\2!\u00a4\3\2\2\2#\u00ac\3\2\2\2%\u00b6" +
                    "\3\2\2\2\'\u00ba\3\2\2\2)\u00c1\3\2\2\2+\u00ca\3\2\2\2-\u00cc\3\2\2\2" +
                    "/\u00ce\3\2\2\2\61\u00d0\3\2\2\2\63\u00d2\3\2\2\2\65\u00d4\3\2\2\2\67" +
                    "\u00d6\3\2\2\29\u00d8\3\2\2\2;\u00da\3\2\2\2=\u00dc\3\2\2\2?\u00de\3\2" +
                    "\2\2AB\7=\2\2B\4\3\2\2\2CD\7}\2\2D\6\3\2\2\2EF\7\177\2\2F\b\3\2\2\2GH" +
                    "\7.\2\2H\n\3\2\2\2IJ\7\61\2\2JK\7\61\2\2KO\3\2\2\2LN\n\2\2\2ML\3\2\2\2" +
                    "NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PS\3\2\2\2QO\3\2\2\2RT\7\17\2\2SR\3\2\2" +
                    "\2ST\3\2\2\2TU\3\2\2\2Ub\7\f\2\2VW\7\61\2\2WX\7,\2\2X\\\3\2\2\2Y[\13\2" +
                    "\2\2ZY\3\2\2\2[^\3\2\2\2\\]\3\2\2\2\\Z\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`" +
                    "\7,\2\2`b\7\61\2\2aI\3\2\2\2aV\3\2\2\2bc\3\2\2\2cd\b\6\2\2d\f\3\2\2\2" +
                    "eg\5\21\t\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\16\3\2\2\2jl\5\21" +
                    "\t\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2no\3\2\2\2os\7\60\2\2pr\5" +
                    "\21\t\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t}\3\2\2\2us\3\2\2\2vx" +
                    "\7\60\2\2wy\5\21\t\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2" +
                    "|k\3\2\2\2|v\3\2\2\2}\20\3\2\2\2~\177\4\62;\2\177\22\3\2\2\2\u0080\u0081" +
                    "\7k\2\2\u0081\u0082\7p\2\2\u0082\u0083\7v\2\2\u0083\24\3\2\2\2\u0084\u0085" +
                    "\7h\2\2\u0085\u0086\7n\2\2\u0086\u0087\7q\2\2\u0087\u0088\7c\2\2\u0088" +
                    "\u0089\7v\2\2\u0089\26\3\2\2\2\u008a\u008b\7U\2\2\u008b\u008c\7v\2\2\u008c" +
                    "\u008d\7t\2\2\u008d\u008e\7k\2\2\u008e\u008f\7p\2\2\u008f\u0090\7i\2\2" +
                    "\u0090\30\3\2\2\2\u0091\u0093\7$\2\2\u0092\u0094\5\33\16\2\u0093\u0092" +
                    "\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\7$\2\2\u0096" +
                    "\32\3\2\2\2\u0097\u0099\5\35\17\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2" +
                    "\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\34\3\2\2\2\u009c\u009d" +
                    "\n\3\2\2\u009d\36\3\2\2\2\u009e\u009f\7r\2\2\u009f\u00a0\7t\2\2\u00a0" +
                    "\u00a1\7k\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7v\2\2\u00a3 \3\2\2\2\u00a4" +
                    "\u00a5\7t\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7f\2\2" +
                    "\u00a8\u00a9\7K\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7v\2\2\u00ab\"\3\2" +
                    "\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7c\2\2\u00af\u00b0" +
                    "\7f\2\2\u00b0\u00b1\7H\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3\7q\2\2\u00b3" +
                    "\u00b4\7c\2\2\u00b4\u00b5\7v\2\2\u00b5$\3\2\2\2\u00b6\u00b7\7h\2\2\u00b7" +
                    "\u00b8\7w\2\2\u00b8\u00b9\7p\2\2\u00b9&\3\2\2\2\u00ba\u00bb\7t\2\2\u00bb" +
                    "\u00bc\7g\2\2\u00bc\u00bd\7v\2\2\u00bd\u00be\7w\2\2\u00be\u00bf\7t\2\2" +
                    "\u00bf\u00c0\7p\2\2\u00c0(\3\2\2\2\u00c1\u00c5\t\4\2\2\u00c2\u00c4\t\5" +
                    "\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5" +
                    "\u00c6\3\2\2\2\u00c6*\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb\5)\25\2" +
                    "\u00c9\u00cb\4\13\f\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb,\3" +
                    "\2\2\2\u00cc\u00cd\7?\2\2\u00cd.\3\2\2\2\u00ce\u00cf\7<\2\2\u00cf\60\3" +
                    "\2\2\2\u00d0\u00d1\7$\2\2\u00d1\62\3\2\2\2\u00d2\u00d3\7-\2\2\u00d3\64" +
                    "\3\2\2\2\u00d4\u00d5\7/\2\2\u00d5\66\3\2\2\2\u00d6\u00d7\7,\2\2\u00d7" +
                    "8\3\2\2\2\u00d8\u00d9\7\61\2\2\u00d9:\3\2\2\2\u00da\u00db\7*\2\2\u00db" +
                    "<\3\2\2\2\u00dc\u00dd\7+\2\2\u00dd>\3\2\2\2\u00de\u00df\t\6\2\2\u00df" +
                    "\u00e0\3\2\2\2\u00e0\u00e1\b \2\2\u00e1@\3\2\2\2\20\2OS\\ahmsz|\u0093" +
                    "\u009a\u00c5\u00ca\3\b\2\2";
	private static final String[] _LITERAL_NAMES = {
            null, "';'", "'{'", "'}'", "','", null, null, null, "'int'", "'float'",
            "'String'", null, "'print'", "'readInt'", "'readFloat'", "'fun'", "'return'",
            null, null, "'='", "':'", "'\"'", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
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

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public PLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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

    private static final String[] _SYMBOLIC_NAMES = {
            null, null, null, null, null, "COMMENT", "NUMBER", "NUMBER_FLOAT", "INT",
            "FLOAT", "STRING", "STRING_LITERAL", "PRINT", "READ_INT", "READ_FLOAT",
            "FUN", "RETURN", "ID", "TEXT", "EQUALS", "COLON", "DOUBLE_QUOTE", "ADD",
            "MINUS", "MUTLIPLY", "DIVIDE", "LEFT_BRACKET", "RIGHT_BRACKET", "WS"
    };
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}