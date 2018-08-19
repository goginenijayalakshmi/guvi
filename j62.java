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
		String s1;
		boolean flag=false;
		Scanner s=new Scanner(System.in);
		s1=s.next();
		for(i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='0'||s1.charAt(i)=='1')
			{
			flag=true;
			}
			else
			flag=false;
	
		}
		if(flag)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
