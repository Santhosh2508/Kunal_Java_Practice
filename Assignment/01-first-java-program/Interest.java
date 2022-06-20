package com.Santhosh;//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

class Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principal Amount : ");
        float p = input.nextFloat();
        System.out.print("Enter Time : ");
        float t = input.nextFloat();
        System.out.print("Enter Rate : ");
        float r = input.nextFloat();

        float result = (p * t * r ) / 100;

        System.out.println("The simple interest of input principle , time and rate  : " + result );
    }
}