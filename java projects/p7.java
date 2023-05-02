// 2.WAP that to sort given strings into alphabetical order.

import java.util.Scanner;
import java.util.Arrays;

class p7
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner(System.in);	
		String mString;
		mString = sc.nextLine();
		char[] a= new char[mString.length()];

		for(int i=0;i<mString.length();i++)
		{
			a[i] = mString.charAt(i);
	
		}
		Arrays.sort(a,0,mString.length());
		String lString = new String(a);
		System.out.println(lString);
	}
}