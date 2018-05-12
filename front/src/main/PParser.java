// Generated from /home/ppiedel/IdeaProjects/Compiler/front/src/main/P.g4 by ANTLR 4.7
package main;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PParser extends Parser {
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
	public static final int
            RULE_program = 0, RULE_body = 1, RULE_function = 2, RULE_statement = 3,
            RULE_expression = 4, RULE_assignment = 5, RULE_variable_declaration = 6,
            RULE_array = 7, RULE_print = 8, RULE_returnst = 9, RULE_read = 10;
	public static final String[] ruleNames = {
            "program", "body", "function", "statement", "expression", "assignment",
            "variable_declaration", "array", "print", "returnst", "read"
	};
	public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00e3\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\2\3\2\6\2\"\n\2\r\2" +
                    "\16\2#\3\2\3\2\3\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\7\2\61\n\2\f\2" +
                    "\16\2\64\13\2\3\3\3\3\7\38\n\3\f\3\16\3;\13\3\3\3\3\3\3\3\6\3@\n\3\r\3" +
                    "\16\3A\3\3\3\3\3\3\7\3G\n\3\f\3\16\3J\13\3\3\3\6\3M\n\3\r\3\16\3N\5\3" +
                    "Q\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4]\n\4\f\4\16\4`\13\4" +
                    "\5\4b\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5" +
                    "\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5z\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6" +
                    "\3\6\5\6\u0085\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6" +
                    "\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u009b\n\6\f\6\16\6\u009e\13\6\3\7\3\7" +
                    "\3\7\3\7\3\7\3\7\5\7\u00a6\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b" +
                    "\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ba\n\b\3\t\3\t\3\t\3\t\3\t\3\t" +
                    "\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3" +
                    "\13\3\13\5\13\u00d4\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5" +
                    "\f\u00e1\n\f\3\f\2\3\n\r\2\4\6\b\n\f\16\20\22\24\26\2\3\3\2\n\13\2\u00f5" +
                    "\2\30\3\2\2\2\4\65\3\2\2\2\6T\3\2\2\2\by\3\2\2\2\n\u0084\3\2\2\2\f\u00a5" +
                    "\3\2\2\2\16\u00b9\3\2\2\2\20\u00bb\3\2\2\2\22\u00c7\3\2\2\2\24\u00d3\3" +
                    "\2\2\2\26\u00e0\3\2\2\2\30\34\b\2\1\2\31\33\7\3\2\2\32\31\3\2\2\2\33\36" +
                    "\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\62\3\2\2\2\36\34\3\2\2\2\37!\5" +
                    "\b\5\2 \"\7\3\2\2! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$%\3\2\2\2%" +
                    "&\b\2\1\2&\61\3\2\2\2\'+\5\6\4\2(*\7\3\2\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2" +
                    "\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2./\b\2\1\2/\61\3\2\2\2\60\37\3\2\2\2\60" +
                    "\'\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\3\3\2\2\2\64\62" +
                    "\3\2\2\2\65P\7\4\2\2\668\7\3\2\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29" +
                    ":\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\5\b\5\2=H\b\3\1\2>@\7\3\2\2?>\3\2\2\2" +
                    "@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\5\b\5\2DE\b\3\1\2EG\3\2\2\2" +
                    "F?\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IL\3\2\2\2JH\3\2\2\2KM\7\3\2\2" +
                    "LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2P9\3\2\2\2PQ\3\2\2\2" +
                    "QR\3\2\2\2RS\7\5\2\2S\5\3\2\2\2TU\7\21\2\2UV\7\23\2\2Va\7\33\2\2WX\7\23" +
                    "\2\2X^\b\4\1\2YZ\7\6\2\2Z[\7\23\2\2[]\b\4\1\2\\Y\3\2\2\2]`\3\2\2\2^\\" +
                    "\3\2\2\2^_\3\2\2\2_b\3\2\2\2`^\3\2\2\2aW\3\2\2\2ab\3\2\2\2bc\3\2\2\2c" +
                    "d\7\34\2\2de\7\25\2\2ef\t\2\2\2fg\b\4\1\2gh\5\4\3\2hi\b\4\1\2i\7\3\2\2" +
                    "\2jk\5\n\6\2kl\b\5\1\2lz\3\2\2\2mn\5\16\b\2no\b\5\1\2oz\3\2\2\2pq\5\22" +
                    "\n\2qr\b\5\1\2rz\3\2\2\2st\5\24\13\2tu\b\5\1\2uz\3\2\2\2vw\5\26\f\2wx" +
                    "\b\5\1\2xz\3\2\2\2yj\3\2\2\2ym\3\2\2\2yp\3\2\2\2ys\3\2\2\2yv\3\2\2\2z" +
                    "\t\3\2\2\2{|\b\6\1\2|}\7\b\2\2}\u0085\b\6\1\2~\177\7\23\2\2\177\u0085" +
                    "\b\6\1\2\u0080\u0081\5\f\7\2\u0081\u0082\b\6\1\2\u0082\u0085\3\2\2\2\u0083" +
                    "\u0085\3\2\2\2\u0084{\3\2\2\2\u0084~\3\2\2\2\u0084\u0080\3\2\2\2\u0084" +
                    "\u0083\3\2\2\2\u0085\u009c\3\2\2\2\u0086\u0087\f\7\2\2\u0087\u0088\7\27" +
                    "\2\2\u0088\u0089\5\n\6\b\u0089\u008a\b\6\1\2\u008a\u009b\3\2\2\2\u008b" +
                    "\u008c\f\6\2\2\u008c\u008d\7\30\2\2\u008d\u008e\5\n\6\7\u008e\u008f\b" +
                    "\6\1\2\u008f\u009b\3\2\2\2\u0090\u0091\f\5\2\2\u0091\u0092\7\31\2\2\u0092" +
                    "\u0093\5\n\6\6\u0093\u0094\b\6\1\2\u0094\u009b\3\2\2\2\u0095\u0096\f\4" +
                    "\2\2\u0096\u0097\7\32\2\2\u0097\u0098\5\n\6\5\u0098\u0099\b\6\1\2\u0099" +
                    "\u009b\3\2\2\2\u009a\u0086\3\2\2\2\u009a\u008b\3\2\2\2\u009a\u0090\3\2" +
                    "\2\2\u009a\u0095\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c" +
                    "\u009d\3\2\2\2\u009d\13\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\23\2" +
                    "\2\u00a0\u00a1\7\24\2\2\u00a1\u00a2\5\n\6\2\u00a2\u00a3\b\7\1\2\u00a3" +
                    "\u00a6\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u009f\3\2\2\2\u00a5\u00a4\3\2" +
                    "\2\2\u00a6\r\3\2\2\2\u00a7\u00a8\7\n\2\2\u00a8\u00a9\7\23\2\2\u00a9\u00aa" +
                    "\7\24\2\2\u00aa\u00ab\7\b\2\2\u00ab\u00ba\b\b\1\2\u00ac\u00ad\7\13\2\2" +
                    "\u00ad\u00ae\7\23\2\2\u00ae\u00af\7\24\2\2\u00af\u00b0\7\t\2\2\u00b0\u00ba" +
                    "\b\b\1\2\u00b1\u00b2\7\f\2\2\u00b2\u00b3\7\23\2\2\u00b3\u00b4\7\24\2\2" +
                    "\u00b4\u00b5\7\r\2\2\u00b5\u00ba\b\b\1\2\u00b6\u00b7\5\20\t\2\u00b7\u00b8" +
                    "\b\b\1\2\u00b8\u00ba\3\2\2\2\u00b9\u00a7\3\2\2\2\u00b9\u00ac\3\2\2\2\u00b9" +
                    "\u00b1\3\2\2\2\u00b9\u00b6\3\2\2\2\u00ba\17\3\2\2\2\u00bb\u00bc\7\n\2" +
                    "\2\u00bc\u00bd\7\35\2\2\u00bd\u00be\7\36\2\2\u00be\u00bf\7\23\2\2\u00bf" +
                    "\u00c0\7\24\2\2\u00c0\u00c1\7\7\2\2\u00c1\u00c2\7\n\2\2\u00c2\u00c3\7" +
                    "\35\2\2\u00c3\u00c4\7\b\2\2\u00c4\u00c5\7\36\2\2\u00c5\u00c6\b\t\1\2\u00c6" +
                    "\21\3\2\2\2\u00c7\u00c8\7\16\2\2\u00c8\u00c9\7\33\2\2\u00c9\u00ca\7\23" +
                    "\2\2\u00ca\u00cb\7\34\2\2\u00cb\u00cc\b\n\1\2\u00cc\23\3\2\2\2\u00cd\u00ce" +
                    "\7\22\2\2\u00ce\u00cf\7\b\2\2\u00cf\u00d4\b\13\1\2\u00d0\u00d1\7\22\2" +
                    "\2\u00d1\u00d2\7\t\2\2\u00d2\u00d4\b\13\1\2\u00d3\u00cd\3\2\2\2\u00d3" +
                    "\u00d0\3\2\2\2\u00d4\25\3\2\2\2\u00d5\u00d6\7\17\2\2\u00d6\u00d7\7\33" +
                    "\2\2\u00d7\u00d8\7\23\2\2\u00d8\u00d9\7\34\2\2\u00d9\u00e1\b\f\1\2\u00da" +
                    "\u00db\7\20\2\2\u00db\u00dc\7\33\2\2\u00dc\u00dd\7\23\2\2\u00dd\u00de" +
                    "\7\34\2\2\u00de\u00e1\b\f\1\2\u00df\u00e1\3\2\2\2\u00e0\u00d5\3\2\2\2" +
                    "\u00e0\u00da\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\27\3\2\2\2\26\34#+\60\62" +
                    "9AHNP^ay\u0084\u009a\u009c\u00a5\u00b9\u00d3\u00e0";
	private static final String[] _LITERAL_NAMES = {
            null, "';'", "'{'", "'}'", "','", "'new'", null, null, "'int'", "'float'",
            "'String'", null, "'print'", "'readInt'", "'readFloat'", "'fun'", "'return'",
            null, "'='", "':'", "'\"'", "'+'", "'-'", "'*'", "'/'", "'('", "')'",
            "'['", "']'"
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

	@Override
	public String getGrammarFileName() { return "P.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Front.Program val;
		public StatementContext statement;
		public FunctionContext function;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitProgram(this);
		}
	}

    private static final String[] _SYMBOLIC_NAMES = {
            null, null, null, null, null, "NEW", "NUMBER", "NUMBER_FLOAT", "INT",
            "FLOAT", "STRING", "STRING_LITERAL", "PRINT", "READ_INT", "READ_FLOAT",
            "FUN", "RETURN", "ID", "EQUALS", "COLON", "DOUBLE_QUOTE", "ADD", "MINUS",
            "MUTLIPLY", "DIVIDE", "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_SQUARE_BRACKET",
            "RIGHT_SQUARE_BRACKET", "WS", "COMMENT"
    };

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
                ((ProgramContext) _localctx).val = new Front.Program();
                setState(26);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
                        setState(23);
					match(T__0);
					}
                    }
				}
                setState(28);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
                setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
                        setState(46);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						{
                            setState(29);
						((ProgramContext)_localctx).statement = statement();
                            setState(31);
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
                                    setState(30);
								match(T__0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
                            setState(33);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
                            _localctx.val.statements.add(((ProgramContext) _localctx).statement.val);
						}
						break;
					case 2:
						{
						{
                            setState(37);
						((ProgramContext)_localctx).function = function();
                            setState(41);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
                                    setState(38);
								match(T__0);
								}
                                }
							}
                            setState(43);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
						}
						}
                            _localctx.val.functions.add(((ProgramContext) _localctx).function.val);
						}
						break;
					}
                    }
				}
                setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
                setState(51);
			match(T__1);
                setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
                    setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
                            setState(52);
						match(T__0);
						}
                        }
					}
                    setState(57);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
                    setState(58);
				((BodyContext)_localctx).a = statement();
                    ((BodyContext) _localctx).val = new Front.Body();
                    _localctx.val.add(((BodyContext) _localctx).a.val);
                    setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
                            setState(61);
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
                                    setState(60);
								match(T__0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
                            setState(63);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
                            setState(65);
						((BodyContext)_localctx).b = statement();
                            _localctx.val.add(((BodyContext) _localctx).b.val);
						}
                        }
					}
                    setState(72);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
                    setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
                        setState(73);
					match(T__0);
					}
					}
                    setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
				break;
			}
                setState(80);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(82);
			match(FUN);
                setState(83);
			((FunctionContext)_localctx).name = match(ID);
                setState(84);
			match(LEFT_BRACKET);
                setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
                    setState(85);
				((FunctionContext)_localctx).arg1 = match(ID);
                    _localctx.val.addArg((((FunctionContext) _localctx).arg1 != null ? ((FunctionContext) _localctx).arg1.getText() : null));
                    setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
                        setState(87);
					match(T__3);
                        setState(88);
					((FunctionContext)_localctx).arg2 = match(ID);
                        _localctx.val.addArg((((FunctionContext) _localctx).arg2 != null ? ((FunctionContext) _localctx).arg2.getText() : null));
					}
					}
                    setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

                setState(97);
			match(RIGHT_BRACKET);
                setState(98);
			match(COLON);
                setState(99);
			((FunctionContext)_localctx).returnType = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
				((FunctionContext)_localctx).returnType = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
                ((FunctionContext) _localctx).val = new Front.Function((((FunctionContext) _localctx).name != null ? ((FunctionContext) _localctx).name.getText() : null), (((FunctionContext) _localctx).returnType != null ? ((FunctionContext) _localctx).returnType.getText() : null));
                setState(101);
			((FunctionContext)_localctx).body = body();
                _localctx.val.setBody(((FunctionContext) _localctx).body.val);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

    public final ExpressionContext expression() throws RecognitionException {
        return expression(0);
    }

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
            setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
                    setState(104);
				((StatementContext)_localctx).a = expression(0);
                    ((StatementContext) _localctx).val = new Front.StatementExpression(((StatementContext) _localctx).a.val);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
                    setState(107);
				((StatementContext)_localctx).c = variable_declaration();
                    ((StatementContext) _localctx).val = ((StatementContext) _localctx).c.val;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
                    setState(110);
				((StatementContext)_localctx).d = print();
                    {
                        ((StatementContext) _localctx).val = ((StatementContext) _localctx).d.val;
                    }
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
                    setState(113);
				((StatementContext)_localctx).e = returnst();
                    {
                        ((StatementContext) _localctx).val = ((StatementContext) _localctx).e.val;
                    }
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
                    setState(116);
				((StatementContext)_localctx).f = read();
                    {
                        ((StatementContext) _localctx).val = ((StatementContext) _localctx).f.val;
                    }
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
                setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
                    setState(122);
				((ExpressionContext)_localctx).a = match(NUMBER);
                    ((ExpressionContext) _localctx).val = new Front.NumberExpression((((ExpressionContext) _localctx).a != null ? ((ExpressionContext) _localctx).a.getText() : null));
				}
				break;
			case 2:
				{
                    setState(124);
				((ExpressionContext)_localctx).b = match(ID);
                    ((ExpressionContext) _localctx).val = new Front.IdExpression((((ExpressionContext) _localctx).b != null ? ((ExpressionContext) _localctx).b.getText() : null));
				}
				break;
			case 3:
				{
                    setState(126);
				((ExpressionContext)_localctx).c = assignment();
                    ((ExpressionContext) _localctx).val = ((ExpressionContext) _localctx).c.val;
				}
				break;
			case 4:
				{
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
                setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
                        setState(152);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.d = _prevctx;
						_localctx.d = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
                            setState(132);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                            setState(133);
						match(ADD);
                            setState(134);
						((ExpressionContext)_localctx).e = expression(6);
                            ((ExpressionContext) _localctx).val = new Front.AddExpression(((ExpressionContext) _localctx).d.val, ((ExpressionContext) _localctx).e.val);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.f = _prevctx;
						_localctx.f = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
                            setState(137);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                            setState(138);
						match(MINUS);
                            setState(139);
						((ExpressionContext)_localctx).g = expression(5);
                            ((ExpressionContext) _localctx).val = new Front.MinusExpression(((ExpressionContext) _localctx).f.val, ((ExpressionContext) _localctx).g.val);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.h = _prevctx;
						_localctx.h = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
                            setState(142);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                            setState(143);
						match(MUTLIPLY);
                            setState(144);
						((ExpressionContext)_localctx).i = expression(4);
                            ((ExpressionContext) _localctx).val = new Front.MultiplyExpression(((ExpressionContext) _localctx).h.val, ((ExpressionContext) _localctx).i.val);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.j = _prevctx;
						_localctx.j = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
                            setState(147);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                            setState(148);
						match(DIVIDE);
                            setState(149);
						((ExpressionContext)_localctx).k = expression(3);
                            ((ExpressionContext) _localctx).val = new Front.DivideExpression(((ExpressionContext) _localctx).j.val, ((ExpressionContext) _localctx).k.val);
						}
						break;
					}
                    }
				}
                setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
            setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
                    setState(157);
				((AssignmentContext)_localctx).to = match(ID);
                    setState(158);
				match(EQUALS);
                    setState(159);
				((AssignmentContext)_localctx).what = expression(0);
                    ((AssignmentContext) _localctx).val = new Front.Assignment((((AssignmentContext) _localctx).to != null ? ((AssignmentContext) _localctx).to.getText() : null), ((AssignmentContext) _localctx).what.val);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variable_declaration);
		try {
            setState(183);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
                case 1:
				enterOuterAlt(_localctx, 1);
				{
                    setState(165);
				match(INT);
                    setState(166);
				((Variable_declarationContext)_localctx).name = match(ID);
                    setState(167);
				match(EQUALS);
                    setState(168);
				((Variable_declarationContext)_localctx).value = match(NUMBER);
                    ((Variable_declarationContext) _localctx).val = new Front.IntVariableDeclaration((((Variable_declarationContext) _localctx).name != null ? ((Variable_declarationContext) _localctx).name.getText() : null), (((Variable_declarationContext) _localctx).value != null ? ((Variable_declarationContext) _localctx).value.getText() : null));
				}
				break;
                case 2:
				enterOuterAlt(_localctx, 2);
				{
                    setState(170);
				match(FLOAT);
                    setState(171);
				((Variable_declarationContext)_localctx).name = match(ID);
                    setState(172);
				match(EQUALS);
                    setState(173);
				((Variable_declarationContext)_localctx).value = match(NUMBER_FLOAT);
                    ((Variable_declarationContext) _localctx).val = new Front.FloatVariableDeclaration((((Variable_declarationContext) _localctx).name != null ? ((Variable_declarationContext) _localctx).name.getText() : null), (((Variable_declarationContext) _localctx).value != null ? ((Variable_declarationContext) _localctx).value.getText() : null));
				}
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
				{
                    setState(175);
                    match(STRING);
                    setState(176);
                    ((Variable_declarationContext) _localctx).name = match(ID);
                    setState(177);
                    match(EQUALS);
                    setState(178);
                    ((Variable_declarationContext) _localctx).value = match(STRING_LITERAL);
                    ((Variable_declarationContext) _localctx).val = new Front.StringVariableDeclaration((((Variable_declarationContext) _localctx).name != null ? ((Variable_declarationContext) _localctx).name.getText() : null), (((Variable_declarationContext) _localctx).value != null ? ((Variable_declarationContext) _localctx).value.getText() : null));
				}
				break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(180);
                    ((Variable_declarationContext) _localctx).f = array();
                    {
                        ((Variable_declarationContext) _localctx).val = ((Variable_declarationContext) _localctx).f.val;
                    }
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ArrayContext array() throws RecognitionException {
        ArrayContext _localctx = new ArrayContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_array);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(185);
                match(INT);
                setState(186);
                match(LEFT_SQUARE_BRACKET);
                setState(187);
                match(RIGHT_SQUARE_BRACKET);
                setState(188);
                ((ArrayContext) _localctx).name = match(ID);
                setState(189);
                match(EQUALS);
                setState(190);
                match(NEW);
                setState(191);
                match(INT);
                setState(192);
                match(LEFT_SQUARE_BRACKET);
                setState(193);
                ((ArrayContext) _localctx).size = match(NUMBER);
                setState(194);
                match(RIGHT_SQUARE_BRACKET);
                ((ArrayContext) _localctx).val = new Front.ArrayInt((((ArrayContext) _localctx).name != null ? ((ArrayContext) _localctx).name.getText() : null), (((ArrayContext) _localctx).size != null ? ((ArrayContext) _localctx).size.getText() : null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(197);
			match(PRINT);
                setState(198);
			match(LEFT_BRACKET);
                setState(199);
			((PrintContext)_localctx).reference = match(ID);
                setState(200);
			match(RIGHT_BRACKET);
			((PrintContext)_localctx).val =  new Front.PrintIDStatement((((PrintContext)_localctx).reference!=null?((PrintContext)_localctx).reference.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public final ReturnstContext returnst() throws RecognitionException {
		ReturnstContext _localctx = new ReturnstContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_returnst);
		try {
            setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
                    setState(203);
				match(RETURN);
                    setState(204);
				((ReturnstContext)_localctx).NUMBER = match(NUMBER);
				((ReturnstContext)_localctx).val =  new Front.ReturnInt((((ReturnstContext)_localctx).NUMBER!=null?((ReturnstContext)_localctx).NUMBER.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
                    setState(206);
				match(RETURN);
                    setState(207);
				((ReturnstContext)_localctx).NUMBER_FLOAT = match(NUMBER_FLOAT);
				((ReturnstContext)_localctx).val =  new Front.ReturnFloat((((ReturnstContext)_localctx).NUMBER_FLOAT!=null?((ReturnstContext)_localctx).NUMBER_FLOAT.getText():null));
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_read);
		try {
            setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ_INT:
				enterOuterAlt(_localctx, 1);
				{
                    setState(211);
				match(READ_INT);
                    setState(212);
				match(LEFT_BRACKET);
                    setState(213);
				((ReadContext)_localctx).reference = match(ID);
                    setState(214);
				match(RIGHT_BRACKET);
				((ReadContext)_localctx).val =  new Front.ReadInt((((ReadContext)_localctx).reference!=null?((ReadContext)_localctx).reference.getText():null));
				}
				break;
			case READ_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
                    setState(216);
				match(READ_FLOAT);
                    setState(217);
				match(LEFT_BRACKET);
                    setState(218);
				((ReadContext)_localctx).reference = match(ID);
                    setState(219);
				match(RIGHT_BRACKET);
				((ReadContext)_localctx).val =  new Front.ReadFloat((((ReadContext)_localctx).reference!=null?((ReadContext)_localctx).reference.getText():null));
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}

	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

    public static class BodyContext extends ParserRuleContext {
        public Front.Body val;
        public StatementContext a;
        public StatementContext b;

        public BodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_body;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).enterBody(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).exitBody(this);
        }
    }

    public static class FunctionContext extends ParserRuleContext {
        public Front.Function val;
        public Token name;
        public Token arg1;
        public Token arg2;
        public Token returnType;
        public BodyContext body;

        public FunctionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode FUN() {
            return getToken(PParser.FUN, 0);
        }

        public TerminalNode COLON() {
            return getToken(PParser.COLON, 0);
        }

        public BodyContext body() {
            return getRuleContext(BodyContext.class, 0);
        }

        public List<TerminalNode> ID() {
            return getTokens(PParser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(PParser.ID, i);
        }

        public TerminalNode INT() {
            return getToken(PParser.INT, 0);
        }

        public TerminalNode FLOAT() {
            return getToken(PParser.FLOAT, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_function;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).enterFunction(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).exitFunction(this);
        }
    }

    public static class StatementContext extends ParserRuleContext {
        public Front.Statement val;
        public ExpressionContext a;
        public Variable_declarationContext c;
        public PrintContext d;
        public ReturnstContext e;
        public ReadContext f;

        public StatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public Variable_declarationContext variable_declaration() {
            return getRuleContext(Variable_declarationContext.class, 0);
        }

        public PrintContext print() {
            return getRuleContext(PrintContext.class, 0);
        }

        public ReturnstContext returnst() {
            return getRuleContext(ReturnstContext.class, 0);
        }

        public ReadContext read() {
            return getRuleContext(ReadContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).enterStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).exitStatement(this);
        }
    }

    public static class ExpressionContext extends ParserRuleContext {
        public Front.Expression val;
        public ExpressionContext d;
        public ExpressionContext f;
        public ExpressionContext h;
        public ExpressionContext j;
        public Token a;
        public Token b;
        public AssignmentContext c;
        public ExpressionContext e;
        public ExpressionContext g;
        public ExpressionContext i;
        public ExpressionContext k;

        public ExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode NUMBER() {
            return getToken(PParser.NUMBER, 0);
        }

        public TerminalNode ID() {
            return getToken(PParser.ID, 0);
        }

        public AssignmentContext assignment() {
            return getRuleContext(AssignmentContext.class, 0);
        }

        public TerminalNode ADD() {
            return getToken(PParser.ADD, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode MINUS() {
            return getToken(PParser.MINUS, 0);
        }

        public TerminalNode MUTLIPLY() {
            return getToken(PParser.MUTLIPLY, 0);
        }

        public TerminalNode DIVIDE() {
            return getToken(PParser.DIVIDE, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).enterExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).exitExpression(this);
        }
    }

    public static class AssignmentContext extends ParserRuleContext {
        public Front.Assignment val;
        public Token to;
        public ExpressionContext what;

        public AssignmentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ID() {
            return getToken(PParser.ID, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_assignment;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).enterAssignment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).exitAssignment(this);
        }
    }

    public static class PrintContext extends ParserRuleContext {
        public Front.PrintStatement val;
        public Token reference;

        public PrintContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode PRINT() {
            return getToken(PParser.PRINT, 0);
        }

        public TerminalNode LEFT_BRACKET() {
            return getToken(PParser.LEFT_BRACKET, 0);
        }

        public TerminalNode RIGHT_BRACKET() {
            return getToken(PParser.RIGHT_BRACKET, 0);
        }

        public TerminalNode ID() {
            return getToken(PParser.ID, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_print;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).enterPrint(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).exitPrint(this);
        }
    }

    public static class ReturnstContext extends ParserRuleContext {
        public Front.ReturnStatement val;
        public Token NUMBER;
        public Token NUMBER_FLOAT;

        public ReturnstContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode RETURN() {
            return getToken(PParser.RETURN, 0);
        }

        public TerminalNode NUMBER() {
            return getToken(PParser.NUMBER, 0);
        }

        public TerminalNode NUMBER_FLOAT() {
            return getToken(PParser.NUMBER_FLOAT, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_returnst;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).enterReturnst(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).exitReturnst(this);
        }
    }

    public static class ReadContext extends ParserRuleContext {
        public Front.Read val;
        public Token reference;

        public ReadContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode READ_INT() {
            return getToken(PParser.READ_INT, 0);
        }

        public TerminalNode LEFT_BRACKET() {
            return getToken(PParser.LEFT_BRACKET, 0);
        }

        public TerminalNode RIGHT_BRACKET() {
            return getToken(PParser.RIGHT_BRACKET, 0);
        }

        public TerminalNode ID() {
            return getToken(PParser.ID, 0);
        }

        public TerminalNode READ_FLOAT() {
            return getToken(PParser.READ_FLOAT, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_read;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).enterRead(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).exitRead(this);
        }
    }

    public static class Variable_declarationContext extends ParserRuleContext {
        public Front.VariableDeclaration val;
        public Token name;
        public Token value;
        public ArrayContext f;

        public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode INT() {
            return getToken(PParser.INT, 0);
        }

        public TerminalNode EQUALS() {
            return getToken(PParser.EQUALS, 0);
        }

        public TerminalNode ID() {
            return getToken(PParser.ID, 0);
        }

        public TerminalNode NUMBER() {
            return getToken(PParser.NUMBER, 0);
        }

        public TerminalNode FLOAT() {
            return getToken(PParser.FLOAT, 0);
        }

        public TerminalNode NUMBER_FLOAT() {
            return getToken(PParser.NUMBER_FLOAT, 0);
        }

        public TerminalNode STRING() {
            return getToken(PParser.STRING, 0);
        }

        public TerminalNode STRING_LITERAL() {
            return getToken(PParser.STRING_LITERAL, 0);
        }

        public ArrayContext array() {
            return getRuleContext(ArrayContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variable_declaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).enterVariable_declaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).exitVariable_declaration(this);
        }
    }

    public static class ArrayContext extends ParserRuleContext {
        public Front.Array val;
        public Token name;
        public Token size;

        public ArrayContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> INT() {
            return getTokens(PParser.INT);
        }

        public TerminalNode INT(int i) {
            return getToken(PParser.INT, i);
        }

        public List<TerminalNode> LEFT_SQUARE_BRACKET() {
            return getTokens(PParser.LEFT_SQUARE_BRACKET);
        }

        public TerminalNode LEFT_SQUARE_BRACKET(int i) {
            return getToken(PParser.LEFT_SQUARE_BRACKET, i);
        }

        public List<TerminalNode> RIGHT_SQUARE_BRACKET() {
            return getTokens(PParser.RIGHT_SQUARE_BRACKET);
        }

        public TerminalNode RIGHT_SQUARE_BRACKET(int i) {
            return getToken(PParser.RIGHT_SQUARE_BRACKET, i);
        }

        public TerminalNode EQUALS() {
            return getToken(PParser.EQUALS, 0);
        }

        public TerminalNode NEW() {
            return getToken(PParser.NEW, 0);
        }

        public TerminalNode ID() {
            return getToken(PParser.ID, 0);
        }

        public TerminalNode NUMBER() {
            return getToken(PParser.NUMBER, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_array;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).enterArray(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).exitArray(this);
        }
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