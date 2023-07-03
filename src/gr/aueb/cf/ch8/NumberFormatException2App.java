package gr.aueb.cf.ch8;

import java.util.Scanner;

/**
 * NumberFormatException is thrown when we parse a non-numeric
 * token with wrapper classes, such as Integer.parse.Int()
 */
public class NumberFormatException2App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        String inputStr = " ";

        System.out.println("Please insert an int: ");
        inputStr = in.nextLine();
        if (isInt(inputStr)) {
            num = Integer.parseInt(inputStr);
            System.out.println("Num: " + num);
        } else {
            System.out.println("Error in parsing. Please insert an integer: ");
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
