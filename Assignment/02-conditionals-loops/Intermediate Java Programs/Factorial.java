//Factorial Program In Java
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Positive number for factorial : " );
        int num = in.nextInt();
        int fact = 1;
        if(num == 0)
        {
            System.out.println("Factorial of  " + num +"! : " + 1 );
        }
        else if(num > 0)
        {
            int n = num;
            while (n>0)
            {
                fact *= n;
                n--;
            }
            System.out.println("Factorial of  " + num +"! : " + fact );
        }
        else {
            System.out.println("Enter Non Negative Number.");
        }
    }

}
