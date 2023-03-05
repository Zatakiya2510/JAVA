import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

/**
 * PosNegZe
 */
public class PosNegZe {

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        n=sc.nextInt();

        if(n==0)
        {
            System.out.println("Zero");
        }
        else if(n>0)
        {
            System.out.println("Positive");
        }
        else 
        {
            System.out.println("Negative");
        }
        
    }
}