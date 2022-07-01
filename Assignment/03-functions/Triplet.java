//Write a function to check if a given triplet is a Pythagorean triplet or not.
//(A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).


import java.util.Scanner;

public class Triplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements : ");
        for(int i = 0 ; i<n;i++)
        {
            arr[i] = in.nextInt();
        }

        if(isTriplet(arr, n))
        {
            System.out.println("The given elements are Pythagorean triplet.");

        }
        else
        {
            System.out.println("The given elements are not Pythagorean triplet.");
        }

    }

    static Boolean isTriplet(int[] arr, int n)
    {
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = i + 1 ; j < n ; j++)
            {
                for(int k = j + 1 ; k < n ; k++)
                {
                    int x = arr[i] * arr[i] , y = arr[j]*arr[j] , z = arr[k]*arr[k];

                    if( x == y + z || y == x + z || z == x + y)
                    {
//                        System.out.println(x + " " + y + " " + z );
                            return true;
                    }
                }
            }
        }

        return false;
    }
}
