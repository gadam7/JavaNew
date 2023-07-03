package gr.aueb.cf.ch2;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

/**
 * Converts days, hours, minutes and seconds
 * to total seconds.
 */
public class DHMToSec {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SEC_DAY = 3600 * 24;
        final int SEC_HOUR = 3600;
        final int SEC_MIN = 60;
        long days, hours, mins, secs, totalSec;

        System.out.println("Give Days, Hours, Minutes and Seconds");
        days = in.nextLong();
        hours = in.nextLong();
        mins = in.nextLong();
        secs = in.nextLong();

        totalSec = (days * SEC_DAY) + (hours * SEC_HOUR) + (mins * SEC_MIN) + secs;

        System.out.printf("Total Seconds: %,d", totalSec);



    }
}
