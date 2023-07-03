package gr.aueb.cf.ch6;

/**
 * Αρχικοποιεί ένα πίνακα ακεραίων με unsized initialization.
 */
public class ArrayPopulateUnsized {

    public static void main(String[] args) {
        // Initialize - Populate the array
        int[] ages = {19, 20, 23, 22, 30};

        // Print the array elements
        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i] + " ");
        }
    }
}
