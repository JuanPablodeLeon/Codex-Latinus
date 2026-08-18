grammar CodexLatinusGrammar;

@header{
    package antlr4;
}
import CodexLatinusLexer;

inicio: instrucciones? EOF //# Programa
      ;

           // 'variables' 'funciones' ... FINIS;
instrucciones: opcion_val? opcion_func? main FINISUP PUNTO_COMA //# Programa_Completo
             ;

         // VARIABILES > ...
opcion_val: VARIABILES MAYOR bloque_vars+ //# Bloque_Variables
          ;
          // MUNERA > ...
opcion_func: MUNERA MAYOR bloque_func+ //# Bloque_Funciones
           ;

            // actio <id> (...){...} finis;
bloque_func: ACTIO ID LPAREN func_param? RPAREN LLLAVE funcs_val? instruccion* RLLAVE FINIS PUNTO_COMA //# Funcion_Actio
          // ratio <tipo> <id> (...) {...} finis;
           | RATIO tipos ID LPAREN func_param? RPAREN LLLAVE funcs_val? instruccion+ RLLAVE FINIS PUNTO_COMA //# Funcion_Ratio
           ;

        // VARIABILES [...] ....
funcs_val: VARIABILES LCORCH bloque_vars RCORCH //# Bloque_Variables_Funciones
         ;

          // esto <id> : <tipo> <valor>;
bloque_vars: ESTO ID DOS_PUNTOS tipos expresion PUNTO_COMA //# Asignacion
           // series <id> [<valor>] : <tipo> {...};                    <valor> , ... <valor> | <valor>
           | SERIES ID LCORCH expresion RCORCH DOS_PUNTOS tipos LLLAVE expresion (COMA expresion)* RLLAVE PUNTO_COMA //# Asignacion_Series
           // series <id> [<valor>] : <tipo>;
           | SERIES ID LCORCH expresion RCORCH DOS_PUNTOS tipos PUNTO_COMA //# Asignacion_Series_Vacia
          // esto <id> : <tipo> {...} finis ;
           | STRUCTURA ID LLLAVE (valores_structura_coma | valores_structura_punto_coma+) RLLAVE FINIS PUNTO_COMA //# Asignacion_Structura
          // esto <id> : <id_structura> {...}
           | ESTO ID DOS_PUNTOS ID LLLAVE asignacion_structura RLLAVE //# Asignacion_Strucutura_Variable
           | asignaciones // <- Aisgnarle valor a variables //# Bloque_Asignaciones
          // esto id : <valor bool> ; <- Solo valores de tipo bool
           | ESTO ID DOS_PUNTOS expresion PUNTO_COMA //# Asignacion_Bool_Inferida
           | ops_automaticas // <- Suma/Resta Abreviadas // # Suma_Resta_Auto
           ;

                     // esto <id> : <tipo> , .... esto <id> : <tipo> | esto <id> : <tipo>
valores_structura_coma: ESTO ID DOS_PUNTOS tipos_structura (COMA ESTO ID DOS_PUNTOS tipos_structura)* //# Valores_Structura_Coma
                      ;

                           // esto <id> : <tipo> ;
valores_structura_punto_coma: ESTO ID DOS_PUNTOS tipos_structura PUNTO_COMA //# Valores_Structura_Punto_Coma
                      ;

                   // <id> : <valor> , ... , <id> : <valor> | <id> : <valor>
asignacion_structura: ID DOS_PUNTOS expresion (COMA ID DOS_PUNTOS expresion)* //# Asignacion_Variable_Structura
                    ;

             // <id> ++
ops_automaticas: ID SUMA_INCR //# Suma_Auto
            // <id> --
              | ID RESTA_DECR //# Resta_Auto
              ;

         // esto <id> : <tipo> | esto <id> : <tipo> , ... , esto <id> : <tipo>
func_param: ESTO ID DOS_PUNTOS tipos (COMA ESTO ID DOS_PUNTOS tipos)* //# Parametros_Funciones
          ;


tipos_structura: tipos //# Tipos_Primitivos
               | ID LCORCH expresion RCORCH //# TIpo_Series
               | ID //# Identificador
               ;

//tipos existentes
tipos: NUMERUS //# Tipo_Numerus
     | DECIMALIS //# Tipo_Decimalis
     | TEXTUM //# Tipo_Textum
     | LITTERA //# Tipo_Littera
     | BOOL //# Tipo_Bool
     ;

   // MAIOR > ...
main: MAIOR MAYOR instruccion* //# Bloque_Maior
    ;

instruccion: imprimir
           | expresion
           | leer_txt
          // si (<exp bool>){...} finis;                                           // aliter( ){...} | aliter(...){...} ... aliter( ){...}
           | SI LPAREN expresion RPAREN LLLAVE (instruccion | asignaciones)* RLLAVE (ALITER (LPAREN expresion RPAREN)? LLLAVE instruccion* RLLAVE)* FINIS PUNTO_COMA
          // dum (...) {...} finis;
           | DUM LPAREN expresion RPAREN LLLAVE instruccion+ RLLAVE FINIS PUNTO_COMA
          // facere {...} dum (...);
           | FACERE LLLAVE instruccion+ RLLAVE DUM LPAREN expresion RPAREN PUNTO_COMA
          // per(<id> ; <exp bool> ; <incremento>){...}
           | PER LPAREN ESTO ID DOS_PUNTOS tipos expresion PUNTO_COMA expresion PUNTO_COMA ops_automaticas RPAREN instruccion+ LLLAVE RLLAVE
          // perge ; <- continue
           | PERGE PUNTO_COMA
          // interrumpe ; <- break
           | INTERRUMPE PUNTO_COMA
          // reddere ; | reddere <valor> ; <- return
           | REDDERE expresion? PUNTO_COMA
           | asignaciones // <- Asignar/Modificar valores de variables ya creadas //# Bloque_Asignaciones
           ;

           // <id> = <valor> ;
asignaciones: ID ASIGNACION expresion PUNTO_COMA
           // <id> [<valor>] = <valor>;
            | ID LCORCH expresion RCORCH ASIGNACION expresion PUNTO_COMA
          // <id_structuta>.<elemento_structura> = <valor>;
            | ID PUNTO expresion ASIGNACION expresion PUNTO_COMA
            ;

        // >> <valor> ; | >> <valor>  ...  >> <valor> ;
imprimir: IMPR expresion (IMPR expresion)* PUNTO_COMA
        ;

      // <id> << | <<
leer_txt: ID? LEER
        ;

        // -<valor>
expresion: RESTA<assoc=right> expresion //# Umenos
        // non <valor>
         | NON<assoc=right> expresion //# Negacion
        // (...)
         | LPAREN expresion RPAREN //# Parentesis
        // <valor> (* /) <valor>
         | expresion ops1=(MULTI | DIV) expresion //# MultDiv
        // <valor> (+ -) <valor>
         | expresion ops1=(SUMA | RESTA) expresion //# SumaResta
        // <valor> (== !=) <valor>
         | expresion ops1=(IGUAL | NO_IGUAL) expresion //# IgualNoIgual
        // <valor> (<= >=) <valor>
         | expresion ops1=(MENRO_IGUAL | MAYOR_IGUAL) expresion //# MenorMayorIgual
        // <valor> (< >) <valor>
         | expresion ops1=(MENOR | MAYOR) expresion //# MenorMayor
        // <valor> (&& ||) <valor>
         | expresion ops1=(AND | OR) expresion //# AndOr
       // <id> (...)
         | ID LPAREN (expresion (COMA expresion)* )* RPAREN
       // <id>[<valor>]
         | ID LCORCH expresion RCORCH
       // <id_structura>.<id_propiedad>
         | ID PUNTO ID
        // <tipo> <id> (...)
         | tipos ID LPAREN (expresion (COMA expresion)* )* RPAREN
         | VERUM //#VerumValor
         | FALSUS //#FalsusValor
         | ID //# Identificador
         | DOUBLE //# DoubleVal
         | INT //# IntVal
         | CHARS //# CharVal
         | STRING //# StringVal
         ;