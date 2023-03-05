/**
 * OddEvenWithArray
 */
import java.util.*;
public class OddEvenWithArray {

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
        int count_odd=0,count_even=0;
        for(int i=0;i<n;i++){
            if (arr[i]%2==0) {
                count_even++;
            }
            else{
                count_odd++;
            }
            
        }
        System.out.println("No. Of Odd Entry:"+count_odd);
        System.out.println("No. Of Even Entry:"+count_even);
    }
}