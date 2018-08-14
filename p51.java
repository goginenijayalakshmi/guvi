/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String n;
		int i;
		Scanner S=new Scanner(System.in);
		n=S.next();
		for(i=0;i<n.length();i++)
		{
			System.out.println(n.charAt(i)+" ");
		}
	}
}
