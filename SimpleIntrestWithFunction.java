
/**
 * SimpleIntrestWithFunction
 */
import java.util.Scanner;

public class SimpleIntrestWithFunction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Principal Amount");
        int p = sc.nextInt();
        System.out.println("Enter The Time");
        int t = sc.nextInt();
        System.out.println("Enter The Rate");
        int r = sc.nextInt();

        CalcSI(p, t, r);
    }

    public static void CalcSI(int p, int r, int t) {
        int SI;

        SI = (p * t * r) / 100;

        System.out.println("\nSimple Intrest Is =" + SI);
    }
}