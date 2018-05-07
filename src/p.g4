grammar p;
variable : INT ID EQUATION NUMBER;
INT : 'int';
ID : ('a'..'z'|'A'..'Z'|'0'..'9'|'_')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
EQUATION : '=';
NUMBER : ('0'..'9')+;