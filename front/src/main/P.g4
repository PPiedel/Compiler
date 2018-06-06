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
    f = read {{ $val = $f.val; } }
;


expression returns [Front.Expression val] :
    a = NUMBER { $val = new Front.NumberExpression($a.text); } |
    b = ID { $val = new Front.IdExpression($b.text); } |
    c = assignment { $val = $c.val; } |
    d = expression ADD e = expression { $val = new Front.AddExpression($d.val,$e.val); } |
    f = expression MINUS g = expression { $val = new Front.MinusExpression($f.val,$g.val); } |
    h = expression MUTLIPLY i = expression { $val = new Front.MultiplyExpression($h.val,$i.val); } |
    j = expression DIVIDE k = expression { $val = new Front.DivideExpression($j.val,$k.val); } |
    l = indexingExpression { $val = $l.val; }
;

indexingExpression returns [Front.IndexingExpression val]
    : name = ID LEFT_SQUARE_BRACKET index = NUMBER RIGHT_SQUARE_BRACKET EQUALS value = NUMBER { $val = new Front.IndexingExpression($name.text,$index.text,$value.text); }
    ;


assignment returns [Front.Assignment val] :
    to = ID '=' what = expression { $val = new Front.Assignment($to.text, $what.val); } |
;

variable_declaration returns [Front.VariableDeclaration val] :
    INT name = ID EQUALS  value = NUMBER { $val = new Front.IntVariableDeclaration($name.text,$value.text); } |
    FLOAT name = ID EQUALS value = NUMBER_FLOAT { $val = new Front.FloatVariableDeclaration($name.text,$value.text); } |
    STRING name = ID  EQUALS value = STRING_LITERAL { $val = new Front.StringVariableDeclaration($name.text,$value.text); } |
    f = array {{ $val = $f.val; } } |
    STATIC INT name = ID EQUALS  value = NUMBER { $val = new Front.StaticIntVariableDeclaration($name.text,$value.text); }
;

array returns [Front.Array val] :
    INT LEFT_SQUARE_BRACKET RIGHT_SQUARE_BRACKET name = ID EQUALS NEW INT LEFT_SQUARE_BRACKET size = NUMBER  RIGHT_SQUARE_BRACKET {$val = new Front.ArrayInt($name.text, $size.text);} |
    FLOAT LEFT_SQUARE_BRACKET RIGHT_SQUARE_BRACKET name = ID EQUALS NEW FLOAT LEFT_SQUARE_BRACKET size = NUMBER  RIGHT_SQUARE_BRACKET {$val = new Front.ArrayFloat($name.text, $size.text);}
;

print returns [Front.PrintStatement val] :
    PRINT LEFT_BRACKET reference = ID RIGHT_BRACKET {$val = new Front.PrintIDStatement($reference.text);} |
    PRINT LEFT_BRACKET reference = ID LEFT_SQUARE_BRACKET index = NUMBER RIGHT_SQUARE_BRACKET RIGHT_BRACKET {$val = new Front.PrintIndex($reference.text,$index.text);}
;

returnst returns [Front.ReturnStatement val] :
    RETURN NUMBER {$val = new Front.ReturnInt($NUMBER.text);} |
    RETURN NUMBER_FLOAT {$val = new Front.ReturnFloat($NUMBER_FLOAT.text);}
;

read returns [Front.Read val] :
    READ_INT LEFT_BRACKET reference = ID RIGHT_BRACKET {$val = new Front.ReadInt($reference.text);} |
    READ_FLOAT LEFT_BRACKET reference = ID RIGHT_BRACKET {$val = new Front.ReadFloat($reference.text);} |
;

NEW : 'new'
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

STATIC : 'static'
;

STRING : 'String'
;

STRING_LITERAL
	:	'"'StringCharacters?'"'
	;

fragment
StringCharacters
	:	StringCharacter+
	;

fragment
StringCharacter
	:~["\\\r\n]
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

DOUBLE_QUOTE : '"'
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

LEFT_SQUARE_BRACKET : '['
;

RIGHT_SQUARE_BRACKET : ']'
;

WS
: (' '|'\r'|'\n') -> skip
;

COMMENT
:   ( '//' ~[\r\n]* '\r'? '\n' | '/*' .*? '*/') -> skip
;