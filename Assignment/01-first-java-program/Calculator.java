package com.Santhosh;//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the num1  ( operator ) num2 : ");
        float a  = input.nextInt();
        char op = input.next().charAt(0);
        float b = input.nextInt();

        if ( op == '+')
        {
            System.out.println( a + b );
        }
        else if ( op == '-')
        {
            System.out.println( a - b );
        }
        else if ( op == '*')
        {
            System.out.println( a * b );
        }
        else if  ( op == '/')
        {
            System.out.println( a / b );
        }
        else {
            System.out.println("NOT VALID OPERATOR");
        }
    }
}
