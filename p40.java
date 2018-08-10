/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,n,a,b,c;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=1;
		b=1;
		System.out.println(a);
		System.out.println(b);
		for(i=3;i<=n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
