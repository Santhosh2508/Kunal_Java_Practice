package com.Santhosh;//Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if ( num1 > num2 )
        {
            System.out.println("The largest number is : " + num1);
        }
        else
        {
            System.out.println("The largest number is : " + num2);
        }
    }
}
