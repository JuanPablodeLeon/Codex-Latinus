package org.example.visitor;

import antlr4.com.CodexLatinusGrammarBaseVisitor;
import antlr4.com.CodexLatinusGrammarParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.example.Ast.ASTNode;
import org.example.Ast.exp.*;
import org.example.Ast.stm.*;
import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.List;

public class BuilderVisitor extends CodexLatinusGrammarBaseVisitor<ASTNode> {

    //INicializa el programa
    @Override public ASTNode visitPrograma(CodexLatinusGrammarParser.ProgramaContext ctx) {
        if (ctx.instrucciones() == null) return new Flujo(new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), line(ctx));

        return visit(ctx.instrucciones());
    }

    //Visita los bloques en caso de tener contenido
    @Override public ASTNode visitPrograma_Completo(CodexLatinusGrammarParser.Programa_CompletoContext ctx) {
        List<ASTNode> varsGlb = new ArrayList<>();
        if (ctx.opcion_val() != null){
            CodexLatinusGrammarParser.Bloque_VariablesContext bv = (CodexLatinusGrammarParser.Bloque_VariablesContext) ctx.opcion_val();
            for (CodexLatinusGrammarParser.Bloque_varsContext b : bv.bloque_vars()){
                varsGlb.add(visit(b));
            }
        }

        List<ASTNode> funcs = new ArrayList<>();
        if (ctx.opcion_func() != null){
            CodexLatinusGrammarParser.Bloque_FuncionesContext bf = (CodexLatinusGrammarParser.Bloque_FuncionesContext) ctx.opcion_func();
            for (CodexLatinusGrammarParser.Bloque_funcContext f : bf.bloque_func()){
                funcs.add(visit(f));
            }
        }

        List<ASTNode> main = new ArrayList<>();
        CodexLatinusGrammarParser.Bloque_MaiorContext bm = (CodexLatinusGrammarParser.Bloque_MaiorContext) ctx.main();
        for (CodexLatinusGrammarParser.InstruccionContext i : bm.instruccion()){
            main.add(visit(i));
        }

        return new Flujo(varsGlb, funcs, main, line(ctx));
    }

    // Actio y Ratio misma estructura, diferencia uno devuelve un valor y el otro no

    @Override public ASTNode visitFuncion_Actio(CodexLatinusGrammarParser.Funcion_ActioContext ctx) {
        String name = ctx.ID().getText(); // id de la funcion

        List<Params> params = getParams(ctx.func_param());
        List<ASTNode> localVars = getLocalVars(ctx.funcs_val());
        List<ASTNode> body = new ArrayList<>();

        for (CodexLatinusGrammarParser.InstruccionContext i : ctx.instruccion()){
            body.add(visit(i));
        }
        //Se agrega null ya que no devuelve ninguna valor
        return new FuncsStm(name, null, params, localVars, body, line(ctx));
    }


    @Override public ASTNode visitFuncion_Ratio(CodexLatinusGrammarParser.Funcion_RatioContext ctx) {
        String name = ctx.ID().getText();
        String type = ctx.tipos().getText(); //tipo de retorno de la funcion

        List<Params> params = getParams(ctx.func_param());
        List<ASTNode> localVars = getLocalVars(ctx.funcs_val());
        List<ASTNode> body = new ArrayList<>();

        for (CodexLatinusGrammarParser.InstruccionContext i : ctx.instruccion()){
            body.add(visit(i));
        }

        return new FuncsStm(name, type, params, localVars, body, line(ctx));
    }

    // Crear una variable con valor definido
    @Override public ASTNode visitAsignacion(CodexLatinusGrammarParser.AsignacionContext ctx) {
        String name = ctx.ID().getText();
        String type = ctx.tipos().getText();
        ASTNode value = visit(ctx.expresion());
        return new ValDeclEsto(name,type,value, false, line(ctx));
    }

    //Crea una variable de tipos Series con elementos
    @Override public ASTNode visitAsignacion_Series(CodexLatinusGrammarParser.Asignacion_SeriesContext ctx) {
        String name = ctx.ID().getText();
        List<CodexLatinusGrammarParser.ExpresionContext> exprs = ctx.expresion();
        ASTNode size = visit(exprs.get(0));
        String type = ctx.tipos_series().getText();
        List<ASTNode> values = new ArrayList<>();
        for (int i = 0; i < exprs.size(); i++) {
            values.add(visit(exprs.get(i)));
        }

        return new SeriesDecl(name,size, type,values, line(ctx));
    }

    //Crear una variable de tipos series sin elementos
    @Override public ASTNode visitAsignacion_Series_Vacia(CodexLatinusGrammarParser.Asignacion_Series_VaciaContext ctx) {
        String name = ctx.ID().getText();
        ASTNode size = visit(ctx.expresion());
        String type = ctx.tipos_series().getText();

        return new SeriesDecl(name, size, type, null, line(ctx));
    }

    // Crear variable de tipo Structura
    @Override public ASTNode visitAsignacion_Structura(CodexLatinusGrammarParser.Asignacion_StructuraContext ctx) {
        String name = ctx.ID().getText();
        List<StrucFieldParams> fields = new ArrayList<>();
        if (ctx.valores_structura_coma() != null){
            CodexLatinusGrammarParser.Valores_Structura_ComaContext vc = (CodexLatinusGrammarParser.Valores_Structura_ComaContext) ctx.valores_structura_coma();
            List<TerminalNode> ids = vc.ID();
            List<CodexLatinusGrammarParser.Tipos_structuraContext> types = vc.tipos_structura();
            for (int i = 0; i < ids.size(); i++) {
                fields.add(fieldValues(ids.get(i).getText(), types.get(i)));
            }
        }else{
            for (CodexLatinusGrammarParser.Valores_structura_punto_comaContext pc : ctx.valores_structura_punto_coma()) {
                CodexLatinusGrammarParser.Valores_Structura_Punto_ComaContext pcc = (CodexLatinusGrammarParser.Valores_Structura_Punto_ComaContext) pc;
                fields.add(fieldValues(pcc.ID().getText(), pcc.tipos_structura()));
            }
        }
        return new StrucTypeDecl(name, fields, line(ctx));
    }

    // Crear variable de una Structura existente
    @Override public ASTNode visitAsignacion_Strucutura_Variable(CodexLatinusGrammarParser.Asignacion_Strucutura_VariableContext ctx) {
        List<TerminalNode> ids = ctx.ID();
        String name = ids.get(0).getText();
        String typeStruc = ids.get(1).getText();
        List<StrucFieldInit> values = getAssigStruc(ctx.asignacion_structura());

        return new StrucVarDecl(name, typeStruc, values, line(ctx));
    }

    // Crear variable de tipo series de una Structura existente
    @Override public ASTNode visitAsignacion_Valores_Struc_Serie(CodexLatinusGrammarParser.Asignacion_Valores_Struc_SerieContext ctx) {
        List<TerminalNode> ids = ctx.ID();
        ASTNode index = visit(ctx.expresion());
        List<StrucFieldInit> values = getAssigStruc(ctx.asignacion_structura());

        return new StructuraAsigSeriesVal(ids.get(0).getText(), ids.get(1).getText(), index, values, line(ctx)); }


    @Override public ASTNode visitBloque_Asignaciones_Vars(CodexLatinusGrammarParser.Bloque_Asignaciones_VarsContext ctx) {
        return visit(ctx.asignaciones()); }

    // Unicamente valido para bools
    @Override public ASTNode visitAsignacion_Bool_Inferida(CodexLatinusGrammarParser.Asignacion_Bool_InferidaContext ctx) {
        String name = ctx.ID().getText();
        ASTNode value = visit(ctx.expresion());
        return new ValDeclEsto(name, null, value, true, line(ctx)); }

    //Incrementa/Decrementa un valor a la variable
    @Override public ASTNode visitSuma_Resta_Auto(CodexLatinusGrammarParser.Suma_Resta_AutoContext ctx) {
        return visit(ctx.ops_automaticas());
    }

    @Override public ASTNode visitBloque_Imprimir(CodexLatinusGrammarParser.Bloque_ImprimirContext ctx) {
        return visit(ctx.imprimir()); }

    @Override public ASTNode visitAuto_Instruccion(CodexLatinusGrammarParser.Auto_InstruccionContext ctx) {
        return visit(ctx.ops_automaticas()); }

    @Override public ASTNode visitBloque_Expresiones(CodexLatinusGrammarParser.Bloque_ExpresionesContext ctx) {
        return visit(ctx.expresion()); }

    @Override public ASTNode visitBloque_Leer(CodexLatinusGrammarParser.Bloque_LeerContext ctx) { return visit(ctx.leer_txt()); }

    @Override public ASTNode visitLlamada_Actio(CodexLatinusGrammarParser.Llamada_ActioContext ctx) {
        String name = ctx.ID().getText();
        List<ASTNode> args = new ArrayList<>();
        for (CodexLatinusGrammarParser.ExpresionContext e : ctx.expresion()){
            args.add(visit(e));
        }
        return new CallActioStm(name, args, line(ctx)); }


    //Aumenta la posicion del hijo a tomar para poder hacer uso de los cuerpos y condiciones
    @Override public ASTNode visitSi_Condicional(CodexLatinusGrammarParser.Si_CondicionalContext ctx) {
        int i = 0;
        int n = ctx.getChildCount();

        //Omite Si y (
        i++;
        i++;
        ASTNode conditionSi = visit(ctx.getChild(i));//pos de la expresion
        //Omite hasta llegar al cuerpo
        i++;
        i++;
        i++;
        List<ASTNode> bodySi = new ArrayList<>();
        while (i < n && !isToken(ctx.getChild(i), CodexLatinusGrammarParser.RLLAVE)){
            bodySi.add(visit(ctx.getChild(i)));
            i++;
        }
        i++;
        List<AliterStm> aliters = new ArrayList<>();
        while (i < n && isToken(ctx.getChild(i), CodexLatinusGrammarParser.LPAREN)){
            i++;
            ASTNode condAliter = null;
            if (i < n && isToken(ctx.getChild(i), CodexLatinusGrammarParser.LPAREN)){
                i++;
                condAliter = visit(ctx.getChild(i));
                i++;
                i++;
            }
            i++;
            List<ASTNode> aliterbody = new ArrayList<>();
            while (i < n && isToken(ctx.getChild(i), CodexLatinusGrammarParser.RLLAVE)){
                aliterbody.add(visit(ctx.getChild(i)));
                i++;
            }
            i++;
            aliters.add(new AliterStm(condAliter, bodySi));
        }

        return new SiStm(conditionSi, bodySi, aliters, line(ctx)); }

    @Override public ASTNode visitDum_Ciclo(CodexLatinusGrammarParser.Dum_CicloContext ctx) {
        ASTNode cond = visit(ctx.expresion());
        List<ASTNode> body = new ArrayList<>();
        for (CodexLatinusGrammarParser.InstruccionContext i : ctx.instruccion()){
            body.add(visit(i));
        }
        return new DumStm(cond, body, line(ctx)); }

    @Override public ASTNode visitFacere_Ciclo(CodexLatinusGrammarParser.Facere_CicloContext ctx) {
        List<ASTNode> body = new ArrayList<>();
        for (CodexLatinusGrammarParser.InstruccionContext i : ctx.instruccion()){
            body.add(visit(i));
        }
        ASTNode cond = visit(ctx.expresion());
        return new FacereStm(body, cond, line(ctx)); };

    @Override public ASTNode visitPer_Ciclo(CodexLatinusGrammarParser.Per_CicloContext ctx) {
        String nameIter = ctx.ID().getText();
        String typeIter = ctx.tipos().getText();
        List<CodexLatinusGrammarParser.ExpresionContext> exprs = ctx.expresion();
        ASTNode initVal = visit(exprs.get(0));
        ASTNode cond = visit(exprs.get(1));
        AutoOpStm incr = (AutoOpStm) visit(ctx.ops_automaticas());
        List<ASTNode> body = new ArrayList<>();
        for (CodexLatinusGrammarParser.InstruccionContext i : ctx.instruccion()){
            body.add(visit(i));
        }
        return new PerStm(nameIter, typeIter, initVal, cond, incr, body, line(ctx)); }

    @Override public ASTNode visitPerge_Action(CodexLatinusGrammarParser.Perge_ActionContext ctx) {
        return new PergeStm(line(ctx)); }

    @Override public ASTNode visitInterrumpe_Action(CodexLatinusGrammarParser.Interrumpe_ActionContext ctx) {
        return new InterrumpeStm(line(ctx)); }

    @Override public ASTNode visitReddere_Value(CodexLatinusGrammarParser.Reddere_ValueContext ctx) {
        ASTNode valiue = ctx.expresion() != null ? visit(ctx.expresion()) : null;
        return new ReddereStm(valiue, line(ctx)); }

    @Override public ASTNode visitBloque_Asignaciones(CodexLatinusGrammarParser.Bloque_AsignacionesContext ctx) {
        return visit(ctx.asignaciones());}

    @Override public ASTNode visitMod_Valor(CodexLatinusGrammarParser.Mod_ValorContext ctx) {
        return new Asigancion(ctx.ID().getText(), visit(ctx.expresion()), line(ctx)); }

    @Override public ASTNode visitMod_Valor_Series(CodexLatinusGrammarParser.Mod_Valor_SeriesContext ctx) {
        List<CodexLatinusGrammarParser.ExpresionContext> expr = ctx.expresion();
        return new SeriesAssigVal(ctx.ID().getText(), visit(expr.get(0)), visit(expr.get(1)), line(ctx));}

    @Override public ASTNode visitMod_Valor_Structura(CodexLatinusGrammarParser.Mod_Valor_StructuraContext ctx) {
        List<CodexLatinusGrammarParser.ExpresionContext> expr = ctx.expresion();
        return new StructuraAsigField(ctx.ID().getText(), visit(expr.get(0)), visit(expr.get(1)), line(ctx)); }

    @Override public ASTNode visitAsignacion_Structura_Series(CodexLatinusGrammarParser.Asignacion_Structura_SeriesContext ctx) {
        List<TerminalNode> ids = ctx.ID();
        List<CodexLatinusGrammarParser.ExpresionContext> exprs = ctx.expresion();

        return new SeriesStrucAssigVal(ids.get(0).getText(), visit(exprs.get(0)), ids.get(1).getText(), visit(exprs.get(1)), line(ctx));}

    @Override public ASTNode visitSuma_Auto(CodexLatinusGrammarParser.Suma_AutoContext ctx) {
        return new AutoOpStm(ctx.ID().getText(), "++", line(ctx)); }

    @Override public ASTNode visitResta_Auto(CodexLatinusGrammarParser.Resta_AutoContext ctx) {
        return new AutoOpStm(ctx.ID().getText(), "--", line(ctx));  }

    @Override public ASTNode visitImpresion_Consola(CodexLatinusGrammarParser.Impresion_ConsolaContext ctx) {
        List<ASTNode> exprs = new ArrayList<>();
        for (CodexLatinusGrammarParser.ExpresionContext e : ctx.expresion()){
            exprs.add(visit(e));
        }
        return new ImprStm(exprs, line(ctx)); }

    @Override public ASTNode visitLectura_Texto(CodexLatinusGrammarParser.Lectura_TextoContext ctx) {
        String name = ctx.ID() != null ? ctx.ID().getText() : null;
        return new LeerStm(name, line(ctx)); }


    @Override public ASTNode visitParentesis(CodexLatinusGrammarParser.ParentesisContext ctx) {
        return new Parentesis(visit(ctx.expresion()), line(ctx)); }

    @Override public ASTNode visitFalsusValor(CodexLatinusGrammarParser.FalsusValorContext ctx) {
        return new BoolLiteral(false,line(ctx)); }

    @Override public ASTNode visitIntVal(CodexLatinusGrammarParser.IntValContext ctx) {
        return new IntLiteral(Integer.parseInt(ctx.INT().getText()), line(ctx)); }

    @Override public ASTNode visitLlamada_Series_Structura(CodexLatinusGrammarParser.Llamada_Series_StructuraContext ctx) {
        List<TerminalNode> ids = ctx.ID();
        return new SeriesFieldAccess(ids.get(0).getText(), visit(ctx.expresion()), ids.get(1).getText(), line(ctx)); }

    @Override public ASTNode visitCharVal(CodexLatinusGrammarParser.CharValContext ctx) {
        String text = ctx.CHARS().getText();
        return new CharLiteral(text.charAt(1), line(ctx)); }

    @Override public ASTNode visitSumaResta(CodexLatinusGrammarParser.SumaRestaContext ctx) {
        List<CodexLatinusGrammarParser.ExpresionContext> exprs = ctx.expresion();
        return new AllExpr(visit(exprs.get(0)), ctx.ops1.getText(), visit(exprs.get(1)), line(ctx)); }

    // Negacion por medio de non a un bool
    @Override public ASTNode visitNegacion(CodexLatinusGrammarParser.NegacionContext ctx) {
        return new NonExp(visit(ctx.expresion()), line(ctx));
    }

    @Override public ASTNode visitLlamada_Elemento_Series(CodexLatinusGrammarParser.Llamada_Elemento_SeriesContext ctx) {
        return new SeriesAccess(ctx.ID().getText(), visit(ctx.expresion()), line(ctx)); }

    @Override public ASTNode visitMultDiv(CodexLatinusGrammarParser.MultDivContext ctx) {
        List<CodexLatinusGrammarParser.ExpresionContext> exprs = ctx.expresion();
        return new AllExpr(visit(exprs.get(0)), ctx.ops1.getText(), visit(exprs.get(1)), line(ctx));
    }

    @Override public ASTNode visitLlamada_Actio_Exp(CodexLatinusGrammarParser.Llamada_Actio_ExpContext ctx) {
        String name = ctx.ID().getText();
        List<ASTNode> args = new ArrayList<>();
        for (CodexLatinusGrammarParser.ExpresionContext e : ctx.expresion()){
                args.add(visit(e));
        }
        return new FuncArgsCall(name, args, line(ctx)); }

    @Override public ASTNode visitIgualNoIgual(CodexLatinusGrammarParser.IgualNoIgualContext ctx) {
        List<CodexLatinusGrammarParser.ExpresionContext> exprs = ctx.expresion();
        return new AllExpr(visit(exprs.get(0)), ctx.ops1.getText(), visit(exprs.get(1)), line(ctx)); }

    @Override public ASTNode visitMenorMayor(CodexLatinusGrammarParser.MenorMayorContext ctx) {
        List<CodexLatinusGrammarParser.ExpresionContext> exprs = ctx.expresion();
        return new AllExpr(visit(exprs.get(0)), ctx.ops1.getText(), visit(exprs.get(1)), line(ctx)); }

    @Override public ASTNode visitLlamada_Ratio_Tipo(CodexLatinusGrammarParser.Llamada_Ratio_TipoContext ctx) {
        String typeDelcr = ctx.tipos().getText();
        String name = ctx.ID().getText();
        List<ASTNode> args = new ArrayList<>();
        for (CodexLatinusGrammarParser.ExpresionContext e : ctx.expresion()){
            args.add(visit(e));
        }
        return new RatioFuncArgsCall(typeDelcr,name, args, line(ctx)); }

    @Override public ASTNode visitDoubleVal(CodexLatinusGrammarParser.DoubleValContext ctx) {
        return new DoubleLiteral(Double.parseDouble(ctx.DOUBLE().getText()), line(ctx)); }

    @Override public ASTNode visitLlamada_Propiedad_Structura(CodexLatinusGrammarParser.Llamada_Propiedad_StructuraContext ctx) {
        List<TerminalNode> ids = ctx.ID();
        return new StructuraAccess(ids.get(0).getText(), ids.get(1).getText(), line(ctx)); }

    @Override public ASTNode visitStringVal(CodexLatinusGrammarParser.StringValContext ctx) {
        return new StringLiteral(procesarStr(ctx.STRING().getText()), line(ctx)); }

    @Override public ASTNode visitIdentificador(CodexLatinusGrammarParser.IdentificadorContext ctx) {
        return new Identificador(ctx.ID().getText(), line(ctx)); }

    @Override public ASTNode visitMenorMayorIgual(CodexLatinusGrammarParser.MenorMayorIgualContext ctx) {
        List<CodexLatinusGrammarParser.ExpresionContext> exprs = ctx.expresion();
        return new AllExpr(visit(exprs.get(0)), ctx.ops1.getText(), visit(exprs.get(1)), line(ctx)); }

    @Override public ASTNode visitVerumValor(CodexLatinusGrammarParser.VerumValorContext ctx) {
        return new BoolLiteral(true, line(ctx)); }

    @Override public ASTNode visitAndOr(CodexLatinusGrammarParser.AndOrContext ctx) {
        List<CodexLatinusGrammarParser.ExpresionContext> exprs = ctx.expresion();
        return new AllExpr(visit(exprs.get(0)), ctx.ops1.getText(), visit(exprs.get(1)), line(ctx)); }

    //Negacion valor
    @Override public ASTNode visitUmenos(CodexLatinusGrammarParser.UmenosContext ctx) {
        return new UMenos(visit(ctx.expresion()), line(ctx));
    }



    //Metodo para obtener la linea por medio del parser
    private int line(ParserRuleContext context){
        return context.getStart().getLine();
    }

    private List<Params> getParams(CodexLatinusGrammarParser.Func_paramContext fp){
        List<Params> resultado = new ArrayList<>();

        if (fp == null) return resultado;

        CodexLatinusGrammarParser.Parametros_FuncionesContext pc = (CodexLatinusGrammarParser.Parametros_FuncionesContext) fp;
        List<TerminalNode> ids = pc.ID();
        List<CodexLatinusGrammarParser.TiposContext> types = pc.tipos();
        for (int i = 0; i < ids.size(); i++) {
            resultado.add(new Params(ids.get(i).getText(), types.get(i).getText()));
        }
        return resultado;
    }

    //Ver y obtener todas las variables
    private List<ASTNode> getLocalVars(CodexLatinusGrammarParser.Funcs_valContext fv){
        List<ASTNode> reultado = new ArrayList<>();
        if (fv == null) return reultado;

        CodexLatinusGrammarParser.Bloque_Variables_FuncionesContext bc = (CodexLatinusGrammarParser.Bloque_Variables_FuncionesContext) fv;
        for (CodexLatinusGrammarParser.Bloque_varsContext b : bc.bloque_vars()){
            reultado.add(visit(b));
        }
        return reultado;
    }

    private String procesarStr(String texto){
        String mod = texto.substring(1, texto.length()-1);
        return mod.replace("\\\"", "\"").replace("\\\\", "\\");
    }

    private StrucFieldParams fieldValues(String name, CodexLatinusGrammarParser.Tipos_structuraContext value){
        if (value instanceof CodexLatinusGrammarParser.TIpo_SeriesContext){
            CodexLatinusGrammarParser.TIpo_SeriesContext tsc = (CodexLatinusGrammarParser.TIpo_SeriesContext) value;
            return new StrucFieldParams(name, tsc.getText(), true);
        }
        return new StrucFieldParams(name, value.getText(), false);
    }

    private List<StrucFieldInit> getAssigStruc(CodexLatinusGrammarParser.Asignacion_structuraContext asc){
        CodexLatinusGrammarParser.Asignacion_Variable_StructuraContext avc = (CodexLatinusGrammarParser.Asignacion_Variable_StructuraContext) asc;
        List<TerminalNode> ids = avc.ID();
        List<CodexLatinusGrammarParser.ExpresionContext> values = avc.expresion();
        List<StrucFieldInit> result = new ArrayList<>();
        for (int i = 0; i < ids.size(); i++) {
            result.add(new StrucFieldInit(ids.get(i).getText(), visit(values.get(i))));
        }
        return result;
    }

    private boolean isToken(ParseTree node, int tokenType){
        return node instanceof TerminalNode && ((TerminalNode) node).getSymbol().getType() == tokenType;
    }
}
