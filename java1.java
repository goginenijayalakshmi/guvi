/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int rock=1,paper=2,scissor=3;
		int ch1,ch2;
		Scanner s=new Scanner(System.in);
		System.out.println("enter 1 for rock,2 for paper,3 for scissor");
		System.out.println("enter choice1");
		ch1=s.nextInt();
		System.out.println("enter choice2");
		ch2=s.nextInt();
		String p1,p2;
		p1=s.next();
		p2=s.next();
		if(ch1==1&&ch2==2)
		System.out.println(ch2);
		else if(ch1==1&&ch2==3)
		System.out.println(ch1);
else if(ch1==2&&ch2==1)
		System.out.println(ch1);
		else if(ch1==2&&ch2==3)
		System.out.println(ch2);
		else if(ch1==3&&ch2==1)
		System.out.println(ch2);
		else if(ch1==3&&ch2==2)
		System.out.println(ch1);
		else
		System.out.println("tie");
	
		
	}
}
