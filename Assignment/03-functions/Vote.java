//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the age : ");
        int age = in.nextInt();
        Boolean check = voting(age);
        if(check)
        {
            System.out.println("Your eligible to vote .");
        }
        else
        {
            System.out.println("Your not eligible to vote .");
        }
    }

    static Boolean voting(int age)
    {
        return (age >= 18);
    }
}
