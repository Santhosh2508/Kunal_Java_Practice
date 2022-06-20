//Area Of Equilateral Triangle


import java.util.Scanner;

public class Area_Equilateral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of Equilateral Triangle side : ");
        float a = in.nextFloat();
        double area = (Math.sqrt(3)/4) * ( a * a);
        System.out.println("Area of Equilateral Triangle : " + area);
    }
}
