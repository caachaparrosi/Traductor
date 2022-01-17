// Generated from C:/Users/Camilo/IdeaProjects/Traductor/grammar\grammar_pseint.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammar_pseintLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TOKEN_INICIO_PROCESO", "TOKEN_FIN_PROCESO", "TOKEN_INICIO_SUBPROCESO", 
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


	public grammar_pseintLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "grammar_pseint.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2C\u026c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0096\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00ae\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u011a\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\5\13\u0160\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3"+
		"\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\5%\u020c\n%\3&\3&\3&\5&\u0211\n&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*"+
		"\3+\3+\3+\3,\3,\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3"+
		";\3;\3<\3<\3=\3=\3=\3>\6>\u0247\n>\r>\16>\u0248\3?\6?\u024c\n?\r?\16?"+
		"\u024d\3?\3?\6?\u0252\n?\r?\16?\u0253\3@\3@\7@\u0258\n@\f@\16@\u025b\13"+
		"@\3@\3@\3A\3A\7A\u0261\nA\fA\16A\u0264\13A\3B\6B\u0267\nB\rB\16B\u0268"+
		"\3B\3B\2\2C\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\3\2\t\4\2qq~~\4\2(({{\3"+
		"\2\62;\6\2\"\"\62;C\\c|\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2"+
		"\u027f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2"+
		"m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3"+
		"\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2"+
		"\2\2\3\u0095\3\2\2\2\5\u00ad\3\2\2\2\7\u00af\3\2\2\2\t\u00ba\3\2\2\2\13"+
		"\u00c8\3\2\2\2\r\u00d0\3\2\2\2\17\u00db\3\2\2\2\21\u00e3\3\2\2\2\23\u0119"+
		"\3\2\2\2\25\u015f\3\2\2\2\27\u0161\3\2\2\2\31\u016b\3\2\2\2\33\u0171\3"+
		"\2\2\2\35\u0176\3\2\2\2\37\u017f\3\2\2\2!\u0189\3\2\2\2#\u018e\3\2\2\2"+
		"%\u0196\3\2\2\2\'\u019c\3\2\2\2)\u01a0\3\2\2\2+\u01a5\3\2\2\2-\u01ab\3"+
		"\2\2\2/\u01ae\3\2\2\2\61\u01b4\3\2\2\2\63\u01bd\3\2\2\2\65\u01c2\3\2\2"+
		"\2\67\u01c8\3\2\2\29\u01d1\3\2\2\2;\u01d4\3\2\2\2=\u01d9\3\2\2\2?\u01de"+
		"\3\2\2\2A\u01e7\3\2\2\2C\u01f3\3\2\2\2E\u01fb\3\2\2\2G\u01ff\3\2\2\2I"+
		"\u020b\3\2\2\2K\u0210\3\2\2\2M\u0212\3\2\2\2O\u0214\3\2\2\2Q\u0216\3\2"+
		"\2\2S\u0218\3\2\2\2U\u021b\3\2\2\2W\u021e\3\2\2\2Y\u0220\3\2\2\2[\u0222"+
		"\3\2\2\2]\u0225\3\2\2\2_\u0228\3\2\2\2a\u022a\3\2\2\2c\u022c\3\2\2\2e"+
		"\u022e\3\2\2\2g\u0230\3\2\2\2i\u0232\3\2\2\2k\u0234\3\2\2\2m\u0236\3\2"+
		"\2\2o\u0238\3\2\2\2q\u023a\3\2\2\2s\u023c\3\2\2\2u\u023e\3\2\2\2w\u0240"+
		"\3\2\2\2y\u0242\3\2\2\2{\u0246\3\2\2\2}\u024b\3\2\2\2\177\u0255\3\2\2"+
		"\2\u0081\u025e\3\2\2\2\u0083\u0266\3\2\2\2\u0085\u0086\7r\2\2\u0086\u0087"+
		"\7t\2\2\u0087\u0088\7q\2\2\u0088\u0089\7e\2\2\u0089\u008a\7g\2\2\u008a"+
		"\u008b\7u\2\2\u008b\u0096\7q\2\2\u008c\u008d\7c\2\2\u008d\u008e\7n\2\2"+
		"\u008e\u008f\7i\2\2\u008f\u0090\7q\2\2\u0090\u0091\7t\2\2\u0091\u0092"+
		"\7k\2\2\u0092\u0093\7v\2\2\u0093\u0094\7o\2\2\u0094\u0096\7q\2\2\u0095"+
		"\u0085\3\2\2\2\u0095\u008c\3\2\2\2\u0096\4\3\2\2\2\u0097\u0098\7h\2\2"+
		"\u0098\u0099\7k\2\2\u0099\u009a\7p\2\2\u009a\u009b\7r\2\2\u009b\u009c"+
		"\7t\2\2\u009c\u009d\7q\2\2\u009d\u009e\7e\2\2\u009e\u009f\7g\2\2\u009f"+
		"\u00a0\7u\2\2\u00a0\u00ae\7q\2\2\u00a1\u00a2\7h\2\2\u00a2\u00a3\7k\2\2"+
		"\u00a3\u00a4\7p\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7"+
		"\7i\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7k\2\2\u00aa"+
		"\u00ab\7v\2\2\u00ab\u00ac\7o\2\2\u00ac\u00ae\7q\2\2\u00ad\u0097\3\2\2"+
		"\2\u00ad\u00a1\3\2\2\2\u00ae\6\3\2\2\2\u00af\u00b0\7U\2\2\u00b0\u00b1"+
		"\7w\2\2\u00b1\u00b2\7d\2\2\u00b2\u00b3\7R\2\2\u00b3\u00b4\7t\2\2\u00b4"+
		"\u00b5\7q\2\2\u00b5\u00b6\7e\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7u\2\2"+
		"\u00b8\u00b9\7q\2\2\u00b9\b\3\2\2\2\u00ba\u00bb\7H\2\2\u00bb\u00bc\7k"+
		"\2\2\u00bc\u00bd\7p\2\2\u00bd\u00be\7U\2\2\u00be\u00bf\7w\2\2\u00bf\u00c0"+
		"\7d\2\2\u00c0\u00c1\7R\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7q\2\2\u00c3"+
		"\u00c4\7e\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7u\2\2\u00c6\u00c7\7q\2\2"+
		"\u00c7\n\3\2\2\2\u00c8\u00c9\7h\2\2\u00c9\u00ca\7w\2\2\u00ca\u00cb\7p"+
		"\2\2\u00cb\u00cc\7e\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf"+
		"\7p\2\2\u00cf\f\3\2\2\2\u00d0\u00d1\7h\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3"+
		"\7p\2\2\u00d3\u00d4\7h\2\2\u00d4\u00d5\7w\2\2\u00d5\u00d6\7p\2\2\u00d6"+
		"\u00d7\7e\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da\7p\2\2"+
		"\u00da\16\3\2\2\2\u00db\u00dc\7f\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7"+
		"h\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7p\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2"+
		"\7t\2\2\u00e2\20\3\2\2\2\u00e3\u00e4\7e\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6"+
		"\7o\2\2\u00e6\u00e7\7q\2\2\u00e7\22\3\2\2\2\u00e8\u00e9\7p\2\2\u00e9\u00ea"+
		"\7w\2\2\u00ea\u00eb\7o\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7t\2\2\u00ed"+
		"\u011a\7q\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0\7w\2\2\u00f0\u00f1\7o\2\2"+
		"\u00f1\u00f2\7g\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5"+
		"\7e\2\2\u00f5\u011a\7q\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7p\2\2\u00f8"+
		"\u00f9\7v\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7t\2\2\u00fb\u011a\7q\2\2"+
		"\u00fc\u00fd\7t\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7c\2\2\u00ff\u011a"+
		"\7n\2\2\u0100\u0101\7n\2\2\u0101\u0102\7q\2\2\u0102\u0103\7i\2\2\u0103"+
		"\u0104\7k\2\2\u0104\u0105\7e\2\2\u0105\u011a\7q\2\2\u0106\u0107\7e\2\2"+
		"\u0107\u0108\7c\2\2\u0108\u0109\7t\2\2\u0109\u010a\7c\2\2\u010a\u010b"+
		"\7e\2\2\u010b\u010c\7v\2\2\u010c\u010d\7g\2\2\u010d\u011a\7t\2\2\u010e"+
		"\u010f\7e\2\2\u010f\u0110\7c\2\2\u0110\u0111\7f\2\2\u0111\u0112\7g\2\2"+
		"\u0112\u0113\7p\2\2\u0113\u011a\7c\2\2\u0114\u0115\7v\2\2\u0115\u0116"+
		"\7g\2\2\u0116\u0117\7z\2\2\u0117\u0118\7v\2\2\u0118\u011a\7q\2\2\u0119"+
		"\u00e8\3\2\2\2\u0119\u00ee\3\2\2\2\u0119\u00f6\3\2\2\2\u0119\u00fc\3\2"+
		"\2\2\u0119\u0100\3\2\2\2\u0119\u0106\3\2\2\2\u0119\u010e\3\2\2\2\u0119"+
		"\u0114\3\2\2\2\u011a\24\3\2\2\2\u011b\u011c\7d\2\2\u011c\u011d\7q\2\2"+
		"\u011d\u011e\7t\2\2\u011e\u011f\7t\2\2\u011f\u0120\7c\2\2\u0120\u0121"+
		"\7t\2\2\u0121\u0122\7\"\2\2\u0122\u0123\7r\2\2\u0123\u0124\7c\2\2\u0124"+
		"\u0125\7p\2\2\u0125\u0126\7v\2\2\u0126\u0127\7c\2\2\u0127\u0128\7n\2\2"+
		"\u0128\u0129\7n\2\2\u0129\u0160\7c\2\2\u012a\u012b\7g\2\2\u012b\u012c"+
		"\7u\2\2\u012c\u012d\7r\2\2\u012d\u012e\7g\2\2\u012e\u012f\7t\2\2\u012f"+
		"\u0130\7c\2\2\u0130\u0131\7t\2\2\u0131\u0132\7\"\2\2\u0132\u0133\7z\2"+
		"\2\u0133\u0134\7\"\2\2\u0134\u0135\7u\2\2\u0135\u0136\7g\2\2\u0136\u0137"+
		"\7i\2\2\u0137\u0138\7w\2\2\u0138\u0139\7p\2\2\u0139\u013a\7f\2\2\u013a"+
		"\u013b\7q\2\2\u013b\u0160\7u\2\2\u013c\u013d\7g\2\2\u013d\u013e\7u\2\2"+
		"\u013e\u013f\7r\2\2\u013f\u0140\7g\2\2\u0140\u0141\7t\2\2\u0141\u0142"+
		"\7c\2\2\u0142\u0143\7t\2\2\u0143\u0144\7\"\2\2\u0144\u0145\7z\2\2\u0145"+
		"\u0146\7\"\2\2\u0146\u0147\7o\2\2\u0147\u0148\7k\2\2\u0148\u0149\7n\2"+
		"\2\u0149\u014a\7k\2\2\u014a\u014b\7u\2\2\u014b\u014c\7g\2\2\u014c\u014d"+
		"\7i\2\2\u014d\u014e\7w\2\2\u014e\u014f\7p\2\2\u014f\u0150\7f\2\2\u0150"+
		"\u0151\7q\2\2\u0151\u0160\7u\2\2\u0152\u0153\7g\2\2\u0153\u0154\7u\2\2"+
		"\u0154\u0155\7r\2\2\u0155\u0156\7g\2\2\u0156\u0157\7t\2\2\u0157\u0158"+
		"\7c\2\2\u0158\u0159\7t\2\2\u0159\u015a\7\"\2\2\u015a\u015b\7v\2\2\u015b"+
		"\u015c\7g\2\2\u015c\u015d\7e\2\2\u015d\u015e\7n\2\2\u015e\u0160\7c\2\2"+
		"\u015f\u011b\3\2\2\2\u015f\u012a\3\2\2\2\u015f\u013c\3\2\2\2\u015f\u0152"+
		"\3\2\2\2\u0160\26\3\2\2\2\u0161\u0162\7x\2\2\u0162\u0163\7g\2\2\u0163"+
		"\u0164\7t\2\2\u0164\u0165\7f\2\2\u0165\u0166\7c\2\2\u0166\u0167\7f\2\2"+
		"\u0167\u0168\7g\2\2\u0168\u0169\7t\2\2\u0169\u016a\7q\2\2\u016a\30\3\2"+
		"\2\2\u016b\u016c\7h\2\2\u016c\u016d\7c\2\2\u016d\u016e\7n\2\2\u016e\u016f"+
		"\7u\2\2\u016f\u0170\7q\2\2\u0170\32\3\2\2\2\u0171\u0172\7n\2\2\u0172\u0173"+
		"\7g\2\2\u0173\u0174\7g\2\2\u0174\u0175\7t\2\2\u0175\34\3\2\2\2\u0176\u0177"+
		"\7g\2\2\u0177\u0178\7u\2\2\u0178\u0179\7e\2\2\u0179\u017a\7t\2\2\u017a"+
		"\u017b\7k\2\2\u017b\u017c\7d\2\2\u017c\u017d\7k\2\2\u017d\u017e\7t\2\2"+
		"\u017e\36\3\2\2\2\u017f\u0180\7f\2\2\u0180\u0181\7k\2\2\u0181\u0182\7"+
		"o\2\2\u0182\u0183\7g\2\2\u0183\u0184\7p\2\2\u0184\u0185\7u\2\2\u0185\u0186"+
		"\7k\2\2\u0186\u0187\7q\2\2\u0187\u0188\7p\2\2\u0188 \3\2\2\2\u0189\u018a"+
		"\7r\2\2\u018a\u018b\7c\2\2\u018b\u018c\7t\2\2\u018c\u018d\7c\2\2\u018d"+
		"\"\3\2\2\2\u018e\u018f\7h\2\2\u018f\u0190\7k\2\2\u0190\u0191\7p\2\2\u0191"+
		"\u0192\7r\2\2\u0192\u0193\7c\2\2\u0193\u0194\7t\2\2\u0194\u0195\7c\2\2"+
		"\u0195$\3\2\2\2\u0196\u0197\7j\2\2\u0197\u0198\7c\2\2\u0198\u0199\7u\2"+
		"\2\u0199\u019a\7v\2\2\u019a\u019b\7c\2\2\u019b&\3\2\2\2\u019c\u019d\7"+
		"e\2\2\u019d\u019e\7q\2\2\u019e\u019f\7p\2\2\u019f(\3\2\2\2\u01a0\u01a1"+
		"\7r\2\2\u01a1\u01a2\7c\2\2\u01a2\u01a3\7u\2\2\u01a3\u01a4\7q\2\2\u01a4"+
		"*\3\2\2\2\u01a5\u01a6\7j\2\2\u01a6\u01a7\7c\2\2\u01a7\u01a8\7e\2\2\u01a8"+
		"\u01a9\7g\2\2\u01a9\u01aa\7t\2\2\u01aa,\3\2\2\2\u01ab\u01ac\7u\2\2\u01ac"+
		"\u01ad\7k\2\2\u01ad.\3\2\2\2\u01ae\u01af\7h\2\2\u01af\u01b0\7k\2\2\u01b0"+
		"\u01b1\7p\2\2\u01b1\u01b2\7u\2\2\u01b2\u01b3\7k\2\2\u01b3\60\3\2\2\2\u01b4"+
		"\u01b5\7g\2\2\u01b5\u01b6\7p\2\2\u01b6\u01b7\7v\2\2\u01b7\u01b8\7q\2\2"+
		"\u01b8\u01b9\7p\2\2\u01b9\u01ba\7e\2\2\u01ba\u01bb\7g\2\2\u01bb\u01bc"+
		"\7u\2\2\u01bc\62\3\2\2\2\u01bd\u01be\7u\2\2\u01be\u01bf\7k\2\2\u01bf\u01c0"+
		"\7p\2\2\u01c0\u01c1\7q\2\2\u01c1\64\3\2\2\2\u01c2\u01c3\7u\2\2\u01c3\u01c4"+
		"\7g\2\2\u01c4\u01c5\7i\2\2\u01c5\u01c6\7w\2\2\u01c6\u01c7\7p\2\2\u01c7"+
		"\66\3\2\2\2\u01c8\u01c9\7h\2\2\u01c9\u01ca\7k\2\2\u01ca\u01cb\7p\2\2\u01cb"+
		"\u01cc\7u\2\2\u01cc\u01cd\7g\2\2\u01cd\u01ce\7i\2\2\u01ce\u01cf\7w\2\2"+
		"\u01cf\u01d0\7p\2\2\u01d08\3\2\2\2\u01d1\u01d2\7f\2\2\u01d2\u01d3\7g\2"+
		"\2\u01d3:\3\2\2\2\u01d4\u01d5\7q\2\2\u01d5\u01d6\7v\2\2\u01d6\u01d7\7"+
		"t\2\2\u01d7\u01d8\7q\2\2\u01d8<\3\2\2\2\u01d9\u01da\7o\2\2\u01da\u01db"+
		"\7q\2\2\u01db\u01dc\7f\2\2\u01dc\u01dd\7q\2\2\u01dd>\3\2\2\2\u01de\u01df"+
		"\7o\2\2\u01df\u01e0\7k\2\2\u01e0\u01e1\7g\2\2\u01e1\u01e2\7p\2\2\u01e2"+
		"\u01e3\7v\2\2\u01e3\u01e4\7t\2\2\u01e4\u01e5\7c\2\2\u01e5\u01e6\7u\2\2"+
		"\u01e6@\3\2\2\2\u01e7\u01e8\7h\2\2\u01e8\u01e9\7k\2\2\u01e9\u01ea\7p\2"+
		"\2\u01ea\u01eb\7o\2\2\u01eb\u01ec\7k\2\2\u01ec\u01ed\7g\2\2\u01ed\u01ee"+
		"\7p\2\2\u01ee\u01ef\7v\2\2\u01ef\u01f0\7t\2\2\u01f0\u01f1\7c\2\2\u01f1"+
		"\u01f2\7u\2\2\u01f2B\3\2\2\2\u01f3\u01f4\7t\2\2\u01f4\u01f5\7g\2\2\u01f5"+
		"\u01f6\7r\2\2\u01f6\u01f7\7g\2\2\u01f7\u01f8\7v\2\2\u01f8\u01f9\7k\2\2"+
		"\u01f9\u01fa\7t\2\2\u01faD\3\2\2\2\u01fb\u01fc\7s\2\2\u01fc\u01fd\7w\2"+
		"\2\u01fd\u01fe\7g\2\2\u01feF\3\2\2\2\u01ff\u0200\7n\2\2\u0200\u0201\7"+
		"k\2\2\u0201\u0202\7o\2\2\u0202\u0203\7r\2\2\u0203\u0204\7k\2\2\u0204\u0205"+
		"\7c\2\2\u0205\u0206\7t\2\2\u0206H\3\2\2\2\u0207\u020c\7\'\2\2\u0208\u0209"+
		"\7o\2\2\u0209\u020a\7q\2\2\u020a\u020c\7f\2\2\u020b\u0207\3\2\2\2\u020b"+
		"\u0208\3\2\2\2\u020cJ\3\2\2\2\u020d\u0211\7\u0080\2\2\u020e\u020f\7p\2"+
		"\2\u020f\u0211\7q\2\2\u0210\u020d\3\2\2\2\u0210\u020e\3\2\2\2\u0211L\3"+
		"\2\2\2\u0212\u0213\t\2\2\2\u0213N\3\2\2\2\u0214\u0215\t\3\2\2\u0215P\3"+
		"\2\2\2\u0216\u0217\7?\2\2\u0217R\3\2\2\2\u0218\u0219\7>\2\2\u0219\u021a"+
		"\7/\2\2\u021aT\3\2\2\2\u021b\u021c\7>\2\2\u021c\u021d\7@\2\2\u021dV\3"+
		"\2\2\2\u021e\u021f\7>\2\2\u021fX\3\2\2\2\u0220\u0221\7@\2\2\u0221Z\3\2"+
		"\2\2\u0222\u0223\7>\2\2\u0223\u0224\7?\2\2\u0224\\\3\2\2\2\u0225\u0226"+
		"\7@\2\2\u0226\u0227\7?\2\2\u0227^\3\2\2\2\u0228\u0229\7-\2\2\u0229`\3"+
		"\2\2\2\u022a\u022b\7/\2\2\u022bb\3\2\2\2\u022c\u022d\7,\2\2\u022dd\3\2"+
		"\2\2\u022e\u022f\7\61\2\2\u022ff\3\2\2\2\u0230\u0231\7=\2\2\u0231h\3\2"+
		"\2\2\u0232\u0233\7<\2\2\u0233j\3\2\2\2\u0234\u0235\7*\2\2\u0235l\3\2\2"+
		"\2\u0236\u0237\7+\2\2\u0237n\3\2\2\2\u0238\u0239\7]\2\2\u0239p\3\2\2\2"+
		"\u023a\u023b\7_\2\2\u023br\3\2\2\2\u023c\u023d\7.\2\2\u023dt\3\2\2\2\u023e"+
		"\u023f\7`\2\2\u023fv\3\2\2\2\u0240\u0241\7$\2\2\u0241x\3\2\2\2\u0242\u0243"+
		"\7\61\2\2\u0243\u0244\7\61\2\2\u0244z\3\2\2\2\u0245\u0247\t\4\2\2\u0246"+
		"\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2"+
		"\2\2\u0249|\3\2\2\2\u024a\u024c\t\4\2\2\u024b\u024a\3\2\2\2\u024c\u024d"+
		"\3\2\2\2\u024d\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024f\3\2\2\2\u024f"+
		"\u0251\7\60\2\2\u0250\u0252\t\4\2\2\u0251\u0250\3\2\2\2\u0252\u0253\3"+
		"\2\2\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254~\3\2\2\2\u0255\u0259"+
		"\5w<\2\u0256\u0258\t\5\2\2\u0257\u0256\3\2\2\2\u0258\u025b\3\2\2\2\u0259"+
		"\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025c\3\2\2\2\u025b\u0259\3\2"+
		"\2\2\u025c\u025d\5w<\2\u025d\u0080\3\2\2\2\u025e\u0262\t\6\2\2\u025f\u0261"+
		"\t\7\2\2\u0260\u025f\3\2\2\2\u0261\u0264\3\2\2\2\u0262\u0260\3\2\2\2\u0262"+
		"\u0263\3\2\2\2\u0263\u0082\3\2\2\2\u0264\u0262\3\2\2\2\u0265\u0267\t\b"+
		"\2\2\u0266\u0265\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u0266\3\2\2\2\u0268"+
		"\u0269\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026b\bB\2\2\u026b\u0084\3\2"+
		"\2\2\17\2\u0095\u00ad\u0119\u015f\u020b\u0210\u0248\u024d\u0253\u0259"+
		"\u0262\u0268\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}