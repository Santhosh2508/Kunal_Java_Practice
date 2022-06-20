//Volume Of Prism


import java.util.Scanner;

public class Volume_Prism {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the Area of Base and Height of Prism : ");
            float b = in.nextFloat();
            float h = in.nextFloat();
            float v = b * h;
            System.out.println("Volume of Prism : " + v);
        }
    }

