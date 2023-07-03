package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * It decides if it's snowing based
 * on the temperature. If the temperature
 * is < 0, then it is snowing, otherwise not.
 */
public class BoolFirstApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        int temp;

        System.out.println("Please insert temperature:");
        temp = in.nextInt();

        isSnowing = (temp < 0);

        System.out.println("Is snowing: " + isSnowing);
    }
}
