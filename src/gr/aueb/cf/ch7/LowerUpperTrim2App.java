package gr.aueb.cf.ch7;

/**
 * Convert to lowercase, uppercase, trimmed.
 */
public class LowerUpperTrim2App {

    public static void main(String[] args) {
        String s = "  Athens University of Economic and Business   ";
        String lowercase;
        String uppercase;
        String trimmed;

        lowercase = s.toLowerCase();
        uppercase = s.toUpperCase();
        trimmed = s.trim();

        System.out.printf("Lexeme: %s, Lowercase: %s\n", s, lowercase);
        System.out.printf("Lexeme: %s, Uppercase: %s\n", s, uppercase);
        System.out.printf("Lexeme: %s, Trimmed: %s\n", s, trimmed);
    }
}
