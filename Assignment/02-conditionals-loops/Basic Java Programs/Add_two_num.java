//Addition Of Two Numbers

import java.util.Scanner;

public class Add_two_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("Addition of " + num1 + " + " + num2 + " = " + sum  );
    }
}
