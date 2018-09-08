/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
			int i,count1=0,count2=0;
			String s1;
			Scanner s=new Scanner(System.in);
			s1=s.next();
			char[] a=s1.toCharArray();
	for(i=0;i<s1.length();i++)
	{
		if(a[i]!=')' && a[i]!='(' )
		{
		
			break;
		}
		else{
		if(a[i]==')')
		{
			count1=count1+1;
		}
		if(a[i]=='(')
		{
			count2=count2+1;
		}
	      }
		
	}
	if(count1==count2)
	System.out.println("yes");
	else
	System.out.println("no");

	}
}
