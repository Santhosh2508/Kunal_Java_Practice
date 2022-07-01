//Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
//        4! = 1 * 2 * 3 * 4 = 24
//        3! = 3 * 2 * 1 = 6
//        2! = 2 * 1 = 2
//        Also,
//        1! = 1
//        0! = 1
//

import java.util.Scanner;


public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        if (num >= 0)
            System.out.println("Factorial of " + num + "! is : " + factorial(num));
        else
            System.out.println("INVALID NUMBER, ENTER NON - NEGATIVE NUMBER.");
    }
    static int factorial(int num)
    {
        int result = 1;
        if(num == 1 | num == 0)
            return result;
        for (int i = 1 ; i<= num ; i++)
        {
            result *= i;
        }
        return result;
    }
}
