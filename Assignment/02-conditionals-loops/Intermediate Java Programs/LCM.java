//LCM Of Two Numbers
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2, max, LCM;
        System.out.print("Enter the Two Numbers to find LCM : ");
        num1 = in.nextInt();
        num2 = in.nextInt();
        max = Math.max(num1, num2);
        while (true) {
            if (max % num1 == 0 && max % num2 == 0) {
                LCM = max;
                break;
            } else {
                max++;
            }

        }
        System.out.println("The LCM of " + num1 + " and " + num2 + " is : " + LCM);
    }
}
