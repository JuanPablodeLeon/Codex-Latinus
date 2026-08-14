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
           // series <id> [<valor>] : <tipo> {...};
           | SERIES ID LCORCH expresion RCORCH DOS_PUNTOS tipos LLAVE expresion RLLAVE PUNTO_COMA
           // series <id> [<valor>] : <tipo>;
           | SERIES ID LCORCH expresion RCORCH DOS_PUNTOS tipos PUNTO_COMA
           // structura <id> {...} finis ;
           | STRUCTURA ID LLLAVE RLLAVE FINIS PUNTO_COMA
           | asignaciones
          // <id> ++
           | ID SUMA_INCR
          // <id> --
           | ID RESTA_DECR
           ;

           // <id> = <valor> ;
asignaciones: ID ASIGNACION expresion PUNTO_COMA
           // series <id> [<valor>] = <valor>;
            | ID LCORCH expresion RCORCH ASIGNACION expresion PUNTO_COMA
           // esto <id> : <tipo> {...}
            | STRUCTURA ID LLLAVE RLLAVE FINIS PUNTO_COMA

            ;

          // MUNERA > ...
opcion_func: MUNERA MAYOR bloque_func+
           ;

            // actio <id> (...){...}finis;
bloque_func: ACTIO ID LPAREN RPAREN LLLAVE RLLAVE FINIS PUNTO_COMA
           | RATIO tipos  ID LPAREN RPAREN LLLAVE RLLAVE FINIS PUNTO_COMA
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
          // si (<exp bool>){...} finis;                            //MODIFICAR PARA ULTIMO ALITER SIN ELEMENTOS
           | SI LPAREN expresion RPAREN LLLAVE instruccion* RLLAVE (ALITER (LPAREN expresion RPAREN)? LLLAVE instruccion* RLLAVE)* FINIS PUNTO_COMA
          // dum (...) {...} finis;
           | DUM LPAREN expresion RPAREN LLLAVE instruccion+ RLLAVE FINIS PUNTO_COMA
          // facere {...} dum (...);
           | FACERE LLLAVE instruccion+ RLLAVE DUM LPAREN expresion RPAREN PUNTO_COMA
          // per(<id> ; <exp bool> ; <incremento>){...}
           | PER LPAREN bloque_vars PUNTO_COMA expresion PUNTO_COMA bloque_vars RPAREN LLLAVE RLLAVE
           | PERGE PUNTO_COMA
           | INTERRUMPE PUNTO_COMA
           ;


imprimir: IMPR expresion PUNTO_COMA
        ;

        // -<valor>
expresion: RESTA<assoc=right> expresion
        // non <valor>
         | NON<assoc=right> expresion
        // (...)
         | LPAREN expresion RPAREN
        // <valor> (* /) <valor>
         | expresion ops1=(MULTI | DIV) expresion
        // <valor> (+ -) <valor>
         | expresion ops1=(SUMA | RESTA) expresion
        // <valor> (== !=) <valor>
         | expresion ops1=(IGUAL | NO_IGUAL) expresion
        // <valor> (<= >=) <valor>
         | expresion ops1=(MENRO_IGUAL | MAYOR_IGUAL) expresion
        // <valor> (< >) <valor>
         | expresion ops1=(MENOR | IGUAL) expresion
        // <valor> (&& ||) <valor>
         | expresion ops1=(AND | OR) expresion
         | ID
         | DOUBLE
         | INT
         | CHARS
         | STRING
         ;