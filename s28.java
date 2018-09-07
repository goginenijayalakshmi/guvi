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
		int i,j;
		Scanner s=new Scanner(System.in);
		s1=s.nextLine();
		char a[]=s1.toCharArray();
		char b[]=new char[100];
		j=0;
		for(i=0;i<s1.length();i++)
		{
			if(a[i]!=' ')
			{
				b[j]=a[i];
				j++;
			}
		}
		for(j=0;j<100;j++)
		System.out.println(b[j]);
	}
}
