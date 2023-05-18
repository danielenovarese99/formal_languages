import java_cup.runtime.*;

%%
%class Yylex
%cup
%line
%column
digit = [0-9]
letter = [a-zA-Z]
comment = ("/*" ~ "*/" )|(\/\/.*)
variable = ([A-Z] | \_)[_a-zA-Z0-9]*
atom = (([a-z][_a-zA-Z0-9]*) | ([\-]?[0-9][1-9]*))
nl = \r|\n|\r\n|\t|\s
%%

{comment} {System.out.println("Comment > " + yytext());}
{nl} {}
{atom} {System.out.println(yytext() + "");return new Symbol(sym.ATOM,yyline,yycolumn);}
{variable} {System.out.println(yytext() + "");return new Symbol(sym.VARIABLE,yyline,yycolumn);}
\; {System.out.println(yytext() + ""); return new Symbol(sym.SC);} 
\, {System.out.println(yytext() + "");return new Symbol(sym.C,yyline,yycolumn);}
\[ {System.out.println(yytext() + "");return new Symbol(sym.OSBRACKET,yyline,yycolumn);}
\] {System.out.println(yytext() + "");return new Symbol(sym.CSBRACKET,yyline,yycolumn);}
\( {System.out.println(yytext() + "");return new Symbol(sym.OBRACKET,yyline,yycolumn);}
\) {System.out.println(yytext() + "");return new Symbol(sym.CBRACKET,yyline,yycolumn);}
\{ {System.out.println(yytext() + "");}//return new Symbol(sym.OGBRACKET,yyline,yycolumn);
\} {System.out.println(yytext() + "");}//return new Symbol(sym.SGBRACKET,yyline,yycolumn);
\= {System.out.println(yytext() + "");return new Symbol(sym.EQ,yyline,yycolumn);}
\> {System.out.println(yytext() + "");return new Symbol(sym.BIGGER,yyline,yycolumn);}
\< {System.out.println(yytext() + "");return new Symbol(sym.SMALLER,yyline,yycolumn);}
\- {System.out.println(yytext() + "");return new Symbol(sym.MINUS,yyline,yycolumn);}
\+ {System.out.println(yytext() + "");return new Symbol(sym.PLUS,yyline,yycolumn);}
\*  {return new Symbol(sym.STAR,yyline,yycolumn);}
\/ {return new Symbol(sym.DIVIDED,yyline,yycolumn);}
\. {return new Symbol(sym.DOT,yyline,yycolumn);}
\: {return new Symbol(sym.DOUBLEDOT,yyline,yycolumn);}
"?" {System.out.println(yytext() + "");return new Symbol(sym.QUESTION,yyline,yycolumn);}
. {System.out.println("Error on " + yytext());}