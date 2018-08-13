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
		int n1,n2;
		Scanner s=new Scanner(System.in);
		s1=s.next();
		s2=s.next();
		n1=s1.length();
		n2=s2.length();
		if(n1>n2)
		System.out.println(s1);
		else if(n1==n2)
		System.out.println(s1);
		else
		System.out.println(s2);
	}
}
