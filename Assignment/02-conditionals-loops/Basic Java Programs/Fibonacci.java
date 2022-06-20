//Fibonacci Series In Java Programs

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int first = 0;
        int second = 1;
        int sum = first + second ;

        System.out.println("Enter the number of terms : ");
        int n = in.nextInt();

        System.out.print("Fibonacci series : " +  first + " " + second );

        for ( int i = 3 ; i <= n ; i++)
        {
            System.out.println(" " + sum);
            first = second;
            second = sum ;
            sum = first + second ;
        }

    }

}
