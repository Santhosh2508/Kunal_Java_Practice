//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.


import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        float radius = in.nextFloat();
        cir_rad(radius);
    }
    static void cir_rad(float r)
    {
        double circumference = 2 * Math.PI * r;
        double area = Math.PI * r  * r;
        System.out.println("Area of Circle : " + ((float)area));
        System.out.println("Circumference of Circle : " + (float) circumference);

    }
}
