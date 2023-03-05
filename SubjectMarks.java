/**
 * SubjectMarks
 */
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class SubjectMarks {

    public static void main(String[] args) {
        float s1,s2,s3,s4,s5,per,total;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks Of First Out Of 100 Subject");
        s1=sc.nextFloat();
        System.out.println("Enter Marks Of Second Out Of 100 Subject");
        s2=sc.nextFloat();
        System.out.println("Enter Marks Of Third Out Of 100 Subject");
        s3=sc.nextFloat();
        System.out.println("Enter Marks Of Fourth Out Of 100 Subject");
        s4=sc.nextFloat();
        System.out.println("Enter Marks Of Fifth Out Of 100 Subject");
        s5=sc.nextFloat();

        per=((s1+s2+s3+s4+s5)*100f)/500f;

        System.out.println("Percentage Of 5 Subject Is :"+per);
        if (per<=35) {
            System.out.println("You Are Fail");
        }
        else if (per>35 && per<=45) {
            System.out.println("You Are Pass Class");
        } 
        else if (per>=45 && per<=60) {
            System.out.println("You Are Second Class");
        }
        else if (per>=60 && per<=70){
            System.out.println("You Are First Class");
        }
        else{
            System.out.println("You Are Distinction");
        }
    }
}