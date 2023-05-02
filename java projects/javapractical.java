class Employee {
    int code;
    String name, designation;
    double basicPay, HRA, DA, totalPay;

    Employee(int c, String n, String d, double bp) {
        code = c;
        name = n;
        designation = d;
        basicPay = bp;
    }

    void calculateSalary() {
        HRA = 0.1 * basicPay;
        DA = 0.45 * basicPay;
        totalPay = basicPay + HRA + DA;
    }

    void displaySalary() {
        System.out.println("Employee Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA: " + HRA);
        System.out.println("DA: " + DA);
        System.out.println("Total Pay: " + totalPay);
    }
}

public class javapractical {
    public static void main(String[] args) {
        // Create employee objects
        Employee emp1 = new Employee(101, "John", "Manager", 50000);
        Employee emp2 = new Employee(102, "Jane", "Developer", 30000);
        Employee emp3 = new Employee(103, "Bob", "Accountant", 25000);

        // Calculate and display salaries for employees
        emp1.calculateSalary();
        emp1.displaySalary();

        emp2.calculateSalary();
        emp2.displaySalary();

        emp3.calculateSalary();
        emp3.displaySalary();
    }
}
