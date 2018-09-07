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
		char[] c=s1.toCharArray();
		for(i=0;i<s1.length();i++)
		{
			if(Character.isUpperCase(c[i]))
			c[i]=Character.toLowerCase(c[i]);
			else
			c[i]=Character.toUpperCase(c[i]);
		}
		for(i=0;i<s1.length();i++)
		System.out.println(c[i]);
	}
}
