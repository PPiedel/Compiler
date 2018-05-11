grammar P;

program returns [Front.Program val] :
    { $val = new Front.Program(); } (';')* ((statement ';'+) { $val.statements.add($statement.val); })*;

body returns [Front.Body val] :
    '{'
    ((';')* a = statement { $val = new Front.Body(); $val.add($a.val); }
        ((';')+ b = statement { $val.add($b.val); })*
    (';')+)?
    '}'
;

statement returns [Front.Statement val] :
    a = expression {$val = new Front.StatementExpression($a.val); } |
    c = variable_declaration { $val = $c.val; }
;


expression returns [Front.Expression val] :
    a = NUMBER { $val = new Front.IntExpression($a.text); } |
    d = assignment { $val = $d.val; }
;


assignment returns [Front.Assignment val] :
    to = ID '=' what = expression { $val = new Front.Assignment($to.text, $what.val); }
;

variable_declaration returns [Front.VariableDeclaration val] :
    INT name = ID EQUALS  value = NUMBER { $val = new Front.IntVariableDeclaration($name.text,$value.text); } |
    FLOAT name = ID EQUALS value = NUMBER { $val = new Front.FloatVariableDeclaration($name.text,$value.text); }
;


COMMENT
    :   ( '//' ~[\r\n]* '\r'? '\n'
        | '/*' .*? '*/'
        ) -> skip
    ;

NUMBER : '0'..'9'+ ;
INT : 'int';
FLOAT : 'float';
ID  : 'a'..'z'+ ;
EQUALS : '=';
WS : (' '|'\r'|'\n') -> skip;
