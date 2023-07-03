package gr.aueb.cf.ch8;

import java.util.Scanner;

/**
 * NumberFormatException is thrown when we
 * parse a non-numeric token with wrapper
 * classes, such as Integer.parseInt()
 */
public class NumberFormatExceptionApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        String inputStr = " ";

        try {
            System.out.println("Please insert an int: ");
            inputStr = in.nextLine();
            num = Integer.parseInt(inputStr);
            System.out.println("Input number: " + num);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
