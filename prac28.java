import java.io.*;
import java.util.*;
class Main
{
	public static void main(String args[])
	{
		prac28 lex=new prac22(System.in);
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
	Token(String t)
	{
		text=t;
	}
}
%%
%public
%class prac28
%type void
digit=[0-9]
letter=[a-zA-Z]
special=[!@#$%^&*()_+]
whitespace=[ \t\n]
%type Token
%eofval{
	return new Token(null)
%eofval}
%%
(P)({letter}|{digit}|{special})*(!)
{
 System.out.print("" + yytext() + "");
 }
 {whitespace}+
 {
	 
 }