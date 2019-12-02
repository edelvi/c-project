grammar CLang;

// Parser rules

program : include* definition+;

//Includes
include :   INCLUDE '"' (ID | PATH) '"'
        |   INCLUDE '<' PATH '>'
        ;

definition  :   functionDefinition
            |   functionDeclaration
            |   declaration //ya
            ;

//Cambiado, porque cuando se tuviera tipo var1, tipo var2 = exp1, no iba a poder saber a quien pertenece exp1
// de la forma en que estaba
//var with type ()

declaration : TYPE  (variableWithExpDeclaration|variableWithoutExpDeclaration)(',' (variableWithoutExpDeclaration|variableWithExpDeclaration))* ';' #VarDeclaration // int a, d= c++
            |   TYPE ID '[' expression ']' (',' ID '[' expression ']')* ';'  #ArrayDeclaration// int a[], b[] ya
            ;
variableWithExpDeclaration: ID  '=' expression  ; //ya

variableWithoutExpDeclaration: ID ; //ya

functionDeclaration : (TYPE | 'void') ID '(' (parameterList | typeList)? ')' ';'; // int max(int a, int b); o int f(int, double);

functionDefinition  : (TYPE | 'void') ID '(' parameterList? ')' '{' statement* '}'; // int max(int a, int b){ return a>b?a:b;}

parameterList : parameterDeclaration ( ',' parameterDeclaration)*; // int a, int b

parameterDeclaration : TYPE ID ; // int a

typeList : TYPE ( ',' TYPE)*; //int, double

statement :     compoundStatement
            |   expression ';'
            |   declaration
			|   ifStatement
			|   whileStatement
			|   forStatement
			|   returnStatement ';'
			|   breakStatement ';'
			|   printfStatement ';'
			|   scanfStatement ';'
			;

compoundStatement :     '{' '}'
                    |   '{' statement+ '}'
                    |   '{' declaration+'}'
                    |   '{' declaration+ statement+ '}'
                    ;

returnStatement :   'return' expression?;

breakStatement  :   BREAK | CONTINUE;


printfStatement :   PRINTF '(' expression ')';

formatString    :    FORMAT_STR;

scanfStatement:   SCANF ('(' formatString',' argumentScanf ')') ;

argumentScanf:  '&'?ID(',''&'?ID)*;



expressionList : expression ( ',' expression)* ;

// Cambiado para que reconozca los arreglos
expression :    '(' expression ')'                              #ExprParenthesis
            |   functionCall                                    #ExprFunctionCall
            |   assignmentExpression                            #ExprAssignment
            |   arrayIndexExpression                            #ExprArrayIndex
            |   expression op=('*'|'/'|'%') expression          #ExprMulDivMod
            |   expression op=('+'|'-') expression              #ExprAddSub
            |   expression op=('>'|'>='|'<'|'<=') expression    #ExprRel
            |   expression op=('=='|'!=')  expression           #ExprEq
            |   expression '&&' expression                      #ExprAnd
            |   expression '||' expression                      #ExprOr
            |   unaryOperator ID                                #ExprUnaryOp
            |   ID unaryOperator                                #ExprUnaryOp
            |   CONSTANT                                        #ExprCnt
            |   ID                                              #ExprId
            ;

functionCall : ID '(' (expression ( ',' expression)*)? ')' ;

assignmentExpression : unaryExpression assignmentOperator expression ; //ya

unaryExpression : ID | arrayIndexExpression; //ya

arrayIndexExpression:  ID '[' expression ']'  ; //ya

assignmentOperator: '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '&=' | '^=' | '|=' ;

conditionalExpression : expression
            |   expression '?' expression ':' conditionalExpression;

ifStatement : IF '(' expression ')' (';' | statement) (ELSE (';' | statement ))?;

whileStatement : WHILE '(' expression ')' (';' | statement) ;

forStatement : FOR '(' expressionList? ';' expression? ';' expression? ')' (';' | statement) ;

unaryOperator : '+' | '-' | '++' | '--' | '~' | '!' ;


// Scanner rules
WHILE : 'while';
IF : 'if';
ELSE : 'else';
FOR : 'for';
CONST : 'const';
PRINTF : 'printf';
SCANF   :  'scanf';


// Add char* type declarations

//Rules for printf and scanf format
FORMAT_STR: '"' STR_OUT? SPECIF+ STR_OUT?'"'
         |  '"' STR_OUT? SPECIF_FLAGS+ STR_OUT? '"'
         |  '"' STR_OUT? SPECIF_FLAGS_WIDTH+ STR_OUT? '"'
         |  '"' STR_OUT? SPECIF_FLAGS_WIDTH_PRECI+ STR_OUT? '"'
         |  '"' STR_OUT? SPECIF_FLAGS_WIDTH_PRECI_LEN+ STR_OUT? '"'
         ;


//PC ( (SIGN | WS | NU | Z)? (INT_CONSTANT | AS)? ('.'(INT_CONSTANT | AS))? LEN? ) SPEC;

SPECIF:   PC SPEC ;
SPECIF_FLAGS: PC FLAGS? SPEC;
SPECIF_FLAGS_WIDTH: PC FLAGS? WIDTH? SPEC;
SPECIF_FLAGS_WIDTH_PRECI: PC FLAGS? WIDTH? PRECI? SPEC;
SPECIF_FLAGS_WIDTH_PRECI_LEN: PC FLAGS? WIDTH? PRECI? LEN? SPEC;


CONSTANT :      INT_CONSTANT
            |   CHAR_CONSTANT
            |   FLOAT_CONSTANT
            |   STRING_LITERAL
            ;

INT_CONSTANT :  OCT_CONSTANT
             |  HEX_CONSTANT
             |  DEC_CONSTANT
             ;

CHAR_CONSTANT : '\'' '\\'?.  '\'';


//TODO11
STRING_LITERAL : '"' (ESC | .)*? '"';

FLOAT_CONSTANT : SIGN? ((DIGITS '.') | ('.' FRAC_PART) | (DIGITS '.' FRAC_PART) | (FLOAT_WITH_E)) FLOAT_SUFFIX?;

TYPE : SHORT | INT | LONG | FLOAT | DOUBLE | CHAR;

INCLUDE : '#include';

//NEW

FLAGS:  SIGN
     | NU
     | Z
     ;

WIDTH:  INT_CONSTANT
     |  AS
     ;

PRECI:  '.'WIDTH;

//Data types
INT : 'int';
FLOAT : 'float';
VOID : 'void';
DOUBLE : 'double';
CHAR : 'char';
SHORT : 'short';
LONG : 'long';

//Jump statements
BREAK : 'break';
CONTINUE : 'continue';

INC_OPERATOR : '++';
DEC_OPERATOR : '--';

ID :    LETTER LET_DIGIT*;

PATH : ID '.' ID;

fragment
PC  :   '%';

fragment
NU: '#';

fragment
AS: '*';

fragment
Z:  '0';
fragment
LEN:    'h' | 'l' | 'L';

fragment
SPEC:    'c' | 'd' | 'i' | 'e' | 'E' | 'f' | 'g' | 'G' | 'o' | 's' | 'u' | 'x' | 'X' | 'p' | 'n' | PC;

fragment
O_WS: ' '  ;

fragment
ESC: '\\"' | '\\\\' | '\\' [btnr"\\]; //\b \t \n

fragment
EXTENSION : '.' ID;

fragment
FRAC_PART : DIGITS+ | (DIGITS+ [eE] SIGN? DIGITS+);

fragment
FLOAT_WITH_E : DIGITS+ [eE] SIGN? DIGITS+;

fragment
OCT_CONSTANT : '0' ('0'..'7')+;

fragment
HEX_CONSTANT : ('0x' | '0X') HEX_DIGIT+;

fragment
DEC_CONSTANT : DIGITS;

fragment
SIGN : '+' | '-';

fragment
FLOAT_SUFFIX: [fFlL];

fragment
COMMENT : LINE_COMMENT | MULTILINE_COMMENT;

fragment
DIGIT  :    [0-9];

fragment
DIGITS : DIGIT+;

fragment
HEX_DIGIT : ([A-F]|[a-f]|DIGIT)+;

fragment
LETTER : [a-zA-Z];

fragment
LET_DIGIT : DIGIT | LETTER;

fragment
STR_OUT:   (ESC | .)*? ;




LINE_COMMENT : '//' .*? (('\r'? '\n') | EOF )  -> skip;

MULTILINE_COMMENT : '/*' .*? '*/' -> skip;

WS : (
        ' ' |
        '\t'|
        '\r'|
        '\n'
     ) -> skip;



