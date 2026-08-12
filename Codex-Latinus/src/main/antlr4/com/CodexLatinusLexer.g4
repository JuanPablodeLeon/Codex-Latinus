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
VARIABLES: 'VARIABLES';
MUNERA: 'MUNERA';
MAIOR: 'MAIOR';
FINISUP: 'FINIS';

//Aritmeticas
SUMA: '+';
RESTA: '-';
MULTI: '*';
DIV: '/';

//Comentarios
LINE_COMMENT: '//' .*? '\r'? '\n' -> skip;
BLOCK_COMMENT: '##' .*? '##' -> skip;