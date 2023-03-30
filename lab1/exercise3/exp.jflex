%%
%standalone
%class MyCFileReader

//numerical constants
//strings, 
//preprocessor directives, 
//keywords 
//comments

// write onto other file with java Filename.java inputfile >> outputfile
digit = [0-9]
letter = [^0-9\.\\\/\*\?\"\>\<\|: ]
emptyspace = [\n|\r|\n\r|\"\" ]*

number = {digit}*
varType = (int|float|double|char)
define = #include[ ]*[\<]{letter}*[\.]{letter}*[\>]
comment = (\/\*)({letter} | {emptyspace} |{digit})*(\*\/)
keywords = (for|if|return|else|while)


%%
// rules
{define} {
            System.out.print("<h2 style=\"color:#0000FF\">");
            for(int i = 0; i < yylength();i++)
            {
               if(yycharat(i) == '<' || yycharat(i) == '>')
               {
                  System.out.print("_");
               }
               else{
                  System.out.print(yycharat(i));
               }
            }
            System.out.print("</h2>");
         }
{number} {System.out.println("<h2 style=\"color:#00FF00\">" + yytext() + "</h2>");}
{emptyspace} {System.out.println("");}
{varType} {System.out.println("<h2 style=\"color:#F0000F\">" + yytext() + "</h2>");}
{comment} {System.out.println("<h2 style=\"color:#FFFFFF\">" + yytext() + "</h2>");}
{keywords} {System.out.println("<h2s style=\"color:#FF0000\">" + yytext() + "</h2>");}


