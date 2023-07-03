package gr.aueb.cf.Projects.ch7;

/**
 * Decryption: A program that decrypts / replaces each
 * character of String with its lexicographically
 * (ASCII!) previous one
 */

import java.util.Scanner;

public class DecryptionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to decrypt: ");
        String input = scanner.nextLine();
        String decryptedString = decrypt(input);
        System.out.println("Decrypted string: " + decryptedString);
    }

    public static String decrypt(String input) {
        StringBuilder decryptedString = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            char decryptedChar = (char) (currentChar - 1);
            decryptedString.append(decryptedChar);
        }
        return decryptedString.toString();
    }
}

