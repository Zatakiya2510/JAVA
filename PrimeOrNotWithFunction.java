
/**
 * PrimeOrNotWithFunction
 */
import java.util.Scanner;

public class PrimeOrNotWithFunction {

    public static void main(String[] args) {
        int n, count = 0, i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any No.");
        n = sc.nextInt();

        while (i <= n) {
            if (i % 2 == 0) {
                count++;

            }
            i++;
        }
        if (check(n)) {
            System.out.println("Is Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

    static boolean check(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0)
                return 0;
        }
        return 1;
    }
}