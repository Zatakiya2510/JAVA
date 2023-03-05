/**
 * CalculatorWithSwitchCase
 */
import java.util.Scanner;

public class CalculatorWithSwitchCase {

    public static void main(String[] args) {
        char op;
        double n1,n2,result;
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose Operater *,/,+,-");
        op=sc.next().charAt(0);
        System.out.println("Enter First No. Of Operator");
        n1=sc.nextDouble();
        System.out.println("Enter Second No. Of Operator");
        n2=sc.nextDouble();

        switch(op)
        {
            case '+':
                    result = n1 + n2;
                    System.out.println(n1 + " + " + n2 + " = " + result);
                     break;
            case '-':
                    result = n1 - n2;
                    System.out.println(n1 + " - " + n2 + " = " + result);
                    break;
            case '*':
                    result = n1 * n2;
                    System.out.println(n1 + " * " + n2 + " = " + result);
                    break;
            case '/':
                    result = n1 / n2;
                    System.out.println(n1 + " / " + n2 + " = " + result);
                    break;
            default:
                    System.out.println("Invalid operator!");
                    break;
        }

    }
}