// 1. WAP to replace substring with other substring in the given string.


import java.util.Scanner;

class p6
	{
	public static void main(String []arg)
	{
		Scanner sc =new Scanner(System.in);
		String mString,sString;
		int i,j;
		System.out.println("Enter your main String :");
		mString = sc.nextLine();
		System.out.println("Enter your sub String :");
		sString = sc.nextLine();
		StringBuffer lString = new StringBuffer(mString);
		System.out.println("Enter Starting location wher you want chang string");
		i = sc.nextInt();
		System.out.println("Enter Starting location wher you want chang string");
		j = sc.nextInt();
		lString.replace(i,j,sString);
		System.out.println(lString);
	}

}