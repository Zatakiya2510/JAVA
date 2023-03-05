/**
 * MeterToFeet
 */
import java.util.*;
public class MeterToFeet {

    public static void main(String[] args) {
        float f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value In Meter To Convert In Feet ");
        float m=sc.nextFloat();
        f=3.28084f*m;
        System.out.println("Feet Of Give Meter Is "+m+" "+f);

    }
}