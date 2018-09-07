/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,j=0;
		String s1;
		Scanner s=new Scanner(System.in);
		s1=s.next();
		char[] a=s1.toCharArray();
		for(i=0;i<s1.length();i++)
		{
			if(a[i]>='a'&&a[i]<='z')
			{
			System.out.println("no");
			break;
			}
			else
			j++;
		}
		if(j==s1.length())
		System.out.println("yes");
	}
}
