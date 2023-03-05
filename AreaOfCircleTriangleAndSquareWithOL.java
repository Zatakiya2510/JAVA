
/**
 * AreaOfCircleTriangleAndSquareWithOL
 */
import java.util.*;

public class AreaOfCircleTriangleAndSquareWithOL {

    public static void main(String[] args) {
        Shape foo = new Shape();
        float a, c, d;
        double b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side Of Square");
        a = sc.nextFloat();
        System.out.println("Enter Radius Of Circle");
        b = sc.nextDouble();
        System.out.println("Enter Length Of Rectangle");
        c = sc.nextFloat();
        System.out.println("Enter Width Of Rectangle");
        d = sc.nextFloat();

        foo.Area(a);
        foo.Area(b);
        foo.Area(c, d);
    }
}

class Shape {
    static final double PI = Math.PI;

    void Area(float a) {
        float A = a * a;
        System.out.println("Area Of Square: " + A);
    }

    void Area(double b) {
        double A = PI * b * b;
        System.out.println("Area Of Circle: " + A);
    }

    void Area(float c, float d) {
        float A = c * d;
        System.out.println("Area Of Rectangle: " + A);
    }
}
