//Volume of Cylinder
import java.util.Scanner;

public class Volume_Cylinder {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the Radius and Height of Cylinder : ");
            float r = in.nextFloat();
            float h = in.nextFloat();

            double v = Math.PI * ( r * r) * h ;
            System.out.println("Volume of Cylinder : " + v);
        }
    }


