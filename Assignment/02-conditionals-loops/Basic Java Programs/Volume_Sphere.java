//Volume of Sphere

import java.util.Scanner;

public class Volume_Sphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Radius Sphere : ");
        float r = in.nextFloat();

        double v = Math.PI * (r * r * r) * 4/3;
        System.out.println("Volume of Sphere : " + v);

    }
}