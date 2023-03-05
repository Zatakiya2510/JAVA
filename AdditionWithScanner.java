import java.util.Scanner;

public class AdditionWithScanner {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        int a=cs.nextInt();
        int b=cs.nextInt();
        int sum;
        sum = a+b;
        System.out.println("Sum of "+a+" and "+b+" is :"+sum);
    }
}
