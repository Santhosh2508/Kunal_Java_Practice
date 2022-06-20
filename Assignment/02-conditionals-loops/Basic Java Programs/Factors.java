//Input a number and print all the factors of that number (use loops).

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Number to print factors : ");
        int number = in.nextInt();
        int i = 1;
        System.out.println("The Factors of  " + number + " are : ");
        while ( i <= number )
        {
            if(number % i == 0)
            {
                System.out.println(i + " ");
            }
            i++;
        }
    }
}
