import java.util.Scanner;

// PART A


class p3
{	
	public static void main (String[] a)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("first number :");
		int f = sc.nextInt();
		System.out.println("second number :");
		int s = sc.nextInt();
		System.out.println("third number :");
		int t = sc.nextInt();
		
		int big;
		big = f>s?(s>t?f:(f>t?f:t)):(f>t?s:(s>t)?s:t);
		System.out.println("Biggest number :"+big);


	}
}