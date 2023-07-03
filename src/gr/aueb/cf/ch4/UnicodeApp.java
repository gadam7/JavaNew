package gr.aueb.cf.ch4;

/**
 * Unicodes greater than 4 Hex digits could be represented in UTF-16 by surrogate pairs.
 * There are surrogate pairs calculators. Or by calling Character wrapper class with
 * toString method.
 */
public class UnicodeApp {

    public static void main(String[] args) {
        int codePoint = 0x1F600; // smiley

        // conversion of 0x1F600 to Surrogate Pairs
        // http://russellcottrell.com/greek/utilities/SurrogatePairCalculator.htm
        System.out.println("Smiley: \uD83D\uDE00");

        // Java-based conversion with Character wrapper class
        // and toChars method that converts to UTF-16 code points
        System.out.print("Smiley: ");
        System.out.println(Character.toChars(codePoint));
    }
}
