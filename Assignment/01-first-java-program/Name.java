package com.Santhosh;//Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = input.next();

        System.out.println("Hello " + name + " ,Wel Come to Java World");
    }
}
