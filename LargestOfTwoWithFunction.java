/**
 * LargestOfTwoWithFunction
 */
import java.util.Scanner;
public class LargestOfTwoWithFunction {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First No.");
        float a=sc.nextFloat();
        System.out.println("Enter Second No.");
        float b=sc.nextFloat();


        LarOfTwo(a,b);
    }
    public static void LarOfTwo(float a, float b) {
        if (a>b) {
            System.out.println("Greater No. Is: " +a);
        }
        else if(b>a){
            System.out.println("Greater No. Is: " +b);
        }
        else {
            System.out.println("Both No. Are Equal: " +a +b);
        }
    }

}