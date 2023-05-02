// a) WAP that declares a class named Person. It should have instance variables to record name, age and salary. Use new operator to create a Person object. Set and display its instance variables.


import java.util.Scanner;

class Person
{
	String name =new String();
	int age , salary;

	void data(String x,int y,int z)
	{
		name = x;
		age = y;
		salary = z;
	}
	void dispaly()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Salary : "+salary);
	}
	
}

class p9_a
{
	public static void main(String [] arg)
	{
		Person p1 = new Person();
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int age = sc.nextInt();
		int salary = sc.nextInt();
		
		p1.data(name,age,salary);
		p1.dispaly();
					
	}

}