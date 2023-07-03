package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * Reads strings from the standard input.
 */
public class StringInput2App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;

        System.out.println("Please insert a string that ends with whitespace (enter/tab/space)");
        s = sc.next();
        sc.nextLine();      // consumes the new line character(s)
        System.out.println(s);

        System.out.println("Please insert a new string that ends with enter");
        s = sc.nextLine();
        System.out.println(s);
    }
}
