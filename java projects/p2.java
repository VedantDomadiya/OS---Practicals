import java.util.Scanner; 

class p2
{	
	public static void main(String[] a)
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int x = 0;
		for (int i=2;i<=number/2;i++)
		{
			if (number%i == 0)
			{
				x++;	
			}
		}
		if(x>0)
		{
			System.out.println("NOT PRIME");
		}
		else
		{
			System.out.println("PRIME");
		}
	
	}
}