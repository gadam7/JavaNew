package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το πλήθος των ψηφίων
 * ενός ακεραίου, το άθροισμα των ψηφίων
 * και το άθροισμα του πρώτου και του τελευταίου
 * ψηφίου.
 * π.χ. 531 -> count: 3, sum: 9, leftmost + rightmost: 6
 */
public class DigitApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int num = 0;
        int count = 0;
        int sum = 0;
        int sumLeftRight = 0;
        int currentDigit = 0;
        int rightMost = 0;
        int leftMost = 0;

        System.out.println("Please insert num (int)");
        inputNum = in.nextInt();

        num = inputNum;
        do {
            count++;
            currentDigit = num % 10;
            sum += currentDigit;
            if (count == 1) {
                rightMost = currentDigit;
            }
            num = num / 10;
        } while (num != 0);

        leftMost = currentDigit;
        sumLeftRight = leftMost + rightMost;

        System.out.println("Count: " + count);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Sum of leftMost, rightMost digits: " + sumLeftRight);
    }
}
