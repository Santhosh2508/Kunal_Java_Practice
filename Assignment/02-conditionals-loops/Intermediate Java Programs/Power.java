//Power In Java

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Base number : ");
        int a = in.nextInt();
        System.out.print("Enter the exponent : ");
        int b  = in.nextInt();
        System.out.println("The Power result : " + Math.pow(a,b));

    }

}
