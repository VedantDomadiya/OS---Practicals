class Employee {
    String name, gender;
    int empNum;

    void input_data() {
        // code to take input for name, empNum, and gender
    }

    void show_data() {
        System.out.println("Name: " + name);
        System.out.println("Employee Number: " + empNum);
        System.out.println("Gender: " + gender);
    }
}

class SalariedEmployee extends Employee {
    double salary;

    SalariedEmployee(String n, int en, String g, double sal) {
        super.name = n;
        super.empNum = en;
        super.gender = g;
        salary = sal;
    }

    double allowance() {
        if (gender.equals("female")) {
            return 0.1 * salary;
        } else {
            return 0.09 * salary;
        }
    }

    void increment() {
        salary += 0.1 * salary;
    }

    double calculate_gross_salary() {
        double HRA = allowance();
        double DA = 0.05 * salary;
        return salary + HRA + DA;
    }
}

public class javapract5 {
    public static void main(String[] args) {
        SalariedEmployee emp = new SalariedEmployee("Jane", 101, "female", 50000);
        emp.show_data();
        double gross_salary = emp.calculate_gross_salary();
        System.out.println("Gross Salary: " + gross_salary);
    }
}
