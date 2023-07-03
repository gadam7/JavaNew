package gr.aueb.cf.ch11.staticfields;

import java.util.Scanner;

/**
 * Στα static blocks ή static initializers μπορούμε να έχουμε
 * περισσότερες εντολές και δομές ελέγχου ενώ στα static
 * variables έχουμε μόνο απλά expressions.
 */
public class StaticBlockApp {
    static Scanner in = new Scanner(System.in);
    static int count;

    static {
        int num = in.nextInt();
        count = (num == 1) ? 1 : 0;
    }

    public StaticBlockApp() {}
}
