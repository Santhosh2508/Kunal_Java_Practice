package com.Santhosh;//Input currency in rupees and output in USD.


import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount in INR : ");

        float INR = input.nextFloat();

        float USD = INR / 77.68f; // As per day 03/06/22

        System.out.println(INR + " INR  = " + USD + " USD");
    }
}
