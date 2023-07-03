package gr.aueb.cf.ch2;

import java.util.Scanner;

public class EurosApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputEu, eu500, eu100, eu50, eu20, eu10, eu5, eu1, remainingEu;

        System.out.println("Please insert the amount (in EU)");
        inputEu = in.nextInt();

        remainingEu = inputEu;

        eu500 = remainingEu / 500;
        remainingEu = remainingEu % 500;
        eu100 = remainingEu / 100;
        remainingEu = remainingEu % 100;
        eu50 = remainingEu / 50;
        remainingEu = remainingEu % 50;
        eu20 = remainingEu / 20;
        remainingEu = remainingEu % 20;
        eu10 = remainingEu / 10;
        remainingEu = remainingEu % 10;
        eu5 = remainingEu / 5;
        remainingEu = remainingEu % 5;
        eu1 = remainingEu / 1;
        remainingEu = remainingEu % 1;

        System.out.printf("%,d EU = 500: %,d, 100: %,d, 50: %,d, 20: %,d, 10: %,d, 5: %,d, 1: %,d",
                inputEu, eu500, eu100, eu50, eu20, eu10, eu5, eu1, remainingEu);


    }
}
