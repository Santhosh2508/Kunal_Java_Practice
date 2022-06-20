//Area Of Rectangle Program


import java.util.Scanner;

public class Area_Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of Length and width : ");
        float l = in.nextFloat();
        float w = in.nextFloat();
        float area = l * w;

        System.out.println("Area of Rectangle : " + area);
    }
}
