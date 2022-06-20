//Subtract the Product and Sum of Digits of an Integer

import java.util.Scanner;

public class diff_prod_sum_integer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the integer : ");
        int num = in.nextInt();
        int sum = 0 , product = 1;
        int n = num;
        while (n >0)
        {
            sum += n % 10;
            product *= n % 10;
            n /= 10;
        }
        int diff = product - sum ;

        System.out.println("The Subtraction of the product and sum of digits of an integer  : " + num + " is " + diff);
    }
}
