grammar P;

program returns [IRGenerator.Program val] :
    { $val = new IRGenerator.Program(); } (';')* ((statement ';'+) { $val.statements.add($statement.val); })*;

body returns [IRGenerator.Body val] :
    '{'
    ((';')* a = statement { $val = new IRGenerator.Body(); $val.add($a.val); }
        ((';')+ b = statement { $val.add($b.val); })*
    (';')+)?
    '}'
;

statement returns [IRGenerator.Statement val] :
    a = expression {$val = new IRGenerator.StatementExpression($a.val); } |
    c = variable_declaration { $val = $c.val; }
;


expression returns [IRGenerator.Expression val] :
    a = NUMBER { $val = new IRGenerator.IntExpression($a.text); } |
    d = assignment { $val = $d.val; }
;


assignment returns [IRGenerator.Assignment val] :
    to = ID '=' what = expression { $val = new IRGenerator.Assignment($to.text, $what.val); }
;

variable_declaration returns [IRGenerator.VariableDeclaration val] :
    'int' name = ID { $val = new IRGenerator.IntVariableDeclaration($name.text); } |
    'float' name = ID { $val = new IRGenerator.FloatVariableDeclaration($name.text); }
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
WS : (' '|'\r'|'\n') -> skip;
