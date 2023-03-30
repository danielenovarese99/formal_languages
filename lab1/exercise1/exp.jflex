%%
%standalone
%class PathChecker

PathFileName = ({Drive}:)?(\\)?({PathName}\\)*{FileName}(\.{FileType})?
Drive = {letter}
PathName =  {id}
FileName = {id}
FileType = {id}


letter = [^\\\/\*\?\"\>\<\|]
digit = [0-9]
emptyspace = (\n|\r|\n\r|\"\")*
id = ({letter}|{digit})({letter}|{digit})*
//id = ([^\\\/\*\?\"\>\<\|]|[0-9])([^\\\/\*\?\"\>\<\|]|[0-9])*
// definitions

%%
// rules


{emptyspace} {System.out.println("Empty string found");}
{PathFileName} {System.out.println("Path to file found: " + yytext());}


