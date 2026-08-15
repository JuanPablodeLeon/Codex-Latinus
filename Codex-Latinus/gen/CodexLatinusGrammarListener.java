// Generated from /home/juanpa/Documentos/Codex-Latinus/Codex-Latinus/src/main/java/antlr4/com/CodexLatinusGrammar.g4 by ANTLR 4.13.2

    package antlr4.com;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CodexLatinusGrammarParser}.
 */
public interface CodexLatinusGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CodexLatinusGrammarParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(CodexLatinusGrammarParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusGrammarParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(CodexLatinusGrammarParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusGrammarParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(CodexLatinusGrammarParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusGrammarParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(CodexLatinusGrammarParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusGrammarParser#opcion_val}.
	 * @param ctx the parse tree
	 */
	void enterOpcion_val(CodexLatinusGrammarParser.Opcion_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusGrammarParser#opcion_val}.
	 * @param ctx the parse tree
	 */
	void exitOpcion_val(CodexLatinusGrammarParser.Opcion_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusGrammarParser#bloque_vars}.
	 * @param ctx the parse tree
	 */
	void enterBloque_vars(CodexLatinusGrammarParser.Bloque_varsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusGrammarParser#bloque_vars}.
	 * @param ctx the parse tree
	 */
	void exitBloque_vars(CodexLatinusGrammarParser.Bloque_varsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusGrammarParser#asignaciones}.
	 * @param ctx the parse tree
	 */
	void enterAsignaciones(CodexLatinusGrammarParser.AsignacionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusGrammarParser#asignaciones}.
	 * @param ctx the parse tree
	 */
	void exitAsignaciones(CodexLatinusGrammarParser.AsignacionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusGrammarParser#opcion_func}.
	 * @param ctx the parse tree
	 */
	void enterOpcion_func(CodexLatinusGrammarParser.Opcion_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusGrammarParser#opcion_func}.
	 * @param ctx the parse tree
	 */
	void exitOpcion_func(CodexLatinusGrammarParser.Opcion_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusGrammarParser#bloque_func}.
	 * @param ctx the parse tree
	 */
	void enterBloque_func(CodexLatinusGrammarParser.Bloque_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusGrammarParser#bloque_func}.
	 * @param ctx the parse tree
	 */
	void exitBloque_func(CodexLatinusGrammarParser.Bloque_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusGrammarParser#tipos}.
	 * @param ctx the parse tree
	 */
	void enterTipos(CodexLatinusGrammarParser.TiposContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusGrammarParser#tipos}.
	 * @param ctx the parse tree
	 */
	void exitTipos(CodexLatinusGrammarParser.TiposContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusGrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(CodexLatinusGrammarParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusGrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(CodexLatinusGrammarParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(CodexLatinusGrammarParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(CodexLatinusGrammarParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusGrammarParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void enterImprimir(CodexLatinusGrammarParser.ImprimirContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusGrammarParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void exitImprimir(CodexLatinusGrammarParser.ImprimirContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(CodexLatinusGrammarParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(CodexLatinusGrammarParser.ExpresionContext ctx);
}