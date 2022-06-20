//Calculate Distance Between Two Points
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Distance_points {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 , y1 , x2 , y2;
        System.out.print("Enter co-ordinates (x1 , y1) of points : ");
        x1 = in.nextInt();
        y1 = in.nextInt();
        System.out.print("Enter co-ordinates (x2 , y2) of points : ");
        x2 = in.nextInt();
        y2 = in.nextInt();
        double dis = sqrt((x2-x1) * ( x2-x1) + (y2-y1) * (y2-y1));
        System.out.println("Distance Between Two Points : " + dis );
    }
}
