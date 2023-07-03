package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * It decides if a year is a leap year,
 * where a leap year means the year is
 * divisible by 4, not divisible by 100,
 * and divisible by 100 and by 400.
 */
public class LeapYearApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year;
        boolean isLeap = false;

        System.out.println("Please provide a yeah (int)");
        year = in.nextInt();

        isLeap = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);

        if (isLeap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
