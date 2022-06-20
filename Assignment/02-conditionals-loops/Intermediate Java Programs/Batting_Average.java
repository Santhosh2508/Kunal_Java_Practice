//Calculate Batting Average

import java.util.Scanner;

public class Batting_Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the matches of played : ");
        int Matches = in.nextInt();
        int innings, notout, runs;
        float avg;

        do {
            System.out.print("Enter the number of innings batted : ");
            innings = in.nextInt();
        } while (innings > Matches);

        do {
            System.out.print("enter number of times notout : ");
            notout = in.nextInt();
        } while (notout > innings);

        System.out.print("Enter the runs Scored : ");

        runs = in.nextInt();

        if (innings == notout)
            avg = runs;
        else {
            avg = (float) (runs / (innings - notout));
        }

        System.out.println("Batting average : " + avg);

    }
}