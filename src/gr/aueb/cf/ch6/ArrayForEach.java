package gr.aueb.cf.ch6;

/**
 * Εκτυπώνει τον πίνακα χρησιμοποιώντας For-Each.
 */
public class ArrayForEach {

    public static void main(String[] args) {
        // Populate the array
        int[] ages = {19, 20, 23, 22, 30};

        // Print the array elements
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}
