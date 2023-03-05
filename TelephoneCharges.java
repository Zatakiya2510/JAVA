import java.util.Scanner;

/**
 * TelephoneCharges
 */
import java.util.Scanner;
public class TelephoneCharges {

    public static void main(String[] args) {
        double n,bill=200;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The No. Of Calls");
        n=sc.nextDouble();

        if (n>100 && n<=150) {
            bill=bill+((n-100)*0.60);
        }
        else if (n>150 && n<=200){
            bill=bill+((n-100)*0.60+(n-150)*0.5);
        }
        else if(n>200){
            bill=bill+((n-100)*0.60+(n-150)*0.5+(n-200)*0.4);
        }
        System.out.println("Total Bill Is"+bill+"Rs");
    }
}