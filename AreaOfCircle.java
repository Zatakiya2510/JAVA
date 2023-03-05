import java.util.*;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        int r=cs.nextInt();
        double pi=3.14 , area;
        area=pi*r*r;
        System.out.println("Area Of Circle With Radius "+r+" is :"+area);
    }
    
}