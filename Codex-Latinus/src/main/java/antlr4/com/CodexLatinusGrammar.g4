grammar CodexLatinusGrammar;

@header{
    package antlr4;
}
import CodexLatinusLexer;

inicio: instrucciones? EOF
      ;

           // 'variables' 'funciones' ... FINIS;
instrucciones: opcion_val? opcion_func? main FINISUP PUNTO_COMA
             ;

         // VARIABILES > ...
opcion_val: VARIABILES MAYOR bloque_vars+
          ;

          // esto <id> : <tipo> <valor>;
bloque_vars: ESTO ID DOS_PUNTOS tipos expresion PUNTO_COMA
          // <id> : <tipo> <valor>;
           | ID DOS_PUNTOS tipos expresion PUNTO_COMA
           // series <id> [<valor>] : <tipo> {...};                    <valor> , ... <valor> | <valor>
           | SERIES ID LCORCH expresion RCORCH DOS_PUNTOS tipos LLLAVE expresion (COMA expresion)* RLLAVE PUNTO_COMA
           // series <id> [<valor>] : <tipo>;
           | SERIES ID LCORCH expresion RCORCH DOS_PUNTOS tipos PUNTO_COMA
          // esto <id> : <tipo> {...} finis ;
           | STRUCTURA ID LLLAVE (valores_structura_coma | valores_structura_punto_coma+) RLLAVE FINIS PUNTO_COMA
          // esto <id> : <id_structura> {...}
           | ESTO ID DOS_PUNTOS ID asignacion_structura LLLAVE RLLAVE
           | asignaciones // <- Aisgnarle valor a variables
          // esto id : <valor bool> ; <- Solo valores de tipo bool
           | ESTO ID DOS_PUNTOS expresion PUNTO_COMA
           | ops_automaticas // <- Suma/Resta Abreviadas
           ;

                     // esto <id> : <tipo> , .... esto <id> : <tipo> | esto <id> : <tipo>
valores_structura_coma: ESTO ID DOS_PUNTOS tipos_structura (COMA ESTO ID DOS_PUNTOS tipos_structura)*
                      ;

                           // esto <id> : <tipo> ;
valores_structura_punto_coma: ESTO ID DOS_PUNTOS tipos_structura PUNTO_COMA
                      ;

                   // <id> : <valor> , ... , <id> : <valor> | <id> : <valor>
asignacion_structura: ID DOS_PUNTOS expresion (COMA ID DOS_PUNTOS expresion)*
                    ;

           // <id> = <valor> ;
asignaciones: ID ASIGNACION expresion PUNTO_COMA
           // <id> [<valor>] = <valor>;
            | ID LCORCH expresion RCORCH ASIGNACION expresion PUNTO_COMA
            ;

             // <id> ++
ops_automaticas: ID SUMA_INCR
            // <id> --
              | ID RESTA_DECR
              ;
          // MUNERA > ...
opcion_func: MUNERA MAYOR bloque_func+
           ;

            // actio <id> (...){...} finis;
bloque_func: ACTIO ID LPAREN func_param? RPAREN LLLAVE funcs_val? instruccion* RLLAVE FINIS PUNTO_COMA
          // ratio <tipo> <id> (...) {...} finis;
           | RATIO tipos ID LPAREN func_param? RPAREN LLLAVE funcs_val? instruccion+ RLLAVE FINIS PUNTO_COMA
           ;

        // VARIABILES [...] ....
funcs_val: VARIABILES LCORCH bloque_vars RCORCH
         ;

         // esto <id> : <tipo> | esto <id> : <tipo> , ... , esto <id> : <tipo>
func_param: ESTO ID DOS_PUNTOS tipos (COMA ESTO ID DOS_PUNTOS tipos)*
          ;


tipos_structura: tipos
               | ID LCORCH expresion RCORCH
               | ID
               ;

//tipos existentes
tipos: NUMERUS
     | DECIMALIS
     | TEXTUM
     | LITTERA
     | BOOL
     ;

   // MAIOR > ...
main: MAIOR MAYOR instruccion*
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