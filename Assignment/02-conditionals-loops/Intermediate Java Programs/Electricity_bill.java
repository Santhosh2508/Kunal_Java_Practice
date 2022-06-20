//Calculate Electricity Bill
//BESCOM 2023 Tariff charges used in program

import java.util.Scanner;

public class Electricity_bill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Electricity consumed in Units : ");
        float units = in.nextInt();
        float amount = 0;
        if (units <= 50)
        {
            amount += (units * 4.05);
        }
        else if (units <= 100)
        {
            amount += 50 * 4.05 + (units - 50) * 5.30;
        }
        else if (units <=200)
        {
            amount += 50 * 4.05 + 50 * 5.30 + (units - 100) * 6.85;
        }
        else {
            amount += 50 * 4.05 + 50 * 5.30 + 100 * 6.85 + (units - 200) * 7.70;
        }
       amount += 85;//fixed charges for 1kwh meter
        amount += (amount * 9/100);// 9% tax
       System.out.println("Electricity bill for " + units + " units  is : " + amount);
    }
}
