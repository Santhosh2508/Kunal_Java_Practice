//Define a method that returns the product of two numbers entered by user.

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int product  = prod(a,b);
        System.out.println("The product of " + a + " and " + b + " is : " + product);
    }
    static  int prod(int A , int B)
    {
        return ( A*B);
    }
}
