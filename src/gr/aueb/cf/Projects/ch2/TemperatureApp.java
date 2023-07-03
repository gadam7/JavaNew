package gr.aueb.cf.Projects.ch2;

import java.util.Scanner;
/**
 * Converts Fahrenheit temperature
 * to Celsius
 */
public class TemperatureApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fahrenheit = 0;
        int celsius = 0;

        System.out.println("Please input temperature in Fahrenheit:");
        fahrenheit = in.nextInt();
        celsius = 5 * (fahrenheit - 32) / 9;
        System.out.printf("%d\u00B0F = %d\u00B0C", fahrenheit, celsius);
    }
}
