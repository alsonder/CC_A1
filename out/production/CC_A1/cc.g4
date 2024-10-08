grammar cc;

// For assignment 1 task 1 (uge 3)

//////// Grammar Parser /////////////

start       : name inputs outputs latches def* updates siminputs EOF ;

name        : HW IDENT ; 

inputs      : IN IDENT+ ; 

outputs     : OUT IDENT+ ; 

latches     : LAT IDENT+ ; 

def         : 'def:' func '=' exp ; 

updates     : 'updates:' stmt+ ; 

siminputs   : 'siminputs:' stmt+ ; 

stmt
    : f=func '=' stmt       # AssignFunction
    | x=IDENT '=' exp       # AssignExp
    | x=IDENT '=' f=func    # AssignIdentFunc
    | '{' stmt '}'          # BlockStatement
    ;

func
    : x=IDENT '(' exps ')'  # FunctionCall
    | x=IDENT '(' exp ')'   # SingleArgFunctionCall
    ;

exps
    : exp (',' exp)*        # ExpressionsList
    ;

exp
    : NOT exp               # NotExp
    | exp AND exp           # AndExp
    | exp OR exp            # OrExp
    | exp exp+              # PlusExp
    | CONST                 # ConstExp
    | IDENT                 # IdentExp
    | '(' exp ')'           # ParenthesizedExp
    ;

/////// TOKENS  Lexer //////////////

HW      : 'hardware:' ;
IN      : 'inputs:' ;
OUT     : 'outputs:' ;
LAT     : 'latches:' ;

IF      : 'if' ; 
ELSE    : 'else' ; 

NOT     : '/' ; 
AND     : '*' ;
OR      : '+' ;

CONST   : [0-9]+ ;

IDENT   : [a-zA-Z_] [a-zA-Z_0-9']* ; 

COMMENT : ('//' ~[\n]* '\n' | '/*' .*? '*/') -> skip ; // Skips comments.

WHITESPACE : [ \n\t]+ -> skip ; // Skips whitespace characters.

ANYTHING : . ; // Matches any character (used for error handling).

