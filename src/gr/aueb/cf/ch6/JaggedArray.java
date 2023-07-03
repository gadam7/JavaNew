package gr.aueb.cf.ch6;

/**
 * Jagged arrays are arrays with (potentially)
 * different dimension in each row.
 */
public class JaggedArray {

    public static void main(String[] args) {
        int[][] jaggedArr = new int[3][];

        // Σε κάθε γραμμή εκχωρούμε ένα πίνακα με διαφορετική διάσταση
        jaggedArr[0] = new int[4];
        jaggedArr[1] = new int[3];
        jaggedArr[2] = new int[6];

        for (int[] row : jaggedArr) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
