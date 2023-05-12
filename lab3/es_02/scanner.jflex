import java_cup.runtime.*;

%%
// definitions
%class Yylex
%cup
%line
%column
digit = [0-9]
letter = [a-zA-Z]
nl = \r|\n|\r\n|\t|\s
keywords = LI | LS | AV | BO | SO
%%
// productions
{nl} {}
{letter} {System.out.println("" + yytext());return new Symbol(sym.LETTER, yyline,yycolumn);}
{digit} {System.out.println("" + yytext());return new Symbol(sym.DIGIT, yyline,yycolumn);}
\" {System.out.println("" + yytext());return new Symbol(sym.QUOTE, yyline,yycolumn);}
\: {System.out.println("" + yytext());return new Symbol(sym.HC, yyline,yycolumn);}
\% {System.out.println("" + yytext());return new Symbol(sym.DIVIDER, yyline,yycolumn);}
\; {System.out.println(yytext() + ""); return new Symbol(sym.SC);} 
\, {System.out.println(yytext() + "");return new Symbol(sym.C,yyline,yycolumn);}
\[ {System.out.println(yytext() + "");return new Symbol(sym.OSBRACKET,yyline,yycolumn);}
\] {System.out.println(yytext() + "");return new Symbol(sym.CSBRACKET,yyline,yycolumn);}
\( {System.out.println(yytext() + "");return new Symbol(sym.OBRACKET,yyline,yycolumn);}
\) {System.out.println(yytext() + "");return new Symbol(sym.CBRACKET,yyline,yycolumn);}
\{ {System.out.println(yytext() + "");return new Symbol(sym.OGBRACKET,yyline,yycolumn);}//
\} {System.out.println(yytext() + "");return new Symbol(sym.SGBRACKET,yyline,yycolumn);}//
\= {System.out.println(yytext() + "");return new Symbol(sym.EQ,yyline,yycolumn);}
\> {System.out.println(yytext() + "");return new Symbol(sym.BIGGER,yyline,yycolumn);}
\< {System.out.println(yytext() + "");return new Symbol(sym.SMALLER,yyline,yycolumn);}
\- {System.out.println(yytext() + "");return new Symbol(sym.MINUS,yyline,yycolumn);}
\+ {System.out.println(yytext() + "");return new Symbol(sym.PLUS,yyline,yycolumn);}
\* {return new Symbol(sym.STAR,yyline,yycolumn);}
\/ {return new Symbol(sym.DIVIDED,yyline,yycolumn);}
\. {return new Symbol(sym.DOT,yyline,yycolumn);}
{keywords} {System.out.println(yytext() + "");return new Symbol(sym.KEYWORDS,yyline,yycolumn);}
. {System.out.println("Error on " + yytext());}