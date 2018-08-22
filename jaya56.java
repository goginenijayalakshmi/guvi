import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s1;
		int i,c1=0,c2=0;
		Scanner s=new Scanner(System.in);
		s1=s.next();
		for(i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0'&&s1.charAt(i)<='9')
			{
				c1++;
			}
			if((s1.charAt(i)>='a'&&s1.charAt(i)<='z')||(s1.charAt(i)>='A'&&s1.charAt(i)<='Z'))
			{
				c2++;
			}
		}
		if(c1==0||c2==0)
		System.out.println("No");
		else
		System.out.println("Yes");
	}
}
