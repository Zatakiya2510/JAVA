/**
 * RectangleWithStatic
 */
public class RectangleWithStatic {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5,3);
        Rectangle r3 = new Rectangle(r1);
        Rectangle r4 = new Rectangle(new Rectangle(3,5));
        
        
        r1.displayArea();
        r2.displayArea();
        r3.displayArea();
        r4.displayArea();
    }
}
class Rectangle{
    double length;
    double width;
    static int count;

    Rectangle(){
        length = 2;
        width = 2;
    }

    Rectangle(double length , double width){
        this.length=length;
        this.width=width;
    }

    Rectangle(Rectangle r){
        this.length = r.length;
        this.width = r.width;
    }

    public double findArea() {
        return length*width;
    }

    public void displayArea() {
        System.out.println(findArea());
    }
}