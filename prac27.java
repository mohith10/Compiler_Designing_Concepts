import java.io.*;
import java.util.*;

class Main
{
	public static void main(String args[])
	{
		prac27 lex=new prac27(System.in);
		Token token=lex.yylex();
		while(Token.text!=null)
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
\/\/({letter}|{digit}|{special})*
{
 System.outprintln("" + yytext() + "");}
 {whitespace}+
 {
	 
 }