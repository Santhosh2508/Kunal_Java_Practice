//Future Investment Value
import java.util.Scanner;

public class Future_Investment {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the principal amount : ");
        float principal = in.nextFloat();
        System.out.print("Enter the interest rate : ");
        float rate = in.nextFloat();
        System.out.print("Enter the time period in years : ");
        float time = in.nextFloat();
        double interest = principal * Math.pow((1+rate/100),time);
        System.out.println("Future Investment : " +(float) interest);

    }
}
