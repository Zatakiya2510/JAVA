import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr Value Of First Point");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        Point3D p1 = new Point3D();
        p1.setX(x);
        p1.setY(y);
        p1.setZ(z);

        System.out.println("Enetr Value Of Second Point");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        Point3D p2 = new Point3D();
        p2.setX(x);
        p2.setY(y);
        p2.setZ(z);

        System.out.println("Distance Between Two Point Is :" + p1.getDistance(p2));
    }
}

class Point2D {
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    double getDistance(Point2D p) {
        return Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y -
                p.y));
    }
}

class Point3D extends Point2D {
    private int z;

    public void setZ(int z) {
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    double getDistance(Point3D p) {
        return (Math.sqrt((this.getX() - p.getX()) * (this.getX() - p.getX()) +
                (this.getY() - p.getY()) * (this.getY() - p.getY())
                + (this.getZ() - p.getZ()) * (this.getZ() - p.getZ())));
    }
}
