//Compound Interest Java Program

import java.util.Scanner;

public class Compound_Interest {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            float principal , year , rate , n;
            double amount ;
            System.out.print("Enter Principal Amount  : ");
            principal = in.nextFloat();
            System.out.print("Enter Interest rate : ");
            rate = in.nextFloat();
            System.out.print("Enter numbers of times interest compounded per unit time : ");
            n = in.nextFloat();
            System.out.print("Enter time period : ");
            year = in.nextFloat();
            amount = principal * Math.pow((1 + rate /(100 * n )), (n * year));
            System.out.println("Amount : " + amount);
            System.out.println("Compound Interest : " + (amount - principal));
        }
    }

