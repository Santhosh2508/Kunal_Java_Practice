//Sum Of A Digits Of Number

import java.util.Scanner;

public class Sum_of_digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = in.nextInt();
        int n = num , sum = 0 , rem ;
        while(n!=0)
        {
            rem = n % 10;
            sum += rem;
            n /= 10;
        }
        System.out.println("The sum of " + num + " is : " + sum );
    }
}
