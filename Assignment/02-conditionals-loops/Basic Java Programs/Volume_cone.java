//Volume of Cone Java Program


import java.util.Scanner;

public class Volume_cone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Radius and Height of Cone : ");
        float r = in.nextFloat();
        float h = in.nextFloat();

        double v = Math.PI * ( r * r) * ( h / 3);
        System.out.println("Volume of Cone : " + v);
    }
}
