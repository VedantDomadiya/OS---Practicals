import java.util.Scanner;

//PART B

class p4
{	
	public static void main (String[] s)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		int n = sc.nextInt();
		int a = 0 ;
		int b,i=1;
		System.out.println(a);
		System.out.println(i);
		for (i=1;i<=n;i=b)
		{
			b = a+i;
			a = i;
			System.out.println(b+" ");
		}
			
	}
}