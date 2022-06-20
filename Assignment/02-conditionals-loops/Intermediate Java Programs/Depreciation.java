//Calculate Depreciation of Value

import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float amount , deppercent , year ;
        System.out.print("Enter Amount  : ");
        amount = in.nextFloat();
        System.out.print("Enter Depreciation percentage : ");
        deppercent = in.nextFloat();
        System.out.print("Enter numbers of years : ");
        year = in.nextFloat();
        float temp=amount;
        for(int i=0;i<year;i++)
            temp=((100-deppercent)*temp)/100;
        System.out.println("After depreciation = "+temp);
//        float depreciation = (float)(amount * Math.pow((1 - deppercent / 100), year));
//        System.out.println("After Depreciation : " + depreciation);
    }
}
