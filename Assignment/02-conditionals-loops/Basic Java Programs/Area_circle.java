//Area Of Circle Java Program

import java.util.Scanner;

public class Area_circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of Circle : ");
        float r = in.nextFloat();
        double Area = ( r * r )*Math.PI;

        System.out.println("Area of circle : " + Area);
    }
}
