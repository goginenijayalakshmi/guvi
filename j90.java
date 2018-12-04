/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int m,n,k,k1,n1=1,n2=1,n3=1;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		k=s.nextInt();
		for(int i=n;i>=1;i--)
		{
			n1=n1*i;
		}
		k1=n-k;
		for(int j=k1;j>=1;j--)
		{
			n2=n2*j;
		}
		for(int i1=k;i1>=1;i1--)
		{
			n3=n3*i1;
		}
		n2=n2*n3;
		n1=n1/n2;
		System.out.println(n1);
		
	}
}
