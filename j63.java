/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int min,i;
		int a[]=new int[10];
		Scanner s=new Scanner(System.in);
		for(i=0;i<10;i++)
		a[i]=s.nextInt();
		min=a[0];
		for(i=1;i<10;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
	}
}
