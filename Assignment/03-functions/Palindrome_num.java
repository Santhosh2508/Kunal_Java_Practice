//Write a function to find if a number is a palindrome or not. Take number as parameter.

import java.util.Scanner;

public class Palindrome_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        int rev = palindrome(num);
        if (num == rev)
            System.out.println("The number is a Palindrome .");
        else
            System.out.println("The number is not a Palindrome .");
    }

     static int palindrome(int num)
    {
        int rev = 0 , rem;
        while(num > 0)
        {
            rem = num %10;
            rev = rev * 10 +rem;
            num = num /10;
        }           
        return  rev;
    }
}
