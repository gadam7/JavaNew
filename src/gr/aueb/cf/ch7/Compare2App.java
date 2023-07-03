package gr.aueb.cf.ch7;

/**
 * String.compareTo() and
 * String.compareToIgnoreCase()
 */
public class Compare2App {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "athens";

        if (s1.compareTo(s2) < 0 ) System.out.println(" 'a'thens is greater than 'A'thens");
        if (s1.compareToIgnoreCase(s2) == 0) System.out.println("Are equal ignoring case");
    }
}
