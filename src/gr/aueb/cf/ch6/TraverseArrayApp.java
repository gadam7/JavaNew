package gr.aueb.cf.ch6;

/**
 * Different types of Array traverse.
 */
public class TraverseArrayApp {

    public static void main(String[] args) {
        int[][] arr = new int[][] {{1, 2}, {3, 4, 5}};

        // classic for
        for (int i = 0; i < arr.length; i++) {
            for (int j =0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // enhanced-for & for
        for (int[] row : arr) {
            for (int j = 0; j < row.length; j++) {
                System.out.print(row[j] + " ");
            }
            System.out.println();
        }

        // with 2 enhanced-for
        for (int row[] : arr) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
