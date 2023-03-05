import java.util.Scanner;
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        float c;
        Scanner sc=new Scanner(System.in);
        float f=sc.nextFloat();
        c=((f-32)*5)/9;
        System.out.println("Fahrenheit To Celsius Of F= "+f+" is :"+c);
    }

    
}