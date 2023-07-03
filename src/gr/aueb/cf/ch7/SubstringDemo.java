package gr.aueb.cf.ch7;

/**
 * Εκτυπώνει ένα String σε μορφή substrings
 * ενός χαρακτήρα τη φορά.
 *
 * @author adminmacbook
 */

public class SubstringDemo {

    public static void main(String[] args) {
        String s = "Athens Uni of Economics and Bus";

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.substring(i, i+1));

        }

        System.out.println();

        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
