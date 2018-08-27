/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String str; 
		Scanner s=new Scanner(System.in);
		str=s.next();
		boolean flag=false;
		for(int i=0;i<str.length();i++)
		for(int j=i;j<str.length();j++)
		if(str.charAt(i)==str.charAt(j))
		flag=false;
		else
		flag=true;
		if(true)
		System.out.println("Yes");
		else
		System.out.println("No");
	}
}
