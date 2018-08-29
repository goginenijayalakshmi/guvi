/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b,ch;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		ch=s.nextInt();
	
		b=s.nextInt();
			switch(ch)
		{
			case 1:
				a=a/b;
				System.out.println(a);
				break;
				case 2:
					a=a%b;
					System.out.println(a);
					break;
					default:
					System.out.println(a);
					
		}
	}
}
