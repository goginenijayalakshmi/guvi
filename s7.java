/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
          int i;
          String s1;
          char ch;
          
          Scanner s=new Scanner(System.in);
          s1=s.next();
          char a[]=s1.toCharArray();
          for(i=0;i<s1.length();i++,i++)
          {
          	ch=a[i];
          	a[i]=a[i+1];
          	a[i+1]=ch;
          	
          }
          for(i=0;i<s1.length();i++)
          System.out.println(a[i]);
          
	}
}
