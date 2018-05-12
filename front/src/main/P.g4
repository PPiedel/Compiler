grammar P;

program returns [Front.Program val] :
    { $val = new Front.Program(); }
    (';')*
    (
        (statement ';'+) { $val.statements.add($statement.val); } |
        (function ';'*) { $val.functions.add($function.val); }
    )*;

body returns [Front.Body val] :
    '{'
    ((';')* a = statement { $val = new Front.Body(); $val.add($a.val); }
        ((';')+ b = statement { $val.add($b.val); })*
    (';')+)?
    '}'
;

function returns [Front.Function val] :
    FUN name = ID
    '('
        (arg1 = ID  { $val.addArg($arg1.text); } (',' arg2 = ID { $val.addArg($arg2.text); })* )?
    ')'
    COLON returnType = (INT|FLOAT) { $val = new Front.Function($name.text,$returnType.text); }
    body { $val.setBody($body.val); }
;

statement returns [Front.Statement val] :
    a = expression {$val = new Front.StatementExpression($a.val); } |
    c = variable_declaration { $val = $c.val; } |
    d = print{{ $val = $d.val; } } |
    e = returnst{{ $val = $e.val; } } |
    f = read{{ $val = $f.val; } }
;


expression returns [Front.Expression val] :
    a = NUMBER { $val = new Front.NumberExpression($a.text); } |
    b = ID { $val = new Front.IdExpression($b.text); } |
    c = assignment { $val = $c.val; } |
    d = expression ADD e = expression { $val = new Front.AddExpression($d.val,$e.val); }

;


assignment returns [Front.Assignment val] :
    to = ID '=' what = expression { $val = new Front.Assignment($to.text, $what.val); } |
;

variable_declaration returns [Front.VariableDeclaration val] :
    INT name = ID EQUALS  value = NUMBER { $val = new Front.IntVariableDeclaration($name.text,$value.text); } |
    FLOAT name = ID EQUALS value = NUMBER_FLOAT { $val = new Front.FloatVariableDeclaration($name.text,$value.text); }
;

print returns [Front.PrintStatement val] :
    PRINT LEFT_BRACKET reference = ID RIGHT_BRACKET {$val = new Front.PrintIDStatement($reference.text);}
;

returnst returns [Front.ReturnStatement val] :
    RETURN NUMBER {$val = new Front.ReturnInt($NUMBER.text);} |
    RETURN NUMBER_FLOAT {$val = new Front.ReturnFloat($NUMBER_FLOAT.text);}
;

read returns [Front.Read val] :
    READ_INT LEFT_BRACKET reference = ID RIGHT_BRACKET {$val = new Front.ReadInt($reference.text);} |
    READ_FLOAT LEFT_BRACKET reference = ID RIGHT_BRACKET {$val = new Front.ReadFloat($reference.text);} |
;


COMMENT
    :   ( '//' ~[\r\n]* '\r'? '\n' | '/*' .*? '*/') -> skip
    ;

NUMBER : DIGIT+ ;

NUMBER_FLOAT
     :   DIGIT+'.'DIGIT*
     |   '.'DIGIT+
     ;

fragment DIGIT : '0'..'9';

INT : 'int'
;

FLOAT : 'float'
;

PRINT : 'print'
;

READ_INT : 'readInt'
;

READ_FLOAT : 'readFloat'
;

FUN : 'fun'
;

RETURN : 'return'
;

ID : [a-zA-Z] [a-zA-Z0-9]*
;

EQUALS : '='
;

COLON : ':'
;

ADD : '+'
;

MINUS : '-'
;

MUTLIPLY : '*'
;

DIVIDE : '/'
;

LEFT_BRACKET : '('
;

RIGHT_BRACKET : ')'
;

WS : (' '|'\r'|'\n') -> skip
;