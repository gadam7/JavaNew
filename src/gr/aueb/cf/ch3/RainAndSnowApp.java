package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Boolean expressions. it decides whether it is snowing
 * based not only on the temperature, but also on whether
 * it is raining. If it is raining and the temperature
 * is < 0, then it is snowing otherwise not.
 */
public class RainAndSnowApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining, isSnowing;
        int temp;

        System.out.println("Please insert if it is raining (true/false)");
        isRaining = in.nextBoolean();

        System.out.println("Please insert temperature (int)");
        temp = in.nextInt();

        isSnowing = isRaining && (temp < 0);

        System.out.println("Is snowing: " + isSnowing);
    }
}
