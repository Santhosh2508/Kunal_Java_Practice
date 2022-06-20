//Reverse A String In Java
import java.util.Scanner;
public class Reverse_string{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        StringBuilder rev = new StringBuilder();
        System.out.print("Enter the String : ");
        str = in.nextLine();

        int length = str.length();

        for ( int i = length - 1 ; i >= 0 ; i --)
        {
            rev.append(str.charAt(i));
        }
        System.out.println("The Reversed String is : " + rev);
    }
}
