package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δείχνει τη χρήση των break και
 * continue.
 */
public class BreakContinueApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int sum =0;
//        boolean found = false;

        while (true) {
            System.out.println("Please provide a num");
            num = in.nextInt();

            if (num == 5) { //Το 5 δεν θα είναι μέσα στο sum
                continue;
            }

            sum += num;
            if (num == 10) {
                System.out.println("Bingo!!!");
//                found = true;
                break;
            }
        }

        System.out.println("Sum: " + sum);
    }
}
