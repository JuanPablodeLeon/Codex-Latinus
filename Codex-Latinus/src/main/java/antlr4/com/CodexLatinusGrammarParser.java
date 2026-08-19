// Generated from /home/juanpa/Documentos/Codex-Latinus/Codex-Latinus/src/main/java/antlr4/com/CodexLatinusGrammar.g4 by ANTLR 4.13.2

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
		RULE_inicio = 0, RULE_instrucciones = 1, RULE_opcion_val = 2, RULE_opcion_func = 3, 
		RULE_bloque_func = 4, RULE_funcs_val = 5, RULE_bloque_vars = 6, RULE_tipos_series = 7, 
		RULE_valores_structura_coma = 8, RULE_valores_structura_punto_coma = 9, 
		RULE_asignacion_structura = 10, RULE_func_param = 11, RULE_tipos_structura = 12, 
		RULE_tipos = 13, RULE_main = 14, RULE_instruccion = 15, RULE_asignaciones = 16, 
		RULE_ops_automaticas = 17, RULE_imprimir = 18, RULE_leer_txt = 19, RULE_expresion = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "instrucciones", "opcion_val", "opcion_func", "bloque_func", 
			"funcs_val", "bloque_vars", "tipos_series", "valores_structura_coma", 
			"valores_structura_punto_coma", "asignacion_structura", "func_param", 
			"tipos_structura", "tipos", "main", "instruccion", "asignaciones", "ops_automaticas", 
			"imprimir", "leer_txt", "expresion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'non'", "'esto'", "'verum'", "'falsus'", "'series'", "'textum'", 
			"'decimalis'", "'numerus'", "'littera'", "'bool'", "'structura'", "'finis'", 
			"'si'", "'aliter'", "'dum'", "'facere'", "'perge'", "'per'", "'interrumpe'", 
			"'actio'", "'ratio'", "'reddere'", "'VARIABILES'", "'MUNERA'", "'MAIOR'", 
			"'FINIS'", "'>>'", "'<<'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", 
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
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
	 
		public InicioContext() { }
		public void copyFrom(InicioContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends InicioContext {
		public TerminalNode EOF() { return getToken(CodexLatinusGrammarParser.EOF, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public ProgramaContext(InicioContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		int _la;
		try {
			_localctx = new ProgramaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0)) {
				{
				setState(42);
				instrucciones();
				}
			}

			setState(45);
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
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
	 
		public InstruccionesContext() { }
		public void copyFrom(InstruccionesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Programa_CompletoContext extends InstruccionesContext {
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
		public Programa_CompletoContext(InstruccionesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterPrograma_Completo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitPrograma_Completo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitPrograma_Completo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);
		int _la;
		try {
			_localctx = new Programa_CompletoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABILES) {
				{
				setState(47);
				opcion_val();
				}
			}

			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUNERA) {
				{
				setState(50);
				opcion_func();
				}
			}

			setState(53);
			main();
			setState(54);
			match(FINISUP);
			setState(55);
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
		public Opcion_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcion_val; }
	 
		public Opcion_valContext() { }
		public void copyFrom(Opcion_valContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Bloque_VariablesContext extends Opcion_valContext {
		public TerminalNode VARIABILES() { return getToken(CodexLatinusGrammarParser.VARIABILES, 0); }
		public TerminalNode MAYOR() { return getToken(CodexLatinusGrammarParser.MAYOR, 0); }
		public List<Bloque_varsContext> bloque_vars() {
			return getRuleContexts(Bloque_varsContext.class);
		}
		public Bloque_varsContext bloque_vars(int i) {
			return getRuleContext(Bloque_varsContext.class,i);
		}
		public Bloque_VariablesContext(Opcion_valContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterBloque_Variables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitBloque_Variables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitBloque_Variables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opcion_valContext opcion_val() throws RecognitionException {
		Opcion_valContext _localctx = new Opcion_valContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_opcion_val);
		int _la;
		try {
			_localctx = new Bloque_VariablesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(VARIABILES);
			setState(58);
			match(MAYOR);
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(59);
				bloque_vars();
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 18014398509484068L) != 0) );
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
		public Opcion_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcion_func; }
	 
		public Opcion_funcContext() { }
		public void copyFrom(Opcion_funcContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Bloque_FuncionesContext extends Opcion_funcContext {
		public TerminalNode MUNERA() { return getToken(CodexLatinusGrammarParser.MUNERA, 0); }
		public TerminalNode MAYOR() { return getToken(CodexLatinusGrammarParser.MAYOR, 0); }
		public List<Bloque_funcContext> bloque_func() {
			return getRuleContexts(Bloque_funcContext.class);
		}
		public Bloque_funcContext bloque_func(int i) {
			return getRuleContext(Bloque_funcContext.class,i);
		}
		public Bloque_FuncionesContext(Opcion_funcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterBloque_Funciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitBloque_Funciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitBloque_Funciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opcion_funcContext opcion_func() throws RecognitionException {
		Opcion_funcContext _localctx = new Opcion_funcContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_opcion_func);
		int _la;
		try {
			_localctx = new Bloque_FuncionesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(MUNERA);
			setState(65);
			match(MAYOR);
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66);
				bloque_func();
				}
				}
				setState(69); 
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
		public Bloque_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_func; }
	 
		public Bloque_funcContext() { }
		public void copyFrom(Bloque_funcContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Funcion_ActioContext extends Bloque_funcContext {
		public TerminalNode ACTIO() { return getToken(CodexLatinusGrammarParser.ACTIO, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusGrammarParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(CodexLatinusGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CodexLatinusGrammarParser.RPAREN, 0); }
		public TerminalNode LLLAVE() { return getToken(CodexLatinusGrammarParser.LLLAVE, 0); }
		public TerminalNode RLLAVE() { return getToken(CodexLatinusGrammarParser.RLLAVE, 0); }
		public TerminalNode FINIS() { return getToken(CodexLatinusGrammarParser.FINIS, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(CodexLatinusGrammarParser.PUNTO_COMA, 0); }
		public Func_paramContext func_param() {
			return getRuleContext(Func_paramContext.class,0);
		}
		public Funcs_valContext funcs_val() {
			return getRuleContext(Funcs_valContext.class,0);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public Funcion_ActioContext(Bloque_funcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterFuncion_Actio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitFuncion_Actio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitFuncion_Actio(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Funcion_RatioContext extends Bloque_funcContext {
		public TerminalNode RATIO() { return getToken(CodexLatinusGrammarParser.RATIO, 0); }
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public TerminalNode ID() { return getToken(CodexLatinusGrammarParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(CodexLatinusGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CodexLatinusGrammarParser.RPAREN, 0); }
		public TerminalNode LLLAVE() { return getToken(CodexLatinusGrammarParser.LLLAVE, 0); }
		public TerminalNode RLLAVE() { return getToken(CodexLatinusGrammarParser.RLLAVE, 0); }
		public TerminalNode FINIS() { return getToken(CodexLatinusGrammarParser.FINIS, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(CodexLatinusGrammarParser.PUNTO_COMA, 0); }
		public Func_paramContext func_param() {
			return getRuleContext(Func_paramContext.class,0);
		}
		public Funcs_valContext funcs_val() {
			return getRuleContext(Funcs_valContext.class,0);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public Funcion_RatioContext(Bloque_funcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterFuncion_Ratio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitFuncion_Ratio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitFuncion_Ratio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_funcContext bloque_func() throws RecognitionException {
		Bloque_funcContext _localctx = new Bloque_funcContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bloque_func);
		int _la;
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACTIO:
				_localctx = new Funcion_ActioContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(ACTIO);
				setState(72);
				match(ID);
				setState(73);
				match(LPAREN);
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ESTO) {
					{
					setState(74);
					func_param();
					}
				}

				setState(77);
				match(RPAREN);
				setState(78);
				match(LLLAVE);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VARIABILES) {
					{
					setState(79);
					funcs_val();
					}
				}

				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 560698158310467546L) != 0)) {
					{
					{
					setState(82);
					instruccion();
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(88);
				match(RLLAVE);
				setState(89);
				match(FINIS);
				setState(90);
				match(PUNTO_COMA);
				}
				break;
			case RATIO:
				_localctx = new Funcion_RatioContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(RATIO);
				setState(92);
				tipos();
				setState(93);
				match(ID);
				setState(94);
				match(LPAREN);
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ESTO) {
					{
					setState(95);
					func_param();
					}
				}

				setState(98);
				match(RPAREN);
				setState(99);
				match(LLLAVE);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VARIABILES) {
					{
					setState(100);
					funcs_val();
					}
				}

				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(103);
					instruccion();
					}
					}
					setState(106); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 560698158310467546L) != 0) );
				setState(108);
				match(RLLAVE);
				setState(109);
				match(FINIS);
				setState(110);
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
	public static class Funcs_valContext extends ParserRuleContext {
		public Funcs_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcs_val; }
	 
		public Funcs_valContext() { }
		public void copyFrom(Funcs_valContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Bloque_Variables_FuncionesContext extends Funcs_valContext {
		public TerminalNode VARIABILES() { return getToken(CodexLatinusGrammarParser.VARIABILES, 0); }
		public TerminalNode LCORCH() { return getToken(CodexLatinusGrammarParser.LCORCH, 0); }
		public TerminalNode RCORCH() { return getToken(CodexLatinusGrammarParser.RCORCH, 0); }
		public List<Bloque_varsContext> bloque_vars() {
			return getRuleContexts(Bloque_varsContext.class);
		}
		public Bloque_varsContext bloque_vars(int i) {
			return getRuleContext(Bloque_varsContext.class,i);
		}
		public Bloque_Variables_FuncionesContext(Funcs_valContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterBloque_Variables_Funciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitBloque_Variables_Funciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitBloque_Variables_Funciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funcs_valContext funcs_val() throws RecognitionException {
		Funcs_valContext _localctx = new Funcs_valContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcs_val);
		int _la;
		try {
			_localctx = new Bloque_Variables_FuncionesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(VARIABILES);
			setState(115);
			match(LCORCH);
			setState(117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(116);
				bloque_vars();
				}
				}
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 18014398509484068L) != 0) );
			setState(121);
			match(RCORCH);
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
		public Bloque_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_vars; }
	 
		public Bloque_varsContext() { }
		public void copyFrom(Bloque_varsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Asignacion_Bool_InferidaContext extends Bloque_varsContext {
		public TerminalNode ESTO() { return getToken(CodexLatinusGrammarParser.ESTO, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusGrammarParser.ID, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CodexLatinusGrammarParser.DOS_PUNTOS, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(CodexLatinusGrammarParser.PUNTO_COMA, 0); }
		public Asignacion_Bool_InferidaContext(Bloque_varsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterAsignacion_Bool_Inferida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitAsignacion_Bool_Inferida(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitAsignacion_Bool_Inferida(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Suma_Resta_AutoContext extends Bloque_varsContext {
		public Ops_automaticasContext ops_automaticas() {
			return getRuleContext(Ops_automaticasContext.class,0);
		}
		public Suma_Resta_AutoContext(Bloque_varsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterSuma_Resta_Auto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitSuma_Resta_Auto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitSuma_Resta_Auto(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends Bloque_varsContext {
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
		public AsignacionContext(Bloque_varsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Asignacion_Valores_Struc_SerieContext extends Bloque_varsContext {
		public List<TerminalNode> ID() { return getTokens(CodexLatinusGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CodexLatinusGrammarParser.ID, i);
		}
		public TerminalNode PUNTO() { return getToken(CodexLatinusGrammarParser.PUNTO, 0); }
		public TerminalNode LCORCH() { return getToken(CodexLatinusGrammarParser.LCORCH, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RCORCH() { return getToken(CodexLatinusGrammarParser.RCORCH, 0); }
		public TerminalNode ASIGNACION() { return getToken(CodexLatinusGrammarParser.ASIGNACION, 0); }
		public TerminalNode LLLAVE() { return getToken(CodexLatinusGrammarParser.LLLAVE, 0); }
		public Asignacion_structuraContext asignacion_structura() {
			return getRuleContext(Asignacion_structuraContext.class,0);
		}
		public TerminalNode RLLAVE() { return getToken(CodexLatinusGrammarParser.RLLAVE, 0); }
		public Asignacion_Valores_Struc_SerieContext(Bloque_varsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterAsignacion_Valores_Struc_Serie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitAsignacion_Valores_Struc_Serie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitAsignacion_Valores_Struc_Serie(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Asignacion_StructuraContext extends Bloque_varsContext {
		public TerminalNode STRUCTURA() { return getToken(CodexLatinusGrammarParser.STRUCTURA, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusGrammarParser.ID, 0); }
		public TerminalNode LLLAVE() { return getToken(CodexLatinusGrammarParser.LLLAVE, 0); }
		public TerminalNode RLLAVE() { return getToken(CodexLatinusGrammarParser.RLLAVE, 0); }
		public TerminalNode FINIS() { return getToken(CodexLatinusGrammarParser.FINIS, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(CodexLatinusGrammarParser.PUNTO_COMA, 0); }
		public Valores_structura_comaContext valores_structura_coma() {
			return getRuleContext(Valores_structura_comaContext.class,0);
		}
		public List<Valores_structura_punto_comaContext> valores_structura_punto_coma() {
			return getRuleContexts(Valores_structura_punto_comaContext.class);
		}
		public Valores_structura_punto_comaContext valores_structura_punto_coma(int i) {
			return getRuleContext(Valores_structura_punto_comaContext.class,i);
		}
		public Asignacion_StructuraContext(Bloque_varsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterAsignacion_Structura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitAsignacion_Structura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitAsignacion_Structura(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Asignacion_Strucutura_VariableContext extends Bloque_varsContext {
		public TerminalNode ESTO() { return getToken(CodexLatinusGrammarParser.ESTO, 0); }
		public List<TerminalNode> ID() { return getTokens(CodexLatinusGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CodexLatinusGrammarParser.ID, i);
		}
		public TerminalNode DOS_PUNTOS() { return getToken(CodexLatinusGrammarParser.DOS_PUNTOS, 0); }
		public TerminalNode LLLAVE() { return getToken(CodexLatinusGrammarParser.LLLAVE, 0); }
		public Asignacion_structuraContext asignacion_structura() {
			return getRuleContext(Asignacion_structuraContext.class,0);
		}
		public TerminalNode RLLAVE() { return getToken(CodexLatinusGrammarParser.RLLAVE, 0); }
		public Asignacion_Strucutura_VariableContext(Bloque_varsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterAsignacion_Strucutura_Variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitAsignacion_Strucutura_Variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitAsignacion_Strucutura_Variable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Asignacion_Series_VaciaContext extends Bloque_varsContext {
		public TerminalNode SERIES() { return getToken(CodexLatinusGrammarParser.SERIES, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusGrammarParser.ID, 0); }
		public TerminalNode LCORCH() { return getToken(CodexLatinusGrammarParser.LCORCH, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RCORCH() { return getToken(CodexLatinusGrammarParser.RCORCH, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CodexLatinusGrammarParser.DOS_PUNTOS, 0); }
		public Tipos_seriesContext tipos_series() {
			return getRuleContext(Tipos_seriesContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(CodexLatinusGrammarParser.PUNTO_COMA, 0); }
		public Asignacion_Series_VaciaContext(Bloque_varsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterAsignacion_Series_Vacia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitAsignacion_Series_Vacia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitAsignacion_Series_Vacia(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Asignacion_SeriesContext extends Bloque_varsContext {
		public TerminalNode SERIES() { return getToken(CodexLatinusGrammarParser.SERIES, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusGrammarParser.ID, 0); }
		public TerminalNode LCORCH() { return getToken(CodexLatinusGrammarParser.LCORCH, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode RCORCH() { return getToken(CodexLatinusGrammarParser.RCORCH, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CodexLatinusGrammarParser.DOS_PUNTOS, 0); }
		public Tipos_seriesContext tipos_series() {
			return getRuleContext(Tipos_seriesContext.class,0);
		}
		public TerminalNode LLLAVE() { return getToken(CodexLatinusGrammarParser.LLLAVE, 0); }
		public TerminalNode RLLAVE() { return getToken(CodexLatinusGrammarParser.RLLAVE, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(CodexLatinusGrammarParser.PUNTO_COMA, 0); }
		public List<TerminalNode> COMA() { return getTokens(CodexLatinusGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(CodexLatinusGrammarParser.COMA, i);
		}
		public Asignacion_SeriesContext(Bloque_varsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterAsignacion_Series(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitAsignacion_Series(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitAsignacion_Series(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Bloque_Asignaciones_VarsContext extends Bloque_varsContext {
		public AsignacionesContext asignaciones() {
			return getRuleContext(AsignacionesContext.class,0);
		}
		public Bloque_Asignaciones_VarsContext(Bloque_varsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterBloque_Asignaciones_Vars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitBloque_Asignaciones_Vars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitBloque_Asignaciones_Vars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_varsContext bloque_vars() throws RecognitionException {
		Bloque_varsContext _localctx = new Bloque_varsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bloque_vars);
		int _la;
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new AsignacionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(ESTO);
				setState(124);
				match(ID);
				setState(125);
				match(DOS_PUNTOS);
				setState(126);
				tipos();
				setState(127);
				expresion(0);
				setState(128);
				match(PUNTO_COMA);
				}
				break;
			case 2:
				_localctx = new Asignacion_SeriesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(SERIES);
				setState(131);
				match(ID);
				setState(132);
				match(LCORCH);
				setState(133);
				expresion(0);
				setState(134);
				match(RCORCH);
				setState(135);
				match(DOS_PUNTOS);
				setState(136);
				tipos_series();
				setState(137);
				match(LLLAVE);
				setState(138);
				expresion(0);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(139);
					match(COMA);
					setState(140);
					expresion(0);
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(146);
				match(RLLAVE);
				setState(147);
				match(PUNTO_COMA);
				}
				break;
			case 3:
				_localctx = new Asignacion_Series_VaciaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				match(SERIES);
				setState(150);
				match(ID);
				setState(151);
				match(LCORCH);
				setState(152);
				expresion(0);
				setState(153);
				match(RCORCH);
				setState(154);
				match(DOS_PUNTOS);
				setState(155);
				tipos_series();
				setState(156);
				match(PUNTO_COMA);
				}
				break;
			case 4:
				_localctx = new Asignacion_StructuraContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				match(STRUCTURA);
				setState(159);
				match(ID);
				setState(160);
				match(LLLAVE);
				setState(167);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(161);
					valores_structura_coma();
					}
					break;
				case 2:
					{
					setState(163); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(162);
						valores_structura_punto_coma();
						}
						}
						setState(165); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==ESTO );
					}
					break;
				}
				setState(169);
				match(RLLAVE);
				setState(170);
				match(FINIS);
				setState(171);
				match(PUNTO_COMA);
				}
				break;
			case 5:
				_localctx = new Asignacion_Strucutura_VariableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				match(ESTO);
				setState(174);
				match(ID);
				setState(175);
				match(DOS_PUNTOS);
				setState(176);
				match(ID);
				setState(177);
				match(LLLAVE);
				setState(178);
				asignacion_structura();
				setState(179);
				match(RLLAVE);
				}
				break;
			case 6:
				_localctx = new Asignacion_Valores_Struc_SerieContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(181);
				match(ID);
				setState(182);
				match(PUNTO);
				setState(183);
				match(ID);
				setState(184);
				match(LCORCH);
				setState(185);
				expresion(0);
				setState(186);
				match(RCORCH);
				setState(187);
				match(ASIGNACION);
				setState(188);
				match(LLLAVE);
				setState(189);
				asignacion_structura();
				setState(190);
				match(RLLAVE);
				}
				break;
			case 7:
				_localctx = new Bloque_Asignaciones_VarsContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(192);
				asignaciones();
				}
				break;
			case 8:
				_localctx = new Asignacion_Bool_InferidaContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(193);
				match(ESTO);
				setState(194);
				match(ID);
				setState(195);
				match(DOS_PUNTOS);
				setState(196);
				expresion(0);
				setState(197);
				match(PUNTO_COMA);
				}
				break;
			case 9:
				_localctx = new Suma_Resta_AutoContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(199);
				ops_automaticas();
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
	public static class Tipos_seriesContext extends ParserRuleContext {
		public Tipos_seriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos_series; }
	 
		public Tipos_seriesContext() { }
		public void copyFrom(Tipos_seriesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Tipos_Primitivos_SeriesContext extends Tipos_seriesContext {
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public Tipos_Primitivos_SeriesContext(Tipos_seriesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterTipos_Primitivos_Series(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitTipos_Primitivos_Series(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitTipos_Primitivos_Series(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Identificador_SeriesContext extends Tipos_seriesContext {
		public TerminalNode ID() { return getToken(CodexLatinusGrammarParser.ID, 0); }
		public Identificador_SeriesContext(Tipos_seriesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterIdentificador_Series(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitIdentificador_Series(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitIdentificador_Series(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipos_seriesContext tipos_series() throws RecognitionException {
		Tipos_seriesContext _localctx = new Tipos_seriesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipos_series);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new Identificador_SeriesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(ID);
				}
				break;
			case TEXTUM:
			case DECIMALIS:
			case NUMERUS:
			case LITTERA:
			case BOOL:
				_localctx = new Tipos_Primitivos_SeriesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				tipos();
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
	public static class Valores_structura_comaContext extends ParserRuleContext {
		public Valores_structura_comaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valores_structura_coma; }
	 
		public Valores_structura_comaContext() { }
		public void copyFrom(Valores_structura_comaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Valores_Structura_ComaContext extends Valores_structura_comaContext {
		public List<TerminalNode> ESTO() { return getTokens(CodexLatinusGrammarParser.ESTO); }
		public TerminalNode ESTO(int i) {
			return getToken(CodexLatinusGrammarParser.ESTO, i);
		}
		public List<TerminalNode> ID() { return getTokens(CodexLatinusGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CodexLatinusGrammarParser.ID, i);
		}
		public List<TerminalNode> DOS_PUNTOS() { return getTokens(CodexLatinusGrammarParser.DOS_PUNTOS); }
		public TerminalNode DOS_PUNTOS(int i) {
			return getToken(CodexLatinusGrammarParser.DOS_PUNTOS, i);
		}
		public List<Tipos_structuraContext> tipos_structura() {
			return getRuleContexts(Tipos_structuraContext.class);
		}
		public Tipos_structuraContext tipos_structura(int i) {
			return getRuleContext(Tipos_structuraContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(CodexLatinusGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(CodexLatinusGrammarParser.COMA, i);
		}
		public Valores_Structura_ComaContext(Valores_structura_comaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterValores_Structura_Coma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitValores_Structura_Coma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitValores_Structura_Coma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Valores_structura_comaContext valores_structura_coma() throws RecognitionException {
		Valores_structura_comaContext _localctx = new Valores_structura_comaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_valores_structura_coma);
		int _la;
		try {
			_localctx = new Valores_Structura_ComaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(ESTO);
			setState(207);
			match(ID);
			setState(208);
			match(DOS_PUNTOS);
			setState(209);
			tipos_structura();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(210);
				match(COMA);
				setState(211);
				match(ESTO);
				setState(212);
				match(ID);
				setState(213);
				match(DOS_PUNTOS);
				setState(214);
				tipos_structura();
				}
				}
				setState(219);
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
	public static class Valores_structura_punto_comaContext extends ParserRuleContext {
		public Valores_structura_punto_comaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valores_structura_punto_coma; }
	 
		public Valores_structura_punto_comaContext() { }
		public void copyFrom(Valores_structura_punto_comaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Valores_Structura_Punto_ComaContext extends Valores_structura_punto_comaContext {
		public TerminalNode ESTO() { return getToken(CodexLatinusGrammarParser.ESTO, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusGrammarParser.ID, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CodexLatinusGrammarParser.DOS_PUNTOS, 0); }
		public Tipos_structuraContext tipos_structura() {
			return getRuleContext(Tipos_structuraContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(CodexLatinusGrammarParser.PUNTO_COMA, 0); }
		public Valores_Structura_Punto_ComaContext(Valores_structura_punto_comaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterValores_Structura_Punto_Coma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitValores_Structura_Punto_Coma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitValores_Structura_Punto_Coma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Valores_structura_punto_comaContext valores_structura_punto_coma() throws RecognitionException {
		Valores_structura_punto_comaContext _localctx = new Valores_structura_punto_comaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_valores_structura_punto_coma);
		try {
			_localctx = new Valores_Structura_Punto_ComaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(ESTO);
			setState(221);
			match(ID);
			setState(222);
			match(DOS_PUNTOS);
			setState(223);
			tipos_structura();
			setState(224);
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
	public static class Asignacion_structuraContext extends ParserRuleContext {
		public Asignacion_structuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion_structura; }
	 
		public Asignacion_structuraContext() { }
		public void copyFrom(Asignacion_structuraContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Asignacion_Variable_StructuraContext extends Asignacion_structuraContext {
		public List<TerminalNode> ID() { return getTokens(CodexLatinusGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CodexLatinusGrammarParser.ID, i);
		}
		public List<TerminalNode> DOS_PUNTOS() { return getTokens(CodexLatinusGrammarParser.DOS_PUNTOS); }
		public TerminalNode DOS_PUNTOS(int i) {
			return getToken(CodexLatinusGrammarParser.DOS_PUNTOS, i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(CodexLatinusGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(CodexLatinusGrammarParser.COMA, i);
		}
		public Asignacion_Variable_StructuraContext(Asignacion_structuraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterAsignacion_Variable_Structura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitAsignacion_Variable_Structura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitAsignacion_Variable_Structura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asignacion_structuraContext asignacion_structura() throws RecognitionException {
		Asignacion_structuraContext _localctx = new Asignacion_structuraContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_asignacion_structura);
		int _la;
		try {
			_localctx = new Asignacion_Variable_StructuraContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(ID);
			setState(227);
			match(DOS_PUNTOS);
			setState(228);
			expresion(0);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(229);
				match(COMA);
				setState(230);
				match(ID);
				setState(231);
				match(DOS_PUNTOS);
				setState(232);
				expresion(0);
				}
				}
				setState(237);
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
	public static class Func_paramContext extends ParserRuleContext {
		public Func_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_param; }
	 
		public Func_paramContext() { }
		public void copyFrom(Func_paramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Parametros_FuncionesContext extends Func_paramContext {
		public List<TerminalNode> ESTO() { return getTokens(CodexLatinusGrammarParser.ESTO); }
		public TerminalNode ESTO(int i) {
			return getToken(CodexLatinusGrammarParser.ESTO, i);
		}
		public List<TerminalNode> ID() { return getTokens(CodexLatinusGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CodexLatinusGrammarParser.ID, i);
		}
		public List<TerminalNode> DOS_PUNTOS() { return getTokens(CodexLatinusGrammarParser.DOS_PUNTOS); }
		public TerminalNode DOS_PUNTOS(int i) {
			return getToken(CodexLatinusGrammarParser.DOS_PUNTOS, i);
		}
		public List<TiposContext> tipos() {
			return getRuleContexts(TiposContext.class);
		}
		public TiposContext tipos(int i) {
			return getRuleContext(TiposContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(CodexLatinusGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(CodexLatinusGrammarParser.COMA, i);
		}
		public Parametros_FuncionesContext(Func_paramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterParametros_Funciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitParametros_Funciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitParametros_Funciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_paramContext func_param() throws RecognitionException {
		Func_paramContext _localctx = new Func_paramContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_func_param);
		int _la;
		try {
			_localctx = new Parametros_FuncionesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(ESTO);
			setState(239);
			match(ID);
			setState(240);
			match(DOS_PUNTOS);
			setState(241);
			tipos();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(242);
				match(COMA);
				setState(243);
				match(ESTO);
				setState(244);
				match(ID);
				setState(245);
				match(DOS_PUNTOS);
				setState(246);
				tipos();
				}
				}
				setState(251);
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
	public static class Tipos_structuraContext extends ParserRuleContext {
		public Tipos_structuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos_structura; }
	 
		public Tipos_structuraContext() { }
		public void copyFrom(Tipos_structuraContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TIpo_SeriesContext extends Tipos_structuraContext {
		public TerminalNode ID() { return getToken(CodexLatinusGrammarParser.ID, 0); }
		public TerminalNode LCORCH() { return getToken(CodexLatinusGrammarParser.LCORCH, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RCORCH() { return getToken(CodexLatinusGrammarParser.RCORCH, 0); }
		public TIpo_SeriesContext(Tipos_structuraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterTIpo_Series(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitTIpo_Series(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitTIpo_Series(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Identificador_StructuraContext extends Tipos_structuraContext {
		public TerminalNode ID() { return getToken(CodexLatinusGrammarParser.ID, 0); }
		public Identificador_StructuraContext(Tipos_structuraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterIdentificador_Structura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitIdentificador_Structura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitIdentificador_Structura(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Tipos_PrimitivosContext extends Tipos_structuraContext {
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public Tipos_PrimitivosContext(Tipos_structuraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterTipos_Primitivos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitTipos_Primitivos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitTipos_Primitivos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipos_structuraContext tipos_structura() throws RecognitionException {
		Tipos_structuraContext _localctx = new Tipos_structuraContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tipos_structura);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new Tipos_PrimitivosContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				tipos();
				}
				break;
			case 2:
				_localctx = new TIpo_SeriesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(ID);
				setState(254);
				match(LCORCH);
				setState(255);
				expresion(0);
				setState(256);
				match(RCORCH);
				}
				break;
			case 3:
				_localctx = new Identificador_StructuraContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				match(ID);
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
	public static class TiposContext extends ParserRuleContext {
		public TiposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos; }
	 
		public TiposContext() { }
		public void copyFrom(TiposContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_NumerusContext extends TiposContext {
		public TerminalNode NUMERUS() { return getToken(CodexLatinusGrammarParser.NUMERUS, 0); }
		public Tipo_NumerusContext(TiposContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterTipo_Numerus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitTipo_Numerus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitTipo_Numerus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_LitteraContext extends TiposContext {
		public TerminalNode LITTERA() { return getToken(CodexLatinusGrammarParser.LITTERA, 0); }
		public Tipo_LitteraContext(TiposContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterTipo_Littera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitTipo_Littera(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitTipo_Littera(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_TextumContext extends TiposContext {
		public TerminalNode TEXTUM() { return getToken(CodexLatinusGrammarParser.TEXTUM, 0); }
		public Tipo_TextumContext(TiposContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterTipo_Textum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitTipo_Textum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitTipo_Textum(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_BoolContext extends TiposContext {
		public TerminalNode BOOL() { return getToken(CodexLatinusGrammarParser.BOOL, 0); }
		public Tipo_BoolContext(TiposContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterTipo_Bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitTipo_Bool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitTipo_Bool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_DecimalisContext extends TiposContext {
		public TerminalNode DECIMALIS() { return getToken(CodexLatinusGrammarParser.DECIMALIS, 0); }
		public Tipo_DecimalisContext(TiposContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterTipo_Decimalis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitTipo_Decimalis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitTipo_Decimalis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TiposContext tipos() throws RecognitionException {
		TiposContext _localctx = new TiposContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tipos);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERUS:
				_localctx = new Tipo_NumerusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(NUMERUS);
				}
				break;
			case DECIMALIS:
				_localctx = new Tipo_DecimalisContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				match(DECIMALIS);
				}
				break;
			case TEXTUM:
				_localctx = new Tipo_TextumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				match(TEXTUM);
				}
				break;
			case LITTERA:
				_localctx = new Tipo_LitteraContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(264);
				match(LITTERA);
				}
				break;
			case BOOL:
				_localctx = new Tipo_BoolContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(265);
				match(BOOL);
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
	public static class MainContext extends ParserRuleContext {
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	 
		public MainContext() { }
		public void copyFrom(MainContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Bloque_MaiorContext extends MainContext {
		public TerminalNode MAIOR() { return getToken(CodexLatinusGrammarParser.MAIOR, 0); }
		public TerminalNode MAYOR() { return getToken(CodexLatinusGrammarParser.MAYOR, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public Bloque_MaiorContext(MainContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterBloque_Maior(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitBloque_Maior(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitBloque_Maior(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_main);
		int _la;
		try {
			_localctx = new Bloque_MaiorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(MAIOR);
			setState(269);
			match(MAYOR);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 560698158310467546L) != 0)) {
				{
				{
				setState(270);
				instruccion();
				}
				}
				setState(275);
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
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	 
		public InstruccionContext() { }
		public void copyFrom(InstruccionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Bloque_ExpresionesContext extends InstruccionContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Bloque_ExpresionesContext(InstruccionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterBloque_Expresiones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitBloque_Expresiones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitBloque_Expresiones(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Bloque_ImprimirContext extends InstruccionContext {
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
		public Bloque_ImprimirContext(InstruccionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterBloque_Imprimir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitBloque_Imprimir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitBloque_Imprimir(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Reddere_ValueContext extends InstruccionContext {
		public TerminalNode REDDERE() { return getToken(CodexLatinusGrammarParser.REDDERE, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(CodexLatinusGrammarParser.PUNTO_COMA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Reddere_ValueContext(InstruccionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterReddere_Value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitReddere_Value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitReddere_Value(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Per_CicloContext extends InstruccionContext {
		public TerminalNode PER() { return getToken(CodexLatinusGrammarParser.PER, 0); }
		public TerminalNode LPAREN() { return getToken(CodexLatinusGrammarParser.LPAREN, 0); }
		public TerminalNode ESTO() { return getToken(CodexLatinusGrammarParser.ESTO, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusGrammarParser.ID, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CodexLatinusGrammarParser.DOS_PUNTOS, 0); }
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> PUNTO_COMA() { return getTokens(CodexLatinusGrammarParser.PUNTO_COMA); }
		public TerminalNode PUNTO_COMA(int i) {
			return getToken(CodexLatinusGrammarParser.PUNTO_COMA, i);
		}
		public Ops_automaticasContext ops_automaticas() {
			return getRuleContext(Ops_automaticasContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CodexLatinusGrammarParser.RPAREN, 0); }
		public TerminalNode LLLAVE() { return getToken(CodexLatinusGrammarParser.LLLAVE, 0); }
		public TerminalNode RLLAVE() { return getToken(CodexLatinusGrammarParser.RLLAVE, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public Per_CicloContext(InstruccionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterPer_Ciclo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitPer_Ciclo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitPer_Ciclo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Dum_CicloContext extends InstruccionContext {
		public TerminalNode DUM() { return getToken(CodexLatinusGrammarParser.DUM, 0); }
		public TerminalNode LPAREN() { return getToken(CodexLatinusGrammarParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CodexLatinusGrammarParser.RPAREN, 0); }
		public TerminalNode LLLAVE() { return getToken(CodexLatinusGrammarParser.LLLAVE, 0); }
		public TerminalNode RLLAVE() { return getToken(CodexLatinusGrammarParser.RLLAVE, 0); }
		public TerminalNode FINIS() { return getToken(CodexLatinusGrammarParser.FINIS, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(CodexLatinusGrammarParser.PUNTO_COMA, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public Dum_CicloContext(InstruccionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterDum_Ciclo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitDum_Ciclo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitDum_Ciclo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Interrumpe_ActionContext extends InstruccionContext {
		public TerminalNode INTERRUMPE() { return getToken(CodexLatinusGrammarParser.INTERRUMPE, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(CodexLatinusGrammarParser.PUNTO_COMA, 0); }
		public Interrumpe_ActionContext(InstruccionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterInterrumpe_Action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitInterrumpe_Action(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitInterrumpe_Action(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Auto_InstruccionContext extends InstruccionContext {
		public Ops_automaticasContext ops_automaticas() {
			return getRuleContext(Ops_automaticasContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(CodexLatinusGrammarParser.PUNTO_COMA, 0); }
		public Auto_InstruccionContext(InstruccionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterAuto_Instruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitAuto_Instruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitAuto_Instruccion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Llamada_ActioContext extends InstruccionContext {
		public TerminalNode ID() { return getToken(CodexLatinusGrammarParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(CodexLatinusGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CodexLatinusGrammarParser.RPAREN, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(CodexLatinusGrammarParser.PUNTO_COMA, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(CodexLatinusGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(CodexLatinusGrammarParser.COMA, i);
		}
		public Llamada_ActioContext(InstruccionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterLlamada_Actio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitLlamada_Actio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitLlamada_Actio(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Facere_CicloContext extends InstruccionContext {
		public TerminalNode FACERE() { return getToken(CodexLatinusGrammarParser.FACERE, 0); }
		public TerminalNode LLLAVE() { return getToken(CodexLatinusGrammarParser.LLLAVE, 0); }
		public TerminalNode RLLAVE() { return getToken(CodexLatinusGrammarParser.RLLAVE, 0); }
		public TerminalNode DUM() { return getToken(CodexLatinusGrammarParser.DUM, 0); }
		public TerminalNode LPAREN() { return getToken(CodexLatinusGrammarParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CodexLatinusGrammarParser.RPAREN, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(CodexLatinusGrammarParser.PUNTO_COMA, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public Facere_CicloContext(InstruccionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterFacere_Ciclo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitFacere_Ciclo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitFacere_Ciclo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Bloque_AsignacionesContext extends InstruccionContext {
		public AsignacionesContext asignaciones() {
			return getRuleContext(AsignacionesContext.class,0);
		}
		public Bloque_AsignacionesContext(InstruccionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterBloque_Asignaciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitBloque_Asignaciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitBloque_Asignaciones(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Perge_ActionContext extends InstruccionContext {
		public TerminalNode PERGE() { return getToken(CodexLatinusGrammarParser.PERGE, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(CodexLatinusGrammarParser.PUNTO_COMA, 0); }
		public Perge_ActionContext(InstruccionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterPerge_Action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitPerge_Action(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitPerge_Action(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Si_CondicionalContext extends InstruccionContext {
		public TerminalNode SI() { return getToken(CodexLatinusGrammarParser.SI, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(CodexLatinusGrammarParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(CodexLatinusGrammarParser.LPAREN, i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(CodexLatinusGrammarParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(CodexLatinusGrammarParser.RPAREN, i);
		}
		public List<TerminalNode> LLLAVE() { return getTokens(CodexLatinusGrammarParser.LLLAVE); }
		public TerminalNode LLLAVE(int i) {
			return getToken(CodexLatinusGrammarParser.LLLAVE, i);
		}
		public List<TerminalNode> RLLAVE() { return getTokens(CodexLatinusGrammarParser.RLLAVE); }
		public TerminalNode RLLAVE(int i) {
			return getToken(CodexLatinusGrammarParser.RLLAVE, i);
		}
		public TerminalNode FINIS() { return getToken(CodexLatinusGrammarParser.FINIS, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(CodexLatinusGrammarParser.PUNTO_COMA, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public List<AsignacionesContext> asignaciones() {
			return getRuleContexts(AsignacionesContext.class);
		}
		public AsignacionesContext asignaciones(int i) {
			return getRuleContext(AsignacionesContext.class,i);
		}
		public List<TerminalNode> ALITER() { return getTokens(CodexLatinusGrammarParser.ALITER); }
		public TerminalNode ALITER(int i) {
			return getToken(CodexLatinusGrammarParser.ALITER, i);
		}
		public Si_CondicionalContext(InstruccionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterSi_Condicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitSi_Condicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitSi_Condicional(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Bloque_LeerContext extends InstruccionContext {
		public Leer_txtContext leer_txt() {
			return getRuleContext(Leer_txtContext.class,0);
		}
		public Bloque_LeerContext(InstruccionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterBloque_Leer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitBloque_Leer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitBloque_Leer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_instruccion);
		int _la;
		try {
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new Bloque_ImprimirContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				imprimir();
				}
				break;
			case 2:
				_localctx = new Auto_InstruccionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				ops_automaticas();
				setState(278);
				match(PUNTO_COMA);
				}
				break;
			case 3:
				_localctx = new Bloque_ExpresionesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				expresion(0);
				}
				break;
			case 4:
				_localctx = new Bloque_LeerContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				leer_txt();
				}
				break;
			case 5:
				_localctx = new Llamada_ActioContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(282);
				match(ID);
				setState(283);
				match(LPAREN);
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 560698157902596058L) != 0)) {
					{
					{
					setState(284);
					expresion(0);
					setState(289);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(285);
						match(COMA);
						setState(286);
						expresion(0);
						}
						}
						setState(291);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(296);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(297);
				match(RPAREN);
				setState(298);
				match(PUNTO_COMA);
				}
				break;
			case 6:
				_localctx = new Si_CondicionalContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(299);
				match(SI);
				setState(300);
				match(LPAREN);
				setState(301);
				expresion(0);
				setState(302);
				match(RPAREN);
				setState(303);
				match(LLLAVE);
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 560698158310467546L) != 0)) {
					{
					setState(306);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						setState(304);
						instruccion();
						}
						break;
					case 2:
						{
						setState(305);
						asignaciones();
						}
						break;
					}
					}
					setState(310);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(311);
				match(RLLAVE);
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ALITER) {
					{
					{
					setState(312);
					match(ALITER);
					setState(317);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LPAREN) {
						{
						setState(313);
						match(LPAREN);
						setState(314);
						expresion(0);
						setState(315);
						match(RPAREN);
						}
					}

					setState(319);
					match(LLLAVE);
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 560698158310467546L) != 0)) {
						{
						{
						setState(320);
						instruccion();
						}
						}
						setState(325);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(326);
					match(RLLAVE);
					}
					}
					setState(331);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(332);
				match(FINIS);
				setState(333);
				match(PUNTO_COMA);
				}
				break;
			case 7:
				_localctx = new Dum_CicloContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(335);
				match(DUM);
				setState(336);
				match(LPAREN);
				setState(337);
				expresion(0);
				setState(338);
				match(RPAREN);
				setState(339);
				match(LLLAVE);
				setState(341); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(340);
					instruccion();
					}
					}
					setState(343); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 560698158310467546L) != 0) );
				setState(345);
				match(RLLAVE);
				setState(346);
				match(FINIS);
				setState(347);
				match(PUNTO_COMA);
				}
				break;
			case 8:
				_localctx = new Facere_CicloContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(349);
				match(FACERE);
				setState(350);
				match(LLLAVE);
				setState(352); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(351);
					instruccion();
					}
					}
					setState(354); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 560698158310467546L) != 0) );
				setState(356);
				match(RLLAVE);
				setState(357);
				match(DUM);
				setState(358);
				match(LPAREN);
				setState(359);
				expresion(0);
				setState(360);
				match(RPAREN);
				setState(361);
				match(PUNTO_COMA);
				}
				break;
			case 9:
				_localctx = new Per_CicloContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(363);
				match(PER);
				setState(364);
				match(LPAREN);
				setState(365);
				match(ESTO);
				setState(366);
				match(ID);
				setState(367);
				match(DOS_PUNTOS);
				setState(368);
				tipos();
				setState(369);
				expresion(0);
				setState(370);
				match(PUNTO_COMA);
				setState(371);
				expresion(0);
				setState(372);
				match(PUNTO_COMA);
				setState(373);
				ops_automaticas();
				setState(374);
				match(RPAREN);
				setState(375);
				match(LLLAVE);
				setState(377); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(376);
					instruccion();
					}
					}
					setState(379); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 560698158310467546L) != 0) );
				setState(381);
				match(RLLAVE);
				}
				break;
			case 10:
				_localctx = new Perge_ActionContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(383);
				match(PERGE);
				setState(384);
				match(PUNTO_COMA);
				}
				break;
			case 11:
				_localctx = new Interrumpe_ActionContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(385);
				match(INTERRUMPE);
				setState(386);
				match(PUNTO_COMA);
				}
				break;
			case 12:
				_localctx = new Reddere_ValueContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(387);
				match(REDDERE);
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 560698157902596058L) != 0)) {
					{
					setState(388);
					expresion(0);
					}
				}

				setState(391);
				match(PUNTO_COMA);
				}
				break;
			case 13:
				_localctx = new Bloque_AsignacionesContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(392);
				asignaciones();
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
	public static class AsignacionesContext extends ParserRuleContext {
		public AsignacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignaciones; }
	 
		public AsignacionesContext() { }
		public void copyFrom(AsignacionesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Mod_Valor_SeriesContext extends AsignacionesContext {
		public TerminalNode ID() { return getToken(CodexLatinusGrammarParser.ID, 0); }
		public TerminalNode LCORCH() { return getToken(CodexLatinusGrammarParser.LCORCH, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode RCORCH() { return getToken(CodexLatinusGrammarParser.RCORCH, 0); }
		public TerminalNode ASIGNACION() { return getToken(CodexLatinusGrammarParser.ASIGNACION, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(CodexLatinusGrammarParser.PUNTO_COMA, 0); }
		public Mod_Valor_SeriesContext(AsignacionesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterMod_Valor_Series(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitMod_Valor_Series(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitMod_Valor_Series(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Mod_Valor_StructuraContext extends AsignacionesContext {
		public TerminalNode ID() { return getToken(CodexLatinusGrammarParser.ID, 0); }
		public TerminalNode PUNTO() { return getToken(CodexLatinusGrammarParser.PUNTO, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode ASIGNACION() { return getToken(CodexLatinusGrammarParser.ASIGNACION, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(CodexLatinusGrammarParser.PUNTO_COMA, 0); }
		public Mod_Valor_StructuraContext(AsignacionesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterMod_Valor_Structura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitMod_Valor_Structura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitMod_Valor_Structura(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Mod_ValorContext extends AsignacionesContext {
		public TerminalNode ID() { return getToken(CodexLatinusGrammarParser.ID, 0); }
		public TerminalNode ASIGNACION() { return getToken(CodexLatinusGrammarParser.ASIGNACION, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(CodexLatinusGrammarParser.PUNTO_COMA, 0); }
		public Mod_ValorContext(AsignacionesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterMod_Valor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitMod_Valor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitMod_Valor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Asignacion_Structura_SeriesContext extends AsignacionesContext {
		public List<TerminalNode> ID() { return getTokens(CodexLatinusGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CodexLatinusGrammarParser.ID, i);
		}
		public TerminalNode LCORCH() { return getToken(CodexLatinusGrammarParser.LCORCH, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode RCORCH() { return getToken(CodexLatinusGrammarParser.RCORCH, 0); }
		public TerminalNode PUNTO() { return getToken(CodexLatinusGrammarParser.PUNTO, 0); }
		public TerminalNode ASIGNACION() { return getToken(CodexLatinusGrammarParser.ASIGNACION, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(CodexLatinusGrammarParser.PUNTO_COMA, 0); }
		public Asignacion_Structura_SeriesContext(AsignacionesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterAsignacion_Structura_Series(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitAsignacion_Structura_Series(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitAsignacion_Structura_Series(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionesContext asignaciones() throws RecognitionException {
		AsignacionesContext _localctx = new AsignacionesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_asignaciones);
		try {
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				_localctx = new Mod_ValorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				match(ID);
				setState(396);
				match(ASIGNACION);
				setState(397);
				expresion(0);
				setState(398);
				match(PUNTO_COMA);
				}
				break;
			case 2:
				_localctx = new Mod_Valor_SeriesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				match(ID);
				setState(401);
				match(LCORCH);
				setState(402);
				expresion(0);
				setState(403);
				match(RCORCH);
				setState(404);
				match(ASIGNACION);
				setState(405);
				expresion(0);
				setState(406);
				match(PUNTO_COMA);
				}
				break;
			case 3:
				_localctx = new Mod_Valor_StructuraContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(408);
				match(ID);
				setState(409);
				match(PUNTO);
				setState(410);
				expresion(0);
				setState(411);
				match(ASIGNACION);
				setState(412);
				expresion(0);
				setState(413);
				match(PUNTO_COMA);
				}
				break;
			case 4:
				_localctx = new Asignacion_Structura_SeriesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(415);
				match(ID);
				setState(416);
				match(LCORCH);
				setState(417);
				expresion(0);
				setState(418);
				match(RCORCH);
				setState(419);
				match(PUNTO);
				setState(420);
				match(ID);
				setState(421);
				match(ASIGNACION);
				setState(422);
				expresion(0);
				setState(423);
				match(PUNTO_COMA);
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
	public static class Ops_automaticasContext extends ParserRuleContext {
		public Ops_automaticasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ops_automaticas; }
	 
		public Ops_automaticasContext() { }
		public void copyFrom(Ops_automaticasContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Resta_AutoContext extends Ops_automaticasContext {
		public TerminalNode ID() { return getToken(CodexLatinusGrammarParser.ID, 0); }
		public TerminalNode RESTA_DECR() { return getToken(CodexLatinusGrammarParser.RESTA_DECR, 0); }
		public Resta_AutoContext(Ops_automaticasContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterResta_Auto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitResta_Auto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitResta_Auto(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Suma_AutoContext extends Ops_automaticasContext {
		public TerminalNode ID() { return getToken(CodexLatinusGrammarParser.ID, 0); }
		public TerminalNode SUMA_INCR() { return getToken(CodexLatinusGrammarParser.SUMA_INCR, 0); }
		public Suma_AutoContext(Ops_automaticasContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterSuma_Auto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitSuma_Auto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitSuma_Auto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ops_automaticasContext ops_automaticas() throws RecognitionException {
		Ops_automaticasContext _localctx = new Ops_automaticasContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ops_automaticas);
		try {
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				_localctx = new Suma_AutoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				match(ID);
				setState(428);
				match(SUMA_INCR);
				}
				break;
			case 2:
				_localctx = new Resta_AutoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				match(ID);
				setState(430);
				match(RESTA_DECR);
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
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
	 
		public ImprimirContext() { }
		public void copyFrom(ImprimirContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Impresion_ConsolaContext extends ImprimirContext {
		public List<TerminalNode> IMPR() { return getTokens(CodexLatinusGrammarParser.IMPR); }
		public TerminalNode IMPR(int i) {
			return getToken(CodexLatinusGrammarParser.IMPR, i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode PUNTO_COMA() { return getToken(CodexLatinusGrammarParser.PUNTO_COMA, 0); }
		public Impresion_ConsolaContext(ImprimirContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterImpresion_Consola(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitImpresion_Consola(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitImpresion_Consola(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_imprimir);
		int _la;
		try {
			_localctx = new Impresion_ConsolaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(IMPR);
			setState(434);
			expresion(0);
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPR) {
				{
				{
				setState(435);
				match(IMPR);
				setState(436);
				expresion(0);
				}
				}
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(442);
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
	public static class Leer_txtContext extends ParserRuleContext {
		public Leer_txtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leer_txt; }
	 
		public Leer_txtContext() { }
		public void copyFrom(Leer_txtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Lectura_TextoContext extends Leer_txtContext {
		public TerminalNode LEER() { return getToken(CodexLatinusGrammarParser.LEER, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusGrammarParser.ID, 0); }
		public Lectura_TextoContext(Leer_txtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterLectura_Texto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitLectura_Texto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitLectura_Texto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Leer_txtContext leer_txt() throws RecognitionException {
		Leer_txtContext _localctx = new Leer_txtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_leer_txt);
		int _la;
		try {
			_localctx = new Lectura_TextoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(444);
				match(ID);
				}
			}

			setState(447);
			match(LEER);
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
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	 
		public ExpresionContext() { }
		public void copyFrom(ExpresionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParentesisContext extends ExpresionContext {
		public TerminalNode LPAREN() { return getToken(CodexLatinusGrammarParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CodexLatinusGrammarParser.RPAREN, 0); }
		public ParentesisContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterParentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitParentesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitParentesis(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalsusValorContext extends ExpresionContext {
		public TerminalNode FALSUS() { return getToken(CodexLatinusGrammarParser.FALSUS, 0); }
		public FalsusValorContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterFalsusValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitFalsusValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitFalsusValor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntValContext extends ExpresionContext {
		public TerminalNode INT() { return getToken(CodexLatinusGrammarParser.INT, 0); }
		public IntValContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterIntVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitIntVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitIntVal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Llamada_Series_StructuraContext extends ExpresionContext {
		public List<TerminalNode> ID() { return getTokens(CodexLatinusGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CodexLatinusGrammarParser.ID, i);
		}
		public TerminalNode LCORCH() { return getToken(CodexLatinusGrammarParser.LCORCH, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RCORCH() { return getToken(CodexLatinusGrammarParser.RCORCH, 0); }
		public TerminalNode PUNTO() { return getToken(CodexLatinusGrammarParser.PUNTO, 0); }
		public Llamada_Series_StructuraContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterLlamada_Series_Structura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitLlamada_Series_Structura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitLlamada_Series_Structura(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharValContext extends ExpresionContext {
		public TerminalNode CHARS() { return getToken(CodexLatinusGrammarParser.CHARS, 0); }
		public CharValContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterCharVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitCharVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitCharVal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SumaRestaContext extends ExpresionContext {
		public Token ops1;
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode SUMA() { return getToken(CodexLatinusGrammarParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(CodexLatinusGrammarParser.RESTA, 0); }
		public SumaRestaContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterSumaResta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitSumaResta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitSumaResta(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegacionContext extends ExpresionContext {
		public TerminalNode NON() { return getToken(CodexLatinusGrammarParser.NON, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public NegacionContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterNegacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitNegacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitNegacion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Llamada_Elemento_SeriesContext extends ExpresionContext {
		public TerminalNode ID() { return getToken(CodexLatinusGrammarParser.ID, 0); }
		public TerminalNode LCORCH() { return getToken(CodexLatinusGrammarParser.LCORCH, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RCORCH() { return getToken(CodexLatinusGrammarParser.RCORCH, 0); }
		public Llamada_Elemento_SeriesContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterLlamada_Elemento_Series(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitLlamada_Elemento_Series(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitLlamada_Elemento_Series(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultDivContext extends ExpresionContext {
		public Token ops1;
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode MULTI() { return getToken(CodexLatinusGrammarParser.MULTI, 0); }
		public TerminalNode DIV() { return getToken(CodexLatinusGrammarParser.DIV, 0); }
		public MultDivContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterMultDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitMultDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitMultDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Llamada_Actio_ExpContext extends ExpresionContext {
		public TerminalNode ID() { return getToken(CodexLatinusGrammarParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(CodexLatinusGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CodexLatinusGrammarParser.RPAREN, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(CodexLatinusGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(CodexLatinusGrammarParser.COMA, i);
		}
		public Llamada_Actio_ExpContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterLlamada_Actio_Exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitLlamada_Actio_Exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitLlamada_Actio_Exp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IgualNoIgualContext extends ExpresionContext {
		public Token ops1;
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode IGUAL() { return getToken(CodexLatinusGrammarParser.IGUAL, 0); }
		public TerminalNode NO_IGUAL() { return getToken(CodexLatinusGrammarParser.NO_IGUAL, 0); }
		public IgualNoIgualContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterIgualNoIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitIgualNoIgual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitIgualNoIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MenorMayorContext extends ExpresionContext {
		public Token ops1;
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode MENOR() { return getToken(CodexLatinusGrammarParser.MENOR, 0); }
		public TerminalNode MAYOR() { return getToken(CodexLatinusGrammarParser.MAYOR, 0); }
		public MenorMayorContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterMenorMayor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitMenorMayor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitMenorMayor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Llamada_Ratio_TipoContext extends ExpresionContext {
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public TerminalNode ID() { return getToken(CodexLatinusGrammarParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(CodexLatinusGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CodexLatinusGrammarParser.RPAREN, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(CodexLatinusGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(CodexLatinusGrammarParser.COMA, i);
		}
		public Llamada_Ratio_TipoContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterLlamada_Ratio_Tipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitLlamada_Ratio_Tipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitLlamada_Ratio_Tipo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleValContext extends ExpresionContext {
		public TerminalNode DOUBLE() { return getToken(CodexLatinusGrammarParser.DOUBLE, 0); }
		public DoubleValContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterDoubleVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitDoubleVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitDoubleVal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Llamada_Propiedad_StructuraContext extends ExpresionContext {
		public List<TerminalNode> ID() { return getTokens(CodexLatinusGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CodexLatinusGrammarParser.ID, i);
		}
		public TerminalNode PUNTO() { return getToken(CodexLatinusGrammarParser.PUNTO, 0); }
		public Llamada_Propiedad_StructuraContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterLlamada_Propiedad_Structura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitLlamada_Propiedad_Structura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitLlamada_Propiedad_Structura(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringValContext extends ExpresionContext {
		public TerminalNode STRING() { return getToken(CodexLatinusGrammarParser.STRING, 0); }
		public StringValContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterStringVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitStringVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitStringVal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentificadorContext extends ExpresionContext {
		public TerminalNode ID() { return getToken(CodexLatinusGrammarParser.ID, 0); }
		public IdentificadorContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MenorMayorIgualContext extends ExpresionContext {
		public Token ops1;
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode MENRO_IGUAL() { return getToken(CodexLatinusGrammarParser.MENRO_IGUAL, 0); }
		public TerminalNode MAYOR_IGUAL() { return getToken(CodexLatinusGrammarParser.MAYOR_IGUAL, 0); }
		public MenorMayorIgualContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterMenorMayorIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitMenorMayorIgual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitMenorMayorIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VerumValorContext extends ExpresionContext {
		public TerminalNode VERUM() { return getToken(CodexLatinusGrammarParser.VERUM, 0); }
		public VerumValorContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterVerumValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitVerumValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitVerumValor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndOrContext extends ExpresionContext {
		public Token ops1;
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode AND() { return getToken(CodexLatinusGrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(CodexLatinusGrammarParser.OR, 0); }
		public AndOrContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterAndOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitAndOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitAndOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UmenosContext extends ExpresionContext {
		public TerminalNode RESTA() { return getToken(CodexLatinusGrammarParser.RESTA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public UmenosContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterUmenos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitUmenos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitUmenos(this);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				_localctx = new UmenosContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(450);
				match(RESTA);
				setState(451);
				expresion(21);
				}
				break;
			case 2:
				{
				_localctx = new NegacionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(452);
				match(NON);
				setState(453);
				expresion(20);
				}
				break;
			case 3:
				{
				_localctx = new ParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(454);
				match(LPAREN);
				setState(455);
				expresion(0);
				setState(456);
				match(RPAREN);
				}
				break;
			case 4:
				{
				_localctx = new Llamada_Elemento_SeriesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(458);
				match(ID);
				setState(459);
				match(LCORCH);
				setState(460);
				expresion(0);
				setState(461);
				match(RCORCH);
				}
				break;
			case 5:
				{
				_localctx = new Llamada_Propiedad_StructuraContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(463);
				match(ID);
				setState(464);
				match(PUNTO);
				setState(465);
				match(ID);
				}
				break;
			case 6:
				{
				_localctx = new Llamada_Actio_ExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(466);
				match(ID);
				setState(467);
				match(LPAREN);
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 560698157902596058L) != 0)) {
					{
					{
					setState(468);
					expresion(0);
					setState(473);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(469);
						match(COMA);
						setState(470);
						expresion(0);
						}
						}
						setState(475);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(480);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(481);
				match(RPAREN);
				}
				break;
			case 7:
				{
				_localctx = new Llamada_Ratio_TipoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(482);
				tipos();
				setState(483);
				match(ID);
				setState(484);
				match(LPAREN);
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 560698157902596058L) != 0)) {
					{
					{
					setState(485);
					expresion(0);
					setState(490);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(486);
						match(COMA);
						setState(487);
						expresion(0);
						}
						}
						setState(492);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(497);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(498);
				match(RPAREN);
				}
				break;
			case 8:
				{
				_localctx = new Llamada_Series_StructuraContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(500);
				match(ID);
				setState(501);
				match(LCORCH);
				setState(502);
				expresion(0);
				setState(503);
				match(RCORCH);
				setState(504);
				match(PUNTO);
				setState(505);
				match(ID);
				}
				break;
			case 9:
				{
				_localctx = new VerumValorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(507);
				match(VERUM);
				}
				break;
			case 10:
				{
				_localctx = new FalsusValorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(508);
				match(FALSUS);
				}
				break;
			case 11:
				{
				_localctx = new IdentificadorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(509);
				match(ID);
				}
				break;
			case 12:
				{
				_localctx = new DoubleValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(510);
				match(DOUBLE);
				}
				break;
			case 13:
				{
				_localctx = new IntValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(511);
				match(INT);
				}
				break;
			case 14:
				{
				_localctx = new CharValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(512);
				match(CHARS);
				}
				break;
			case 15:
				{
				_localctx = new StringValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(513);
				match(STRING);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(536);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(534);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(516);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(517);
						((MultDivContext)_localctx).ops1 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULTI || _la==DIV) ) {
							((MultDivContext)_localctx).ops1 = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(518);
						expresion(19);
						}
						break;
					case 2:
						{
						_localctx = new SumaRestaContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(519);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(520);
						((SumaRestaContext)_localctx).ops1 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SUMA || _la==RESTA) ) {
							((SumaRestaContext)_localctx).ops1 = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(521);
						expresion(18);
						}
						break;
					case 3:
						{
						_localctx = new IgualNoIgualContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(522);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(523);
						((IgualNoIgualContext)_localctx).ops1 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==IGUAL || _la==NO_IGUAL) ) {
							((IgualNoIgualContext)_localctx).ops1 = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(524);
						expresion(17);
						}
						break;
					case 4:
						{
						_localctx = new MenorMayorIgualContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(525);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(526);
						((MenorMayorIgualContext)_localctx).ops1 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MENRO_IGUAL || _la==MAYOR_IGUAL) ) {
							((MenorMayorIgualContext)_localctx).ops1 = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(527);
						expresion(16);
						}
						break;
					case 5:
						{
						_localctx = new MenorMayorContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(528);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(529);
						((MenorMayorContext)_localctx).ops1 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MENOR || _la==MAYOR) ) {
							((MenorMayorContext)_localctx).ops1 = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(530);
						expresion(15);
						}
						break;
					case 6:
						{
						_localctx = new AndOrContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(531);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(532);
						((AndOrContext)_localctx).ops1 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((AndOrContext)_localctx).ops1 = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(533);
						expresion(14);
						}
						break;
					}
					} 
				}
				setState(538);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
		case 20:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001>\u021c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0003\u0000"+
		",\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0003\u00011\b\u0001\u0001"+
		"\u0001\u0003\u00014\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002=\b\u0002\u000b"+
		"\u0002\f\u0002>\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003D\b\u0003"+
		"\u000b\u0003\f\u0003E\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004L\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"Q\b\u0004\u0001\u0004\u0005\u0004T\b\u0004\n\u0004\f\u0004W\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004a\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004f\b\u0004\u0001\u0004\u0004\u0004i\b\u0004\u000b\u0004"+
		"\f\u0004j\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"q\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005v\b\u0005\u000b"+
		"\u0005\f\u0005w\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u008e\b\u0006\n"+
		"\u0006\f\u0006\u0091\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0004\u0006\u00a4\b\u0006\u000b\u0006\f\u0006\u00a5"+
		"\u0003\u0006\u00a8\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00c9\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00cd\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00d8\b\b\n\b\f\b\u00db"+
		"\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00ea\b\n\n\n\f\n\u00ed\t\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00f8\b\u000b\n\u000b"+
		"\f\u000b\u00fb\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0003\f\u0104\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u010b\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0110\b\u000e"+
		"\n\u000e\f\u000e\u0113\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u0120\b\u000f\n\u000f\f\u000f\u0123\t\u000f"+
		"\u0005\u000f\u0125\b\u000f\n\u000f\f\u000f\u0128\t\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u0133\b\u000f\n\u000f\f\u000f\u0136\t\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u013e\b\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0142\b"+
		"\u000f\n\u000f\f\u000f\u0145\t\u000f\u0001\u000f\u0005\u000f\u0148\b\u000f"+
		"\n\u000f\f\u000f\u014b\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0004"+
		"\u000f\u0156\b\u000f\u000b\u000f\f\u000f\u0157\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f"+
		"\u0161\b\u000f\u000b\u000f\f\u000f\u0162\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0004\u000f\u017a\b\u000f\u000b\u000f\f\u000f\u017b\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u0186\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u018a\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u01aa\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u01b0\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u01b6\b\u0012\n\u0012\f\u0012\u01b9\t\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0003\u0013\u01be\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u01d8"+
		"\b\u0014\n\u0014\f\u0014\u01db\t\u0014\u0005\u0014\u01dd\b\u0014\n\u0014"+
		"\f\u0014\u01e0\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u01e9\b\u0014\n\u0014"+
		"\f\u0014\u01ec\t\u0014\u0005\u0014\u01ee\b\u0014\n\u0014\f\u0014\u01f1"+
		"\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0203"+
		"\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u0217\b\u0014\n\u0014\f\u0014\u021a\t\u0014\u0001\u0014"+
		"\u0000\u0001(\u0015\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(\u0000\u0006\u0001\u0000!\"\u0001"+
		"\u0000\u001f \u0001\u0000#$\u0001\u0000%&\u0001\u0000\'(\u0001\u0000)"+
		"*\u025e\u0000+\u0001\u0000\u0000\u0000\u00020\u0001\u0000\u0000\u0000"+
		"\u00049\u0001\u0000\u0000\u0000\u0006@\u0001\u0000\u0000\u0000\bp\u0001"+
		"\u0000\u0000\u0000\nr\u0001\u0000\u0000\u0000\f\u00c8\u0001\u0000\u0000"+
		"\u0000\u000e\u00cc\u0001\u0000\u0000\u0000\u0010\u00ce\u0001\u0000\u0000"+
		"\u0000\u0012\u00dc\u0001\u0000\u0000\u0000\u0014\u00e2\u0001\u0000\u0000"+
		"\u0000\u0016\u00ee\u0001\u0000\u0000\u0000\u0018\u0103\u0001\u0000\u0000"+
		"\u0000\u001a\u010a\u0001\u0000\u0000\u0000\u001c\u010c\u0001\u0000\u0000"+
		"\u0000\u001e\u0189\u0001\u0000\u0000\u0000 \u01a9\u0001\u0000\u0000\u0000"+
		"\"\u01af\u0001\u0000\u0000\u0000$\u01b1\u0001\u0000\u0000\u0000&\u01bd"+
		"\u0001\u0000\u0000\u0000(\u0202\u0001\u0000\u0000\u0000*,\u0003\u0002"+
		"\u0001\u0000+*\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0001"+
		"\u0000\u0000\u0000-.\u0005\u0000\u0000\u0001.\u0001\u0001\u0000\u0000"+
		"\u0000/1\u0003\u0004\u0002\u00000/\u0001\u0000\u0000\u000001\u0001\u0000"+
		"\u0000\u000013\u0001\u0000\u0000\u000024\u0003\u0006\u0003\u000032\u0001"+
		"\u0000\u0000\u000034\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u0000"+
		"56\u0003\u001c\u000e\u000067\u0005\u001a\u0000\u000078\u0005,\u0000\u0000"+
		"8\u0003\u0001\u0000\u0000\u00009:\u0005\u0017\u0000\u0000:<\u0005(\u0000"+
		"\u0000;=\u0003\f\u0006\u0000<;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000"+
		"\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?\u0005\u0001"+
		"\u0000\u0000\u0000@A\u0005\u0018\u0000\u0000AC\u0005(\u0000\u0000BD\u0003"+
		"\b\u0004\u0000CB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EC\u0001"+
		"\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000F\u0007\u0001\u0000\u0000"+
		"\u0000GH\u0005\u0014\u0000\u0000HI\u00056\u0000\u0000IK\u00053\u0000\u0000"+
		"JL\u0003\u0016\u000b\u0000KJ\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000"+
		"\u0000LM\u0001\u0000\u0000\u0000MN\u00054\u0000\u0000NP\u0005/\u0000\u0000"+
		"OQ\u0003\n\u0005\u0000PO\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000"+
		"QU\u0001\u0000\u0000\u0000RT\u0003\u001e\u000f\u0000SR\u0001\u0000\u0000"+
		"\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000"+
		"\u0000\u0000VX\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000XY\u0005"+
		"0\u0000\u0000YZ\u0005\f\u0000\u0000Zq\u0005,\u0000\u0000[\\\u0005\u0015"+
		"\u0000\u0000\\]\u0003\u001a\r\u0000]^\u00056\u0000\u0000^`\u00053\u0000"+
		"\u0000_a\u0003\u0016\u000b\u0000`_\u0001\u0000\u0000\u0000`a\u0001\u0000"+
		"\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u00054\u0000\u0000ce\u0005/\u0000"+
		"\u0000df\u0003\n\u0005\u0000ed\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000"+
		"\u0000fh\u0001\u0000\u0000\u0000gi\u0003\u001e\u000f\u0000hg\u0001\u0000"+
		"\u0000\u0000ij\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001"+
		"\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u00050\u0000\u0000mn\u0005"+
		"\f\u0000\u0000no\u0005,\u0000\u0000oq\u0001\u0000\u0000\u0000pG\u0001"+
		"\u0000\u0000\u0000p[\u0001\u0000\u0000\u0000q\t\u0001\u0000\u0000\u0000"+
		"rs\u0005\u0017\u0000\u0000su\u00051\u0000\u0000tv\u0003\f\u0006\u0000"+
		"ut\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000"+
		"\u0000wx\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u00052\u0000"+
		"\u0000z\u000b\u0001\u0000\u0000\u0000{|\u0005\u0002\u0000\u0000|}\u0005"+
		"6\u0000\u0000}~\u0005+\u0000\u0000~\u007f\u0003\u001a\r\u0000\u007f\u0080"+
		"\u0003(\u0014\u0000\u0080\u0081\u0005,\u0000\u0000\u0081\u00c9\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0005\u0005\u0000\u0000\u0083\u0084\u00056\u0000"+
		"\u0000\u0084\u0085\u00051\u0000\u0000\u0085\u0086\u0003(\u0014\u0000\u0086"+
		"\u0087\u00052\u0000\u0000\u0087\u0088\u0005+\u0000\u0000\u0088\u0089\u0003"+
		"\u000e\u0007\u0000\u0089\u008a\u0005/\u0000\u0000\u008a\u008f\u0003(\u0014"+
		"\u0000\u008b\u008c\u0005-\u0000\u0000\u008c\u008e\u0003(\u0014\u0000\u008d"+
		"\u008b\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f"+
		"\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090"+
		"\u0092\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u00050\u0000\u0000\u0093\u0094\u0005,\u0000\u0000\u0094\u00c9\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0005\u0005\u0000\u0000\u0096\u0097\u0005"+
		"6\u0000\u0000\u0097\u0098\u00051\u0000\u0000\u0098\u0099\u0003(\u0014"+
		"\u0000\u0099\u009a\u00052\u0000\u0000\u009a\u009b\u0005+\u0000\u0000\u009b"+
		"\u009c\u0003\u000e\u0007\u0000\u009c\u009d\u0005,\u0000\u0000\u009d\u00c9"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u000b\u0000\u0000\u009f\u00a0"+
		"\u00056\u0000\u0000\u00a0\u00a7\u0005/\u0000\u0000\u00a1\u00a8\u0003\u0010"+
		"\b\u0000\u00a2\u00a4\u0003\u0012\t\u0000\u00a3\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a1\u0001\u0000\u0000\u0000\u00a7\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa\u00050\u0000\u0000"+
		"\u00aa\u00ab\u0005\f\u0000\u0000\u00ab\u00ac\u0005,\u0000\u0000\u00ac"+
		"\u00c9\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u0002\u0000\u0000\u00ae"+
		"\u00af\u00056\u0000\u0000\u00af\u00b0\u0005+\u0000\u0000\u00b0\u00b1\u0005"+
		"6\u0000\u0000\u00b1\u00b2\u0005/\u0000\u0000\u00b2\u00b3\u0003\u0014\n"+
		"\u0000\u00b3\u00b4\u00050\u0000\u0000\u00b4\u00c9\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u00056\u0000\u0000\u00b6\u00b7\u0005.\u0000\u0000\u00b7\u00b8"+
		"\u00056\u0000\u0000\u00b8\u00b9\u00051\u0000\u0000\u00b9\u00ba\u0003("+
		"\u0014\u0000\u00ba\u00bb\u00052\u0000\u0000\u00bb\u00bc\u00055\u0000\u0000"+
		"\u00bc\u00bd\u0005/\u0000\u0000\u00bd\u00be\u0003\u0014\n\u0000\u00be"+
		"\u00bf\u00050\u0000\u0000\u00bf\u00c9\u0001\u0000\u0000\u0000\u00c0\u00c9"+
		"\u0003 \u0010\u0000\u00c1\u00c2\u0005\u0002\u0000\u0000\u00c2\u00c3\u0005"+
		"6\u0000\u0000\u00c3\u00c4\u0005+\u0000\u0000\u00c4\u00c5\u0003(\u0014"+
		"\u0000\u00c5\u00c6\u0005,\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c9\u0003\"\u0011\u0000\u00c8{\u0001\u0000\u0000\u0000\u00c8"+
		"\u0082\u0001\u0000\u0000\u0000\u00c8\u0095\u0001\u0000\u0000\u0000\u00c8"+
		"\u009e\u0001\u0000\u0000\u0000\u00c8\u00ad\u0001\u0000\u0000\u0000\u00c8"+
		"\u00b5\u0001\u0000\u0000\u0000\u00c8\u00c0\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9"+
		"\r\u0001\u0000\u0000\u0000\u00ca\u00cd\u00056\u0000\u0000\u00cb\u00cd"+
		"\u0003\u001a\r\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cd\u000f\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005"+
		"\u0002\u0000\u0000\u00cf\u00d0\u00056\u0000\u0000\u00d0\u00d1\u0005+\u0000"+
		"\u0000\u00d1\u00d9\u0003\u0018\f\u0000\u00d2\u00d3\u0005-\u0000\u0000"+
		"\u00d3\u00d4\u0005\u0002\u0000\u0000\u00d4\u00d5\u00056\u0000\u0000\u00d5"+
		"\u00d6\u0005+\u0000\u0000\u00d6\u00d8\u0003\u0018\f\u0000\u00d7\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u0011"+
		"\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0005\u0002\u0000\u0000\u00dd\u00de\u00056\u0000\u0000\u00de\u00df\u0005"+
		"+\u0000\u0000\u00df\u00e0\u0003\u0018\f\u0000\u00e0\u00e1\u0005,\u0000"+
		"\u0000\u00e1\u0013\u0001\u0000\u0000\u0000\u00e2\u00e3\u00056\u0000\u0000"+
		"\u00e3\u00e4\u0005+\u0000\u0000\u00e4\u00eb\u0003(\u0014\u0000\u00e5\u00e6"+
		"\u0005-\u0000\u0000\u00e6\u00e7\u00056\u0000\u0000\u00e7\u00e8\u0005+"+
		"\u0000\u0000\u00e8\u00ea\u0003(\u0014\u0000\u00e9\u00e5\u0001\u0000\u0000"+
		"\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u0015\u0001\u0000\u0000"+
		"\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005\u0002\u0000"+
		"\u0000\u00ef\u00f0\u00056\u0000\u0000\u00f0\u00f1\u0005+\u0000\u0000\u00f1"+
		"\u00f9\u0003\u001a\r\u0000\u00f2\u00f3\u0005-\u0000\u0000\u00f3\u00f4"+
		"\u0005\u0002\u0000\u0000\u00f4\u00f5\u00056\u0000\u0000\u00f5\u00f6\u0005"+
		"+\u0000\u0000\u00f6\u00f8\u0003\u001a\r\u0000\u00f7\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u0017\u0001\u0000"+
		"\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u0104\u0003\u001a"+
		"\r\u0000\u00fd\u00fe\u00056\u0000\u0000\u00fe\u00ff\u00051\u0000\u0000"+
		"\u00ff\u0100\u0003(\u0014\u0000\u0100\u0101\u00052\u0000\u0000\u0101\u0104"+
		"\u0001\u0000\u0000\u0000\u0102\u0104\u00056\u0000\u0000\u0103\u00fc\u0001"+
		"\u0000\u0000\u0000\u0103\u00fd\u0001\u0000\u0000\u0000\u0103\u0102\u0001"+
		"\u0000\u0000\u0000\u0104\u0019\u0001\u0000\u0000\u0000\u0105\u010b\u0005"+
		"\b\u0000\u0000\u0106\u010b\u0005\u0007\u0000\u0000\u0107\u010b\u0005\u0006"+
		"\u0000\u0000\u0108\u010b\u0005\t\u0000\u0000\u0109\u010b\u0005\n\u0000"+
		"\u0000\u010a\u0105\u0001\u0000\u0000\u0000\u010a\u0106\u0001\u0000\u0000"+
		"\u0000\u010a\u0107\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000"+
		"\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010b\u001b\u0001\u0000\u0000"+
		"\u0000\u010c\u010d\u0005\u0019\u0000\u0000\u010d\u0111\u0005(\u0000\u0000"+
		"\u010e\u0110\u0003\u001e\u000f\u0000\u010f\u010e\u0001\u0000\u0000\u0000"+
		"\u0110\u0113\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000"+
		"\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u001d\u0001\u0000\u0000\u0000"+
		"\u0113\u0111\u0001\u0000\u0000\u0000\u0114\u018a\u0003$\u0012\u0000\u0115"+
		"\u0116\u0003\"\u0011\u0000\u0116\u0117\u0005,\u0000\u0000\u0117\u018a"+
		"\u0001\u0000\u0000\u0000\u0118\u018a\u0003(\u0014\u0000\u0119\u018a\u0003"+
		"&\u0013\u0000\u011a\u011b\u00056\u0000\u0000\u011b\u0126\u00053\u0000"+
		"\u0000\u011c\u0121\u0003(\u0014\u0000\u011d\u011e\u0005-\u0000\u0000\u011e"+
		"\u0120\u0003(\u0014\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u0120\u0123"+
		"\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0122"+
		"\u0001\u0000\u0000\u0000\u0122\u0125\u0001\u0000\u0000\u0000\u0123\u0121"+
		"\u0001\u0000\u0000\u0000\u0124\u011c\u0001\u0000\u0000\u0000\u0125\u0128"+
		"\u0001\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0127"+
		"\u0001\u0000\u0000\u0000\u0127\u0129\u0001\u0000\u0000\u0000\u0128\u0126"+
		"\u0001\u0000\u0000\u0000\u0129\u012a\u00054\u0000\u0000\u012a\u018a\u0005"+
		",\u0000\u0000\u012b\u012c\u0005\r\u0000\u0000\u012c\u012d\u00053\u0000"+
		"\u0000\u012d\u012e\u0003(\u0014\u0000\u012e\u012f\u00054\u0000\u0000\u012f"+
		"\u0134\u0005/\u0000\u0000\u0130\u0133\u0003\u001e\u000f\u0000\u0131\u0133"+
		"\u0003 \u0010\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0132\u0131\u0001"+
		"\u0000\u0000\u0000\u0133\u0136\u0001\u0000\u0000\u0000\u0134\u0132\u0001"+
		"\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u0137\u0001"+
		"\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0137\u0149\u0005"+
		"0\u0000\u0000\u0138\u013d\u0005\u000e\u0000\u0000\u0139\u013a\u00053\u0000"+
		"\u0000\u013a\u013b\u0003(\u0014\u0000\u013b\u013c\u00054\u0000\u0000\u013c"+
		"\u013e\u0001\u0000\u0000\u0000\u013d\u0139\u0001\u0000\u0000\u0000\u013d"+
		"\u013e\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f"+
		"\u0143\u0005/\u0000\u0000\u0140\u0142\u0003\u001e\u000f\u0000\u0141\u0140"+
		"\u0001\u0000\u0000\u0000\u0142\u0145\u0001\u0000\u0000\u0000\u0143\u0141"+
		"\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0146"+
		"\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0146\u0148"+
		"\u00050\u0000\u0000\u0147\u0138\u0001\u0000\u0000\u0000\u0148\u014b\u0001"+
		"\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u014a\u0001"+
		"\u0000\u0000\u0000\u014a\u014c\u0001\u0000\u0000\u0000\u014b\u0149\u0001"+
		"\u0000\u0000\u0000\u014c\u014d\u0005\f\u0000\u0000\u014d\u014e\u0005,"+
		"\u0000\u0000\u014e\u018a\u0001\u0000\u0000\u0000\u014f\u0150\u0005\u000f"+
		"\u0000\u0000\u0150\u0151\u00053\u0000\u0000\u0151\u0152\u0003(\u0014\u0000"+
		"\u0152\u0153\u00054\u0000\u0000\u0153\u0155\u0005/\u0000\u0000\u0154\u0156"+
		"\u0003\u001e\u000f\u0000\u0155\u0154\u0001\u0000\u0000\u0000\u0156\u0157"+
		"\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0157\u0158"+
		"\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015a"+
		"\u00050\u0000\u0000\u015a\u015b\u0005\f\u0000\u0000\u015b\u015c\u0005"+
		",\u0000\u0000\u015c\u018a\u0001\u0000\u0000\u0000\u015d\u015e\u0005\u0010"+
		"\u0000\u0000\u015e\u0160\u0005/\u0000\u0000\u015f\u0161\u0003\u001e\u000f"+
		"\u0000\u0160\u015f\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000"+
		"\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000"+
		"\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0165\u00050\u0000\u0000"+
		"\u0165\u0166\u0005\u000f\u0000\u0000\u0166\u0167\u00053\u0000\u0000\u0167"+
		"\u0168\u0003(\u0014\u0000\u0168\u0169\u00054\u0000\u0000\u0169\u016a\u0005"+
		",\u0000\u0000\u016a\u018a\u0001\u0000\u0000\u0000\u016b\u016c\u0005\u0012"+
		"\u0000\u0000\u016c\u016d\u00053\u0000\u0000\u016d\u016e\u0005\u0002\u0000"+
		"\u0000\u016e\u016f\u00056\u0000\u0000\u016f\u0170\u0005+\u0000\u0000\u0170"+
		"\u0171\u0003\u001a\r\u0000\u0171\u0172\u0003(\u0014\u0000\u0172\u0173"+
		"\u0005,\u0000\u0000\u0173\u0174\u0003(\u0014\u0000\u0174\u0175\u0005,"+
		"\u0000\u0000\u0175\u0176\u0003\"\u0011\u0000\u0176\u0177\u00054\u0000"+
		"\u0000\u0177\u0179\u0005/\u0000\u0000\u0178\u017a\u0003\u001e\u000f\u0000"+
		"\u0179\u0178\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000"+
		"\u017b\u0179\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000"+
		"\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u017e\u00050\u0000\u0000\u017e"+
		"\u018a\u0001\u0000\u0000\u0000\u017f\u0180\u0005\u0011\u0000\u0000\u0180"+
		"\u018a\u0005,\u0000\u0000\u0181\u0182\u0005\u0013\u0000\u0000\u0182\u018a"+
		"\u0005,\u0000\u0000\u0183\u0185\u0005\u0016\u0000\u0000\u0184\u0186\u0003"+
		"(\u0014\u0000\u0185\u0184\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000"+
		"\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000\u0187\u018a\u0005,\u0000"+
		"\u0000\u0188\u018a\u0003 \u0010\u0000\u0189\u0114\u0001\u0000\u0000\u0000"+
		"\u0189\u0115\u0001\u0000\u0000\u0000\u0189\u0118\u0001\u0000\u0000\u0000"+
		"\u0189\u0119\u0001\u0000\u0000\u0000\u0189\u011a\u0001\u0000\u0000\u0000"+
		"\u0189\u012b\u0001\u0000\u0000\u0000\u0189\u014f\u0001\u0000\u0000\u0000"+
		"\u0189\u015d\u0001\u0000\u0000\u0000\u0189\u016b\u0001\u0000\u0000\u0000"+
		"\u0189\u017f\u0001\u0000\u0000\u0000\u0189\u0181\u0001\u0000\u0000\u0000"+
		"\u0189\u0183\u0001\u0000\u0000\u0000\u0189\u0188\u0001\u0000\u0000\u0000"+
		"\u018a\u001f\u0001\u0000\u0000\u0000\u018b\u018c\u00056\u0000\u0000\u018c"+
		"\u018d\u00055\u0000\u0000\u018d\u018e\u0003(\u0014\u0000\u018e\u018f\u0005"+
		",\u0000\u0000\u018f\u01aa\u0001\u0000\u0000\u0000\u0190\u0191\u00056\u0000"+
		"\u0000\u0191\u0192\u00051\u0000\u0000\u0192\u0193\u0003(\u0014\u0000\u0193"+
		"\u0194\u00052\u0000\u0000\u0194\u0195\u00055\u0000\u0000\u0195\u0196\u0003"+
		"(\u0014\u0000\u0196\u0197\u0005,\u0000\u0000\u0197\u01aa\u0001\u0000\u0000"+
		"\u0000\u0198\u0199\u00056\u0000\u0000\u0199\u019a\u0005.\u0000\u0000\u019a"+
		"\u019b\u0003(\u0014\u0000\u019b\u019c\u00055\u0000\u0000\u019c\u019d\u0003"+
		"(\u0014\u0000\u019d\u019e\u0005,\u0000\u0000\u019e\u01aa\u0001\u0000\u0000"+
		"\u0000\u019f\u01a0\u00056\u0000\u0000\u01a0\u01a1\u00051\u0000\u0000\u01a1"+
		"\u01a2\u0003(\u0014\u0000\u01a2\u01a3\u00052\u0000\u0000\u01a3\u01a4\u0005"+
		".\u0000\u0000\u01a4\u01a5\u00056\u0000\u0000\u01a5\u01a6\u00055\u0000"+
		"\u0000\u01a6\u01a7\u0003(\u0014\u0000\u01a7\u01a8\u0005,\u0000\u0000\u01a8"+
		"\u01aa\u0001\u0000\u0000\u0000\u01a9\u018b\u0001\u0000\u0000\u0000\u01a9"+
		"\u0190\u0001\u0000\u0000\u0000\u01a9\u0198\u0001\u0000\u0000\u0000\u01a9"+
		"\u019f\u0001\u0000\u0000\u0000\u01aa!\u0001\u0000\u0000\u0000\u01ab\u01ac"+
		"\u00056\u0000\u0000\u01ac\u01b0\u0005\u001d\u0000\u0000\u01ad\u01ae\u0005"+
		"6\u0000\u0000\u01ae\u01b0\u0005\u001e\u0000\u0000\u01af\u01ab\u0001\u0000"+
		"\u0000\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01b0#\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b2\u0005\u001b\u0000\u0000\u01b2\u01b7\u0003(\u0014\u0000"+
		"\u01b3\u01b4\u0005\u001b\u0000\u0000\u01b4\u01b6\u0003(\u0014\u0000\u01b5"+
		"\u01b3\u0001\u0000\u0000\u0000\u01b6\u01b9\u0001\u0000\u0000\u0000\u01b7"+
		"\u01b5\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8"+
		"\u01ba\u0001\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01ba"+
		"\u01bb\u0005,\u0000\u0000\u01bb%\u0001\u0000\u0000\u0000\u01bc\u01be\u0005"+
		"6\u0000\u0000\u01bd\u01bc\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000"+
		"\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c0\u0005\u001c"+
		"\u0000\u0000\u01c0\'\u0001\u0000\u0000\u0000\u01c1\u01c2\u0006\u0014\uffff"+
		"\uffff\u0000\u01c2\u01c3\u0005 \u0000\u0000\u01c3\u0203\u0003(\u0014\u0015"+
		"\u01c4\u01c5\u0005\u0001\u0000\u0000\u01c5\u0203\u0003(\u0014\u0014\u01c6"+
		"\u01c7\u00053\u0000\u0000\u01c7\u01c8\u0003(\u0014\u0000\u01c8\u01c9\u0005"+
		"4\u0000\u0000\u01c9\u0203\u0001\u0000\u0000\u0000\u01ca\u01cb\u00056\u0000"+
		"\u0000\u01cb\u01cc\u00051\u0000\u0000\u01cc\u01cd\u0003(\u0014\u0000\u01cd"+
		"\u01ce\u00052\u0000\u0000\u01ce\u0203\u0001\u0000\u0000\u0000\u01cf\u01d0"+
		"\u00056\u0000\u0000\u01d0\u01d1\u0005.\u0000\u0000\u01d1\u0203\u00056"+
		"\u0000\u0000\u01d2\u01d3\u00056\u0000\u0000\u01d3\u01de\u00053\u0000\u0000"+
		"\u01d4\u01d9\u0003(\u0014\u0000\u01d5\u01d6\u0005-\u0000\u0000\u01d6\u01d8"+
		"\u0003(\u0014\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d8\u01db\u0001"+
		"\u0000\u0000\u0000\u01d9\u01d7\u0001\u0000\u0000\u0000\u01d9\u01da\u0001"+
		"\u0000\u0000\u0000\u01da\u01dd\u0001\u0000\u0000\u0000\u01db\u01d9\u0001"+
		"\u0000\u0000\u0000\u01dc\u01d4\u0001\u0000\u0000\u0000\u01dd\u01e0\u0001"+
		"\u0000\u0000\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01de\u01df\u0001"+
		"\u0000\u0000\u0000\u01df\u01e1\u0001\u0000\u0000\u0000\u01e0\u01de\u0001"+
		"\u0000\u0000\u0000\u01e1\u0203\u00054\u0000\u0000\u01e2\u01e3\u0003\u001a"+
		"\r\u0000\u01e3\u01e4\u00056\u0000\u0000\u01e4\u01ef\u00053\u0000\u0000"+
		"\u01e5\u01ea\u0003(\u0014\u0000\u01e6\u01e7\u0005-\u0000\u0000\u01e7\u01e9"+
		"\u0003(\u0014\u0000\u01e8\u01e6\u0001\u0000\u0000\u0000\u01e9\u01ec\u0001"+
		"\u0000\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001"+
		"\u0000\u0000\u0000\u01eb\u01ee\u0001\u0000\u0000\u0000\u01ec\u01ea\u0001"+
		"\u0000\u0000\u0000\u01ed\u01e5\u0001\u0000\u0000\u0000\u01ee\u01f1\u0001"+
		"\u0000\u0000\u0000\u01ef\u01ed\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001"+
		"\u0000\u0000\u0000\u01f0\u01f2\u0001\u0000\u0000\u0000\u01f1\u01ef\u0001"+
		"\u0000\u0000\u0000\u01f2\u01f3\u00054\u0000\u0000\u01f3\u0203\u0001\u0000"+
		"\u0000\u0000\u01f4\u01f5\u00056\u0000\u0000\u01f5\u01f6\u00051\u0000\u0000"+
		"\u01f6\u01f7\u0003(\u0014\u0000\u01f7\u01f8\u00052\u0000\u0000\u01f8\u01f9"+
		"\u0005.\u0000\u0000\u01f9\u01fa\u00056\u0000\u0000\u01fa\u0203\u0001\u0000"+
		"\u0000\u0000\u01fb\u0203\u0005\u0003\u0000\u0000\u01fc\u0203\u0005\u0004"+
		"\u0000\u0000\u01fd\u0203\u00056\u0000\u0000\u01fe\u0203\u00058\u0000\u0000"+
		"\u01ff\u0203\u00057\u0000\u0000\u0200\u0203\u0005:\u0000\u0000\u0201\u0203"+
		"\u00059\u0000\u0000\u0202\u01c1\u0001\u0000\u0000\u0000\u0202\u01c4\u0001"+
		"\u0000\u0000\u0000\u0202\u01c6\u0001\u0000\u0000\u0000\u0202\u01ca\u0001"+
		"\u0000\u0000\u0000\u0202\u01cf\u0001\u0000\u0000\u0000\u0202\u01d2\u0001"+
		"\u0000\u0000\u0000\u0202\u01e2\u0001\u0000\u0000\u0000\u0202\u01f4\u0001"+
		"\u0000\u0000\u0000\u0202\u01fb\u0001\u0000\u0000\u0000\u0202\u01fc\u0001"+
		"\u0000\u0000\u0000\u0202\u01fd\u0001\u0000\u0000\u0000\u0202\u01fe\u0001"+
		"\u0000\u0000\u0000\u0202\u01ff\u0001\u0000\u0000\u0000\u0202\u0200\u0001"+
		"\u0000\u0000\u0000\u0202\u0201\u0001\u0000\u0000\u0000\u0203\u0218\u0001"+
		"\u0000\u0000\u0000\u0204\u0205\n\u0012\u0000\u0000\u0205\u0206\u0007\u0000"+
		"\u0000\u0000\u0206\u0217\u0003(\u0014\u0013\u0207\u0208\n\u0011\u0000"+
		"\u0000\u0208\u0209\u0007\u0001\u0000\u0000\u0209\u0217\u0003(\u0014\u0012"+
		"\u020a\u020b\n\u0010\u0000\u0000\u020b\u020c\u0007\u0002\u0000\u0000\u020c"+
		"\u0217\u0003(\u0014\u0011\u020d\u020e\n\u000f\u0000\u0000\u020e\u020f"+
		"\u0007\u0003\u0000\u0000\u020f\u0217\u0003(\u0014\u0010\u0210\u0211\n"+
		"\u000e\u0000\u0000\u0211\u0212\u0007\u0004\u0000\u0000\u0212\u0217\u0003"+
		"(\u0014\u000f\u0213\u0214\n\r\u0000\u0000\u0214\u0215\u0007\u0005\u0000"+
		"\u0000\u0215\u0217\u0003(\u0014\u000e\u0216\u0204\u0001\u0000\u0000\u0000"+
		"\u0216\u0207\u0001\u0000\u0000\u0000\u0216\u020a\u0001\u0000\u0000\u0000"+
		"\u0216\u020d\u0001\u0000\u0000\u0000\u0216\u0210\u0001\u0000\u0000\u0000"+
		"\u0216\u0213\u0001\u0000\u0000\u0000\u0217\u021a\u0001\u0000\u0000\u0000"+
		"\u0218\u0216\u0001\u0000\u0000\u0000\u0218\u0219\u0001\u0000\u0000\u0000"+
		"\u0219)\u0001\u0000\u0000\u0000\u021a\u0218\u0001\u0000\u0000\u0000/+"+
		"03>EKPU`ejpw\u008f\u00a5\u00a7\u00c8\u00cc\u00d9\u00eb\u00f9\u0103\u010a"+
		"\u0111\u0121\u0126\u0132\u0134\u013d\u0143\u0149\u0157\u0162\u017b\u0185"+
		"\u0189\u01a9\u01af\u01b7\u01bd\u01d9\u01de\u01ea\u01ef\u0202\u0216\u0218";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}