import java.io.*;
import java.util.*;
class Main
{
	public static void main(String args[]) throws IOException
	{
		prac22 lex=new prac22(System.in);
		Token token=lex.yylex();
		while(token.text()!=null)
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
%class prac22
%type void
digit=[0-9]
letter=[a-zA-Z]
special=[!@#$%^&*()_+]
whitespace=[ \n\t]
%type Token
%eofval{
	return new Token(null);
%eofval}
%%
({digit}|{letter}|{special}-[_])*
{
 System.out.print("Valid" + yytext() + ">");}
 {whitespace}+
 {
  /*Skip White Space*/	 
 }