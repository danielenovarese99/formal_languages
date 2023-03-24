%%
// declarations

// objective >> recognize URLs
%standalone
%class UrlRecognizer
FinalUrl = ({scheme})({escape})?({domain})(:{port})?((\/)({escape})?({fileName}))*(\/)?(#{id})?({escape})?
scheme = (http | ftp | gopher | nntp)(:)(\/){2}

domain = (({id})(\.)({id})(\.)({id})|({digit}{1,3}(\.){digit}{1,3}(\.){digit}{1,3}(\.){digit}{1,3})) //
// domain is either word.word.word or nnn.nnn.nnn.nnn 
//where n can be a number from 1 to 3 digits
port = ({digit}){1,4} // digit from 1 to 3 numbers
fileName = {id}(\.{id})? // letters + numbers followed by optional format
id = ({letter}|{digit})({letter}|{digit})*
letter = [^\.\\\/\*\?\"\>\<\|:]
digit = [0-9]
emptyspace = (\n|\r|\n\r|\"\")*
schemedomainandportfilename = ({scheme})({domain})(:{port})?(\/)({fileName})
escape = (%)[0-9A-F]{2}
%%

//{scheme} {System.out.println("Scheme > " + yytext());}
{FinalUrl} {System.out.println("Correct URL detected :    " + yytext());}
{escape} {System.out.println("Escape char > " + yytext());}
{emptyspace} {System.out.println("Empty string found");}
{port} {System.out.println("Port > " + yytext());}
{domain} {System.out.println("Domain > " + yytext());}
{fileName} {System.out.println("Filename > " + yytext());}

// rules


// SAMPLES
/*
http://www.mysite.it/file.html
ftp://10.9.9.71/prova.zip
http://another.site.com/%7Euser/index.html#rif33
nntp://news.site.ch:8181/data/
*/
