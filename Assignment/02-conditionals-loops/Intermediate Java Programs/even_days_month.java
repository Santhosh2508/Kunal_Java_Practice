/*Kunal is allowed to go out with his friends only on the even days of a given month.
 Write a program to count the number of days he can go out in the month of August.*/

import java.util.Scanner;

public class even_days_month {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Month : ");
        int month = in.nextInt();
        int days, count = 0;
        switch (month)
        {
            case 1,3,5,7,8,10,12 -> days = 31;
            case 4,6,9,11 -> days = 30;
            case 2 -> days = 28;
            default ->{
                System.out.println("Invalid Month.");
                return ;
            }

        }
        System.out.print("The date on which can go out : ");
        for ( int i = 1 ; i <= days ; i++)
        {
            if(i % 2 == 0)
            {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nThe number of days can go out is : " + count);

    }
}
