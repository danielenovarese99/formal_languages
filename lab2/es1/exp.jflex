%% 

%standalone

%class MyCFileReader

id = [_a-zA-Z]([_a-zA-Z0-9])*
digit = [0-9]
emptyspace = [\n|\r|\n\r|\"\" ]*
bo = \{
bc = \}
so = \[
sc = \]
ro = \(
rc = \)
PLS = \+
MNS = \-
PRD = \*
DVD = \/
EQ = \=
PV = \;
P = \.
V = \,
GRTR = \>
SMLR = \<
AND = \&
OR = \|
EXCL = \!
letter = [a-zA-Z]
comment = (\/\*)({letter}|{digit}|{emptyspace})*(\*\/)
//keywords = (int|double|if|else|while|print)
DOUBLE_TYPE = double
INT_TYPE = int
IF = if
WHILE = while
PRINT = print
int = ({digit})*
double = ({digit})*(\.){digit}{2}
define = (\#define)(.)*(\n)
TAB = [\t]
NEWLINE = [\n]
SPACE = [ ]

%%
{define} {System.out.print("");} // skip defines
{TAB} {System.out.print("");}
{NEWLINE} {System.out.print("");}
{SPACE} {System.out.print("");}
{bo} {System.out.print(" BO ");}
{bc} {System.out.print(" BC ");}
{so} {System.out.print(" SO ");}
{sc} {System.out.print(" SC ");}
{ro} {System.out.print(" RO ");}
{rc} {System.out.print(" RC ");}
{PLS} {System.out.print(" PLS ");}
{MNS} {System.out.print(" MNS ");}
{PRD} {System.out.print(" PRD ");}
{DVD} {System.out.print("DVD ");}
{EQ} {System.out.print(" EQ ");}
{PV} {System.out.print(" PV ");}
{P} {System.out.print(" P ");}
{V} {System.out.print(" V ");}
{GRTR} {System.out.print(" GRTR ");}
{SMLR} {System.out.print(" SMLR ");}
{AND} {System.out.print(" AND ");}
{OR} {System.out.print(" OR ");}
{EXCL} {System.out.print(" EXCL ");}
{comment} {System.out.print("Comment found > " + yytext()+"");}
{DOUBLE_TYPE} {System.out.print(" DOUBLE_TYPE ");}
{INT_TYPE} {System.out.print ("INT_TYPE");}
{IF} {System.out.print(" IF ");}
{WHILE} {System.out.print(" WHILE ");}
{PRINT} {System.out.print(" PRINT ");}
{int} {System.out.print(" INT:"+yytext()+"");}
{double} {System.out.print(" DOUBLE:"+yytext()+"");}
{id} {System.out.print(" ID:" + yytext()+"");}
