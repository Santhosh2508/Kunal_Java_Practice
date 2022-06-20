//Calculate CGPA Java Program

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int subjects = in.nextInt();
        float sum = 0 , CGPA , CGPA_percentage ;
        for ( int i = 0 ; i < subjects ; i++)
        {
            System.out.print("Enter Subject " +  ( i+1 ) + " Grade points : ");
            sum += in.nextFloat();
        }
        CGPA = sum / subjects;
        CGPA_percentage = (float) (9.5 * CGPA);
        System.out.println("CGPA Percentage : " + CGPA_percentage +"%.");

    }
}
