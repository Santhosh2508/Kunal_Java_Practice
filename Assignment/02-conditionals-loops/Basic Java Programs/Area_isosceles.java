//Area Of Isosceles Triangle

import java.util.Scanner;

public class Area_isosceles {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the value of Base and width : ");
            float b = in.nextFloat();
            float h = in.nextFloat();
            float area = ( b * h)/2;

            System.out.println("Area of Isosceles Triangle : " + area);
        }
    }

