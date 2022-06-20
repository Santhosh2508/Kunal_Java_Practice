//Area of Parallelogram

import java.util.Scanner;

public class Area_Parallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of Base and Height : ");
        float b = in.nextFloat();
        float h = in.nextFloat();
        float area = b * h;

        System.out.println("Area of Parallelogram : " + area);
}
}