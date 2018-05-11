// Generated from /home/ppiedel/IdeaProjects/Compiler/front/src/main/P.g4 by ANTLR 4.7
package main;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, COMMENT=4, NUMBER=5, INT=6, FLOAT=7, ID=8, EQUALS=9, 
		WS=10;
	public static final int
		RULE_program = 0, RULE_body = 1, RULE_statement = 2, RULE_expression = 3, 
		RULE_assignment = 4, RULE_variable_declaration = 5;
	public static final String[] ruleNames = {
		"program", "body", "statement", "expression", "assignment", "variable_declaration"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'{'", "'}'", null, null, "'int'", "'float'", null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "COMMENT", "NUMBER", "INT", "FLOAT", "ID", "EQUALS", 
		"WS"
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ProgramContext)_localctx).val =  new Front.Program(); 
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(13);
				match(T__0);
				}
				}
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << INT) | (1L << FLOAT) | (1L << ID))) != 0)) {
				{
				{
				{
				setState(19);
				((ProgramContext)_localctx).statement = statement();
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(20);
					match(T__0);
					}
					}
					setState(23); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
				 _localctx.val.statements.add(((ProgramContext)_localctx).statement.val); 
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class BodyContext extends ParserRuleContext {
		public Front.Body val;
		public StatementContext a;
		public StatementContext b;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(T__1);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NUMBER) | (1L << INT) | (1L << FLOAT) | (1L << ID))) != 0)) {
				{
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(33);
					match(T__0);
					}
					}
					setState(38);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(39);
				((BodyContext)_localctx).a = statement();
				 ((BodyContext)_localctx).val =  new Front.Body(); _localctx.val.add(((BodyContext)_localctx).a.val); 
				setState(51);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(42); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(41);
							match(T__0);
							}
							}
							setState(44); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==T__0 );
						setState(46);
						((BodyContext)_localctx).b = statement();
						 _localctx.val.add(((BodyContext)_localctx).b.val); 
						}
						} 
					}
					setState(53);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(54);
					match(T__0);
					}
					}
					setState(57); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
			}

			setState(61);
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

	public static class StatementContext extends ParserRuleContext {
		public Front.Statement val;
		public ExpressionContext a;
		public Variable_declarationContext c;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				((StatementContext)_localctx).a = expression();
				((StatementContext)_localctx).val =  new Front.StatementExpression(((StatementContext)_localctx).a.val); 
				}
				break;
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				((StatementContext)_localctx).c = variable_declaration();
				 ((StatementContext)_localctx).val =  ((StatementContext)_localctx).c.val; 
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

	public static class ExpressionContext extends ParserRuleContext {
		public Front.Expression val;
		public Token a;
		public AssignmentContext d;
		public TerminalNode NUMBER() { return getToken(PParser.NUMBER, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expression);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				((ExpressionContext)_localctx).a = match(NUMBER);
				 ((ExpressionContext)_localctx).val =  new Front.IntExpression((((ExpressionContext)_localctx).a!=null?((ExpressionContext)_localctx).a.getText():null)); 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				((ExpressionContext)_localctx).d = assignment();
				 ((ExpressionContext)_localctx).val =  ((ExpressionContext)_localctx).d.val; 
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

	public static class AssignmentContext extends ParserRuleContext {
		public Front.Assignment val;
		public Token to;
		public ExpressionContext what;
		public TerminalNode ID() { return getToken(PParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			((AssignmentContext)_localctx).to = match(ID);
			setState(79);
			match(EQUALS);
			setState(80);
			((AssignmentContext)_localctx).what = expression();
			 ((AssignmentContext)_localctx).val =  new Front.Assignment((((AssignmentContext)_localctx).to!=null?((AssignmentContext)_localctx).to.getText():null), ((AssignmentContext)_localctx).what.val); 
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

	public static class Variable_declarationContext extends ParserRuleContext {
		public Front.VariableDeclaration val;
		public Token name;
		public Token value;
		public TerminalNode INT() { return getToken(PParser.INT, 0); }
		public TerminalNode EQUALS() { return getToken(PParser.EQUALS, 0); }
		public TerminalNode ID() { return getToken(PParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(PParser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(PParser.FLOAT, 0); }
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitVariable_declaration(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable_declaration);
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(INT);
				setState(84);
				((Variable_declarationContext)_localctx).name = match(ID);
				setState(85);
				match(EQUALS);
				setState(86);
				((Variable_declarationContext)_localctx).value = match(NUMBER);
				 ((Variable_declarationContext)_localctx).val =  new Front.IntVariableDeclaration((((Variable_declarationContext)_localctx).name!=null?((Variable_declarationContext)_localctx).name.getText():null),(((Variable_declarationContext)_localctx).value!=null?((Variable_declarationContext)_localctx).value.getText():null)); 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(FLOAT);
				setState(89);
				((Variable_declarationContext)_localctx).name = match(ID);
				setState(90);
				match(EQUALS);
				setState(91);
				((Variable_declarationContext)_localctx).value = match(NUMBER);
				 ((Variable_declarationContext)_localctx).val =  new Front.FloatVariableDeclaration((((Variable_declarationContext)_localctx).name!=null?((Variable_declarationContext)_localctx).name.getText():null),(((Variable_declarationContext)_localctx).value!=null?((Variable_declarationContext)_localctx).value.getText():null)); 
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\fb\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\7\2\21\n\2\f\2\16\2\24\13\2"+
		"\3\2\3\2\6\2\30\n\2\r\2\16\2\31\3\2\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\3"+
		"\3\3\7\3%\n\3\f\3\16\3(\13\3\3\3\3\3\3\3\6\3-\n\3\r\3\16\3.\3\3\3\3\3"+
		"\3\7\3\64\n\3\f\3\16\3\67\13\3\3\3\6\3:\n\3\r\3\16\3;\5\3>\n\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4H\n\4\3\5\3\5\3\5\3\5\3\5\5\5O\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7`\n\7\3\7\2\2"+
		"\b\2\4\6\b\n\f\2\2\2f\2\16\3\2\2\2\4\"\3\2\2\2\6G\3\2\2\2\bN\3\2\2\2\n"+
		"P\3\2\2\2\f_\3\2\2\2\16\22\b\2\1\2\17\21\7\3\2\2\20\17\3\2\2\2\21\24\3"+
		"\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\37\3\2\2\2\24\22\3\2\2\2\25\27\5"+
		"\6\4\2\26\30\7\3\2\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3"+
		"\2\2\2\32\33\3\2\2\2\33\34\b\2\1\2\34\36\3\2\2\2\35\25\3\2\2\2\36!\3\2"+
		"\2\2\37\35\3\2\2\2\37 \3\2\2\2 \3\3\2\2\2!\37\3\2\2\2\"=\7\4\2\2#%\7\3"+
		"\2\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\')\3\2\2\2(&\3\2\2\2)*\5"+
		"\6\4\2*\65\b\3\1\2+-\7\3\2\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/"+
		"\60\3\2\2\2\60\61\5\6\4\2\61\62\b\3\1\2\62\64\3\2\2\2\63,\3\2\2\2\64\67"+
		"\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\669\3\2\2\2\67\65\3\2\2\28:\7\3\2"+
		"\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=&\3\2\2\2=>\3\2\2"+
		"\2>?\3\2\2\2?@\7\5\2\2@\5\3\2\2\2AB\5\b\5\2BC\b\4\1\2CH\3\2\2\2DE\5\f"+
		"\7\2EF\b\4\1\2FH\3\2\2\2GA\3\2\2\2GD\3\2\2\2H\7\3\2\2\2IJ\7\7\2\2JO\b"+
		"\5\1\2KL\5\n\6\2LM\b\5\1\2MO\3\2\2\2NI\3\2\2\2NK\3\2\2\2O\t\3\2\2\2PQ"+
		"\7\n\2\2QR\7\13\2\2RS\5\b\5\2ST\b\6\1\2T\13\3\2\2\2UV\7\b\2\2VW\7\n\2"+
		"\2WX\7\13\2\2XY\7\7\2\2Y`\b\7\1\2Z[\7\t\2\2[\\\7\n\2\2\\]\7\13\2\2]^\7"+
		"\7\2\2^`\b\7\1\2_U\3\2\2\2_Z\3\2\2\2`\r\3\2\2\2\r\22\31\37&.\65;=GN_";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}