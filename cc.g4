grammar cc;

// For assignment 1 task 1 (uge 3)

//////// Grammar Parser /////////////

start       : hw=name in=inputs out=outputs lat=latches de+=def* up=updates sim=siminputs end=EOF ;

name        : HW IDENT ; 

inputs      : IN IDENT+ ; 

outputs     : OUT IDENT+ ; 

latches     : LAT IDENT+ ; 

def         : 'def:' func '=' exp ; 

updates     : 'updates:' stmt+ ; 

siminputs   : 'siminputs:' stmt+ ; 

stmt
    : f=func '=' s=stmt       # AssignFunction
    | f=func '=' e1=exp		#FuncAssign
    | x=IDENT '=' e1=exp       # AssignExp
    | x=IDENT '=' f=func    # AssignIdentFunc
    | '{' s=stmt '}'          # BlockStatement
    ;

func
    : x=IDENT '(' e1=exps ')'  # FunctionCall
    | x=IDENT '(' e1=exp ')'   # SingleArgFunctionCall
    ;

exps
    : e1=exp (',' e2=exp)*        # ExpressionsList
    ;

exp
    : NOT e1=exp               	  # NotExp
    | e1=exp AND e2=exp           # AndExp
    | e1=exp OR e2=exp            # OrExp
    | e1=exp e2=exp+              # PlusExp
    | n=CONST                     # ConstExp
    | x=IDENT                     # IdentExp
    | '(' e1=exp ')'              # ParenthesizedExp
    ;

/////// TOKENS  Lexer //////////////

HW      : 'hardware:' ;
IN      : 'inputs:' ;
OUT     : 'outputs:' ;
LAT     : 'latches:' ;

NOT     : '/' ; 
AND     : '*' ;
OR      : '+' ;

CONST   : [0-9]+ ;

IDENT   : [a-zA-Z_] [a-zA-Z_0-9']* ; 

COMMENT : ('//' ~[\n]* '\n' | '/*' .*? '*/') -> skip ; // Skips comments.

WHITESPACE : [ \n\t]+ -> skip ; // Skips whitespace characters.

ANYTHING : . ; // Matches any character (used for error handling).

