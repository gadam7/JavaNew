package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * User inputs an int that is equal to seconds and is
 * transformed to days, hours, minutes, seconds and
 * prints the result.
 */
public class Seconds2Demo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int DAY = 24 * 3600;
        final int HOUR = 3600;
        final int MINUTE = 60;
        int inputSeconds, days, hours, minutes, remainingSeconds;

        System.out.println("Please insert the count of Seconds");
        inputSeconds = in.nextInt();

        remainingSeconds = inputSeconds;

        days = remainingSeconds / DAY;
        remainingSeconds = remainingSeconds % DAY;

        hours = remainingSeconds / HOUR;
        remainingSeconds = remainingSeconds % HOUR;

        minutes = remainingSeconds / MINUTE;
        remainingSeconds = remainingSeconds % MINUTE;

        System.out.printf("Input Seconds: %d = %d Days, %d Hours, %d Minutes, %d Seconds",
                inputSeconds, days, hours, minutes, remainingSeconds);
    }
}
