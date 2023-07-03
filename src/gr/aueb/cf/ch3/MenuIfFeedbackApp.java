package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * if - the - else
 */
public class MenuIfFeedbackApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Choose one of the following or 5 for exit");
            System.out.println("1. Add");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Update");
            System.out.println("5. Exit");
            choice = in.nextInt();

            if (choice == 1) {
                System.out.println("Successful Add");
            } else if (choice == 2) {
                System.out.println("Successful Search");
            } else if (choice == 3) {
                System.out.println("Successful Delete");
            } else if (choice == 4) {
                System.out.println("Successful Update");
            } else if (choice == 5) {
                System.out.println("You choose Exit");
            } else {
                System.out.println("Wrong Choice");
            }
        } while (choice != 5);

        System.out.println("Goodbye");
    }
}
