import java.util.*;

public class StudentInfo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.getStudentDetails();
        s1.displayStudentDetails();
    }
}

class Student {
    int enrollment;
    String name;
    int sem;
    float cpi;
    float spi;

    public void getStudentDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Enrolment No.:");
        enrollment = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name:");
        name = sc.nextLine();
        System.out.println("Enter Semestrer:");
        sem = sc.nextInt();
        System.out.println("Enter CPI:");
        if (cpi >= 0) {
            cpi = sc.nextFloat();
        }
        System.out.println("Enter SPI:");
        if (spi >= 0) {
            spi = sc.nextFloat();
        }
    }

    public void displayStudentDetails() {
        System.out.println(
                "Enrollment No.:" + enrollment + "\nName:" + name + "\nSemester:" + sem + "\nCPI:" + cpi + "\nSPI:"
                        + spi);
    }
}
