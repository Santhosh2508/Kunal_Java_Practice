//Find Ncr & Npr

import java.util.Scanner;

public class Ncr_Npr {
    static  double fact(int n)
    {
        int fact = 1;
        if ( n == 0 || n == 1)
        {
            return 1;
        }
        else
        {
            for ( int i = 1 ; i <=n ; i++)
            {
                fact = fact*i;
            }
            return fact;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = in.nextInt();
        System.out.print("Enter value of r : ");
        int r = in.nextInt();
        double per = fact(n) / fact(n-r);
        double com = fact(n) / (fact(n-r) * fact(r));
        System.out.println("The value of " + n + "p" + r +" : " + per);
        System.out.println("The value of " + n + "c" + r +" : " + com);
    }
}
