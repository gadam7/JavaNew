package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * EU to USD Converter.
 */
public class EuroUsdConverter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int insertEuros;
        final  int PARITY = 99; // USA cents
        int totalUsaCents, usaCents, usaDollars;

        System.out.println("Please insert an amount (in EU)");
        insertEuros = in.nextInt();

        totalUsaCents = insertEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        System.out.printf("%d EU = %d USD & %d Cents", insertEuros, usaDollars, usaCents);
    }
}
