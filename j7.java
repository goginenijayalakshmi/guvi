/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,m,i;
		boolean flag=false;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		m=s.nextInt();
		n=n*m;
		for(i=1;i<=n/2;i++)
		{
			if(n==i*i)
			flag=true;
			
		}
		if(flag)
			System.out.println("yes");
		else
			System.out.println("no");
		
	}
}
