package com.Santhosh;//To calculate Fibonacci Series up to n numbers.


import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number of  terms : ");
        int num = input.nextInt();

        int first = 0;
        int second = 1;
        int sum = first + second ;

        System.out.print("Fibonacci series : " +  first + " " + second );

        for(int i = 3 ; i <= num; ++i)
        {
            System.out.print(" " + sum);
            first = second ;
            second = sum ;
            sum = first + second;
        }

        
    }
}
