%%

%standalone
%caseless
%class HTMLfileREADER
%{
    int totalTags = 0;
    int tableCount = 0;
    int totalH1 = 0;
    int totalH2 = 0;
    int totalH3 = 0;
    int totalH4 = 0;    
%}

word = [a-zA-Z0-9]*
comment = (\<)(\!)(\-){2}(\-)*(.)*(\-){2}(\>)
/*
TABLE = ((\<)(table)([ ])*(.)*(\>) | (\<)(\/)(table)(\>))
BODY = ((\<)(body)([ ])*(.)* | (\<)(\/)(body)(\>))
HTML = ((\<)(html)([ ])*(.)* | (\<)(\/)(html)(\>))
TITLE = ((\<)(title)([ ])*(.)* | (\<)(\/)(title)(\>))
H1 = ((\<)(h1)([ ])*(.)* | (\<)(\/)(h1)(\>))
H2 = ((\<)(h2)([ ])*(.)* | (\<)(\/)(h2)(\>))
H3 = ((\<)(h3)([ ])*(.)* | (\<)(\/)(h3)(\>))
H4 = ((\<)(h4)([ ])*(.)* | (\<)(\/)(h4)(\>))
HEAD = ((\<)(head)([ ])*(.)* | (\<)(\/)(head)(\>))
*/
// generic tag 
tag = ((\<)({word})([ ]*)([^\>]*)|(\<)(\/)({word})(\>))
//tagOpen = (\<)({word}|[\.\=\"\"\ ])*(\>)
tagOpen = (\<)({word}|(\.)|(\=)|(\")|[ ]|[\/])*(\>)
tagClose = (\<)(\/)({word})*(\>)

%eof{
    System.out.println("Total tags > "+ totalTags);
    System.out.println("Total TABLE > "+ tableCount);
    System.out.println("Total H1 > "+ totalH1);
    System.out.println("Total H2 > "+ totalH2);
    System.out.println("Total H3 > "+ totalH3);
    System.out.println("Total H4 > "+ totalH4);
%eof}
%%
{comment} {System.out.print("");}
{tagOpen} {System.out.println(yytext());
String test = yytext();
    if(test.indexOf("/") != -1)
    {
        test = test.replace("/","");
    }
    test = test.replace("<","");
    test = test.replace(">","");
    test = test.toLowerCase();
    if(test.contains(" "))
    {
        test = test.substring(0,test.indexOf(" "));
    }
    switch(test){
        case "table":
            tableCount++;
            totalTags++;
            break;
        case "h1":
            totalH1++;
            totalTags++;
            break;
        case "h2":
            totalH2++;
            totalTags++;
            break;
        case "h3":
            totalH3++;
            totalTags++;
            break;
        case "h4":
            totalH4++;
            totalTags++;
            break;
        default:
            totalTags++;
            break;
    }
}

{tagClose} {System.out.println(yytext());
String test = yytext();
    if(test.indexOf("/") != -1)
    {
        test = test.replace("/","");
    }
    test = test.replace("<","");
    test = test.replace(">","");
    test = test.toLowerCase();
    if(test.contains(" "))
    {
        test = test.substring(0,test.indexOf(" "));
    }
    switch(test){
        case "table":
            tableCount++;
            totalTags++;
            break;
        case "h1":
            totalH1++;
            totalTags++;
            break;
        case "h2":
            totalH2++;
            totalTags++;
            break;
        case "h3":
            totalH3++;
            totalTags++;
            break;
        case "h4":
            totalH4++;
            totalTags++;
            break;
        default:
            totalTags++;
            break;
    }
    }


/*
{TABLE} {System.out.println(" TABLE TAG >> " + yytext() );}
{BODY} {System.out.println(" BODY >> " + yytext());}
{HTML} {System.out.println(" HTML >> " + yytext());}
{TITLE} {System.out.println("TITLE >> " +yytext());}
{H1} {System.out.println(" H1 >> " + yytext());}
{H2} {System.out.println(yytext());}
{H3} {System.out.println(yytext());}
{H4} {System.out.println(yytext());}
{HEAD} {System.out.println(yytext());}
*/