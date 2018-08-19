/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,i=10;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(n<=10000)
		{
			if(n%i==0)
			{
			System.out.println(n);
			break;
			}
			n++;
		}
	}
}
