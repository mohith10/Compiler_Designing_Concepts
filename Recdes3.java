import java.util.*;
import java.io.*;


class Recdes3
{
	static int ptr;
	static char[] input;
	static boolean other=false;
	public static void main(String args[])
	{
		System.out.println("Input the string to be checked :");
		String s=new Scanner(System.in).nextLine();
		input=s.toCharArray();
		ptr=0;
		boolean result=S();
		if(result && ptr==input.length)
			System.out.println("ACCEPTED :)");
		else System.out.println("REJECTED :(");
	}

	static boolean S()
	{
		int fallback=ptr;
		if(input[ptr]=='a')
		{
			if (ptr+1==input.length)
				{
					ptr++;
					return true;}
					if(other)
						{
							ptr++;
							return true;
						}
			else return true;
		}
		else
		{
			if(input[ptr++]!='(')
			{
			ptr=fallback;
			return false;
			}
		if(L()==false)
		{
				ptr=fallback;
				return false;
		}
		if(input[ptr++]!=')')
		{
				ptr=fallback;
				return false;
		}
		return true;
		}

	}

	static boolean L()
	{
		int fallback=ptr;
		if(S()==true)
			{
				//System.out.println("a checked");
				ptr++;
				return true;
				
			}
		else
		{
			other =true;
			if(L()==false)
				{
					ptr=fallback;
					return false;
				}
			if(input[ptr++]!=',')
			{
				ptr=fallback;
				return false;
			}
			if(S()==false)
			{
					ptr=fallback;
					return false;
			}
			other =false;
				return true;
		}
	}
}
