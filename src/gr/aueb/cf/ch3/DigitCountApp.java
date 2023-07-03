package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculates the number of digits of
 * an integer by repeatedly dividing by
 * 10 until the result of the division is 0.
 */
public class DigitCountApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum, num;
        int count = 0;

        System.out.println("Please insert a number (int)");
        inputNum = in.nextInt();

        num = inputNum;
        do {
            count++;
            num = num / 10;
        } while (num != 0);

        System.out.printf("Num: %d consists of %d digits", inputNum, count);
    }
}
