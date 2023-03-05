import java.util.*;

public class StudentDetail {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter No. Of Student");
        int n = 3;
        Student[] stu = new Student[3];

        stu[0] = new Student(101, "Abhishek", 'M', 90);
        stu[1] = new Student(102, "Jay", 'M', 99);
        stu[2] = new Student(103, "Bhargav", 'M', 80);
        stu[0].display();
        // for (int i = 0; i < n; i++) {

        // }

        // Student s1 = new Student(22010101, "Abhishek Zatakiya", 'M', 300);
        // s1.display();
        // Student s2 = new Student(22010102, "Jay Ramani", 'M', 400);
        // s2.display();
        // System.out.println("Total Student=" + Student.count);

    }
}

class Student {
    long enrollNo;
    String name;
    char gender;
    int marks;
    static int count;

    Student() {
        enrollNo = 0;
        name = "Undefined";
        gender = 'M';
        marks = 0;
        count = 0;
    }

    Student(long enrollNo, String name, char gender, int marks) {
        this.enrollNo = enrollNo;
        this.name = name;
        this.gender = gender;
        this.marks = marks;
        count++;
    }

    public void display() {
        System.out.println("Enrollment No:" + enrollNo + "\nName:" + name + "\nGender:" + gender + "\nMarks:" + marks
                + "\nCount:" + count);
    }
}
