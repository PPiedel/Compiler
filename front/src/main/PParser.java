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
		T__0=1, T__1=2, T__2=3, T__3=4, COMMENT=5, NUMBER=6, NUMBER_FLOAT=7, INT=8, 
		FLOAT=9, PRINT=10, FUN=11, RETURN=12, ID=13, EQUALS=14, COLON=15, LEFT_BRACKET=16, 
		RIGHT_BRACKET=17, WS=18;
	public static final int
		RULE_program = 0, RULE_body = 1, RULE_function = 2, RULE_statement = 3, 
		RULE_expression = 4, RULE_assignment = 5, RULE_variable_declaration = 6, 
		RULE_print = 7, RULE_returnst = 8;
	public static final String[] ruleNames = {
		"program", "body", "function", "statement", "expression", "assignment", 
		"variable_declaration", "print", "returnst"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'{'", "'}'", "','", null, null, null, "'int'", "'float'", 
		"'print'", "'fun'", "'return'", null, "'='", "':'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "COMMENT", "NUMBER", "NUMBER_FLOAT", "INT", 
		"FLOAT", "PRINT", "FUN", "RETURN", "ID", "EQUALS", "COLON", "LEFT_BRACKET", 
		"RIGHT_BRACKET", "WS"
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

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ProgramContext)_localctx).val =  new Front.Program(); 
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(19);
				match(T__0);
				}
				}
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << INT) | (1L << FLOAT) | (1L << PRINT) | (1L << FUN) | (1L << RETURN) | (1L << ID))) != 0)) {
				{
				setState(42);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER:
				case INT:
				case FLOAT:
				case PRINT:
				case RETURN:
				case ID:
					{
					{
					setState(25);
					((ProgramContext)_localctx).statement = statement();
					setState(27); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(26);
						match(T__0);
						}
						}
						setState(29); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__0 );
					}
					 _localctx.val.statements.add(((ProgramContext)_localctx).statement.val); 
					}
					break;
				case FUN:
					{
					{
					setState(33);
					((ProgramContext)_localctx).function = function();
					setState(37);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(34);
						match(T__0);
						}
						}
						setState(39);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					 _localctx.val.functions.add(((ProgramContext)_localctx).function.val); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(46);
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
			setState(47);
			match(T__1);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NUMBER) | (1L << INT) | (1L << FLOAT) | (1L << PRINT) | (1L << RETURN) | (1L << ID))) != 0)) {
				{
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(48);
					match(T__0);
					}
					}
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(54);
				((BodyContext)_localctx).a = statement();
				 ((BodyContext)_localctx).val =  new Front.Body(); _localctx.val.add(((BodyContext)_localctx).a.val); 
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(57); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(56);
							match(T__0);
							}
							}
							setState(59); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==T__0 );
						setState(61);
						((BodyContext)_localctx).b = statement();
						 _localctx.val.add(((BodyContext)_localctx).b.val); 
						}
						} 
					}
					setState(68);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(69);
					match(T__0);
					}
					}
					setState(72); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
			}

			setState(76);
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

	public static class FunctionContext extends ParserRuleContext {
		public Front.Function val;
		public Token name;
		public Token arg1;
		public Token arg2;
		public Token returnType;
		public BodyContext body;
		public TerminalNode FUN() { return getToken(PParser.FUN, 0); }
		public TerminalNode COLON() { return getToken(PParser.COLON, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(PParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PParser.ID, i);
		}
		public TerminalNode INT() { return getToken(PParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(PParser.FLOAT, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(FUN);
			setState(79);
			((FunctionContext)_localctx).name = match(ID);
			setState(80);
			match(LEFT_BRACKET);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(81);
				((FunctionContext)_localctx).arg1 = match(ID);
				 _localctx.val.addArg((((FunctionContext)_localctx).arg1!=null?((FunctionContext)_localctx).arg1.getText():null)); 
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(83);
					match(T__3);
					setState(84);
					((FunctionContext)_localctx).arg2 = match(ID);
					 _localctx.val.addArg((((FunctionContext)_localctx).arg2!=null?((FunctionContext)_localctx).arg2.getText():null)); 
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(93);
			match(RIGHT_BRACKET);
			setState(94);
			match(COLON);
			setState(95);
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
			 ((FunctionContext)_localctx).val =  new Front.Function((((FunctionContext)_localctx).name!=null?((FunctionContext)_localctx).name.getText():null),(((FunctionContext)_localctx).returnType!=null?((FunctionContext)_localctx).returnType.getText():null)); 
			setState(97);
			((FunctionContext)_localctx).body = body();
			 _localctx.val.setBody(((FunctionContext)_localctx).body.val); 
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
		public PrintContext d;
		public ReturnstContext e;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ReturnstContext returnst() {
			return getRuleContext(ReturnstContext.class,0);
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
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				((StatementContext)_localctx).a = expression();
				((StatementContext)_localctx).val =  new Front.StatementExpression(((StatementContext)_localctx).a.val); 
				}
				break;
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				((StatementContext)_localctx).c = variable_declaration();
				 ((StatementContext)_localctx).val =  ((StatementContext)_localctx).c.val; 
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				((StatementContext)_localctx).d = print();
				{ ((StatementContext)_localctx).val =  ((StatementContext)_localctx).d.val; } 
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				((StatementContext)_localctx).e = returnst();
				{ ((StatementContext)_localctx).val =  ((StatementContext)_localctx).e.val; } 
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
		enterRule(_localctx, 8, RULE_expression);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				((ExpressionContext)_localctx).a = match(NUMBER);
				 ((ExpressionContext)_localctx).val =  new Front.IntExpression((((ExpressionContext)_localctx).a!=null?((ExpressionContext)_localctx).a.getText():null)); 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
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
		enterRule(_localctx, 10, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			((AssignmentContext)_localctx).to = match(ID);
			setState(122);
			match(EQUALS);
			setState(123);
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
		public TerminalNode NUMBER_FLOAT() { return getToken(PParser.NUMBER_FLOAT, 0); }
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
		enterRule(_localctx, 12, RULE_variable_declaration);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(INT);
				setState(127);
				((Variable_declarationContext)_localctx).name = match(ID);
				setState(128);
				match(EQUALS);
				setState(129);
				((Variable_declarationContext)_localctx).value = match(NUMBER);
				 ((Variable_declarationContext)_localctx).val =  new Front.IntVariableDeclaration((((Variable_declarationContext)_localctx).name!=null?((Variable_declarationContext)_localctx).name.getText():null),(((Variable_declarationContext)_localctx).value!=null?((Variable_declarationContext)_localctx).value.getText():null)); 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(FLOAT);
				setState(132);
				((Variable_declarationContext)_localctx).name = match(ID);
				setState(133);
				match(EQUALS);
				setState(134);
				((Variable_declarationContext)_localctx).value = match(NUMBER_FLOAT);
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

	public static class PrintContext extends ParserRuleContext {
		public Front.PrintStatement val;
		public Token reference;
		public TerminalNode PRINT() { return getToken(PParser.PRINT, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(PParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(PParser.RIGHT_BRACKET, 0); }
		public TerminalNode ID() { return getToken(PParser.ID, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(PRINT);
			setState(139);
			match(LEFT_BRACKET);
			setState(140);
			((PrintContext)_localctx).reference = match(ID);
			setState(141);
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

	public static class ReturnstContext extends ParserRuleContext {
		public Front.ReturnStatement val;
		public Token NUMBER;
		public Token NUMBER_FLOAT;
		public TerminalNode RETURN() { return getToken(PParser.RETURN, 0); }
		public TerminalNode NUMBER() { return getToken(PParser.NUMBER, 0); }
		public TerminalNode NUMBER_FLOAT() { return getToken(PParser.NUMBER_FLOAT, 0); }
		public ReturnstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterReturnst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitReturnst(this);
		}
	}

	public final ReturnstContext returnst() throws RecognitionException {
		ReturnstContext _localctx = new ReturnstContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnst);
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(RETURN);
				setState(145);
				((ReturnstContext)_localctx).NUMBER = match(NUMBER);
				((ReturnstContext)_localctx).val =  new Front.ReturnInt((((ReturnstContext)_localctx).NUMBER!=null?((ReturnstContext)_localctx).NUMBER.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(RETURN);
				setState(148);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24\u009b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3"+
		"\2\7\2\27\n\2\f\2\16\2\32\13\2\3\2\3\2\6\2\36\n\2\r\2\16\2\37\3\2\3\2"+
		"\3\2\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\3"+
		"\3\3\7\3\64\n\3\f\3\16\3\67\13\3\3\3\3\3\3\3\6\3<\n\3\r\3\16\3=\3\3\3"+
		"\3\3\3\7\3C\n\3\f\3\16\3F\13\3\3\3\6\3I\n\3\r\3\16\3J\5\3M\n\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4Y\n\4\f\4\16\4\\\13\4\5\4^\n\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5s\n\5\3\6\3\6\3\6\3\6\3\6\5\6z\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008b\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\n\u0099\n\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2"+
		"\3\3\2\n\13\2\u00a3\2\24\3\2\2\2\4\61\3\2\2\2\6P\3\2\2\2\br\3\2\2\2\n"+
		"y\3\2\2\2\f{\3\2\2\2\16\u008a\3\2\2\2\20\u008c\3\2\2\2\22\u0098\3\2\2"+
		"\2\24\30\b\2\1\2\25\27\7\3\2\2\26\25\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2"+
		"\2\30\31\3\2\2\2\31.\3\2\2\2\32\30\3\2\2\2\33\35\5\b\5\2\34\36\7\3\2\2"+
		"\35\34\3\2\2\2\36\37\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!\"\b"+
		"\2\1\2\"-\3\2\2\2#\'\5\6\4\2$&\7\3\2\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2"+
		"\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\b\2\1\2+-\3\2\2\2,\33\3\2\2\2,#\3\2"+
		"\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\3\3\2\2\2\60.\3\2\2\2\61L\7\4\2"+
		"\2\62\64\7\3\2\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2"+
		"\2\668\3\2\2\2\67\65\3\2\2\289\5\b\5\29D\b\3\1\2:<\7\3\2\2;:\3\2\2\2<"+
		"=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\5\b\5\2@A\b\3\1\2AC\3\2\2\2"+
		"B;\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EH\3\2\2\2FD\3\2\2\2GI\7\3\2\2"+
		"HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2L\65\3\2\2\2LM\3\2\2"+
		"\2MN\3\2\2\2NO\7\5\2\2O\5\3\2\2\2PQ\7\r\2\2QR\7\17\2\2R]\7\22\2\2ST\7"+
		"\17\2\2TZ\b\4\1\2UV\7\6\2\2VW\7\17\2\2WY\b\4\1\2XU\3\2\2\2Y\\\3\2\2\2"+
		"ZX\3\2\2\2Z[\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2]S\3\2\2\2]^\3\2\2\2^_\3\2\2"+
		"\2_`\7\23\2\2`a\7\21\2\2ab\t\2\2\2bc\b\4\1\2cd\5\4\3\2de\b\4\1\2e\7\3"+
		"\2\2\2fg\5\n\6\2gh\b\5\1\2hs\3\2\2\2ij\5\16\b\2jk\b\5\1\2ks\3\2\2\2lm"+
		"\5\20\t\2mn\b\5\1\2ns\3\2\2\2op\5\22\n\2pq\b\5\1\2qs\3\2\2\2rf\3\2\2\2"+
		"ri\3\2\2\2rl\3\2\2\2ro\3\2\2\2s\t\3\2\2\2tu\7\b\2\2uz\b\6\1\2vw\5\f\7"+
		"\2wx\b\6\1\2xz\3\2\2\2yt\3\2\2\2yv\3\2\2\2z\13\3\2\2\2{|\7\17\2\2|}\7"+
		"\20\2\2}~\5\n\6\2~\177\b\7\1\2\177\r\3\2\2\2\u0080\u0081\7\n\2\2\u0081"+
		"\u0082\7\17\2\2\u0082\u0083\7\20\2\2\u0083\u0084\7\b\2\2\u0084\u008b\b"+
		"\b\1\2\u0085\u0086\7\13\2\2\u0086\u0087\7\17\2\2\u0087\u0088\7\20\2\2"+
		"\u0088\u0089\7\t\2\2\u0089\u008b\b\b\1\2\u008a\u0080\3\2\2\2\u008a\u0085"+
		"\3\2\2\2\u008b\17\3\2\2\2\u008c\u008d\7\f\2\2\u008d\u008e\7\22\2\2\u008e"+
		"\u008f\7\17\2\2\u008f\u0090\7\23\2\2\u0090\u0091\b\t\1\2\u0091\21\3\2"+
		"\2\2\u0092\u0093\7\16\2\2\u0093\u0094\7\b\2\2\u0094\u0099\b\n\1\2\u0095"+
		"\u0096\7\16\2\2\u0096\u0097\7\t\2\2\u0097\u0099\b\n\1\2\u0098\u0092\3"+
		"\2\2\2\u0098\u0095\3\2\2\2\u0099\23\3\2\2\2\22\30\37\',.\65=DJLZ]ry\u008a"+
		"\u0098";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}