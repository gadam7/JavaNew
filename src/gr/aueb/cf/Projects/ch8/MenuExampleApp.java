package gr.aueb.cf.Projects.ch8;

/**
 * This is a menu example that allows the user to make a choice from the menu,
 * handles non-integer input, and catches and displays appropriate error
 * messages for invalid choices.
 */

import java.util.Scanner;

public class MenuExampleApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        try {
            choice = getChoice(sc);
            printChoice(choice);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid choice! Please choose a number between 1 and 5.");
        }
    }

    public static int getChoice(Scanner sc) {
        System.out.println("Menu:");
        System.out.println("1. Option 1");
        System.out.println("2. Option 2");
        System.out.println("3. Option 3");
        System.out.println("4. Option 4");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");

        while (true) {
            if (sc.hasNextInt()) {
                int choice = sc.nextInt();
                if (choice >= 1 && choice <= 5) {
                    return choice;
                }
            } else {
                sc.next(); // Consume the non-integer input
            }

            System.out.println("Invalid choice! Please choose a number between 1 and 5.");
            System.out.print("Enter your choice: ");
        }
    }

    public static void printChoice(int choice) {
        if (choice >= 1 && choice <= 4) {
            System.out.println("You choose option " + choice);
        } else if (choice == 5) {
            System.out.println("Exiting...");
        } else {
            throw new IllegalArgumentException();
        }
    }
}

