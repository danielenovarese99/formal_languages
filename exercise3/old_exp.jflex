%%

%standalone
%class FileReader
// definitions


/*
1) recognize all C syntax members
2) output to HTML file with 
    h2 >>> filename
    different font color for each element
*/

define = (#include)(\<)(letter)*(\.)(letter)*(\>)(\n)
expression = {variable}([\+\>\<\/\*\-]|[\=]{1,2})({variable}|{number})
variable_type = (int | float | double | char)
variable_init = ({variable_type})[ ]*({variable})[ ]*((\=)[ ]*({number}))?(\;)
variable =  ([_]?({letter})*) /// variable is reading {} as a variable >> this is due to the [^]
// find a way to read everything but if / for / else / return ... and also exclude all symbols
// removed from variable >> [^(if|for|else|\)]3
construct = (if|for|else)({emptyspace}*)(\(({expression})\))({emptyspace}*)
number = ({digit})*
comment = (\/\*)({letter} | {emptyspace})*(\*\/)
curly_bracket_open = [\{]
curly_bracket_close = [\}]
// default stuff
letter = [^\.\\\/\*\?\"\>\<\|\+:\(\)\-\=\{\}]
emptyspace = [\n|\r|\n\r|\"\"\t ]*
digit = [0-9]
returnStatement = [return]({emptyspace})*({variable})

/// TODO fix letter actually reading { }

%%
// rules
{letter} {System.out.println("letter >>> " + yytext());}

{variable} {System.out.println("Variable > " + yytext());}
{expression} {System.out.println("Expression >> " + yytext());}
{construct} {System.out.println("Construct >> " + yytext());}
{emptyspace} {System.out.println("Empty string found");}
{curly_bracket_open} {System.out.println("Curly bracket open >>> " + yytext());}
{curly_bracket_close} {System.out.println("Curly bracket close >>> " + yytext());}

/*
{number} {System.out.println("Number > " + yytext());}
//{variable} {System.out.println("Variable > " + yytext());}
{variable_init} {System.out.println("Variable init >>> " + yytext());}
{construct} {System.out.println("Construct >> " + yytext());}
{comment} {System.out.println("Comment >>> " + yytext());}


*/

