//Perimeter Of Equilateral Triangle


import java.util.Scanner;

public class Perimeter_Equilateral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value Equilateral triangle side : ");
        float a = in.nextFloat();
        float p = 3 * a;

        System.out.println("Perimeter of Equilateral Triangle: " + p);
    }
}
