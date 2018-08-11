/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int h1,h2,h3,h,m1,m2,m;
		Scanner s=new Scanner(System.in);
		h1=s.nextInt();
		m1=s.nextInt();
		h2=s.nextInt();
		m2=s.nextInt();
		h1=h1*60+m1;
		h2=h2*60+m2;
		h=h1-h2;
		h3=h/60;
		m=h%60;
		System.out.println(h3+" "+m);
	}
}
