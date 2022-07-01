//Define a program to find out whether a given number is even or odd.


import java.util.Scanner;

public class Even_odd_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = in.nextInt();
        Boolean check = even0rodd(num);
        if (check) {
            System.out.println("Number is Even .");
        } else {
            System.out.println("Number is Odd .");
        }
    }
        static Boolean even0rodd(int num)
        {
            return (num | 1) > num;
        }

    }
