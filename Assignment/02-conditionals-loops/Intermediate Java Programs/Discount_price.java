//Calculate Discount Of Product

import java.util.Scanner;

public class Discount_price {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Original price  of product : ");
        float org = in.nextFloat();
        System.out.print("Enter the Discount Percentage : ");
        int dis = in.nextInt();
        float dis_amount = org - ( dis * org  / 100);
        System.out.println("Discount Price of the Product is : " + dis_amount);
    }
}
