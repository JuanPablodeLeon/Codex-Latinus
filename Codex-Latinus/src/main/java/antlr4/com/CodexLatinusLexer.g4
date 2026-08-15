lexer grammar CodexLatinusLexer;

//Palanras Reservadas
NON: 'non';
ESTO: 'esto';
VERUM: 'verum';
FALSUS: 'falsus';
SERIES: 'series';
TEXTUM: 'textum';
DECIMALIS: 'decimalis';
NUMERUS: 'numerus';
LITTERA: 'littera';
BOOL: 'bool';
STRUCTURA: 'structura';
FINIS: 'finis';
SI: 'si';
ALITER: 'aliter';
DUM: 'dum';
FACERE: 'facere';
PERGE: 'perge';
PER: 'per';
INTERRUMPE: 'interrumpe';
ACTIO: 'actio';
RATIO: 'ratio';
REDDERE: 'reddere';
VARIABILES: 'VARIABILES';
MUNERA: 'MUNERA';
MAIOR: 'MAIOR';
FINISUP: 'FINIS';

//Funciones
IMPR: '>>';
LEER: '<<';

//Aritmeticas
SUMA_INCR: '++';
RESTA_DECR: '--';
SUMA: '+';
RESTA: '-';
MULTI: '*';
DIV: '/';

//Relacionales
IGUAL: '==';
NO_IGUAL: '!=';
MENRO_IGUAL: '<=';
MAYOR_IGUAL: '>=';
MENOR: '<';
MAYOR: '>';

//Logicos
AND: '&&';
OR: '||';

//Demas Elementos
DOS_PUNTOS: ':';
PUNTO_COMA: ';';
COMA: ',';
PUNTO: '.';
LLLAVE: '{';
RLLAVE: '}';
LCORCH: '[';
RCORCH: ']';
LPAREN: '(';
RPAREN: ')';
ASIGNACION: '=';

ID: [a-zA-Z_][a-zA-Z_0-9]*;
INT: [0-9]+;
DOUBLE: INT '.' INT;
STRING: '"' (ESC|.)*? '"';
CHARS: '\'' [a-z-A-Z] '\'';
ESC: '\\"' | '\\\\' ;

//Comentarios
LINE_COMMENT: '//' .*? '\r'? '\n' -> skip;
BLOCK_COMMENT: '##' .*? '##' -> skip;

WS: [ \t\r\n]+ -> skip;