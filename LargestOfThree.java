/**
 * LargestOfThree
 */
import java.util.Scanner;
public class LargestOfThree {

    public static void main(String[] args) {
        int x,y,z;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        x=sc.nextInt();
        System.out.println("Enter Second Number");
        y=sc.nextInt();
        System.out.println("Enter Third Number");
        z=sc.nextInt();

            if(x >= y)   
            {  
                if(x >= z)
                {
                    System.out.println("The largest number is: "+x);
                }  
                else  
                {
                    System.out.println("The largest number is: "+z);  
                }  
           
            }   
            else   
            {  
                if(y >= z)  
                {
                    System.out.println("The largest number is: "+y);  
                }
                
                else  
                {
                    System.out.println("The largest number is: "+z);  

                }
               
            }
        }
    }
