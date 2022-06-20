//Find if a number is palindrome or not


import java.util.Scanner;

public class Palindrome_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int org = in.nextInt();
        int num = org , rem , rev = 0;
        while(num != 0 )
        {
            rem = num % 10;
            rev = (rev * 10) + rem ;
            num /= 10;
        }
        System.out.println("Reversed Number of " + org + " is : " + rev );
        if(rev == org)
        {
            System.out.println("The Number " + org + " is Palindrome.");
        }
        else {
            System.out.println("The Number " + org + " is not Palindrome.");
        }

    }
}
