//Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class Largest_of_inputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int largest = 0 , input;
        while ((input = in.nextInt()) != 0)
        {
            if ( input > largest)
            {
                largest = input;
            }
        }
        System.out.println("Largest number from all input : " + largest);

    }
}
