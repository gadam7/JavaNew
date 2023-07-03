package gr.aueb.cf.Projects.ch2;

import java.util.Scanner;

/**
 * Converts day, month and year
 * to dd/mm/yy
 */
public class DateApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;

        System.out.println("Please input day, month and year");
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();
        System.out.printf("Date is: %02d/%02d/%02d", day, month, year % 100);
    }
}
