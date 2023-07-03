package gr.aueb.cf.Projects.ch3;

import java.util.Scanner;

/**
 * It displays a Menu and the user
 * makes a choice and receives a
 * corresponding feedback.
 */
public class FeedbackMenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Choose one of the following:");
            System.out.println("1. Input");
            System.out.println("2. Delete");
            System.out.println("3. Update");
            System.out.println("4. Search");
            System.out.println("5. Exit");
            choice = in.nextInt();

            if (choice <1 || choice > 5) {
                System.out.println("Invalid selection, try again");
                continue;
            }

                if (choice == 1) {
                    System.out.println("You chose Input");
                } else if (choice == 2) {
                    System.out.println("You chose Delete");
                } else if (choice == 3) {
                    System.out.println("You chose Update");
                } else if (choice == 4) {
                    System.out.println("You chose Search");
                } else if (choice == 5) {
                    System.out.println("You chose Exit");
                }
            } while (choice != 5);
    }
}

