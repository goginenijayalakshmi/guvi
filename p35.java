/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,n,count=0;
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
	            n=str.length();
		for(i=0;i<n;i++)
		{
			if(str.charAt(i)>='0'&&str.charAt(i)<='9')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
