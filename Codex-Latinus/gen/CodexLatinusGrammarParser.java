// Generated from /home/juanpa/Documentos/Codex-Latinus/Codex-Latinus/src/main/java/antlr4/com/CodexLatinusGrammar.g4 by ANTLR 4.13.2

    package antlr4.com;


    package antlr4.com;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CodexLatinusGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NON=1, ESTO=2, VERUM=3, FALSUS=4, SERIES=5, TEXTUM=6, DECIMALIS=7, NUMERUS=8, 
		LITTERA=9, BOOL=10, STRUCTURA=11, FINIS=12, SI=13, ALITER=14, DUM=15, 
		FACERE=16, PERGE=17, PER=18, INTERRUMPE=19, ACTIO=20, RATIO=21, REDDERE=22, 
		VARIABILES=23, MUNERA=24, MAIOR=25, FINISUP=26, IMPR=27, LEER=28, SUMA_INCR=29, 
		RESTA_DECR=30, SUMA=31, RESTA=32, MULTI=33, DIV=34, IGUAL=35, NO_IGUAL=36, 
		MENRO_IGUAL=37, MAYOR_IGUAL=38, MENOR=39, MAYOR=40, AND=41, OR=42, DOS_PUNTOS=43, 
		PUNTO_COMA=44, COMA=45, PUNTO=46, LLLAVE=47, RLLAVE=48, LCORCH=49, RCORCH=50, 
		LPAREN=51, RPAREN=52, ASIGNACION=53, ID=54, INT=55, DOUBLE=56, STRING=57, 
		CHARS=58, ESC=59, LINE_COMMENT=60, BLOCK_COMMENT=61, WS=62;
	public static final int
		RULE_inicio = 0, RULE_instrucciones = 1, RULE_opcion_val = 2, RULE_bloque_vars = 3, 
		RULE_opcion_func = 4, RULE_bloque_func = 5, RULE_tipos = 6, RULE_main = 7, 
		RULE_instruccion = 8, RULE_imprimir = 9, RULE_expresion = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "instrucciones", "opcion_val", "bloque_vars", "opcion_func", 
			"bloque_func", "tipos", "main", "instruccion", "imprimir", "expresion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'non'", "'esto'", "'verum'", "'falsus'", "'series'", "'textum'", 
			"'decimalis'", "'numerus'", "'littera'", "'bool'", "'structura'", "'finis'", 
			"'si'", "'aliter'", "'dum'", "'facere'", "'perge'", "'per'", "'interrumpe'", 
			"'actio'", "'ratio'", "'reddere'", "'VARIABILES'", "'MUNERA'", "'MAIOR'", 
			"'FINIS'", "'<<'", "'>>'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", 
			"'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'&&'", "'||'", "':'", 
			"';'", "','", "'.'", "'{'", "'}'", "'['", "']'", "'('", "')'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NON", "ESTO", "VERUM", "FALSUS", "SERIES", "TEXTUM", "DECIMALIS", 
			"NUMERUS", "LITTERA", "BOOL", "STRUCTURA", "FINIS", "SI", "ALITER", "DUM", 
			"FACERE", "PERGE", "PER", "INTERRUMPE", "ACTIO", "RATIO", "REDDERE", 
			"VARIABILES", "MUNERA", "MAIOR", "FINISUP", "IMPR", "LEER", "SUMA_INCR", 
			"RESTA_DECR", "SUMA", "RESTA", "MULTI", "DIV", "IGUAL", "NO_IGUAL", "MENRO_IGUAL", 
			"MAYOR_IGUAL", "MENOR", "MAYOR", "AND", "OR", "DOS_PUNTOS", "PUNTO_COMA", 
			"COMA", "PUNTO", "LLLAVE", "RLLAVE", "LCORCH", "RCORCH", "LPAREN", "RPAREN", 
			"ASIGNACION", "ID", "INT", "DOUBLE", "STRING", "CHARS", "ESC", "LINE_COMMENT", 
			"BLOCK_COMMENT", "WS"
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
	public String getGrammarFileName() { return "CodexLatinusGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CodexLatinusGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicioContext extends ParserRuleContext {
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CodexLatinusGrammarParser.EOF, 0); }
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitInicio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			instrucciones();
			setState(23);
			match(EOF);
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
	public static class InstruccionesContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode FINISUP() { return getToken(CodexLatinusGrammarParser.FINISUP, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(CodexLatinusGrammarParser.PUNTO_COMA, 0); }
		public Opcion_valContext opcion_val() {
			return getRuleContext(Opcion_valContext.class,0);
		}
		public Opcion_funcContext opcion_func() {
			return getRuleContext(Opcion_funcContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitInstrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABILES) {
				{
				setState(25);
				opcion_val();
				}
			}

			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUNERA) {
				{
				setState(28);
				opcion_func();
				}
			}

			setState(31);
			main();
			setState(32);
			match(FINISUP);
			setState(33);
			match(PUNTO_COMA);
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
	public static class Opcion_valContext extends ParserRuleContext {
		public TerminalNode VARIABILES() { return getToken(CodexLatinusGrammarParser.VARIABILES, 0); }
		public TerminalNode MAYOR() { return getToken(CodexLatinusGrammarParser.MAYOR, 0); }
		public List<Bloque_varsContext> bloque_vars() {
			return getRuleContexts(Bloque_varsContext.class);
		}
		public Bloque_varsContext bloque_vars(int i) {
			return getRuleContext(Bloque_varsContext.class,i);
		}
		public Opcion_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcion_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterOpcion_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitOpcion_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitOpcion_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opcion_valContext opcion_val() throws RecognitionException {
		Opcion_valContext _localctx = new Opcion_valContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_opcion_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(VARIABILES);
			setState(36);
			match(MAYOR);
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(37);
				bloque_vars();
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ESTO || _la==ID );
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
	public static class Bloque_varsContext extends ParserRuleContext {
		public TerminalNode ESTO() { return getToken(CodexLatinusGrammarParser.ESTO, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusGrammarParser.ID, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CodexLatinusGrammarParser.DOS_PUNTOS, 0); }
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(CodexLatinusGrammarParser.PUNTO_COMA, 0); }
		public Bloque_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterBloque_vars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitBloque_vars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitBloque_vars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_varsContext bloque_vars() throws RecognitionException {
		Bloque_varsContext _localctx = new Bloque_varsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bloque_vars);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(ESTO);
				setState(43);
				match(ID);
				setState(44);
				match(DOS_PUNTOS);
				setState(45);
				tipos();
				setState(46);
				expresion(0);
				setState(47);
				match(PUNTO_COMA);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(ID);
				setState(50);
				match(DOS_PUNTOS);
				setState(51);
				tipos();
				setState(52);
				expresion(0);
				setState(53);
				match(PUNTO_COMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Opcion_funcContext extends ParserRuleContext {
		public TerminalNode MUNERA() { return getToken(CodexLatinusGrammarParser.MUNERA, 0); }
		public TerminalNode MAYOR() { return getToken(CodexLatinusGrammarParser.MAYOR, 0); }
		public List<Bloque_funcContext> bloque_func() {
			return getRuleContexts(Bloque_funcContext.class);
		}
		public Bloque_funcContext bloque_func(int i) {
			return getRuleContext(Bloque_funcContext.class,i);
		}
		public Opcion_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcion_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterOpcion_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitOpcion_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitOpcion_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opcion_funcContext opcion_func() throws RecognitionException {
		Opcion_funcContext _localctx = new Opcion_funcContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_opcion_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(MUNERA);
			setState(58);
			match(MAYOR);
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(59);
				bloque_func();
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ACTIO || _la==RATIO );
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
	public static class Bloque_funcContext extends ParserRuleContext {
		public TerminalNode ACTIO() { return getToken(CodexLatinusGrammarParser.ACTIO, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusGrammarParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(CodexLatinusGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CodexLatinusGrammarParser.RPAREN, 0); }
		public TerminalNode LLLAVE() { return getToken(CodexLatinusGrammarParser.LLLAVE, 0); }
		public TerminalNode RLLAVE() { return getToken(CodexLatinusGrammarParser.RLLAVE, 0); }
		public TerminalNode FINIS() { return getToken(CodexLatinusGrammarParser.FINIS, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(CodexLatinusGrammarParser.PUNTO_COMA, 0); }
		public TerminalNode RATIO() { return getToken(CodexLatinusGrammarParser.RATIO, 0); }
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public Bloque_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterBloque_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitBloque_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitBloque_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_funcContext bloque_func() throws RecognitionException {
		Bloque_funcContext _localctx = new Bloque_funcContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bloque_func);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACTIO:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(ACTIO);
				setState(65);
				match(ID);
				setState(66);
				match(LPAREN);
				setState(67);
				match(RPAREN);
				setState(68);
				match(LLLAVE);
				setState(69);
				match(RLLAVE);
				setState(70);
				match(FINIS);
				setState(71);
				match(PUNTO_COMA);
				}
				break;
			case RATIO:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(RATIO);
				setState(73);
				tipos();
				setState(74);
				match(ID);
				setState(75);
				match(LPAREN);
				setState(76);
				match(RPAREN);
				setState(77);
				match(LLLAVE);
				setState(78);
				match(RLLAVE);
				setState(79);
				match(FINIS);
				setState(80);
				match(PUNTO_COMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TiposContext extends ParserRuleContext {
		public TerminalNode NUMERUS() { return getToken(CodexLatinusGrammarParser.NUMERUS, 0); }
		public TerminalNode DECIMALIS() { return getToken(CodexLatinusGrammarParser.DECIMALIS, 0); }
		public TerminalNode TEXTUM() { return getToken(CodexLatinusGrammarParser.TEXTUM, 0); }
		public TerminalNode LITTERA() { return getToken(CodexLatinusGrammarParser.LITTERA, 0); }
		public TerminalNode BOOL() { return getToken(CodexLatinusGrammarParser.BOOL, 0); }
		public TiposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterTipos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitTipos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitTipos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TiposContext tipos() throws RecognitionException {
		TiposContext _localctx = new TiposContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tipos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1984L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIOR() { return getToken(CodexLatinusGrammarParser.MAIOR, 0); }
		public TerminalNode MAYOR() { return getToken(CodexLatinusGrammarParser.MAYOR, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(MAIOR);
			setState(87);
			match(MAYOR);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 560698157902594050L) != 0)) {
				{
				{
				setState(88);
				instruccion();
				}
				}
				setState(93);
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
	public static class InstruccionContext extends ParserRuleContext {
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_instruccion);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				imprimir();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				expresion(0);
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
	public static class ImprimirContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(CodexLatinusGrammarParser.PUNTO_COMA, 0); }
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterImprimir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitImprimir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitImprimir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_imprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			expresion(0);
			setState(99);
			match(PUNTO_COMA);
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
	public static class ExpresionContext extends ParserRuleContext {
		public Token ops1;
		public TerminalNode RESTA() { return getToken(CodexLatinusGrammarParser.RESTA, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode NON() { return getToken(CodexLatinusGrammarParser.NON, 0); }
		public TerminalNode LPAREN() { return getToken(CodexLatinusGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CodexLatinusGrammarParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusGrammarParser.ID, 0); }
		public TerminalNode DOUBLE() { return getToken(CodexLatinusGrammarParser.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(CodexLatinusGrammarParser.INT, 0); }
		public TerminalNode CHARS() { return getToken(CodexLatinusGrammarParser.CHARS, 0); }
		public TerminalNode STRING() { return getToken(CodexLatinusGrammarParser.STRING, 0); }
		public TerminalNode MULTI() { return getToken(CodexLatinusGrammarParser.MULTI, 0); }
		public TerminalNode DIV() { return getToken(CodexLatinusGrammarParser.DIV, 0); }
		public TerminalNode SUMA() { return getToken(CodexLatinusGrammarParser.SUMA, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RESTA:
				{
				setState(102);
				match(RESTA);
				setState(103);
				expresion(10);
				}
				break;
			case NON:
				{
				setState(104);
				match(NON);
				setState(105);
				expresion(9);
				}
				break;
			case LPAREN:
				{
				setState(106);
				match(LPAREN);
				setState(107);
				expresion(0);
				setState(108);
				match(RPAREN);
				}
				break;
			case ID:
				{
				setState(110);
				match(ID);
				}
				break;
			case DOUBLE:
				{
				setState(111);
				match(DOUBLE);
				}
				break;
			case INT:
				{
				setState(112);
				match(INT);
				}
				break;
			case CHARS:
				{
				setState(113);
				match(CHARS);
				}
				break;
			case STRING:
				{
				setState(114);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(123);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(117);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(118);
						((ExpresionContext)_localctx).ops1 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULTI || _la==DIV) ) {
							((ExpresionContext)_localctx).ops1 = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(119);
						expresion(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(120);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(121);
						((ExpresionContext)_localctx).ops1 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SUMA || _la==RESTA) ) {
							((ExpresionContext)_localctx).ops1 = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(122);
						expresion(7);
						}
						break;
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		case 10:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001>\u0081\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0003\u0001\u001b\b\u0001\u0001\u0001\u0003\u0001\u001e"+
		"\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0004\u0002\'\b\u0002\u000b\u0002\f\u0002(\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u00038\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004"+
		"=\b\u0004\u000b\u0004\f\u0004>\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005S\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007Z\b\u0007\n\u0007"+
		"\f\u0007]\t\u0007\u0001\b\u0001\b\u0003\ba\b\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nt\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n|\b\n\n\n\f\n\u007f\t\n\u0001"+
		"\n\u0000\u0001\u0014\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0000\u0003\u0001\u0000\u0006\n\u0001\u0000!\"\u0001\u0000\u001f"+
		" \u0086\u0000\u0016\u0001\u0000\u0000\u0000\u0002\u001a\u0001\u0000\u0000"+
		"\u0000\u0004#\u0001\u0000\u0000\u0000\u00067\u0001\u0000\u0000\u0000\b"+
		"9\u0001\u0000\u0000\u0000\nR\u0001\u0000\u0000\u0000\fT\u0001\u0000\u0000"+
		"\u0000\u000eV\u0001\u0000\u0000\u0000\u0010`\u0001\u0000\u0000\u0000\u0012"+
		"b\u0001\u0000\u0000\u0000\u0014s\u0001\u0000\u0000\u0000\u0016\u0017\u0003"+
		"\u0002\u0001\u0000\u0017\u0018\u0005\u0000\u0000\u0001\u0018\u0001\u0001"+
		"\u0000\u0000\u0000\u0019\u001b\u0003\u0004\u0002\u0000\u001a\u0019\u0001"+
		"\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u001d\u0001"+
		"\u0000\u0000\u0000\u001c\u001e\u0003\b\u0004\u0000\u001d\u001c\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000"+
		"\u0000\u0000\u001f \u0003\u000e\u0007\u0000 !\u0005\u001a\u0000\u0000"+
		"!\"\u0005,\u0000\u0000\"\u0003\u0001\u0000\u0000\u0000#$\u0005\u0017\u0000"+
		"\u0000$&\u0005(\u0000\u0000%\'\u0003\u0006\u0003\u0000&%\u0001\u0000\u0000"+
		"\u0000\'(\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000"+
		"\u0000\u0000)\u0005\u0001\u0000\u0000\u0000*+\u0005\u0002\u0000\u0000"+
		"+,\u00056\u0000\u0000,-\u0005+\u0000\u0000-.\u0003\f\u0006\u0000./\u0003"+
		"\u0014\n\u0000/0\u0005,\u0000\u000008\u0001\u0000\u0000\u000012\u0005"+
		"6\u0000\u000023\u0005+\u0000\u000034\u0003\f\u0006\u000045\u0003\u0014"+
		"\n\u000056\u0005,\u0000\u000068\u0001\u0000\u0000\u00007*\u0001\u0000"+
		"\u0000\u000071\u0001\u0000\u0000\u00008\u0007\u0001\u0000\u0000\u0000"+
		"9:\u0005\u0018\u0000\u0000:<\u0005(\u0000\u0000;=\u0003\n\u0005\u0000"+
		"<;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000><\u0001\u0000\u0000"+
		"\u0000>?\u0001\u0000\u0000\u0000?\t\u0001\u0000\u0000\u0000@A\u0005\u0014"+
		"\u0000\u0000AB\u00056\u0000\u0000BC\u00053\u0000\u0000CD\u00054\u0000"+
		"\u0000DE\u0005/\u0000\u0000EF\u00050\u0000\u0000FG\u0005\f\u0000\u0000"+
		"GS\u0005,\u0000\u0000HI\u0005\u0015\u0000\u0000IJ\u0003\f\u0006\u0000"+
		"JK\u00056\u0000\u0000KL\u00053\u0000\u0000LM\u00054\u0000\u0000MN\u0005"+
		"/\u0000\u0000NO\u00050\u0000\u0000OP\u0005\f\u0000\u0000PQ\u0005,\u0000"+
		"\u0000QS\u0001\u0000\u0000\u0000R@\u0001\u0000\u0000\u0000RH\u0001\u0000"+
		"\u0000\u0000S\u000b\u0001\u0000\u0000\u0000TU\u0007\u0000\u0000\u0000"+
		"U\r\u0001\u0000\u0000\u0000VW\u0005\u0019\u0000\u0000W[\u0005(\u0000\u0000"+
		"XZ\u0003\u0010\b\u0000YX\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000"+
		"[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\u000f\u0001\u0000"+
		"\u0000\u0000][\u0001\u0000\u0000\u0000^a\u0003\u0012\t\u0000_a\u0003\u0014"+
		"\n\u0000`^\u0001\u0000\u0000\u0000`_\u0001\u0000\u0000\u0000a\u0011\u0001"+
		"\u0000\u0000\u0000bc\u0003\u0014\n\u0000cd\u0005,\u0000\u0000d\u0013\u0001"+
		"\u0000\u0000\u0000ef\u0006\n\uffff\uffff\u0000fg\u0005 \u0000\u0000gt"+
		"\u0003\u0014\n\nhi\u0005\u0001\u0000\u0000it\u0003\u0014\n\tjk\u00053"+
		"\u0000\u0000kl\u0003\u0014\n\u0000lm\u00054\u0000\u0000mt\u0001\u0000"+
		"\u0000\u0000nt\u00056\u0000\u0000ot\u00058\u0000\u0000pt\u00057\u0000"+
		"\u0000qt\u0005:\u0000\u0000rt\u00059\u0000\u0000se\u0001\u0000\u0000\u0000"+
		"sh\u0001\u0000\u0000\u0000sj\u0001\u0000\u0000\u0000sn\u0001\u0000\u0000"+
		"\u0000so\u0001\u0000\u0000\u0000sp\u0001\u0000\u0000\u0000sq\u0001\u0000"+
		"\u0000\u0000sr\u0001\u0000\u0000\u0000t}\u0001\u0000\u0000\u0000uv\n\u0007"+
		"\u0000\u0000vw\u0007\u0001\u0000\u0000w|\u0003\u0014\n\bxy\n\u0006\u0000"+
		"\u0000yz\u0007\u0002\u0000\u0000z|\u0003\u0014\n\u0007{u\u0001\u0000\u0000"+
		"\u0000{x\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001"+
		"\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0015\u0001\u0000\u0000"+
		"\u0000\u007f}\u0001\u0000\u0000\u0000\u000b\u001a\u001d(7>R[`s{}";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}