import java.util.Scanner;

/**
 * Factorial
 */
import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,fact=1,i;
        System.out.println("Enter Any No.");
        n=sc.nextInt();
        for ( i= 1; i <= n; i++) {
            fact=fact*i;
        }
        System.out.println("Factorial Is:"+fact);
    }
}