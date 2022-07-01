//Write a function that returns the sum of first n natural numbers.


import java.util.Scanner;

public class Sum_n {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = in.nextInt();
        System.out.println("The sum of first " + n + " natural numbers is : " + sum_n(n));
    }

    static  int sum_n(int n)
    {
        int sum = 0 ;
        for(int i = 1 ; i<=n;i++)
            sum += i;

        return sum;
    }


}
