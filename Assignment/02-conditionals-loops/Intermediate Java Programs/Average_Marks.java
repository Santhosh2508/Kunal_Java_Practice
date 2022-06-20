//Calculate Average Marks

import java.util.Scanner;

public class Average_Marks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float sum = 0 , avg , marks;
        System.out.print("Enter 6 Subjects Marks : ");
        for (int i = 0; i < 6; i++)
        {
            marks = in.nextInt();
            if (marks >= 0 && marks <= 100)
            {
                sum += marks;
            }
            else {
                System.out.println("Invalid Marks.");
                return ;
            }

        }
        avg = sum / 6;
        System.out.println("The Average marks of 6 subjects is : " + avg);
    }
}
