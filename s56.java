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
		int i;
		Scanner s=new Scanner(System.in);
		s1=s.next();
		char[] a=s1.toCharArray();
		char j=s.next().charAt(0);
		for(i=0;i<s1.length();i++)
		{
			if(a[i]==j)
			{
			System.out.println(i+1);
			break;
	                 	}
		}
	}
}
