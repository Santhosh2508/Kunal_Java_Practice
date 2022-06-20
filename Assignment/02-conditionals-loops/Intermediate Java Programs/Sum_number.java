//Sum Of N Numbers

import java.util.Scanner;

public class Sum_number {
    public static void main(String[] args) {
        int n , sum = 0 ;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of N numbers : ");
        n = in.nextInt();
        System.out.print("Enter the " + n + " Numbers : ");
        for( int i = 0 ; i < n ; i++)
        {
            sum += in.nextInt();
        }
        System.out.println("The Sum is : " + sum);
    }
}
