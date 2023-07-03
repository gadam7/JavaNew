package gr.aueb.cf.ch8;

import java.util.Scanner;

/**
 * java Arithmetic Exception with try/catch
 */

public class ArithmeticException3App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            try {
                System.out.println("Please insert a numerator and a denominator: ");
                numerator = in.nextInt();
                denominator = in.nextInt();

                result = numerator / denominator;

                System.out.printf("%d / %d = %d\n", numerator, denominator, result);
            } catch (ArithmeticException e) {
                e.printStackTrace();
                break;
            }
        }

        System.out.println("Thanks for using the app!!");
    }
}
