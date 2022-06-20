//Area Of Rhombus

import java.util.Scanner;

public class Area_Rhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of Diagonals : ");
        float p = in.nextFloat();
        float q = in.nextFloat();
        float area = (p*q)/2;

        System.out.println("Area of Rhombus : " + area);
    }
}
