//Write a program that will ask the user to enter his/her marks (out of 100).
//Define a method that will display grades according to the marks entered as below:
//Marks        Grade
//        91-100         AA
//        81-90          AB
//        71-80          BB
//        61-70          BC
//        51-60          CD
//        41-50          DD
//        <=40          Fail

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float TotalMarks = 0, percentage;
        System.out.print("Enter number of Subjects : ");
        int count = in.nextInt();
        System.out.print("Enter Marks of " + count + " subjects : ");
        for (int i = 0; i < count; i++) {
            TotalMarks += in.nextFloat();
        }
        System.out.print("Total Marks : " + TotalMarks);
        percentage = (TotalMarks / (count * 100)) * 100;
        System.out.print("\n");
        grade(percentage);
    }

    static void grade(float percentage)
    {
        switch ((int) percentage / 10) {
            case 9 -> System.out.println("Grade : AA");
            case 8 -> System.out.println("Grade : AB");
            case 7 -> System.out.println("Grade : BB");
            case 6 -> System.out.println("Grade : BC");
            case 5 -> System.out.println("Grade : CD");
            case 4 -> System.out.println("Grade : DD");
            default -> System.out.println("Grade : Fail");
        }
    }
}
