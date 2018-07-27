/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,p,r,i;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		p=s.nextInt();
		r=n;
		for(i=1;i<p;i++)
		r=r*n;
		System.out.println(r);// your code goes here
	}
}
