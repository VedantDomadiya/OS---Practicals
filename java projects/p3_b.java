import java.util.Scanner;

//PART B

class p3_b
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
		
if (f>s)
{
if (f>t)
{
System.out.println("Biggest Number : "+f);
}
else 
{
System.out.println("Biggest Number : "+t);
}
}

else 
{
if (s>t)
{
System.out.println("Biggest Number : "+s);
}
else 
{
System.out.println("Biggest Number : "+t);
}
}














	}
}