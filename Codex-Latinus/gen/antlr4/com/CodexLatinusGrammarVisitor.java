// Generated from /home/juanpa/Documentos/Codex-Latinus/Codex-Latinus/src/main/java/antlr4/com/CodexLatinusGrammar.g4 by ANTLR 4.13.2
package antlr4.com;

    package antlr4;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CodexLatinusGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CodexLatinusGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CodexLatinusGrammarParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(CodexLatinusGrammarParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusGrammarParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(CodexLatinusGrammarParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusGrammarParser#opcion_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcion_val(CodexLatinusGrammarParser.Opcion_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusGrammarParser#bloque_vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_vars(CodexLatinusGrammarParser.Bloque_varsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusGrammarParser#valores_structura_coma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValores_structura_coma(CodexLatinusGrammarParser.Valores_structura_comaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusGrammarParser#valores_structura_punto_coma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValores_structura_punto_coma(CodexLatinusGrammarParser.Valores_structura_punto_comaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusGrammarParser#asignacion_structura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion_structura(CodexLatinusGrammarParser.Asignacion_structuraContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusGrammarParser#asignaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignaciones(CodexLatinusGrammarParser.AsignacionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusGrammarParser#opcion_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcion_func(CodexLatinusGrammarParser.Opcion_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusGrammarParser#bloque_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_func(CodexLatinusGrammarParser.Bloque_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusGrammarParser#ratio_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRatio_val(CodexLatinusGrammarParser.Ratio_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusGrammarParser#tipos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipos(CodexLatinusGrammarParser.TiposContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusGrammarParser#tipos_structura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipos_structura(CodexLatinusGrammarParser.Tipos_structuraContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusGrammarParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(CodexLatinusGrammarParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(CodexLatinusGrammarParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusGrammarParser#imprimir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimir(CodexLatinusGrammarParser.ImprimirContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusGrammarParser#leer_txt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeer_txt(CodexLatinusGrammarParser.Leer_txtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(CodexLatinusGrammarParser.ExpresionContext ctx);
}