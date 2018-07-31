/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t,r,n,s;
		Scanner S=new Scanner(System.in);
		n=S.nextInt();
		t=n;
		s=0;
		while(n>0)
		{
			r=n%10;
			s=s+r*r*r;
			n=n/10;
		}
		if(t==s)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
