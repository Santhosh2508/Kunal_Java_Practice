//Write a program to print the sum of two numbers entered by user by defining your own method.


import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two number : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = add(num1,num2);
        System.out.println("The sum of " + num1 + " and " + num2 +" is : " + sum );
    }
    static int add(int a , int b)
    {
        return (a + b);
    }

}
