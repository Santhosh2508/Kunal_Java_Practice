//Calculate Average Of N Numbers

import java.util.Scanner;

public class Average_N_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of terms n : ");
        int n = in.nextInt();
        int sum = 0;
        System.out.println("Enter the " + n + " terms of numbers : ");
        for ( int i = 0 ; i < n ; i++)
        {
            sum += in.nextInt();
        }
        float average = ( float) sum / n ;
        System.out.println("The average of numbers entered is : " + average );

    }

}
