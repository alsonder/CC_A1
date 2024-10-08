// Generated from cc.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ccParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, HW=8, IN=9, OUT=10, 
		LAT=11, NOT=12, AND=13, OR=14, CONST=15, IDENT=16, COMMENT=17, WHITESPACE=18, 
		ANYTHING=19;
	public static final int
		RULE_start = 0, RULE_name = 1, RULE_inputs = 2, RULE_outputs = 3, RULE_latches = 4, 
		RULE_def = 5, RULE_updates = 6, RULE_siminputs = 7, RULE_stmt = 8, RULE_func = 9, 
		RULE_exps = 10, RULE_exp = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "name", "inputs", "outputs", "latches", "def", "updates", "siminputs", 
			"stmt", "func", "exps", "exp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def:'", "'='", "'updates:'", "'siminputs:'", "'('", "')'", "','", 
			"'hardware:'", "'inputs:'", "'outputs:'", "'latches:'", "'/'", "'*'", 
			"'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "HW", "IN", "OUT", "LAT", 
			"NOT", "AND", "OR", "CONST", "IDENT", "COMMENT", "WHITESPACE", "ANYTHING"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "cc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ccParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public NameContext hw;
		public InputsContext in;
		public OutputsContext out;
		public LatchesContext lat;
		public DefContext def;
		public List<DefContext> de = new ArrayList<DefContext>();
		public UpdatesContext up;
		public SiminputsContext sim;
		public Token end;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public InputsContext inputs() {
			return getRuleContext(InputsContext.class,0);
		}
		public OutputsContext outputs() {
			return getRuleContext(OutputsContext.class,0);
		}
		public LatchesContext latches() {
			return getRuleContext(LatchesContext.class,0);
		}
		public UpdatesContext updates() {
			return getRuleContext(UpdatesContext.class,0);
		}
		public SiminputsContext siminputs() {
			return getRuleContext(SiminputsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ccParser.EOF, 0); }
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			((StartContext)_localctx).hw = name();
			setState(25);
			((StartContext)_localctx).in = inputs();
			setState(26);
			((StartContext)_localctx).out = outputs();
			setState(27);
			((StartContext)_localctx).lat = latches();
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(28);
				((StartContext)_localctx).def = def();
				((StartContext)_localctx).de.add(((StartContext)_localctx).def);
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			((StartContext)_localctx).up = updates();
			setState(35);
			((StartContext)_localctx).sim = siminputs();
			setState(36);
			((StartContext)_localctx).end = match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public Token id;
		public TerminalNode HW() { return getToken(ccParser.HW, 0); }
		public TerminalNode IDENT() { return getToken(ccParser.IDENT, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(HW);
			setState(39);
			((NameContext)_localctx).id = match(IDENT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InputsContext extends ParserRuleContext {
		public Token IDENT;
		public List<Token> id = new ArrayList<Token>();
		public TerminalNode IN() { return getToken(ccParser.IN, 0); }
		public List<TerminalNode> IDENT() { return getTokens(ccParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(ccParser.IDENT, i);
		}
		public InputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterInputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitInputs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitInputs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputsContext inputs() throws RecognitionException {
		InputsContext _localctx = new InputsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_inputs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(IN);
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				((InputsContext)_localctx).IDENT = match(IDENT);
				((InputsContext)_localctx).id.add(((InputsContext)_localctx).IDENT);
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
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

	@SuppressWarnings("CheckReturnValue")
	public static class OutputsContext extends ParserRuleContext {
		public Token IDENT;
		public List<Token> id = new ArrayList<Token>();
		public TerminalNode OUT() { return getToken(ccParser.OUT, 0); }
		public List<TerminalNode> IDENT() { return getTokens(ccParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(ccParser.IDENT, i);
		}
		public OutputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterOutputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitOutputs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitOutputs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputsContext outputs() throws RecognitionException {
		OutputsContext _localctx = new OutputsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_outputs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(OUT);
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				((OutputsContext)_localctx).IDENT = match(IDENT);
				((OutputsContext)_localctx).id.add(((OutputsContext)_localctx).IDENT);
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
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

	@SuppressWarnings("CheckReturnValue")
	public static class LatchesContext extends ParserRuleContext {
		public Token IDENT;
		public List<Token> id = new ArrayList<Token>();
		public TerminalNode LAT() { return getToken(ccParser.LAT, 0); }
		public List<TerminalNode> IDENT() { return getTokens(ccParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(ccParser.IDENT, i);
		}
		public LatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_latches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterLatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitLatches(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitLatches(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LatchesContext latches() throws RecognitionException {
		LatchesContext _localctx = new LatchesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_latches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(LAT);
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				((LatchesContext)_localctx).IDENT = match(IDENT);
				((LatchesContext)_localctx).id.add(((LatchesContext)_localctx).IDENT);
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefContext extends ParserRuleContext {
		public FuncContext f;
		public ExpContext e;
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__0);
			setState(60);
			((DefContext)_localctx).f = func();
			setState(61);
			match(T__1);
			setState(62);
			((DefContext)_localctx).e = exp(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UpdatesContext extends ParserRuleContext {
		public StmtContext stmt;
		public List<StmtContext> st = new ArrayList<StmtContext>();
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public UpdatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updates; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterUpdates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitUpdates(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitUpdates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdatesContext updates() throws RecognitionException {
		UpdatesContext _localctx = new UpdatesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_updates);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__2);
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				((UpdatesContext)_localctx).stmt = stmt();
				((UpdatesContext)_localctx).st.add(((UpdatesContext)_localctx).stmt);
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
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

	@SuppressWarnings("CheckReturnValue")
	public static class SiminputsContext extends ParserRuleContext {
		public StmtContext stmt;
		public List<StmtContext> st = new ArrayList<StmtContext>();
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public SiminputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_siminputs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterSiminputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitSiminputs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitSiminputs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiminputsContext siminputs() throws RecognitionException {
		SiminputsContext _localctx = new SiminputsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_siminputs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__3);
			setState(72); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(71);
				((SiminputsContext)_localctx).stmt = stmt();
				((SiminputsContext)_localctx).st.add(((SiminputsContext)_localctx).stmt);
				}
				}
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
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

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignExpContext extends StmtContext {
		public Token x;
		public ExpContext e1;
		public TerminalNode IDENT() { return getToken(ccParser.IDENT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssignExpContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterAssignExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitAssignExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitAssignExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignFunctionContext extends StmtContext {
		public FuncContext f;
		public StmtContext s;
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public AssignFunctionContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterAssignFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitAssignFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitAssignFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncAssignContext extends StmtContext {
		public FuncContext f;
		public ExpContext e1;
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public FuncAssignContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterFuncAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitFuncAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitFuncAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignIdentFuncContext extends StmtContext {
		public Token x;
		public FuncContext f;
		public TerminalNode IDENT() { return getToken(ccParser.IDENT, 0); }
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public AssignIdentFuncContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterAssignIdentFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitAssignIdentFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitAssignIdentFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmt);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new AssignFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				((AssignFunctionContext)_localctx).f = func();
				setState(77);
				match(T__1);
				setState(78);
				((AssignFunctionContext)_localctx).s = stmt();
				}
				break;
			case 2:
				_localctx = new FuncAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				((FuncAssignContext)_localctx).f = func();
				setState(81);
				match(T__1);
				setState(82);
				((FuncAssignContext)_localctx).e1 = exp(0);
				}
				break;
			case 3:
				_localctx = new AssignExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				((AssignExpContext)_localctx).x = match(IDENT);
				setState(85);
				match(T__1);
				setState(86);
				((AssignExpContext)_localctx).e1 = exp(0);
				}
				break;
			case 4:
				_localctx = new AssignIdentFuncContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				((AssignIdentFuncContext)_localctx).x = match(IDENT);
				setState(88);
				match(T__1);
				setState(89);
				((AssignIdentFuncContext)_localctx).f = func();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncContext extends ParserRuleContext {
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
	 
		public FuncContext() { }
		public void copyFrom(FuncContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleArgFunctionCallContext extends FuncContext {
		public Token x;
		public ExpContext e1;
		public TerminalNode IDENT() { return getToken(ccParser.IDENT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public SingleArgFunctionCallContext(FuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterSingleArgFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitSingleArgFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitSingleArgFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends FuncContext {
		public Token x;
		public ExpsContext e1;
		public TerminalNode IDENT() { return getToken(ccParser.IDENT, 0); }
		public ExpsContext exps() {
			return getRuleContext(ExpsContext.class,0);
		}
		public FunctionCallContext(FuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_func);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				((FunctionCallContext)_localctx).x = match(IDENT);
				setState(93);
				match(T__4);
				setState(94);
				((FunctionCallContext)_localctx).e1 = exps();
				setState(95);
				match(T__5);
				}
				break;
			case 2:
				_localctx = new SingleArgFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				((SingleArgFunctionCallContext)_localctx).x = match(IDENT);
				setState(98);
				match(T__4);
				setState(99);
				((SingleArgFunctionCallContext)_localctx).e1 = exp(0);
				setState(100);
				match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpsContext extends ParserRuleContext {
		public ExpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exps; }
	 
		public ExpsContext() { }
		public void copyFrom(ExpsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionsListContext extends ExpsContext {
		public ExpContext e1;
		public ExpContext e2;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExpressionsListContext(ExpsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterExpressionsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitExpressionsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitExpressionsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpsContext exps() throws RecognitionException {
		ExpsContext _localctx = new ExpsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exps);
		int _la;
		try {
			_localctx = new ExpressionsListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			((ExpressionsListContext)_localctx).e1 = exp(0);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(105);
				match(T__6);
				setState(106);
				((ExpressionsListContext)_localctx).e2 = exp(0);
				}
				}
				setState(111);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusExpContext extends ExpContext {
		public ExpContext e1;
		public ExpContext e2;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public PlusExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterPlusExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitPlusExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitPlusExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExpContext extends ExpContext {
		public ExpContext e1;
		public TerminalNode NOT() { return getToken(ccParser.NOT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NotExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterNotExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitNotExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitNotExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExpContext extends ExpContext {
		public ExpContext e1;
		public ExpContext e2;
		public TerminalNode AND() { return getToken(ccParser.AND, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public AndExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterAndExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitAndExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitAndExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExpContext extends ExpContext {
		public ExpContext e1;
		public ExpContext e2;
		public TerminalNode OR() { return getToken(ccParser.OR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OrExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterOrExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitOrExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitOrExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstExpContext extends ExpContext {
		public Token n;
		public TerminalNode CONST() { return getToken(ccParser.CONST, 0); }
		public ConstExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterConstExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitConstExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitConstExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedExpContext extends ExpContext {
		public ExpContext e1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ParenthesizedExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterParenthesizedExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitParenthesizedExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitParenthesizedExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentExpContext extends ExpContext {
		public Token x;
		public TerminalNode IDENT() { return getToken(ccParser.IDENT, 0); }
		public IdentExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterIdentExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitIdentExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitIdentExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				_localctx = new NotExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(113);
				match(NOT);
				setState(114);
				((NotExpContext)_localctx).e1 = exp(7);
				}
				break;
			case CONST:
				{
				_localctx = new ConstExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(115);
				((ConstExpContext)_localctx).n = match(CONST);
				}
				break;
			case IDENT:
				{
				_localctx = new IdentExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				((IdentExpContext)_localctx).x = match(IDENT);
				}
				break;
			case T__4:
				{
				_localctx = new ParenthesizedExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				match(T__4);
				setState(118);
				((ParenthesizedExpContext)_localctx).e1 = exp(0);
				setState(119);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(135);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new AndExpContext(new ExpContext(_parentctx, _parentState));
						((AndExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(123);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(124);
						match(AND);
						setState(125);
						((AndExpContext)_localctx).e2 = exp(7);
						}
						break;
					case 2:
						{
						_localctx = new OrExpContext(new ExpContext(_parentctx, _parentState));
						((OrExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(126);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(127);
						match(OR);
						setState(128);
						((OrExpContext)_localctx).e2 = exp(6);
						}
						break;
					case 3:
						{
						_localctx = new PlusExpContext(new ExpContext(_parentctx, _parentState));
						((PlusExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(129);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(131); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(130);
								((PlusExpContext)_localctx).e2 = exp(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(133); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0013\u008d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"\u001e\b\u0000\n\u0000\f\u0000!\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0004\u0002,\b\u0002\u000b\u0002\f\u0002-\u0001\u0003\u0001\u0003"+
		"\u0004\u00032\b\u0003\u000b\u0003\f\u00033\u0001\u0004\u0001\u0004\u0004"+
		"\u00048\b\u0004\u000b\u0004\f\u00049\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0004\u0006C\b\u0006"+
		"\u000b\u0006\f\u0006D\u0001\u0007\u0001\u0007\u0004\u0007I\b\u0007\u000b"+
		"\u0007\f\u0007J\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b[\b"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\tg\b\t\u0001\n\u0001\n\u0001\n\u0005\nl\b\n\n\n\f\no"+
		"\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000bz\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0004\u000b\u0084\b\u000b\u000b\u000b\f\u000b\u0085"+
		"\u0005\u000b\u0088\b\u000b\n\u000b\f\u000b\u008b\t\u000b\u0001\u000b\u0000"+
		"\u0001\u0016\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0000\u0000\u0092\u0000\u0018\u0001\u0000\u0000\u0000\u0002&\u0001\u0000"+
		"\u0000\u0000\u0004)\u0001\u0000\u0000\u0000\u0006/\u0001\u0000\u0000\u0000"+
		"\b5\u0001\u0000\u0000\u0000\n;\u0001\u0000\u0000\u0000\f@\u0001\u0000"+
		"\u0000\u0000\u000eF\u0001\u0000\u0000\u0000\u0010Z\u0001\u0000\u0000\u0000"+
		"\u0012f\u0001\u0000\u0000\u0000\u0014h\u0001\u0000\u0000\u0000\u0016y"+
		"\u0001\u0000\u0000\u0000\u0018\u0019\u0003\u0002\u0001\u0000\u0019\u001a"+
		"\u0003\u0004\u0002\u0000\u001a\u001b\u0003\u0006\u0003\u0000\u001b\u001f"+
		"\u0003\b\u0004\u0000\u001c\u001e\u0003\n\u0005\u0000\u001d\u001c\u0001"+
		"\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000"+
		"\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \"\u0001\u0000\u0000\u0000"+
		"!\u001f\u0001\u0000\u0000\u0000\"#\u0003\f\u0006\u0000#$\u0003\u000e\u0007"+
		"\u0000$%\u0005\u0000\u0000\u0001%\u0001\u0001\u0000\u0000\u0000&\'\u0005"+
		"\b\u0000\u0000\'(\u0005\u0010\u0000\u0000(\u0003\u0001\u0000\u0000\u0000"+
		")+\u0005\t\u0000\u0000*,\u0005\u0010\u0000\u0000+*\u0001\u0000\u0000\u0000"+
		",-\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000"+
		"\u0000.\u0005\u0001\u0000\u0000\u0000/1\u0005\n\u0000\u000002\u0005\u0010"+
		"\u0000\u000010\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000031\u0001"+
		"\u0000\u0000\u000034\u0001\u0000\u0000\u00004\u0007\u0001\u0000\u0000"+
		"\u000057\u0005\u000b\u0000\u000068\u0005\u0010\u0000\u000076\u0001\u0000"+
		"\u0000\u000089\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001"+
		"\u0000\u0000\u0000:\t\u0001\u0000\u0000\u0000;<\u0005\u0001\u0000\u0000"+
		"<=\u0003\u0012\t\u0000=>\u0005\u0002\u0000\u0000>?\u0003\u0016\u000b\u0000"+
		"?\u000b\u0001\u0000\u0000\u0000@B\u0005\u0003\u0000\u0000AC\u0003\u0010"+
		"\b\u0000BA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DB\u0001\u0000"+
		"\u0000\u0000DE\u0001\u0000\u0000\u0000E\r\u0001\u0000\u0000\u0000FH\u0005"+
		"\u0004\u0000\u0000GI\u0003\u0010\b\u0000HG\u0001\u0000\u0000\u0000IJ\u0001"+
		"\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000"+
		"K\u000f\u0001\u0000\u0000\u0000LM\u0003\u0012\t\u0000MN\u0005\u0002\u0000"+
		"\u0000NO\u0003\u0010\b\u0000O[\u0001\u0000\u0000\u0000PQ\u0003\u0012\t"+
		"\u0000QR\u0005\u0002\u0000\u0000RS\u0003\u0016\u000b\u0000S[\u0001\u0000"+
		"\u0000\u0000TU\u0005\u0010\u0000\u0000UV\u0005\u0002\u0000\u0000V[\u0003"+
		"\u0016\u000b\u0000WX\u0005\u0010\u0000\u0000XY\u0005\u0002\u0000\u0000"+
		"Y[\u0003\u0012\t\u0000ZL\u0001\u0000\u0000\u0000ZP\u0001\u0000\u0000\u0000"+
		"ZT\u0001\u0000\u0000\u0000ZW\u0001\u0000\u0000\u0000[\u0011\u0001\u0000"+
		"\u0000\u0000\\]\u0005\u0010\u0000\u0000]^\u0005\u0005\u0000\u0000^_\u0003"+
		"\u0014\n\u0000_`\u0005\u0006\u0000\u0000`g\u0001\u0000\u0000\u0000ab\u0005"+
		"\u0010\u0000\u0000bc\u0005\u0005\u0000\u0000cd\u0003\u0016\u000b\u0000"+
		"de\u0005\u0006\u0000\u0000eg\u0001\u0000\u0000\u0000f\\\u0001\u0000\u0000"+
		"\u0000fa\u0001\u0000\u0000\u0000g\u0013\u0001\u0000\u0000\u0000hm\u0003"+
		"\u0016\u000b\u0000ij\u0005\u0007\u0000\u0000jl\u0003\u0016\u000b\u0000"+
		"ki\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000"+
		"\u0000mn\u0001\u0000\u0000\u0000n\u0015\u0001\u0000\u0000\u0000om\u0001"+
		"\u0000\u0000\u0000pq\u0006\u000b\uffff\uffff\u0000qr\u0005\f\u0000\u0000"+
		"rz\u0003\u0016\u000b\u0007sz\u0005\u000f\u0000\u0000tz\u0005\u0010\u0000"+
		"\u0000uv\u0005\u0005\u0000\u0000vw\u0003\u0016\u000b\u0000wx\u0005\u0006"+
		"\u0000\u0000xz\u0001\u0000\u0000\u0000yp\u0001\u0000\u0000\u0000ys\u0001"+
		"\u0000\u0000\u0000yt\u0001\u0000\u0000\u0000yu\u0001\u0000\u0000\u0000"+
		"z\u0089\u0001\u0000\u0000\u0000{|\n\u0006\u0000\u0000|}\u0005\r\u0000"+
		"\u0000}\u0088\u0003\u0016\u000b\u0007~\u007f\n\u0005\u0000\u0000\u007f"+
		"\u0080\u0005\u000e\u0000\u0000\u0080\u0088\u0003\u0016\u000b\u0006\u0081"+
		"\u0083\n\u0004\u0000\u0000\u0082\u0084\u0003\u0016\u000b\u0000\u0083\u0082"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0083"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0088"+
		"\u0001\u0000\u0000\u0000\u0087{\u0001\u0000\u0000\u0000\u0087~\u0001\u0000"+
		"\u0000\u0000\u0087\u0081\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000"+
		"\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000"+
		"\u0000\u0000\u008a\u0017\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000"+
		"\u0000\u0000\r\u001f-39DJZfmy\u0085\u0087\u0089";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}