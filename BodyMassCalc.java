/**
 * BodyMassCalc
 */
import java.util.Scanner;
public class BodyMassCalc {

    public static void main(String[] args) {
        float wp,wkg,hI,hM,bmi;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Weight In Pound");
        wp=sc.nextFloat();
        System.out.println("Enter Height In Inch");
        hI=sc.nextFloat();
        
        wkg = wp*0.45359237f;
        hM = hI*0.0254f;
        bmi=wkg/(hM*hM);
        System.out.println("Your BMI Is :"+bmi);
    }
}