import java.util.Scanner;

/**
 * ReverseOrder
 */
import java.util.Scanner;
public class ReverseOrder {

    public static void main(String[] args) {
        int n , rev=0,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any No.");
        n=sc.nextInt();

        while (n!=0) {
            rem=n%10;
            rev=(rev*10)+rem;
            n /=10;
        }
        System.out.println("Reverse Order Of No. Entered Is:"+rev);
    }
}