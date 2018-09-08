/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,m,i,k;
		Scanner s=new Scanner(System.in);
		boolean flag=false;
		n=s.nextInt();
		m=s.nextInt();
		for(i=1;i<n;i*=m)
		{
			k=m*i;
			if(n==k)
			{
			flag=true;
			break;
			} 
			else
			flag=false;
			
		}
		if(flag)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
