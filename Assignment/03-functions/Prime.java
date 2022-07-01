//Define a method to find out if a number is prime or not.


import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = in.nextInt();
        Boolean check = isPrime(num);
        if(check)
        {
            System.out.println(num + " is a Prime Number .");
        }
        else {
            System.out.println(num + " is not a Prime Number .");
        }
    }
    static Boolean isPrime(int n)
    {
        if(n <= 1)
            return false;

        for(int c = 2 ;  c * c <= n ; c++)
        {
            if(n % c == 0)
                return false;
        }

        return true;
    }
}
