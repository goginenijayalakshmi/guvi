/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b,c,n;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		n=s.nextInt();
		c=(n*((2*a)+((n-1)*b)))/2;
		System.out.println(c);
	}
}
