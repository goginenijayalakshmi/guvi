/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,i;
		String str;
		Scanner s=new Scanner(System.in);
		str=s.next();
		n=s.nextInt();
		i=str.length()-n;
		for(int j=i;j<str.length();j++)
		{
			System.out.println(str.charAt(j));
		}
	}
}
