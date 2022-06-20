//Perimeter Of Parallelogram


import java.util.Scanner;

public class Perimeter_Parallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of Base and side : ");
        float b = in.nextFloat();
        float a = in.nextFloat();

        float p = 2* ( a + b);

        System.out.println("Perimeter of Parallelogram : " + p);
    }
}
