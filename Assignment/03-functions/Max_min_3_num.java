//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.


import java.util.Scanner;

public class Max_min_3_num {
    public static void main(String[] args) {
        Scanner in = new Scanner((System.in));
        System.out.print("Enter Three numbers to check max and min among the numbers : ");
        int first = in.nextInt();
        int second = in.nextInt();
        int third = in.nextInt();
        int min = min(first , second , third);
        int max = max(first , second , third);
        System.out.println("The maximum is : " + max );
        System.out.println("The minimum is : " + min );

    }

    public static int min(int first , int second , int third)
    {
        int min = first;
        if ( second < min)
            min = second;
        if ( third < min) min = third;
        return min;
    }

    public static int max(int first ,int second , int third)
    {
        int max = first;
        if(second > max)
            max = second;
        if ( third > max)
            max = third;
        return max;
    }
}
