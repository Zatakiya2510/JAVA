/**
 * TriangleSides
 */
import java.util.Scanner;

public class TriangleSides {

    public static void main(String[] args) {
        float a,b,c,A,B,C,a1,b1,c1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Side Of Triangle");
        a=sc.nextFloat();
        System.out.println("Enter Second Side Of Triangle");
        b=sc.nextFloat();
        System.out.println("Enter Third Side Of Triangle");
        c=sc.nextFloat();

    
        a1=(int)Math.pow(a, 2);
        b1=(int)Math.pow(b, 2);
        c1=(int)Math.pow(c, 2);
        

        if (a==b && b==c && c==a) {
            System.out.println("Triangle Is Equilateral");
        }
        else if (a==b || b==c || c==a){
            System.out.println("Triangle Is Isoceles");
        }
        
        else if (a1 == b1+c1 || b1 == c1+a1 || c1 == a1+b1) {
            System.out.println("Triangle Is Right Angled");
        }
        else {
            System.out.println("Triangle Is Scalene");
        }
        

    }
}