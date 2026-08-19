package org.example.Interpreter;

import antlr4.com.CodexLatinusGrammarBaseVisitor;
import antlr4.com.CodexLatinusGrammarParser;

import javax.management.ObjectName;
import java.util.List;

public class InterpreterVisitor extends CodexLatinusGrammarBaseVisitor<Object> {

    private Enviroment enviroment = new Enviroment();
    private final StringBuilder sb = new StringBuilder();


    public String getConsola(){
        return sb.toString();
    }

    @Override public Object visitPrograma(CodexLatinusGrammarParser.ProgramaContext ctx) {
        if (ctx.instrucciones() != null) visit(ctx.instrucciones());
        return null;
    }

    @Override public Object visitPrograma_Completo(CodexLatinusGrammarParser.Programa_CompletoContext ctx) {
        if (ctx.opcion_val() != null) visit(ctx.opcion_val());

        if (ctx.opcion_func() != null) visit(ctx.opcion_func());

        visit(ctx.main());
        return null;
    }

    @Override public Object visitBloque_Variables(CodexLatinusGrammarParser.Bloque_VariablesContext ctx) {
        for (CodexLatinusGrammarParser.Bloque_varsContext b : ctx.bloque_vars()){
            visit(b);
        }

        return null;
    }

    @Override public Object visitBloque_Funciones(CodexLatinusGrammarParser.Bloque_FuncionesContext ctx) {
        for (CodexLatinusGrammarParser.Bloque_funcContext b : ctx.bloque_func()){
            visit(b);
        }
        return null;
    }

    @Override public Object visitFuncion_Actio(CodexLatinusGrammarParser.Funcion_ActioContext ctx) { return visitChildren(ctx); }

    @Override public Object visitFuncion_Ratio(CodexLatinusGrammarParser.Funcion_RatioContext ctx) { return visitChildren(ctx); }

    @Override public Object visitBloque_Variables_Funciones(CodexLatinusGrammarParser.Bloque_Variables_FuncionesContext ctx) { return visitChildren(ctx); }

    //Crear una nueva variable
    @Override public Object visitAsignacion(CodexLatinusGrammarParser.AsignacionContext ctx) {
        String name = ctx.ID().getText();
        String type = (String)visit(ctx.tipos());
        Object value = valueTypes(visit(ctx.expresion()), type);
        enviroment.assing(name, value);
        return null;
    }

    /* Modificar para que asigne el valor por defecto si no es declarado
    @Override public T visitAsignacion_Default(CodexLatinusGrammarParser.AsignacionContext ctx) {
        String name = ctx.ID().getText();
        String type = (String)visit(ctx.tipos());
        Object value = valueTypes(visit(ctx.expresion()), type);
        enviroment.assing(name, value);
        return null;
    }*/


    @Override public Object visitAsignacion_Series(CodexLatinusGrammarParser.Asignacion_SeriesContext ctx) {
        String name = ctx.ID().getText();
        int size = Numerus(visit(ctx.expresion(0)));
        String type = (String) visit(ctx.tipos_series());
        Object[] serie = new Object[Math.max(size, 0)];
        Object defaultValue = DefaultValue(type);
        for (int i = 0; i < serie.length; i++) serie[i] = defaultValue;

        List<? extends CodexLatinusGrammarParser.ExpresionContext> listaValues = ctx.expresion();
        int sizeList = listaValues.size() - 1;
        for (int i = 0; i < sizeList; i++) {
            CodexLatinusGrammarParser.ExpresionContext exprValue = listaValues.get(i+1);
            Object valorEvaluado = visit(exprValue);
            Object valueType = valueTypes(valorEvaluado, type);
            if (i < size){
                serie[i] = valueType;
            } else {
                //error
                break;
            }
        }
        enviroment.assing(name, serie);
        return null;
    }

    //Crear Series sin elementos dentro
    @Override public Object visitAsignacion_Series_Vacia(CodexLatinusGrammarParser.Asignacion_Series_VaciaContext ctx) {
        String name = ctx.ID().getText();
        int size = Numerus(visit(ctx.expresion()));
        String type = (String) visit(ctx.tipos_series());
        Object forDefault = DefaultValue(type);
        if (size < 0){
            Object[] series = new Object[Math.max(1, 0)];
            for (int i = 0; i < series.length; i++) series[i] = forDefault;
            enviroment.assing(name, series);
        }
        Object[] series = new Object[Math.max(size, 0)];
        for (int i = 0; i < series.length; i++) series[i] = forDefault;
        enviroment.assing(name, series);
        return null;
    }

    @Override public Object visitAsignacion_Structura(CodexLatinusGrammarParser.Asignacion_StructuraContext ctx) { return visitChildren(ctx); }

    @Override public Object visitAsignacion_Strucutura_Variable(CodexLatinusGrammarParser.Asignacion_Strucutura_VariableContext ctx) { return visitChildren(ctx); }

    @Override public Object visitAsignacion_Valores_Struc_Serie(CodexLatinusGrammarParser.Asignacion_Valores_Struc_SerieContext ctx) { return visitChildren(ctx); }

    @Override public Object visitBloque_Asignaciones_Vars(CodexLatinusGrammarParser.Bloque_Asignaciones_VarsContext ctx) {
        return visit(ctx.asignaciones());
    }

    @Override public Object visitAsignacion_Bool_Inferida(CodexLatinusGrammarParser.Asignacion_Bool_InferidaContext ctx) { return visitChildren(ctx); }

    @Override public Object visitSuma_Resta_Auto(CodexLatinusGrammarParser.Suma_Resta_AutoContext ctx) {
        return visit(ctx.ops_automaticas());
    }

    @Override public Object visitIdentificador_Series(CodexLatinusGrammarParser.Identificador_SeriesContext ctx) { return visitChildren(ctx); }

    @Override public Object visitTipos_Primitivos_Series(CodexLatinusGrammarParser.Tipos_Primitivos_SeriesContext ctx) {
        return visit(ctx.tipos());
    }

    @Override public Object visitValores_Structura_Coma(CodexLatinusGrammarParser.Valores_Structura_ComaContext ctx) { return visitChildren(ctx); }

    @Override public Object visitValores_Structura_Punto_Coma(CodexLatinusGrammarParser.Valores_Structura_Punto_ComaContext ctx) { return visitChildren(ctx); }

    @Override public Object visitAsignacion_Variable_Structura(CodexLatinusGrammarParser.Asignacion_Variable_StructuraContext ctx) { return visitChildren(ctx); }

    @Override public Object visitParametros_Funciones(CodexLatinusGrammarParser.Parametros_FuncionesContext ctx) { return visitChildren(ctx); }

    @Override public Object visitTipos_Primitivos(CodexLatinusGrammarParser.Tipos_PrimitivosContext ctx) { return visitChildren(ctx); }

    @Override public Object visitTIpo_Series(CodexLatinusGrammarParser.TIpo_SeriesContext ctx) { return visitChildren(ctx); }

    @Override public Object visitIdentificador_Structura(CodexLatinusGrammarParser.Identificador_StructuraContext ctx) { return visitChildren(ctx); }

    @Override public Object visitTipo_Numerus(CodexLatinusGrammarParser.Tipo_NumerusContext ctx) {
        return "numerus";
    }

    @Override public Object visitTipo_Decimalis(CodexLatinusGrammarParser.Tipo_DecimalisContext ctx) {
        return "decimalis";
    }

    @Override public Object visitTipo_Textum(CodexLatinusGrammarParser.Tipo_TextumContext ctx) {
        return "textum";
    }

    @Override public Object visitTipo_Littera(CodexLatinusGrammarParser.Tipo_LitteraContext ctx) {
        return "littera";
    }

    @Override public Object visitTipo_Bool(CodexLatinusGrammarParser.Tipo_BoolContext ctx) {
        return "bool";
    }

    @Override public Object visitBloque_Maior(CodexLatinusGrammarParser.Bloque_MaiorContext ctx) { return visitChildren(ctx); }

    @Override public Object visitBloque_Imprimir(CodexLatinusGrammarParser.Bloque_ImprimirContext ctx) {
        return visit(ctx.imprimir());
    }

    @Override public Object visitAuto_Instruccion(CodexLatinusGrammarParser.Auto_InstruccionContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Object visitBloque_Expresiones(CodexLatinusGrammarParser.Bloque_ExpresionesContext ctx) {
        return visit(ctx.expresion());
    }

    @Override public Object visitBloque_Leer(CodexLatinusGrammarParser.Bloque_LeerContext ctx) {
        return visit(ctx.leer_txt());
    }

    @Override public Object visitLlamada_Actio(CodexLatinusGrammarParser.Llamada_ActioContext ctx) { return visitChildren(ctx); }

    @Override public Object visitSi_Condicional(CodexLatinusGrammarParser.Si_CondicionalContext ctx) {
        int cantExpr = ctx.expresion().size();
        int totalBloqs = ctx.LLLAVE().size();

        //Si el bloque Si es valido
        if (isVerum(visit(ctx.expresion(0)))){
            BloqueSI(ctx, 0);
            return null;
        }

        //Si un bloque aliter con condicion es valido
        int idExpr = 1;
        for (int i = 1; i < totalBloqs; i++) {
            boolean hayCondicion = idExpr < cantExpr && condicionBloque(ctx, i);
            if (hayCondicion){
                boolean valido = isVerum(visit(ctx.expresion(idExpr)));
                idExpr++;
                if (valido){
                    BloqueSI(ctx, i);
                    return null;
                }
            } else { //Ejecuta el ultimo aliter sin condicion
                BloqueSI(ctx,i);
                return null;
            }
        }

        return null;
    }

    @Override public Object visitDum_Ciclo(CodexLatinusGrammarParser.Dum_CicloContext ctx) { return visitChildren(ctx); }

    @Override public Object visitFacere_Ciclo(CodexLatinusGrammarParser.Facere_CicloContext ctx) { return visitChildren(ctx); }

    @Override public Object visitPer_Ciclo(CodexLatinusGrammarParser.Per_CicloContext ctx) { return visitChildren(ctx); }

    @Override public Object visitPerge_Action(CodexLatinusGrammarParser.Perge_ActionContext ctx) { return visitChildren(ctx); }

    @Override public Object visitInterrumpe_Action(CodexLatinusGrammarParser.Interrumpe_ActionContext ctx) { return visitChildren(ctx); }

    @Override public Object visitReddere_Value(CodexLatinusGrammarParser.Reddere_ValueContext ctx) { return visitChildren(ctx); }

    @Override public Object visitBloque_Asignaciones(CodexLatinusGrammarParser.Bloque_AsignacionesContext ctx) {
        return visit(ctx.asignaciones());
    }

    //Reasignar una el valor a una variable ya creada
    @Override public Object visitMod_Valor(CodexLatinusGrammarParser.Mod_ValorContext ctx) {
        String name = ctx.ID().getText();
        Object value = visit(ctx.expresion());
        Object actualValue = enviroment.get(name);

        if (compareTypes(actualValue, value) == false) return null; //para errores
        enviroment.assing(name, value);
        return null;
    }

    // Reasignar o agregar valor a un elemento de la serie
    @Override public Object visitMod_Valor_Series(CodexLatinusGrammarParser.Mod_Valor_SeriesContext ctx) {
        String name = ctx.ID().getText();
        int rangeSeries = Numerus(visit(ctx.expresion(0)));
        Object value = visit(ctx.expresion(1));
        Object obj = enviroment.get(name);
        if (obj instanceof Object[] serie){
            if (rangeSeries >= 0 && rangeSeries < serie.length){
                serie[rangeSeries] = value;
            } else {
                //error
            }
        } else {
            //errir
        }
        return null;
    }

    @Override public Object visitMod_Valor_Structura(CodexLatinusGrammarParser.Mod_Valor_StructuraContext ctx) { return visitChildren(ctx); }

    @Override public Object visitAsignacion_Structura_Series(CodexLatinusGrammarParser.Asignacion_Structura_SeriesContext ctx) { return visitChildren(ctx); }

    @Override public Object visitSuma_Auto(CodexLatinusGrammarParser.Suma_AutoContext ctx) {
        String value = ctx.ID().getText();
        enviroment.assing(value, AddAction(enviroment.get(value), 1));
        return null;
    }

    @Override public Object visitResta_Auto(CodexLatinusGrammarParser.Resta_AutoContext ctx) {
        String value = ctx.ID().getText();
        enviroment.assing(value, SustracAction(enviroment.get(value), 1));
        return null;
    }

    @Override public Object visitImpresion_Consola(CodexLatinusGrammarParser.Impresion_ConsolaContext ctx) {
        StringBuilder console = new StringBuilder();
        for (CodexLatinusGrammarParser.ExpresionContext expr : ctx.expresion()){
            Object valor = visit(expr);
            if (console.length() > 0) console.append(" ");
            console.append(format(valor));
        }
        sb.append(console).append("\n");
        return null;
    }

    @Override public Object visitLectura_Texto(CodexLatinusGrammarParser.Lectura_TextoContext ctx) { return visitChildren(ctx); }

    @Override public Object visitParentesis(CodexLatinusGrammarParser.ParentesisContext ctx) {
        return visit(ctx.expresion());
    }

    @Override public Object visitFalsusValor(CodexLatinusGrammarParser.FalsusValorContext ctx) {
        return Boolean.FALSE;
    }

    @Override public Object visitIntVal(CodexLatinusGrammarParser.IntValContext ctx) {
        return Integer.parseInt(ctx.getText());
    }

    @Override public Object visitLlamada_Series_Structura(CodexLatinusGrammarParser.Llamada_Series_StructuraContext ctx) { return visitChildren(ctx); }

    @Override public Object visitCharVal(CodexLatinusGrammarParser.CharValContext ctx) {
        String charT = ctx.getText();
        return charT.charAt(1);
    }

    @Override public Object visitSumaResta(CodexLatinusGrammarParser.SumaRestaContext ctx) {
        Object left = visit(ctx.expresion(0));
        Object right = visit(ctx.expresion(1));
        boolean isSuma = ctx.ops1.getText().equals("+");
        if (isSuma && (left instanceof String || right instanceof String)) return format(left) + format(right);

        return isSuma ? AddAction(left, right) : SustracAction(left, right);
    }

    @Override public Object visitNegacion(CodexLatinusGrammarParser.NegacionContext ctx) {
        Object value = visit(ctx.expresion());
        if (value instanceof Double d) return -d;
        return -Numerus(value);
    }

    @Override public Object visitLlamada_Elemento_Series(CodexLatinusGrammarParser.Llamada_Elemento_SeriesContext ctx) { return visitChildren(ctx); }

    @Override public Object visitMultDiv(CodexLatinusGrammarParser.MultDivContext ctx) {
        Object left = visit(ctx.expresion(0));
        Object right = visit(ctx.expresion(1));
        boolean isDiv = ctx.ops1.getText().equals("/");
        if (isDecimalis(left) || isDecimalis(right)){
            double leftD = Decimalis(left), rightD = Decimalis(right);
            return isDiv ? leftD / rightD : leftD * rightD;
        }
        int leftI = Numerus(left), rightI = Numerus(right);
        return isDiv ? leftI / rightI : leftI * rightI;
    }

    @Override public Object visitLlamada_Actio_Exp(CodexLatinusGrammarParser.Llamada_Actio_ExpContext ctx) { return visitChildren(ctx); }

    @Override public Object visitIgualNoIgual(CodexLatinusGrammarParser.IgualNoIgualContext ctx) {
        double left = Decimalis(visit(ctx.expresion(0)));
        double right = Decimalis(visit(ctx.expresion(1)));
        return ctx.ops1.getText().equals("<=") ? left <= right : left >= right;
    }

    @Override public Object visitMenorMayor(CodexLatinusGrammarParser.MenorMayorContext ctx) {
        double left = Decimalis(visit(ctx.expresion(0)));
        double right = Decimalis(visit(ctx.expresion(1)));
        return ctx.ops1.getText().equals("<") ? left < right : left > right;
    }

    @Override public Object visitLlamada_Ratio_Tipo(CodexLatinusGrammarParser.Llamada_Ratio_TipoContext ctx) { return visitChildren(ctx); }

    @Override public Object visitDoubleVal(CodexLatinusGrammarParser.DoubleValContext ctx) {
        return Double.parseDouble(ctx.getText());
    }

    @Override public Object visitLlamada_Propiedad_Structura(CodexLatinusGrammarParser.Llamada_Propiedad_StructuraContext ctx) { return visitChildren(ctx); }

    @Override public Object visitStringVal(CodexLatinusGrammarParser.StringValContext ctx) {
        String text = ctx.getText();
        if (text.length() < 3) return text;
        return text.substring(1, text.length() -1);
    }

    @Override public Object visitIdentificador(CodexLatinusGrammarParser.IdentificadorContext ctx) {
        return enviroment.get(ctx.getText());
    }

    @Override public Object visitMenorMayorIgual(CodexLatinusGrammarParser.MenorMayorIgualContext ctx) { return visitChildren(ctx); }

    @Override public Object visitVerumValor(CodexLatinusGrammarParser.VerumValorContext ctx) {
        return Boolean.TRUE;
    }

    @Override public Object visitAndOr(CodexLatinusGrammarParser.AndOrContext ctx) {
        boolean left = isVerum(visit(ctx.expresion(0)));
        if (ctx.ops1.getText().equals("&&")) return left && isVerum(visit(ctx.expresion(1)));
        return left || isVerum(visit(ctx.expresion(1)));
    }

    @Override public Object visitUmenos(CodexLatinusGrammarParser.UmenosContext ctx) { return visitChildren(ctx); }

    private int Numerus(Object o){
        if (o instanceof Integer i ) return i;
        return 0;
    }

    private double Decimalis(Object o){
        if (o instanceof Integer i ) return i.doubleValue();
        if (o instanceof Double i) return i;
        return 0;
    }

    private boolean isDecimalis(Object o){
        return o instanceof Double;
    }

    private boolean isVerum(Object o){
        if (o instanceof Boolean b) return b;
        if (o instanceof Integer i) return i != 0;
        if (o instanceof Double d) return d != 0;
        return o != null;
    }

    private Object AddAction(Object left, Object right){
        if (isDecimalis(left) || isDecimalis(right)) return Decimalis(left) + Decimalis(right);
        return Numerus(left)+ Numerus(right);
    }

    private Object SustracAction(Object left, Object right){
        if (isDecimalis(left) || isDecimalis(right)) return Decimalis(left) - Decimalis(right);
        return Numerus(left)- Numerus(right);
    }

    private boolean Equals(Object left, Object right){
        if (left instanceof Number || right instanceof Number) return Decimalis(left) == Decimalis(right);
        return java.util.Objects.equals(left,right);
    }

    private Object valueTypes(Object value, String type) {
        return switch (type){
            case "numerus" -> Numerus(value);
            case "decimalis" -> Decimalis(value);
            case "bool" -> isVerum(value);
            case "textum" -> format(value);
            case "littera" -> value instanceof Character c ? c : format(value).charAt(0);
            default -> value;
        };
    }

    private Object DefaultValue(String type){
        return switch (type){
            case "numerus" -> 0;
            case "decimalis" -> 0.0;
            case "bool" -> false;
            case "textum" -> "";
            case "littera" -> ' ';
            default -> null;
        };
    }

    private String format(Object value){
        if (value instanceof Boolean b) return b ? "verum" : "falsus";

        if (value instanceof Integer i) return String.valueOf(i);

        if (value instanceof Double d){
            if ( d == Math.floor(d) && !Double.isInfinite(d)) return String.valueOf(d.longValue());
            return String.valueOf(d);
        }
        if (value instanceof Object[] arr){
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                if (i > 0) sb.append(", ");
                sb.append(format(arr[i]));
            }
            return sb.append("]").toString();
        }
        return String.valueOf(value);
    }

    //Agregar series y structuras
    private boolean compareTypes(Object prev, Object actual){
        if ((prev instanceof Integer) && (actual instanceof Integer)) return true;

        if (prev instanceof Double){
            if (actual instanceof Double) return true;
            if (actual instanceof Integer) return true;
        }
        if ((prev instanceof String) && (actual instanceof String)) return true;

        if ((prev instanceof Character) && (actual instanceof Character)) return true;
        return false;
    }

    //Crea un nuevo entorno para ejecutar el bloque Si aceptado
    private void BloqueSI(CodexLatinusGrammarParser.Si_CondicionalContext ctx, int indice){
        int inicio = ctx.LLLAVE(indice).getSymbol().getStopIndex();
        int fin = ctx.RLLAVE(indice).getSymbol().getStartIndex();
        Enviroment parent = enviroment;
        enviroment = new Enviroment(parent);
        try {
            for(CodexLatinusGrammarParser.InstruccionContext instr : ctx.instruccion()){
                int pos = instr.getStart().getStartIndex();
                if (pos > inicio && pos < fin) visit(instr);
            }
        }finally {
            enviroment = parent;
        }
    }

    //Ver si un aliter tiene condicional
    private boolean condicionBloque(CodexLatinusGrammarParser.Si_CondicionalContext ctx, int indiceBloque){
        if (indiceBloque >= ctx.LPAREN().size()) return false;

        return ctx.LPAREN(indiceBloque).getSymbol().getStartIndex() < ctx.LLLAVE(indiceBloque).getSymbol().getStartIndex();
    }
}
