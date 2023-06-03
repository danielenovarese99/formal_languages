import java.io.*;
import java_cup.runtime.*;

%%
%class Yylex
%cup
%line
%column
digit = [0-9]
num = ("+"|"-")? (( [1-9][0-9]* "." [0-9]* ) | [1-9][0-9]* | [0]("." [0-9])* )
comment = ("/*" ~ "*/" )|(\/\/.*)
//function = print;
variable_name = [_A-Za-z][_A-Za-z0-9]*
nl = \r|\n|\r\n|\t|\s
%%

{nl} {}
{comment} {System.out.println(" " + yytext());}

if {return new Symbol(sym.IF,yyline,yycolumn);} //System.out.print(yytext() + "");
while {return new Symbol(sym.WHILE,yyline,yycolumn);} // System.out.print(yytext() + "");
double {return new Symbol(sym.DOUBLE_TYPE,yyline,yycolumn,new String(yytext()));}
int {return new Symbol(sym.INT_TYPE,yyline,yycolumn,new String(yytext()));}
print {return new Symbol(sym.PRINTFUNC,yyline,yycolumn);}
\; { return new Symbol(sym.SC);} 
\, {return new Symbol(sym.C,yyline,yycolumn);}
\. {return new Symbol(sym.DOT,yyline,yycolumn);}
\[ {return new Symbol(sym.OSBRACKET,yyline,yycolumn);}
\] {return new Symbol(sym.CSBRACKET,yyline,yycolumn);}
\( {return new Symbol(sym.OBRACKET,yyline,yycolumn);}
\) {return new Symbol(sym.CBRACKET,yyline,yycolumn);}
\{ {return new Symbol(sym.OGBRACKET,yyline,yycolumn);}
\} {return new Symbol(sym.SGBRACKET,yyline,yycolumn);}
\= {return new Symbol(sym.EQ,yyline,yycolumn);}
\> {return new Symbol(sym.BIGGER,yyline,yycolumn);}
\< {return new Symbol(sym.SMALLER,yyline,yycolumn);}
\- {return new Symbol(sym.MINUS,yyline,yycolumn);}
\+ {return new Symbol(sym.PLUS,yyline,yycolumn);}
\*  {return new Symbol(sym.STAR,yyline,yycolumn);}
\/ {return new Symbol(sym.DIVIDED,yyline,yycolumn);}
\? { return new Symbol(sym.QM);}
{num} {return new Symbol(sym.NUM,yyline,yycolumn,new Double(Double.parseDouble(yytext())));} // 
{variable_name} {return new Symbol(sym.ID, yyline, yycolumn,new String(yytext()));}
//{loop} {System.out.println(yytext()+ "");return new Symbol(sym.LOOP,yyline,yycolumn);}

. {System.out.println("Error on " + yytext());}