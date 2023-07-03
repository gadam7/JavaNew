package gr.aueb.cf.ch6;

/**
 * Το unsized init μπορεί να χρησιμοποιηθεί μόνο κατά τη στιγμή της δήλωσης ενώ το array initializer
 * είναι πιο ευέλικτο.
 */
public class ArrayInitializerApp {

    public static void main(String[] args) {
        int[] ages;

        // Array initializer
        ages = new int[] {1, 2, 3, 4};

        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i]);
        }
    }
}
