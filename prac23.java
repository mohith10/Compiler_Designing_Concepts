import.java.util.*
import java.io.*;
class Main
{
	public static void main(String[] args) throws IOException
	{
		prac22 lex=new prac22(System.in);
		Token token=lex.yylex();
		while(token.text!=null)
		{
			token=lex.yylex();
		}
	}
}
class Token
{
	String text;
	Token(Srting t)
	{
		text=t;
	}
}
%%
&public
%class prac23
%type void
digit=[0-9]
letter[a-zA-Z]
special=[!@#$%^&*()_+]
whitespace=[ \n\t]
%type Token
%eofval{
	return new Token(null);
%eofval}
%%
"if"
{
 System.out.print("< valid identifier " + yytext() + ">");
 }
 {whitespace}+
 {
	 
 }