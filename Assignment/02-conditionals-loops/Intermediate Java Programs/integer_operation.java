/*Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers
from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.*/

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class integer_operation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num , sumodd = 0 , sumeven = 0  , sumnev= 0;
        System.out.print("Enter the list of Numbers (N) : ");
        while ( (num = in.nextInt()) != 0 )
        {
            if( num < 0)
            {
                sumnev += num ;
            }
            else if(num % 2 == 0)
            {
                sumeven += num;
            }
            else
            {
                sumodd += num;
            }
        }
        System.out.println("Sum of +ve even numbers : " + sumeven);
        System.out.println("Sum of +ve odd numbers  : " + sumodd);
        System.out.println("Sum of negative numbers : " + sumnev);
        }
    }
