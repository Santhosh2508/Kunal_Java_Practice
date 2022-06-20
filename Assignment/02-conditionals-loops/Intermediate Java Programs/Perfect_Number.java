//Perfect Number In Java
import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0 , num ,i = 1 ;
        System.out.print("Enter a number to check for perfect Number : ");
        num = in.nextInt();
        while (i <= num/2)
        {
            if ( num % i == 0)
            {
                sum += i++;
            }
            else
            {
                i++;
            }

        }
        if (sum == num)
        {
            System.out.println(num + " is a Perfect Number. ");
        }
        else
        {
            System.out.println(num + " is not a Perfect Number. ");
        }

    }
}
