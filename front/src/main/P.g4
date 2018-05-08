grammar P;

program returns [Compiler.Program val] :
    { $val = new Compiler.Program(); } (';')* ((statement ';'+) { $val.statements.add($statement.val); })*;

body returns [Compiler.Body val] :
    '{'
    ((';')* a = statement { $val = new Compiler.Body(); $val.add($a.val); }
        ((';')+ b = statement { $val.add($b.val); })*
    (';')+)?
    '}'
;

statement returns [Compiler.Statement val] :
    a = expression {$val = new Compiler.StatementExpression($a.val); } |
    c = variable_definition { $val = $c.val; }
;


expression returns [Compiler.Expression val] :
    a = NUMBER { $val = new Compiler.IntExpression($a.text); } |
    d = assignment { $val = $d.val; }
;


assignment returns [Compiler.Assignment val] :
    to = ID '=' what = expression { $val = new Compiler.Assignment($to.text, $what.val); }
;

variable_definition returns [Compiler.VariableDefinition val] :
    'int' name = ID { $val = new Compiler.IntVariableDefinition($name.text); } |
    'float' name = ID { $val = new Compiler.FloatVariableDefinition($name.text); }
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
