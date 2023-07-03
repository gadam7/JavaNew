package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculates and prints the summary of
 * an integer digits.
 */
public class DigitsOfNum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, remaining, rightmostDigit;
        int sumOfDigits = 0;

        System.out.println("Please insert a num:");
        num = in.nextInt();
        remaining = num;

        do {
            rightmostDigit = remaining % 10;
            sumOfDigits += rightmostDigit;
            remaining = remaining / 10;
        } while (remaining != 0);

        System.out.println("Sum of Digit: " + sumOfDigits);
    }
}
