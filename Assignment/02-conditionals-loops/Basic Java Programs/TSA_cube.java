//Total Surface Area Of Cube


import java.util.Scanner;

public class TSA_cube {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the side of Cube : ");
            float a = in.nextFloat();
            float TSA = 6 * ( a * a);
            System.out.println("Total surface area of cube : " + TSA);
        }
    }

