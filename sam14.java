/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,k=0,m=0,j;
		String s1;
		char[] ch1=new char[100];
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		s1=s.next();
		char ch[]=s1.toCharArray();
		j=0;
		for(int i=0;i<n;i++)
		{
		    if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
		    k++;
		    else
		    {
		    ch1[j]=ch[i];
		    j++;
		    m++;
		    }
		}
		for(j=m;j>=0;j--)
		System.out.println(ch1[j]);
		
	}
}
