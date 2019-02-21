import java.util.*;
import java.io.*;
class Main{
public static void main(String args[]) throws IO exception    {
		prac21 lex=new prac21(System.in);
		Token token=lex.yylex();
		while(token.text()!=null) {
			token=lex.yylex();
		}
	}
}
class Token {
	String text;
	Token(String t){text=t;}
}
%%
%public
%class prac21
%type void
digit=[0-9]
letter=[a-zA-z]
special=[!@#$%^&*]()_+]
whitespace=[ \t\n]
%type Token
%type Token
%eofval{
	return new Token(null);
%eofval}
%%
({letter}|{[_])({letter}|{digit}|[_])*
{
 System.out.print("<A valid Identifier: " + yytext() + ">");}
 {whitespace}+
 {
  /*Skip white spaces*/
 }	 


