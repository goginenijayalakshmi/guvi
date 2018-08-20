/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i;
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		boolean flag=false;
		for(i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
			{
				flag=true;
				break;
			}
		
		}
		if(flag==true)
		System.out.println("yes");
		else
		System.out.println("no");
		
	}
}
