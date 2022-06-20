package com.Santhosh;//To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str , rev = "";
        System.out.println("Enter the String : ");
         str = input.nextLine();

        int length = str.length();

        for( int i = length-1 ; i >= 0 ; i--)
        {
            rev = rev + (str.charAt(i));
        }

        if(str.equalsIgnoreCase(rev))
        {
            System.out.println(str + " is a Palindrome.");
        }
        else
        {
            System.out.println(str + " is not Palindrome.");
        }
    }
}
