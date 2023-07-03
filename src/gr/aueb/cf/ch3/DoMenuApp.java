package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Prints a menu, until the user
 * chooses to exit.
 */
public class DoMenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Choose one from below:");
            System.out.println("1. Add Product");
            System.out.println("2. Delete Product");
            System.out.println("3. Exit");
            choice = in.nextInt();
        } while (choice != 3);

        System.out.println("Thanks for using our app");
    }
}
