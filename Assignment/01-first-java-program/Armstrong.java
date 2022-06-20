package com.Santhosh;//To find Armstrong Number between two given number.
import  java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 , num2,check , sum, rem;
        System.out.print("Enter the first Number : ");
        num1 = input.nextInt();
        System.out.print("Enter the Second Number : ");
        num2 = input.nextInt();

        for(int i = num1+1; i < num2; i++)
        {
            sum = 0 ;
            check = i;
            while(check != 0 )
            {
                rem = check % 10;
                sum+= (rem * rem * rem);
                check /= 10;
            }
            if (sum == i )
            {
                System.out.println(i + " is a Armstrong Number");
            }
        }
    }
}
