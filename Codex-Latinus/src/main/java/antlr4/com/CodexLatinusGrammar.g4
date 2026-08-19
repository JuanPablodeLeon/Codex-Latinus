grammar CodexLatinusGrammar;

@header{
    package antlr4.com;
}
//import CodexLatinusLexer;

inicio: instrucciones? EOF # Programa
      ;

           // 'variables' 'funciones' ... FINIS;
instrucciones: opcion_val? opcion_func? main FINISUP PUNTO_COMA # Programa_Completo
             ;

         // VARIABILES > ...
opcion_val: VARIABILES MAYOR bloque_vars+ # Bloque_Variables
          ;
          // MUNERA > ...
opcion_func: MUNERA MAYOR bloque_func+ # Bloque_Funciones
           ;

            // actio <id> (...){...} finis;
bloque_func: ACTIO ID LPAREN func_param? RPAREN LLLAVE funcs_val? instruccion* RLLAVE FINIS PUNTO_COMA # Funcion_Actio
          // ratio <tipo> <id> (...) {...} finis;
           | RATIO tipos ID LPAREN func_param? RPAREN LLLAVE funcs_val? instruccion+ RLLAVE FINIS PUNTO_COMA # Funcion_Ratio
           ;

        // VARIABILES [...] ....
funcs_val: VARIABILES LCORCH bloque_vars+ RCORCH # Bloque_Variables_Funciones
         ;

          // esto <id> : <tipo> <valor>;
bloque_vars: ESTO ID DOS_PUNTOS tipos expresion PUNTO_COMA # Asignacion
           | ESTO ID DOS_PUNTOS tipos PUNTO_COMA # Asignacion_Defualt
           // series <id> [<valor>] : <tipo> {...};                    <valor> , ... <valor> | <valor>
           | SERIES ID LCORCH expresion RCORCH DOS_PUNTOS tipos_series LLLAVE expresion (COMA expresion)* RLLAVE PUNTO_COMA # Asignacion_Series
           // series <id> [<valor>] : <tipo>;
           | SERIES ID LCORCH expresion RCORCH DOS_PUNTOS tipos_series PUNTO_COMA # Asignacion_Series_Vacia
          // esto <id> : <tipo> {...} finis ;
           | STRUCTURA ID LLLAVE (valores_structura_coma | valores_structura_punto_coma+) RLLAVE FINIS PUNTO_COMA # Asignacion_Structura
          // esto <id> : <id_structura> {...}
           | ESTO ID DOS_PUNTOS ID LLLAVE asignacion_structura RLLAVE # Asignacion_Strucutura_Variable
         // <id>.<id>[<valor>] = {...}
           | ID PUNTO ID LCORCH expresion RCORCH ASIGNACION LLLAVE asignacion_structura RLLAVE # Asignacion_Valores_Struc_Serie
           | asignaciones # Bloque_Asignaciones_Vars // <- Aisgnarle valor a variables
          // esto id : <valor bool> ; <- Solo valores de tipo bool
           | ESTO ID DOS_PUNTOS expresion PUNTO_COMA # Asignacion_Bool_Inferida
           | ops_automaticas # Suma_Resta_Auto // <- Suma/Resta Abreviadas
           ;

tipos_series: ID # Identificador_Series
            | tipos # Tipos_Primitivos_Series
            ;
                     // esto <id> : <tipo> , .... esto <id> : <tipo> | esto <id> : <tipo>
valores_structura_coma: ESTO ID DOS_PUNTOS tipos_structura (COMA ESTO ID DOS_PUNTOS tipos_structura)* # Valores_Structura_Coma
                      ;

                           // esto <id> : <tipo> ;
valores_structura_punto_coma: ESTO ID DOS_PUNTOS tipos_structura PUNTO_COMA # Valores_Structura_Punto_Coma
                      ;

                   // <id> : <valor> , ... , <id> : <valor> | <id> : <valor>
asignacion_structura: ID DOS_PUNTOS expresion (COMA ID DOS_PUNTOS expresion)* # Asignacion_Variable_Structura
                    ;

         // esto <id> : <tipo> | esto <id> : <tipo> , ... , esto <id> : <tipo>
func_param: ESTO ID DOS_PUNTOS tipos (COMA ESTO ID DOS_PUNTOS tipos)* # Parametros_Funciones
          ;


tipos_structura: tipos # Tipos_Primitivos
               | ID LCORCH expresion RCORCH # TIpo_Series
               | ID # Identificador_Structura
               ;

//tipos existentes
tipos: NUMERUS # Tipo_Numerus
     | DECIMALIS # Tipo_Decimalis
     | TEXTUM # Tipo_Textum
     | LITTERA # Tipo_Littera
     | BOOL # Tipo_Bool
     ;

   // MAIOR > ...
main: MAIOR MAYOR instruccion* # Bloque_Maior
    ;

instruccion: imprimir # Bloque_Imprimir
           | ops_automaticas PUNTO_COMA # Auto_Instruccion
           | expresion # Bloque_Expresiones
           | leer_txt # Bloque_Leer
         // <id> (...)
           | ID LPAREN (expresion (COMA expresion)* )* RPAREN PUNTO_COMA # Llamada_Actio
          // si (<exp bool>){...} finis;                                           // aliter( ){...} | aliter(...){...} ... aliter( ){...}
           | SI LPAREN expresion RPAREN LLLAVE (instruccion | asignaciones)* RLLAVE (ALITER (LPAREN expresion RPAREN)? LLLAVE instruccion* RLLAVE)* FINIS PUNTO_COMA # Si_Condicional
          // dum (...) {...} finis;
           | DUM LPAREN expresion RPAREN LLLAVE instruccion+ RLLAVE FINIS PUNTO_COMA # Dum_Ciclo
          // facere {...} dum (...);
           | FACERE LLLAVE instruccion+ RLLAVE DUM LPAREN expresion RPAREN PUNTO_COMA # Facere_Ciclo
          // per(<id> ; <exp bool> ; <incremento>){...}
           | PER LPAREN ESTO ID DOS_PUNTOS tipos expresion PUNTO_COMA expresion PUNTO_COMA ops_automaticas RPAREN LLLAVE instruccion+ RLLAVE # Per_Ciclo
          // perge ; <- continue
           | PERGE PUNTO_COMA # Perge_Action
          // interrumpe ; <- break
           | INTERRUMPE PUNTO_COMA # Interrumpe_Action
          // reddere ; | reddere <valor> ; <- return
           | REDDERE expresion? PUNTO_COMA # Reddere_Value
           | asignaciones # Bloque_Asignaciones // <- Asignar/Modificar valores de variables ya creadas
           ;

           // <id> = <valor> ;
asignaciones: ID ASIGNACION expresion PUNTO_COMA # Mod_Valor
           // <id> [<valor>] = <valor>;
            | ID LCORCH expresion RCORCH ASIGNACION expresion PUNTO_COMA # Mod_Valor_Series
          // <id_structuta>.<elemento_structura> = <valor>;
            | ID PUNTO expresion ASIGNACION expresion PUNTO_COMA # Mod_Valor_Structura
          // <id>[<valor>].<id> = <valor>;
            | ID LCORCH expresion RCORCH PUNTO ID ASIGNACION expresion PUNTO_COMA # Asignacion_Structura_Series
            ;

             // <id> ++
ops_automaticas: ID SUMA_INCR # Suma_Auto
            // <id> --
              | ID RESTA_DECR # Resta_Auto
              ;

        // >> <valor> ; | >> <valor>  ...  >> <valor> ;
imprimir: IMPR expresion (IMPR expresion)* PUNTO_COMA # Impresion_Consola
        ;

      // <id> << | <<
leer_txt: ID? LEER # Lectura_Texto
        ;

        // -<valor>
expresion: RESTA expresion # Umenos
        // non <valor>
         | NON expresion # Negacion
        // (...)
         | LPAREN expresion RPAREN # Parentesis
        // <valor> (* /) <valor>
         | expresion ops1=(MULTI | DIV) expresion # MultDiv
        // <valor> (+ -) <valor>
         | expresion ops1=(SUMA | RESTA) expresion # SumaResta
        // <valor> (== !=) <valor>
         | expresion ops1=(IGUAL | NO_IGUAL) expresion # IgualNoIgual
        // <valor> (<= >=) <valor>
         | expresion ops1=(MENRO_IGUAL | MAYOR_IGUAL) expresion # MenorMayorIgual
        // <valor> (< >) <valor>
         | expresion ops1=(MENOR | MAYOR) expresion # MenorMayor
        // <valor> (&& ||) <valor>
         | expresion ops1=(AND | OR) expresion # AndOr
       // <id>[<valor>]
         | ID LCORCH expresion RCORCH # Llamada_Elemento_Series
       // <id_structura>.<id_propiedad>
         | ID PUNTO ID # Llamada_Propiedad_Structura
         // <id> (...)
         | ID LPAREN (expresion (COMA expresion)* )* RPAREN # Llamada_Actio_Exp
        // <tipo> <id> (...)
         | tipos ID LPAREN (expresion (COMA expresion)* )* RPAREN # Llamada_Ratio_Tipo
       // <id>[<valor>].<id>
         | ID LCORCH expresion RCORCH PUNTO ID # Llamada_Series_Structura
         | VERUM # VerumValor
         | FALSUS # FalsusValor
         | ID # Identificador
         | DOUBLE # DoubleVal
         | INT # IntVal
         | CHARS # CharVal
         | STRING # StringVal
         ;