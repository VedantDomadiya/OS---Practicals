// The employee list for a company contains employee code, name, designation and basic pay. The employee is given HRA of 10% of the basic and DA of 45% of the basic pay. The total pay of the employee is calculated as Basic pay+HRA+ DA. Write a class to define the details of the employee. Write a constructor to assign the required initial values. Add a method to calculate HRA, DA and Total pay and print them out. Write another class with a main method. Create objects for three different employees and calculate the HRA, DA and total pay.


class Employee
{
	int id;
	double basicPay,hra,da,totalPay;
	String name = new String();
	String Designation = new String();

	
	Employee (int w,String x,String y,int z)
	{
		id = w;
		name = x;
		Designation = y;
		basicPay = z;	
	}
	void Calculate()
	{
		hra = 0.1*basicPay;
		da = 0.45*basicPay;
		totalPay = basicPay+hra+da;
		
		System.out.println("For Employee ID "+id);
		System.out.println("HRA : " + hra);
		System.out.println("DA : " + da);
		System.out.println("Total Pay : " + totalPay+"\n");
	}
	
}

class p10
{
	public static void main(String [] arg)
	{
		Employee emp1 = new Employee(01,"Yug","CEO",100000000);
		Employee emp2 = new Employee(02,"Jash","Manager",1000000);
		Employee emp3 = new Employee(03,"Vivak","Janiter",10000);

		
		emp1.Calculate();
		emp2.Calculate();
		emp3.Calculate();

	}

}