/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s1,s2;
		int i,j=0;
		Scanner s=new Scanner(System.in);
		s1=s.next();
		s2=s.next();
		if(s1.length()==s2.length())
		{
		for(i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				j++;
			}
		}
		
		if(j==1)
		System.out.println("yes");
		else
		System.out.println("no");
	}
	}
}
