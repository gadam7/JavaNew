package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ternary operator
 */
public class AbsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int abs;

        System.out.println("Please provide a num");
        num = in.nextInt();

        abs = (num > 0) ? num : -num;

//        abs = (num > 0) ? num : (num < 0) ? -num : 0;

        System.out.println("Abs: " + abs);
    }
}
