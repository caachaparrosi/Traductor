// Generated from C:/Users/Camilo/IdeaProjects/Traductor/grammar\grammar_pseint.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammar_pseintParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TOKEN_INICIO_PROCESO=1, TOKEN_FIN_PROCESO=2, TOKEN_INICIO_SUBPROCESO=3, 
		TOKEN_FIN_SUBPROCESO=4, TOKEN_FUNCION=5, TOKEN_FIN_FUNCION=6, TOKEN_DEFINIR=7, 
		TOKEN_COMO=8, TOKEN_TIPO=9, TOKEN_COMANDO_ESPECIAL=10, TOKEN_VERDADERO=11, 
		TOKEN_FALSO=12, TOKEN_COMANDO_LEER=13, TOKEN_COMANDO_ESCRIBIR=14, TOKEN_COMANDO_DIMENSION=15, 
		TOKEN_PARA=16, TOKEN_FIN_PARA=17, TOKEN_HASTA=18, TOKEN_CON=19, TOKEN_PASO=20, 
		TOKEN_HACER=21, TOKEN_SI=22, TOKEN_FIN_SI=23, TOKEN_ENTONCES=24, TOKEN_SINO=25, 
		TOKEN_SEGUN=26, TOKEN_FIN_SEGUN=27, TOKEN_DE=28, TOKEN_OTRO=29, TOKEN_MODO=30, 
		TOKEN_MIENTRAS=31, TOKEN_FIN_MIENTRAS=32, TOKEN_REPETIR=33, TOKEN_QUE=34, 
		TOKEN_LIMPIAR=35, TOKEN_MOD=36, TOKEN_NEG=37, TOKEN_O=38, TOKEN_Y=39, 
		TOKEN_IGUAL=40, TOKEN_ASIG=41, TOKEN_DIF=42, TOKEN_MENOR=43, TOKEN_MAYOR=44, 
		TOKEN_MENOR_IGUAL=45, TOKEN_MAYOR_IGUAL=46, TOKEN_MAS=47, TOKEN_MENOS=48, 
		TOKEN_MUL=49, TOKEN_DIV=50, TOKEN_PYC=51, TOKEN_DOSP=52, TOKEN_PAR_IZQ=53, 
		TOKEN_PAR_DER=54, TOKEN_COR_IZQ=55, TOKEN_COR_DER=56, TOKEN_COMA=57, TOKEN_POT=58, 
		TOKEN_COMILLAS=59, TOKEN_COMENTARIO=60, INT=61, DOUBLE=62, CADENA=63, 
		ID=64, SPACE=65;
	public static final int
		RULE_test = 0, RULE_instructions = 1, RULE_asignment_var = 2, RULE_expr = 3, 
		RULE_term = 4, RULE_factor = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"test", "instructions", "asignment_var", "expr", "term", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'SubProceso'", "'FinSubProceso'", "'funcion'", "'finfuncion'", 
			"'definir'", "'como'", null, null, "'verdadero'", "'falso'", "'leer'", 
			"'escribir'", "'dimension'", "'para'", "'finpara'", "'hasta'", "'con'", 
			"'paso'", "'hacer'", "'si'", "'finsi'", "'entonces'", "'sino'", "'segun'", 
			"'finsegun'", "'de'", "'otro'", "'modo'", "'mientras'", "'finmientras'", 
			"'repetir'", "'que'", "'limpiar'", null, null, null, null, "'='", "'<-'", 
			"'<>'", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "';'", 
			"':'", "'('", "')'", "'['", "']'", "','", "'^'", "'\"'", "'//'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TOKEN_INICIO_PROCESO", "TOKEN_FIN_PROCESO", "TOKEN_INICIO_SUBPROCESO", 
			"TOKEN_FIN_SUBPROCESO", "TOKEN_FUNCION", "TOKEN_FIN_FUNCION", "TOKEN_DEFINIR", 
			"TOKEN_COMO", "TOKEN_TIPO", "TOKEN_COMANDO_ESPECIAL", "TOKEN_VERDADERO", 
			"TOKEN_FALSO", "TOKEN_COMANDO_LEER", "TOKEN_COMANDO_ESCRIBIR", "TOKEN_COMANDO_DIMENSION", 
			"TOKEN_PARA", "TOKEN_FIN_PARA", "TOKEN_HASTA", "TOKEN_CON", "TOKEN_PASO", 
			"TOKEN_HACER", "TOKEN_SI", "TOKEN_FIN_SI", "TOKEN_ENTONCES", "TOKEN_SINO", 
			"TOKEN_SEGUN", "TOKEN_FIN_SEGUN", "TOKEN_DE", "TOKEN_OTRO", "TOKEN_MODO", 
			"TOKEN_MIENTRAS", "TOKEN_FIN_MIENTRAS", "TOKEN_REPETIR", "TOKEN_QUE", 
			"TOKEN_LIMPIAR", "TOKEN_MOD", "TOKEN_NEG", "TOKEN_O", "TOKEN_Y", "TOKEN_IGUAL", 
			"TOKEN_ASIG", "TOKEN_DIF", "TOKEN_MENOR", "TOKEN_MAYOR", "TOKEN_MENOR_IGUAL", 
			"TOKEN_MAYOR_IGUAL", "TOKEN_MAS", "TOKEN_MENOS", "TOKEN_MUL", "TOKEN_DIV", 
			"TOKEN_PYC", "TOKEN_DOSP", "TOKEN_PAR_IZQ", "TOKEN_PAR_DER", "TOKEN_COR_IZQ", 
			"TOKEN_COR_DER", "TOKEN_COMA", "TOKEN_POT", "TOKEN_COMILLAS", "TOKEN_COMENTARIO", 
			"INT", "DOUBLE", "CADENA", "ID", "SPACE"
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
	public String getGrammarFileName() { return "grammar_pseint.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public grammar_pseintParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TestContext extends ParserRuleContext {
		public TerminalNode TOKEN_INICIO_PROCESO() { return getToken(grammar_pseintParser.TOKEN_INICIO_PROCESO, 0); }
		public TerminalNode ID() { return getToken(grammar_pseintParser.ID, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public TerminalNode TOKEN_FIN_PROCESO() { return getToken(grammar_pseintParser.TOKEN_FIN_PROCESO, 0); }
		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pseintListener ) ((grammar_pseintListener)listener).enterTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pseintListener ) ((grammar_pseintListener)listener).exitTest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pseintVisitor ) return ((grammar_pseintVisitor<? extends T>)visitor).visitTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(TOKEN_INICIO_PROCESO);
			setState(13);
			match(ID);
			setState(14);
			instructions();
			setState(15);
			match(TOKEN_FIN_PROCESO);
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

	public static class InstructionsContext extends ParserRuleContext {
		public Asignment_varContext asignment_var() {
			return getRuleContext(Asignment_varContext.class,0);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pseintListener ) ((grammar_pseintListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pseintListener ) ((grammar_pseintListener)listener).exitInstructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pseintVisitor ) return ((grammar_pseintVisitor<? extends T>)visitor).visitInstructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instructions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			asignment_var();
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

	public static class Asignment_varContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(grammar_pseintParser.ID, 0); }
		public TerminalNode TOKEN_ASIG() { return getToken(grammar_pseintParser.TOKEN_ASIG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TOKEN_PYC() { return getToken(grammar_pseintParser.TOKEN_PYC, 0); }
		public Asignment_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignment_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pseintListener ) ((grammar_pseintListener)listener).enterAsignment_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pseintListener ) ((grammar_pseintListener)listener).exitAsignment_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pseintVisitor ) return ((grammar_pseintVisitor<? extends T>)visitor).visitAsignment_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asignment_varContext asignment_var() throws RecognitionException {
		Asignment_varContext _localctx = new Asignment_varContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_asignment_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(ID);
			setState(20);
			match(TOKEN_ASIG);
			setState(21);
			expr();
			setState(22);
			match(TOKEN_PYC);
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

	public static class ExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> TOKEN_MAS() { return getTokens(grammar_pseintParser.TOKEN_MAS); }
		public TerminalNode TOKEN_MAS(int i) {
			return getToken(grammar_pseintParser.TOKEN_MAS, i);
		}
		public List<TerminalNode> TOKEN_MENOS() { return getTokens(grammar_pseintParser.TOKEN_MENOS); }
		public TerminalNode TOKEN_MENOS(int i) {
			return getToken(grammar_pseintParser.TOKEN_MENOS, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pseintListener ) ((grammar_pseintListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pseintListener ) ((grammar_pseintListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pseintVisitor ) return ((grammar_pseintVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			term();
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_MAS || _la==TOKEN_MENOS) {
				{
				{
				setState(25);
				_la = _input.LA(1);
				if ( !(_la==TOKEN_MAS || _la==TOKEN_MENOS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(26);
				term();
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> TOKEN_MUL() { return getTokens(grammar_pseintParser.TOKEN_MUL); }
		public TerminalNode TOKEN_MUL(int i) {
			return getToken(grammar_pseintParser.TOKEN_MUL, i);
		}
		public List<TerminalNode> TOKEN_DIV() { return getTokens(grammar_pseintParser.TOKEN_DIV); }
		public TerminalNode TOKEN_DIV(int i) {
			return getToken(grammar_pseintParser.TOKEN_DIV, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pseintListener ) ((grammar_pseintListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pseintListener ) ((grammar_pseintListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pseintVisitor ) return ((grammar_pseintVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			factor();
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_MUL || _la==TOKEN_DIV) {
				{
				{
				setState(33);
				_la = _input.LA(1);
				if ( !(_la==TOKEN_MUL || _la==TOKEN_DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(34);
				factor();
				}
				}
				setState(39);
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(grammar_pseintParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(grammar_pseintParser.DOUBLE, 0); }
		public TerminalNode ID() { return getToken(grammar_pseintParser.ID, 0); }
		public TerminalNode CADENA() { return getToken(grammar_pseintParser.CADENA, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pseintListener ) ((grammar_pseintListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammar_pseintListener ) ((grammar_pseintListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammar_pseintVisitor ) return ((grammar_pseintVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_la = _input.LA(1);
			if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (INT - 61)) | (1L << (DOUBLE - 61)) | (1L << (CADENA - 61)) | (1L << (ID - 61)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3C-\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\7\5\36\n\5\f\5\16\5!\13\5\3\6\3\6\3\6\7\6&\n\6"+
		"\f\6\16\6)\13\6\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\5\3\2\61\62\3\2\63\64"+
		"\3\2?B\2(\2\16\3\2\2\2\4\23\3\2\2\2\6\25\3\2\2\2\b\32\3\2\2\2\n\"\3\2"+
		"\2\2\f*\3\2\2\2\16\17\7\3\2\2\17\20\7B\2\2\20\21\5\4\3\2\21\22\7\4\2\2"+
		"\22\3\3\2\2\2\23\24\5\6\4\2\24\5\3\2\2\2\25\26\7B\2\2\26\27\7+\2\2\27"+
		"\30\5\b\5\2\30\31\7\65\2\2\31\7\3\2\2\2\32\37\5\n\6\2\33\34\t\2\2\2\34"+
		"\36\5\n\6\2\35\33\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \t\3\2"+
		"\2\2!\37\3\2\2\2\"\'\5\f\7\2#$\t\3\2\2$&\5\f\7\2%#\3\2\2\2&)\3\2\2\2\'"+
		"%\3\2\2\2\'(\3\2\2\2(\13\3\2\2\2)\'\3\2\2\2*+\t\4\2\2+\r\3\2\2\2\4\37"+
		"\'";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}