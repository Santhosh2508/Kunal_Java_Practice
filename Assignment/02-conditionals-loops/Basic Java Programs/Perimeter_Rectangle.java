//Perimeter of Rectangle

import java.util.Scanner;

public class Perimeter_Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of length and width : ");
        float l = in.nextFloat();
        float w = in.nextFloat();

        float p = 2 * ( l + w);


        System.out.println("Perimeter of Rectangle: " +  p);
    }
}
