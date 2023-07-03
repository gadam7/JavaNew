package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * It decides whether a car's lights should
 * turn on based on three variables: if it's
 * raining AND at the same time at least one
 * of the following is true: it's dark or we're
 * running (speed > 100). We get these values from
 * the user (stdin).
 */
public class LightsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining, isDark, isRunning, lightsOn;
        int velocity;

        System.out.println("Please insert if it is raining (true/false)");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it is dark (true/false)");
        isDark = in.nextBoolean();

        System.out.println("Please insert velocity (int)");
        velocity = in.nextInt();

        lightsOn = isRaining && (isDark || (velocity > 100));

        System.out.println("Lights on: " + lightsOn);
    }
}
