//Java Program Vowel Or Consonant

import java.util.Scanner;

public class VowelConsonant {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a Character : ");
            char ch = in.next().trim().charAt(0);
            ch = Character.toLowerCase(ch);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
                System.out.println(ch + " is vowel");
            else
                System.out.println(ch + " is consonant");

        }
    }

