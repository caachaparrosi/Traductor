grammar grammar_pseint;

//Palabras reservadas
TOKEN_INICIO_PROCESO: 'proceso' | 'algoritmo';
TOKEN_FIN_PROCESO: 'finproceso' | 'finalgoritmo';
TOKEN_INICIO_SUBPROCESO: 'SubProceso';
TOKEN_FIN_SUBPROCESO: 'FinSubProceso' ;
TOKEN_FUNCION: 'funcion';
TOKEN_FIN_FUNCION: 'finfuncion';
TOKEN_DEFINIR: 'definir';
TOKEN_COMO: 'como';
TOKEN_TIPO: 'numero' | 'numerico' | 'entero' | 'real' | 'logico' | 'caracter' | 'cadena' | 'texto' ;
TOKEN_COMANDO_ESPECIAL: 'borrar pantalla' | 'esperar x segundos' | 'esperar x milisegundos' | 'esperar tecla' ;
TOKEN_VERDADERO: 'verdadero';
TOKEN_FALSO: 'falso';
TOKEN_COMANDO_LEER: 'leer' ;
TOKEN_COMANDO_ESCRIBIR: 'escribir' ;
TOKEN_COMANDO_DIMENSION: 'dimension' ;
TOKEN_PARA: 'para';
TOKEN_FIN_PARA: 'finpara';
TOKEN_HASTA: 'hasta';
TOKEN_CON: 'con';
TOKEN_PASO: 'paso';
TOKEN_HACER: 'hacer';
TOKEN_SI: 'si';
TOKEN_FIN_SI: 'finsi';
TOKEN_ENTONCES: 'entonces';
TOKEN_SINO: 'sino';
TOKEN_SEGUN: 'segun';
TOKEN_FIN_SEGUN: 'finsegun';
TOKEN_DE: 'de';
TOKEN_OTRO: 'otro';
TOKEN_MODO: 'modo';
TOKEN_MIENTRAS: 'mientras';
TOKEN_FIN_MIENTRAS: 'finmientras';
TOKEN_REPETIR: 'repetir';
TOKEN_QUE: 'que';
TOKEN_LIMPIAR: 'limpiar';


// Operadores reservados***
TOKEN_MOD: '%' | 'mod';
TOKEN_NEG: '~' | 'no';
TOKEN_O: '|' | 'o';
TOKEN_Y: '&' | 'y';


// Operadores
TOKEN_IGUAL: '=';
TOKEN_ASIG: '<-';
TOKEN_DIF: '<>';
TOKEN_MENOR: '<';
TOKEN_MAYOR: '>';
TOKEN_MENOR_IGUAL: '<=';
TOKEN_MAYOR_IGUAL: '>=';
TOKEN_MAS: '+';
TOKEN_MENOS: '-';
TOKEN_MUL: '*';
TOKEN_DIV: '/';
TOKEN_PYC: ';';
TOKEN_DOSP: ':';
TOKEN_PAR_IZQ: '(';
TOKEN_PAR_DER: ')';
TOKEN_COR_IZQ: '[';
TOKEN_COR_DER: ']';
TOKEN_COMA: ',';
TOKEN_POT: '^';
TOKEN_COMILLAS: '"';
TOKEN_COMENTARIO: '//';


INT: [0-9]+ ;
DOUBLE: [0-9]+ '.' [0-9]+ ;
CADENA: TOKEN_COMILLAS [a-zA-Z0-9 ]* TOKEN_COMILLAS ;
ID: [a-zA-Z_][a-zA-Z0-9_]* ;
SPACE : [ \t\r\n]+ -> skip ;



test:TOKEN_INICIO_PROCESO ID instructions TOKEN_FIN_PROCESO ;
instructions: def_var varasignment_var;
asignment_var: ID TOKEN_ASIG expr TOKEN_PYC;

expr: term ((TOKEN_MAS | TOKEN_MENOS) term)* ;
term: factor ((TOKEN_MUL | TOKEN_DIV) factor)* ;
factor: INT | DOUBLE | ID | CADENA ;

/*subproceso: TOKEN_INICIO_SUBPROCESO id_subproceso comandos TOKEN_FIN_SUBPROCESO ;
id_subproceso: ID | ID TOKEN_ASIG ID TOKEN_PAR_IZQ arg (TOKEN_COMA arg)* TOKEN_PAR_DER ;
arg: INT | DOUBLE | ID;


//comandos
definicion_variables: TOKEN_DEFINIR ID (TOKEN_COMA ID)* TOKEN_COMO TOKEN_TIPO TOKEN_PYC ;

asignacion_variable: ID TOKEN_ASIG asignacion TOKEN_PYC ;
asignacion:  expresion | INT | DOUBLE | STRING;
expresion: term ((TOKEN_MAS | TOKEN_MENOS) term)* ;
term: factor ((TOKEN_MUL | TOKEN_DIV) factor)* ;
factor: INT | DOUBLE | ID | TOKEN_PAR_IZQ expresion TOKEN_PAR_DER | STRING;

comandos_especiales: TOKEN_COMANDO_ESPECIAL ID (TOKEN_COMA ID)* TOKEN_PYC ;
comando_escribir: TOKEN_COMANDO_ESCRIBIR expresion (TOKEN_COMA expresion)* TOKEN_PYC ;
comando_leer: TOKEN_COMANDO_LEER ID (TOKEN_COMA ID)* TOKEN_PYC ;
dimensionamiento_arreglo: TOKEN_COMANDO_DIMENSION ID TOKEN_COR_IZQ INT TOKEN_COR_DER TOKEN_PYC ;
*/
