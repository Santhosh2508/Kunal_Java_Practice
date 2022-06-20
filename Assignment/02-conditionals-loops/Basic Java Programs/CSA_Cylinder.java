//Curved Surface Area Of Cylinder


import java.util.Scanner;

public class CSA_Cylinder {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the Radius and Height Cylinder : ");
            float r = in.nextFloat();
            float h = in.nextFloat();

            double CSA = 2 * Math.PI * r * h;
            System.out.println("Curved surface of Cylinder : " + CSA);
        }
    }


