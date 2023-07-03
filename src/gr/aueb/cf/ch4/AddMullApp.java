package gr.aueb.cf.ch4;

import java.util.Locale;
import java.util.Scanner;

/**
 * Προσθέτει και πολλαπλασιάζει
 * n πρώτους ακεραίους. Το n θα
 * το δώσει ο χρήστης.
 */
public class AddMullApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int sum = 0;
        int result = 1;

        System.out.println("Please insert a num (int)");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            sum += i;
            result *= i;
        }

        System.out.println("Sum = " + sum);
        System.out.println("Mul = " + result);
        System.out.printf("Mul: %,d", result);
    }
}
