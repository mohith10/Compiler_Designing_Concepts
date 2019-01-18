//S->cAd 
//A->ab|d 

import java.util.*;
import java.io.*;
class RecDes
{
	static int ptr;
	static char[] input;
	public static void main(String args[])
	{
		System.out.println("Input the string to be checked :");
		String s=new Scanner(System.in).nextLine();
		input=s.toCharArray();
		ptr=0;
		boolean result=S();
		if(result &&  ptr==input.length)
		{
			System.out.println("ACCEPTED :)");
		}
		else 
		{
				System.out.println("REJECTED :( ");
		}
	}

static boolean S()
{
	int fallback=ptr;
	if(input[ptr++]!='c')
		{
			ptr=fallback;
			return false;
		}
	if(A()==false)
		{
				ptr=fallback;
				return false;
		}
	if(input[ptr++]!='d')
	{
		ptr=fallback;
		return false;
	}
	return true;
}
static boolean A()
{
	int fallback=ptr;
	if(input[ptr]=='d')
		{
			ptr++;
			return true;
		}

else
	{
		if(input[ptr++]!='a')
		{
			ptr=fallback;
			return false;
		}
		if(input[ptr++]!='b')
		{
			ptr=fallback;
			return false;
		}

		return true;
	}
	}

}


