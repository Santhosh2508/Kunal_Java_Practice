//Volume Of Pyramid


import java.util.Scanner;

public class Volume_Pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of the Pyramid: ");
        float height = input.nextFloat();
        System.out.print("Enter the base of the Pyramid: ");
        float base = input.nextFloat();
        System.out.print("Enter the length of the Pyramid: ");
        float length = input.nextFloat();

        float volume = length *height * base;

        System.out.println("Volume of the prism is = " + volume);
    }
}