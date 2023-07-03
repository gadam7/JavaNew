package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Scanner Demo. Reads two ints from standard
 * input (keyboard) and gets/prints the sum.
 */
public class ScannerDemo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;

        System.out.println("Please insert two ints:");
        num1 = in.nextInt();
        num2 = in.nextInt();

        sum = num1 + num2;

        System.out.printf("The summary of %d and %d is: %d", num1, num2, sum);

    }
}
