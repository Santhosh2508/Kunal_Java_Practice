//HCF Of Two Numbers Program
import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
            Scanner  in = new Scanner(System.in);
            int num1 , num2 , min , i = 1, HCF = 1;
            System.out.print("Enter the Two Numbers to find HCF : ");
            num1 = in.nextInt();
            num2 = in.nextInt();
        min = Math.min(num1, num2);
        while ( i <= min)
        {
            if( num1 % i == 0 && num2 % i == 0)
            {
                HCF = i++;
            }
            else
            {
                i++;
            }
        }
        System.out.println("The HCF of " + num1 + " and " + num2 + " is : " + HCF);
    }
}
