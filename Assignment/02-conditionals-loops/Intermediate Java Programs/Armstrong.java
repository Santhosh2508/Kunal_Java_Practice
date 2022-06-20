//Armstrong Number In Java
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        int n = num , sum = 0 , rem ;

        while(n != 0)
        {
            rem = n % 10;
            sum += ( rem * rem * rem);
            n /= 10;
        }
        if ( sum == num)
        {
            System.out.println(num + " is a Armstrong Number . ");

        }
        else
        {
            System.out.println(num + " is not a Armstrong Number . ");
        }

    }
}
