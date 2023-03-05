/**
 * FindDiameter
 */
import java.util.Scanner;
public class FindDiameter {

    public static void main(String[] args) {
        double d,a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        
        d=(Math.sqrt(a/3.14))*2;

        System.out.println("Diameter Of Circle With Area "+a+" "+d);
    }
}