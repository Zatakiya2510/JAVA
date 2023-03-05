import java.util.Scanner;

/**
 * CircleAreaAndPerimeter
 */
public class CircleAreaAndPerimeter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius Of Circle");
        double r = sc.nextDouble();

        Circle c1 = new Circle();
        c1.displayArea();
        c1.displayPerimeter();

    }
}

class Circle {
    double r;

    Circle(double r) {
        this.r = r;
    }

    public double displayArea() {
        return 3.14f * r * r;

    }

    public double displayPerimeter() {
        return 2 * 3.14f * r;
    }
}
