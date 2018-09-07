/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,i,m,c=0;
		double p;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		m=s.nextInt();
		for(i=n+1;i<m;i++)
		{
			p=Math.sqrt(i);
			if(p-(Math.floor(p))==0)
			{
			c++;
			}
		}
		System.out.println(c);
	}
}
