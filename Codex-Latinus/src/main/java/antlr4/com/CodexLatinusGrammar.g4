grammar CodexLatinusGrammar;

@header{
    package antlr4.com;
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
           | asignaciones
          // esto id : <valor bool> ;
           | ESTO ID DOS_PUNTOS expresion PUNTO_COMA
          // <id> ++
           | ID SUMA_INCR
          // <id> --
           | ID RESTA_DECR
           ;

                     // esto <id> : <tipo> , .... esto <id> : <tipo> | esto <id> : <tipo>
valores_structura_coma: ESTO ID DOS_PUNTOS tipos_structura (COMA ESTO ID DOS_PUNTOS tipos_structura)*
                      ;

                           // esto <id> : <tipo> ;
valores_structura_punto_coma: ESTO ID DOS_PUNTOS tipos_structura PUNTO_COMA
                      ;

                   // <id> : <valor> , ... <id> : <valor> | <id> : <valor>
asignacion_structura: ID DOS_PUNTOS expresion (COMA ID DOS_PUNTOS expresion)*
                    ;

           // <id> = <valor> ;
asignaciones: ID ASIGNACION expresion PUNTO_COMA
           // series <id> [<valor>] = <valor>;
            | ID LCORCH expresion RCORCH ASIGNACION expresion PUNTO_COMA
            ;

          // MUNERA > ...
opcion_func: MUNERA MAYOR bloque_func+
           ;

            // actio <id> (...){...}finis;
bloque_func: ACTIO ID LPAREN valores_structura_coma RPAREN LLLAVE RLLAVE FINIS PUNTO_COMA
           | RATIO tipos  ID LPAREN valores_structura_coma RPAREN LLLAVE ratio_val? instruccion* RLLAVE FINIS PUNTO_COMA
           ;

ratio_val: VARIABILES LCORCH bloque_vars RCORCH
         ;
//tipos existentes
tipos: NUMERUS
     | DECIMALIS
     | TEXTUM
     | LITTERA
     | BOOL
     ;

tipos_structura: tipos
               | ID LCORCH expresion RCORCH
               | ID
               ;
   // MAIOR > ...
main: MAIOR MAYOR instruccion*
    ;

instruccion: imprimir
           | expresion
           | leer_txt
          // si (<exp bool>){...} finis;                            //MODIFICAR PARA ULTIMO ALITER SIN ELEMENTOS
           | SI LPAREN expresion RPAREN LLLAVE (instruccion* | asignaciones*) RLLAVE (ALITER (LPAREN expresion RPAREN)? LLLAVE instruccion* RLLAVE)* FINIS PUNTO_COMA
          // dum (...) {...} finis;
           | DUM LPAREN expresion RPAREN LLLAVE instruccion+ RLLAVE FINIS PUNTO_COMA
          // facere {...} dum (...);
           | FACERE LLLAVE instruccion+ RLLAVE DUM LPAREN expresion RPAREN PUNTO_COMA
          // per(<id> ; <exp bool> ; <incremento>){...}
           | PER LPAREN bloque_vars PUNTO_COMA expresion PUNTO_COMA bloque_vars RPAREN LLLAVE RLLAVE
           | PERGE PUNTO_COMA
           | INTERRUMPE PUNTO_COMA
           | REDDERE expresion? PUNTO_COMA
           ;


imprimir: IMPR expresion (IMPR expresion)* PUNTO_COMA
        ;

leer_txt: ID? LEER PUNTO_COMA?
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
         | ID LPAREN (expresion (COMA expresion)* )* RPAREN
         | ID tipos LPAREN (expresion (COMA expresion)* )* RPAREN
         | VERUM //#VerumValor
         | FALSUS //#FalsusValor
         | ID //# Identificador
         | DOUBLE //# DoubleVal
         | INT //# IntVal
         | CHARS //# CharVal
         | STRING //# StringVal
         ;