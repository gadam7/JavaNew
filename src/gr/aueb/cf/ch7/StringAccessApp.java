package gr.aueb.cf.ch7;

/**
 * Traverses, reads and prints a string,
 * character by character.
 */
public class StringAccessApp {

    public static void main(String[] args) {
        String s = "Coding Factory";

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }

        System.out.println();

        // reverse order
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i) + " ");
        }
    }
}
