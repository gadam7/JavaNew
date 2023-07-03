package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Διαβάζει έναν char με Scanner
 */
public class CharScannerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char inputChar;

        //  H nextLine επιστρέφει όλη τη γραμμή μέχρι το \n
        //  H charAt(0) επιστρέφει τον πρώτο char ως UTF-16
        System.out.println("Please insert a char:");
        inputChar = in.next().charAt(0);

        System.out.println("Char: " + inputChar);
    }
}
