/**
 * DivisibleBy2AndNotBy3
 */
import java.util.Scanner;
public class DivisibleBy2AndNotBy3 {

    public static void main(String[] args) {
        int i,n1,n2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. To Start");
        n1=sc.nextInt();
        System.out.println("Enter No. To Stop");
        n2=sc.nextInt();
        for ( i=n1; i < n2; i++){
            if (i % 2 == 0 && i % 3 != 0) {
                System.out.println("Divisible By 2 And Not By 3 Is "+i);
            }
        }
    }
}