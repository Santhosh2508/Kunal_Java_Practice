//Check Leap Year Or Not


import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year;
        System.out.print("Enter the Year : ");
        year = in.nextInt();
        if ( year % 400 == 0 )
        {
            System.out.println(year + " is a Leap year.");

        }
        else if (year % 100 == 0 )
        {
            System.out.println(year + " is not a Leap year.");
        } else if (year % 4 == 0 )
        {
            System.out.println(year + " is a Leap year.");
        }
        else {
            System.out.println(year + " is not a Leap year.");
        }
    }
}