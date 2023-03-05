
/**
 * FibonacciSeriesWithFunction
 */
import java.util.Scanner;

public class FibonacciSeriesWithFunction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The No. Of Element");
        int n = sc.nextInt();

        FibWF(n);
    }

    static void FibWF(int n) {
        int n1 = 0, n2 = 1;
        int i = 0;
        while (i < n) {
            System.out.print(n1 + " ");
            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
            i = i + 1;
        }

    }
}