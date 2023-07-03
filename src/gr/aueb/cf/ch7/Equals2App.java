package gr.aueb.cf.ch7;

/**
 * String.equals() just checks for equality
 * or inequality. Not less or greater than.
 */
public class Equals2App {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "Athens";
        String s3 = "London";
        String s4 = "ATHENS";

        boolean isEqual;

        isEqual = s1.equals(s2);             // isEqual is true
        isEqual = s1.equals(s3);             // isEqual is false
        isEqual = s1.equalsIgnoreCase(s4);   // isEqual is true
    }
}
