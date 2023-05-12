import java_cup.runtime.*;

%%
%class Yylex
%cup
%line
%column
digit = [0-9]
letter = [a-zA-Z]
comment = ("/*" ~ "*/" )|(\/\/.*)
double_n = ("+"|"-")? ( [1-9][0-9]* "." [0-9]* ) | ( "." [0-9]+ ) | ( 0 "." [0-9]* )
int_n = ("+"|"-")? [0-9]+

include = #inclue.*
nl = \r|\n|\r\n|\t|\s
variable_name = [_A-Za-z][_A-Za-z0-9]*
keyword = while | if | for
%%

{include} {}
{comment} {}
{nl} {}

double {System.out.println(yytext() + "");return new Symbol(sym.DOUBLE_TYPE,yyline,yycolumn);}
int {System.out.println(yytext() + "");return new Symbol(sym.INT_TYPE,yyline,yycolumn);}
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
{double_n} {System.out.println(yytext() + "");return new Symbol(sym.DOUBLE,yyline,yycolumn);}
{int_n} {System.out.println(yytext() + "");return new Symbol(sym.INT,yyline,yycolumn);}
{keyword} {System.out.print(yytext() + " ");return new Symbol(sym.COND,yyline,yycolumn);}
print {return new Symbol(sym.PRINTFUNC,yyline,yycolumn);}
{variable_name} {System.out.println(yytext() + "");return new Symbol(sym.ID);}
. {System.out.println("Error on " + yytext());}