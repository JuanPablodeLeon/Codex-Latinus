grammar CodexLatinusGrammar;

@header{
    package antlr4.com;
}
import CodexLatinusLexer;

inicio: instrucciones EOF
      ;

// 'variables' 'funciones' ... FINIS;
instrucciones: opcion_val? opcion_func? main FINISUP PUNTO_COMA
             ;

         // VARIABILES > ...
opcion_val: VARIABILES MAYOR bloque_vars+
          ;

bloque_vars: ESTO ID DOS_PUNTOS tipos expresion PUNTO_COMA
           | ID DOS_PUNTOS tipos expresion PUNTO_COMA
           ;


          // MUNERA > ...
opcion_func: MUNERA MAYOR bloque_func+
           ;

bloque_func: ACTIO ID LPAREN RPAREN LLLAVE RLLAVE FINIS PUNTO_COMA
           | RATIO tipos  ID LPAREN RPAREN LLLAVE RLLAVE FINIS PUNTO_COMA
           ;

tipos: NUMERUS
     | DECIMALIS
     | TEXTUM
     | LITTERA
     ;

   // MAIOR > ...
main: MAIOR MAYOR instruccion*
    ;

instruccion: imprimir
           | expresion
           ;

imprimir: expresion PUNTOCOMA
        ;

expresion: RESTA<assoc=right> expresion
         | NON<assoc=right> expresion
         | LPAREN expresion RPAREN
         | expresion ops1=(MULT | DIV) expresion
         | expresion ops1=(SUMA | RESTA) expresion
         | ID
         | DOUBLE
         | INT
         | CHARS
         | STRING
         ;