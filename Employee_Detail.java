
/**
 * Employee_Detail
 */
import java.util.*;

public class Employee_Detail {

    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.getEmployeeDetails();
        e1.displayEmpolyeeDetails();
    }
}

class Employee {
    int id;
    String name;
    String designation;
    int age;
    double salary;

    public void getEmployeeDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Employee ID");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Your Name");
        name = sc.nextLine();
        System.out.println("Enter Your Designation");
        designation = sc.nextLine();
        System.out.println("Enter Your Age");
        age = sc.nextInt();
        System.out.println("Enter Your Salary");
        salary = sc.nextDouble();
    }

    public void displayEmpolyeeDetails() {

        System.out.println("Employee ID :" + id + "\nEmployee Name:" + name + "\nDesignation:" + designation
                + "\nEmployee Age:" + age + "\nSalary" + salary);

    }
}