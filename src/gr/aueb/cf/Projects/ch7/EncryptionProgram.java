package gr.aueb.cf.Projects.ch7;

/**
 * Encrypt: A program that encrypts / replaces each
 * character of String with the lexicographically
 * (ASCII!) next character
 */

import java.util.Scanner;

public class EncryptionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to encrypt: ");
        String input = scanner.nextLine();
        String encryptedString = encrypt(input);
        System.out.println("Encrypted string: " + encryptedString);
    }

    public static String encrypt(String input) {
        StringBuilder encryptedString = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            char encryptedChar = (char) (currentChar + 1);
            encryptedString.append(encryptedChar);
        }
        return encryptedString.toString();
    }
}

