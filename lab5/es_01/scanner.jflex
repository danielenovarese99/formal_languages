import java.io.*;
import java_cup.runtime.*;

%%
%class Yylex
%cup
%line
%column
digit = [0-9]
letter = [a-z]
letter2 = [A-Z]
num = ("+"|"-")? (( [1-9][0-9]* "." [0-9]* ) | [1-9][0-9]* )

nl = \r|\n|\r\n|\t|\s
%%

{nl} {}

\; {System.out.println(yytext() + ""); return new Symbol(sym.SC);} 
\, {System.out.println(yytext() + "");return new Symbol(sym.C,yyline,yycolumn);}
\. {System.out.println(yytext() + "");return new Symbol(sym.DOT,yyline,yycolumn);}
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
\*  {System.out.println(yytext() + "");return new Symbol(sym.STAR,yyline,yycolumn);}
\/ {System.out.println(yytext() + "");return new Symbol(sym.DIVIDED,yyline,yycolumn);}
\= {System.out.println(yytext() + "");return new Symbol(sym.EQ,yyline,yycolumn);}
{num} {System.out.println(yytext() + "");return new Symbol(sym.NUM,yyline,yycolumn,new Double(Double.parseDouble(yytext())));}
{letter} {System.out.println(yytext() + "");return new Symbol(sym.SCALARVAR,yyline,yycolumn,new String(yytext()));}
{letter2} {System.out.println(yytext() + "");return new Symbol(sym.VECTORVAR,yyline,yycolumn,new String(yytext()));}
\? {System.out.println(yytext() + ""); return new Symbol(sym.QM);}
. {System.out.println("Error on " + yytext());}