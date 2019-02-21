
	Token(String t)
	{
		text=t;
	}
}
%%
%public
%class prac27
%type void
digit=[0-9]
letter=[a-zA-Z]
special=[!@#$%^&*()_+]
whitespace=[ \t\n]
%type Token
%eofval{
	return new Token(null);
%eofval}
%%
\/\*({letter}|{digit}|{special})*\*\/
{
 System.outprintln("" + yytext() + "");}
 {whitespace}+
 {
	 
 }