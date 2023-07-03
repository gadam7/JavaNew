package gr.aueb.cf.Projects.ch5;

import java.util.Scanner;

/**
 * Create an application that displays a menu with 6 options:
 * 1. Display n stars horizontal
 * 2. Display n stars vertical
 * 3. Display n lines with n stars
 * 4. Display n lines with stars 1 – n
 * 5. Display n lines with stars n – 1
 * 6. Exit the program
 * We give a choice from 1 to 6, then we enter number for stars
 */

public class StarsMenu {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        int numStars = 0;

        while (choice != 6) {
            System.out.println("Menu:");
            System.out.println("1. Display n stars horizontal");
            System.out.println("2. Display n stars vertical");
            System.out.println("3. Display n lines with n stars");
            System.out.println("4. Display n lines with stars 1 – n");
            System.out.println("5. Display n lines with stars n – 1");
            System.out.println("6. Exit the program");
            System.out.print("Enter your choice: ");
            choice = in.nextInt();

            if (choice >= 1 && choice <= 5) {
                System.out.print("Enter the number of stars: ");
                numStars = in.nextInt();
            }

            switch (choice) {
                case 1:
                    displayStarsHorizontal(numStars);
                    break;
                case 2:
                    displayStarsVertical(numStars);
                    break;
                case 3:
                    displayLinesWithNStars(numStars);
                    break;
                case 4:
                    displayLinesWithStarsOnePlusN(numStars);
                    break;
                case 5:
                    displayLinesWithStarsNMinusOne(numStars);
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    public static void displayStarsHorizontal(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void displayStarsVertical(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }

    public static void displayLinesWithNStars(int n) {
        for (int i = 0; i < n; i++) {
            displayStarsHorizontal(n);
        }
    }

    public static void displayLinesWithStarsOnePlusN(int n) {
        for (int i = 1; i <= n; i++) {
            displayStarsHorizontal(i);
        }
    }

    public static void displayLinesWithStarsNMinusOne(int n) {
        for (int i = n; i >= 1; i--) {
            displayStarsHorizontal(i);
        }
    }
}
