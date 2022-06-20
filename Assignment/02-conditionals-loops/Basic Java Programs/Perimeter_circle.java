//Perimeter Of Circle


import java.util.Scanner;

public class Perimeter_circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of Radius : ");
        float r = in.nextFloat();
        double c = 2 * Math.PI * r;
        System.out.println("Perimeter of Circle : " + c);
    }
}
