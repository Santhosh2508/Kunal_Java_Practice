//Write a function that returns all prime numbers between two given numbers.

import java.util.Scanner;

public class Prime_btw_interval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the lower bound number : ");
        int a = in.nextInt();
        System.out.print("Enter the upper bound number : ");
        int b = in.nextInt();
        for(int i = a ; i <= b ; i++)
        {
            if(isPrime(i))
            {
                System.out.print(i + " ");
            }
        }
    }

    static  Boolean isPrime(int num)
    {
        if(num == 0 || num == 1)
            return false;

        if(num == 2)
            return true;

        for (int i = 2 ; i * i <= num ; i++)
            if(num % i == 0)
                return false;

        return true;
    }
}
