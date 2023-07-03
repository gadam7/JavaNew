package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Counts n!
 */
public class FactoApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int facto = 1;
        int i = 1;

        System.out.println("Please insert n");
        n = in.nextInt();

        while (i <= n) {
            facto *= i;
            i++;
        }

        System.out.printf("%d! = %d", n, facto);
    }
}
