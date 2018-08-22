/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s1;
		int n,i;
		Scanner s=new Scanner(System.in);
		s1=s.next();
		char[] ch=s1.toCharArray();
		if(s1.length()%2==0)
		{
			n=s1.length()/2;
			ch[n-1]='*';
			ch[n]='*';
			for(i=0;i<s1.length();i++)
			{
				System.out.println(ch[i]);
			}
		}
		else
		{
				n=s1.length()/2;
			ch[n]='*';
			for(i=0;i<s1.length();i++)
			{
				System.out.println(ch[i]);
			}
		
		}
	}
}
