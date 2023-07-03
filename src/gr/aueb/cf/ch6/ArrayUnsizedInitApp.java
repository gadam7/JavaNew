package gr.aueb.cf.ch6;

/**
 * Unsized 2D Array Initialization.
 */
public class ArrayUnsizedInitApp {

    public static void main(String[] args) {
        int[][] grid = {{1, 2},{3, 4},{5, 6}};      // 3x2

        for (int[] row : grid) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
