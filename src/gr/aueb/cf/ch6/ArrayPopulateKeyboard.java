package gr.aueb.cf.ch6;

import java.util.Scanner;

/**
 * Αρχικοποιεί με Scanner από το πληκτρολόγιο.
 */
public class ArrayPopulateKeyboard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[5];

        for (int i = 0; i < ages.length; i++) {
            System.out.println("Give number for the position: " + (i+1));
            /* Δίνουμε i+1 για να είναι πιο φιλικό προς τον χρήστη
             * Ο χρήστης δεν καταλαβαίνει τις θέσεις από 0 - 4 αλλά
             * από 1 - 5
             */
            ages[i] = sc.nextInt();
        }
        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i] + " ");
        }

        sc.close();
    }
}
