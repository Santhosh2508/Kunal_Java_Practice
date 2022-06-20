//Perimeter of Rhombus

import java.util.Scanner;

public class Perimeter_Rhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of side of Rhombus : ");
        float a = in.nextFloat();

        float p = 4 * a;

        System.out.println("Perimeter of Rhombus : " + p);
    }
}