package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * It reads integers until it finds a negative one,
 * at which point it stops. It also counts the number of positives.
 */
public class PositivesApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int positivesCount = 0;

        System.out.println("Please insert a positive number (or negative for exit)");
        num = in.nextInt();

        while (num >= 0) {
            System.out.println("Positive number inserted...");
            positivesCount++;
            System.out.println("Please insert a new positive number (or negative for exit)");
            num = in.nextInt();

        }

        System.out.println("You inserted a negative");
        System.out.println("The total count of positives was: " + positivesCount);
    }
}
