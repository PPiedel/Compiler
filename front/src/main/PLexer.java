// Generated from /home/ppiedel/IdeaProjects/Compiler/front/src/main/P.g4 by ANTLR 4.7
package main;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, COMMENT=5, NUMBER=6, INT=7, FLOAT=8, PRINT=9, 
		FUN=10, ID=11, EQUALS=12, COLON=13, LEFT_BRACKET=14, RIGHT_BRACKET=15, 
		WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "COMMENT", "NUMBER", "INT", "FLOAT", "PRINT", 
		"FUN", "ID", "EQUALS", "COLON", "LEFT_BRACKET", "RIGHT_BRACKET", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'{'", "'}'", "','", null, null, "'int'", "'float'", "'print'", 
		"'fun'", null, "'='", "':'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "COMMENT", "NUMBER", "INT", "FLOAT", "PRINT", 
		"FUN", "ID", "EQUALS", "COLON", "LEFT_BRACKET", "RIGHT_BRACKET", "WS"
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22s\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\7\6\60\n\6\f\6\16\6\63\13\6\3\6"+
		"\5\6\66\n\6\3\6\3\6\3\6\3\6\3\6\7\6=\n\6\f\6\16\6@\13\6\3\6\3\6\5\6D\n"+
		"\6\3\6\3\6\3\7\6\7I\n\7\r\7\16\7J\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\7\fc\n\f\f\f"+
		"\16\ff\13\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3>\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22\3\2\6\4\2\f\f\17\17\4\2C\\c|\5\2\62;C\\c|\5\2\f\f\17"+
		"\17\"\"\2x\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\3#\3\2\2\2\5%\3\2\2\2\7\'\3\2\2\2\t)\3\2\2\2\13C\3\2\2\2\rH\3\2\2\2"+
		"\17L\3\2\2\2\21P\3\2\2\2\23V\3\2\2\2\25\\\3\2\2\2\27`\3\2\2\2\31g\3\2"+
		"\2\2\33i\3\2\2\2\35k\3\2\2\2\37m\3\2\2\2!o\3\2\2\2#$\7=\2\2$\4\3\2\2\2"+
		"%&\7}\2\2&\6\3\2\2\2\'(\7\177\2\2(\b\3\2\2\2)*\7.\2\2*\n\3\2\2\2+,\7\61"+
		"\2\2,-\7\61\2\2-\61\3\2\2\2.\60\n\2\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3"+
		"\2\2\2\61\62\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\64\66\7\17\2\2\65\64"+
		"\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\67D\7\f\2\289\7\61\2\29:\7,\2\2:"+
		">\3\2\2\2;=\13\2\2\2<;\3\2\2\2=@\3\2\2\2>?\3\2\2\2><\3\2\2\2?A\3\2\2\2"+
		"@>\3\2\2\2AB\7,\2\2BD\7\61\2\2C+\3\2\2\2C8\3\2\2\2DE\3\2\2\2EF\b\6\2\2"+
		"F\f\3\2\2\2GI\4\62;\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\16\3\2"+
		"\2\2LM\7k\2\2MN\7p\2\2NO\7v\2\2O\20\3\2\2\2PQ\7h\2\2QR\7n\2\2RS\7q\2\2"+
		"ST\7c\2\2TU\7v\2\2U\22\3\2\2\2VW\7r\2\2WX\7t\2\2XY\7k\2\2YZ\7p\2\2Z[\7"+
		"v\2\2[\24\3\2\2\2\\]\7h\2\2]^\7w\2\2^_\7p\2\2_\26\3\2\2\2`d\t\3\2\2ac"+
		"\t\4\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\30\3\2\2\2fd\3\2\2\2"+
		"gh\7?\2\2h\32\3\2\2\2ij\7<\2\2j\34\3\2\2\2kl\7*\2\2l\36\3\2\2\2mn\7+\2"+
		"\2n \3\2\2\2op\t\5\2\2pq\3\2\2\2qr\b\21\2\2r\"\3\2\2\2\t\2\61\65>CJd\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}