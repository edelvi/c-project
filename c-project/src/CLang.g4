grammar CLang;

// Parser rules

program : include* definition+;

//Includes
include :   INCLUDE '"' (ID | PATH) '"'
        |   INCLUDE '<' PATH '>'
        ;

definition  :   functionDefinition
            |   functionDeclaration
            |   declaration
            ;

declaration :   TYPE (varWithExpDeclaration | varWithoutExpDeclaration) (',' (varWithoutExpDeclaration |varWithExpDeclaration))* ';'        #VarDeclaration

            |   TYPE ID '[' expression ']' (',' ID '[' expression ']')* ';'                                                                 #ArrayDeclaration
            ;

varWithExpDeclaration:   ID  '=' expression ;

varWithoutExpDeclaration:     ID ;



functionDeclaration : (TYPE | 'void') ID '(' (parameterList | typeList)? ')' ';'; // int max(int a, int b); o int f(int, double);

functionDefinition  : (TYPE | 'void') ID '(' parameterList? ')' '{' statementCombination '}'; // int max(int a, int b){ return a>b?a:b;}

parameterList : parameterDeclaration ( ',' parameterDeclaration)*; // int a, int b

parameterDeclaration : TYPE ID ; // int a

typeList : TYPE ( ',' TYPE)*; //int, double

statementCombination: statement*;

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
                    |   '{' statementCombination '}'
                    |   '{' declarCombination'}'
                    |   '{' declarCombination statementCombination '}'
                    ;
declarCombination: declaration+ ;

returnStatement :   'return' expression?;

breakStatement  :   BREAK | CONTINUE;


printfStatement :   PRINTF '('  expression  ')';

scanfStatement:   SCANF '(' argumentScanf ')' ;

argumentScanf:  '&'?ID(',''&'?ID)*;

//Firs printf
/* printfStatement :   PRINTF '(' format ')';

   format: formatString ',' argumentsList
           |  commonStr
           ;


   formatString    :    FORMAT_STR;

   argumentsList:  argument (','argument)*;

   argument   :  CONSTANT
              | ID
              ;

   commonStr: COMMON_STR ;

   scanfStatement:   SCANF ('(' formatString',' argumentScanf ')') ;

   argumentScanf:  '&'?ID(',''&'?ID)*;
*/
expressionList : expression ( ',' expression)* ;

expression :    '(' expression ')'                                         #ExprParenthesis
            |   functionCall                                               #ExprFunctionCall

            |   arrayIndexExpression                                       #ExprArrayIndex
            |   left=expression op=('*'|'/'|'%') right=expression          #ExprArit
            |   left=expression op=('+'|'-') right=expression              #ExprArit
            |   left=expression op=('>'|'>='|'<'|'<=') right=expression    #ExprRel
            |   left=expression op=('=='|'!=')  right=expression           #ExprRel
            |   expression '&&' expression                                 #ExprAnd
            |   expression '||' expression                                 #ExprOr
            |   unaryOperator=('+'|'-'|'++'|'--'|'~'|'!') ID               #ExprUnaryOpPost
            |   ID unaryOperator=('++'|'--')                               #ExprUnaryOpPre
            |   constant                                                   #ExprCnt
            |   ID                                                         #ExprId
            |   assignmentExpression                                       #ExprAssignment
            ;

constant    :  INT_CONSTANT                                                #IntCnt
            |  CHAR_CONSTANT                                               #CharCnt
            |  FLOAT_CONSTANT                                              #FloatCnt
            |  STRING_LITERAL                                              #StrLCnt
            ;


functionCall : ID '(' expressionList? ')' ;

assignmentExpression : unaryExpression assignmentOperator expression;

unaryExpression : ID | arrayIndexExpression;
arrayIndexExpression:  ID '[' expression ']'  ;

assignmentOperator: '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '&=' | '^=' | '|=' |;

conditionalExpression : expression
            |   expression '?' expression ':' conditionalExpression;

ifStatement : IF '(' expression ')' (';' | statement) (ELSE (';' | statement ))?;

whileStatement : WHILE '(' expression ')' (';' | statement) ;

forStatement : FOR '(' expressionList? ';' condExpression? ';' iterExpression? ')' (';' | statement) ;

condExpression: expression;
iterExpression: expression;


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
/*FORMAT_STR: '"' STR_OUT? SPECIF+ STR_OUT?'"'
         |  '"' STR_OUT? SPECIF_FLAGS+ STR_OUT? '"'
         |  '"' STR_OUT? SPECIF_FLAGS_WIDTH+ STR_OUT? '"'
         |  '"' STR_OUT? SPECIF_FLAGS_WIDTH_PRECI+ STR_OUT? '"'
         |  '"' STR_OUT? SPECIF_FLAGS_WIDTH_PRECI_LEN+ STR_OUT? '"'
         ;

*/
//PC ( (SIGN | WS | NU | Z)? (INT_CONSTANT | AS)? ('.'(INT_CONSTANT | AS))? LEN? ) SPEC;
/*
SPECIF:   PC SPEC ;
SPECIF_FLAGS: PC FLAGS? SPEC;
SPECIF_FLAGS_WIDTH: PC FLAGS? WIDTH? SPEC;
SPECIF_FLAGS_WIDTH_PRECI: PC FLAGS? WIDTH? PRECI? SPEC;
SPECIF_FLAGS_WIDTH_PRECI_LEN: PC FLAGS? WIDTH? PRECI? LEN? SPEC;
*/
//COMMON_STR: '"' STR_OUT '"';


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
//new fragment added to the var declaration


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



