/**
 * DivisibleBy3Or5
 */
import java.util.*;;
public class DivisibleBy3Or5 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter Size Of Array");
        n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter Element Of Array Index : "+i);
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            if (arr[i]%3==0||arr[i]%5==0) {
                count++;
            } 

        }
        System.out.println("Count Of No. Divisible By 3 Or 5 Is:"+count);
    }
}