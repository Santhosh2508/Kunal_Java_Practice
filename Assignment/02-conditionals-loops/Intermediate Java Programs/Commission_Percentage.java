//Calculate Commission Percentage
import java.util.Scanner;


public class Commission_Percentage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the sale price : ");
        float sale_price = in.nextFloat();
        System.out.print("Enter the commission Percentage : ");
        int commission_percentage = in.nextInt();
        float commission_amount = sale_price * commission_percentage / 100;
        System.out.println("The commission amount : " + commission_amount);
    }
}
