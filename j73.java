/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,n,l,r;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		l=s.nextInt();
	r=s.nextInt();
	boolean flag=false;
	for(i=l;i<r;i++)
	{
		if(i==n)
		{
			flag=true;
			break;
		}
		
	}
	if(flag)
	System.out.println("yes");
	else
	System.out.println("no");
}
}
