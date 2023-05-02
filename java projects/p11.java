/*5
1. Write a program which defines base class Employee having three data members, namely name[30], 
emp_numb and gender and two methods namely input_data() and show_data(). Derive a class SalariedEmployee 
from Employee and adds a new data member, namely salary. It also adds two member methods, namely allowance 
(if gender is female HRA=0.1 *salary ,else 0.09* salary. DA= 0.05*salary) and increment (salary= salary+0.1*salary). 
Display the gross salary in main class. (Tip: Use super to call base class’s constructor0). */

import java.util.Scanner;

class Employee
{
    char[]name = new char[30];
    int emp_numb ;
    String gender;

    Employee(char[] x,int y,String z)
    {
        name = x;
        emp_numb = y;
        gender = z;
    }

    void input_data()
    {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine().toCharArray();
        emp_numb = sc.nextInt();
        gender = sc.nextLine();
    }

    void show_data()
    {
        System.out.println(name);
        System.out.println(emp_numb);
        System.out.println(gender);

    }
}

class SalariedEmployee extends Employee
{
    double salary;
    double finel;
    double hra ;
    SalariedEmployee(char[] x,int y,String z,double a)
    {
        super(x, y, z);
        salary =a;
    }

    void allowance()
    {
        gender.toUpperCase();
        if (gender == "FEMALE" )
        {
            hra = 0.1;
        }
        else{
            hra = 0.09;
        }
        Double allow = (salary*hra)+ (0.05*salary)+salary;
        System.out.println("Allowance is : "+allow);
        finel = (salary*hra)+ (0.05*salary)+salary;
    }

    void increment()
    {
        System.out.println("your increment is : "+ salary+(salary*0.1));
        System.out.println("total salary is : " +(salary+(salary*0.1))+finel );
    }

}

class p11 {
    public static void main(String [] arg)
    {
        Scanner sc =new Scanner(System.in);
        String gender = new String();
        System.out.println("Enter your name : ");
        char[] name = new char[30];
        name  = sc.nextLine().toCharArray();
        
        System.out.println("Enter your Gender : ");
        gender = sc.nextLine();
        
        System.out.println("Enter your number : ");
        int num =sc.nextInt();


        System.out.println("Enter your Salary : ");
        double a = sc.nextDouble();

        SalariedEmployee emp1 = new SalariedEmployee(name, num, gender, a);
        emp1.show_data();
        emp1.allowance();
        emp1.increment();
    }
}
