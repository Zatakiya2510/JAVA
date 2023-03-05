/**
 * VovelAndConsonant
 */
import java.util.Scanner;
public class VovelAndConsonant {

    public static void main(String[] args) {
        char c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Character");
        c=sc.next().charAt(0);

        if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        {
            System.out.println("Character Is Vowel");
        }
        else
        {
            System.out.println("Character Is Consonant");
        }
    }
}