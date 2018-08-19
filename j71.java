/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,l; 
		String s1;
		boolean flag=false;
		Scanner s=new Scanner(System.in);
		s1=s.next();
		l=s1.length();
		for(i=0;i<s1.length();i++,l--)
		{
			if(s1.charAt(i)==s1.charAt(l-1))
			{
			
				flag=true;
			}
				
				else
				{
				flag=false;
				break;
				}
			
		}
		if(flag)
		System.out.println("yes");
		else
			System.out.println("no");
	
		
	}
}
