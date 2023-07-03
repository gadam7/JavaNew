package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Linearizes if-then-else.
 */
public class LinearBooleanBingoApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        final int SECRET_KEY = 17;
        boolean bingo = false;

        while (!bingo) {
            System.out.println("Please provide a num");
            num = in.nextInt();

            if (num != SECRET_KEY) {
                System.out.println("Please try again");
                continue;
            }

            System.out.println("Bingo!!");
            bingo = true;
        }
    }
}
