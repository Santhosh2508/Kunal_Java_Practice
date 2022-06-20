//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

import java.util.Scanner;

public class Sum_of_inputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0 , input;
        while ((input = in.nextInt()) != 0)
        {
            sum += input;
        }
        System.out.println("Sum of all numbers : " + sum);

    }
}
