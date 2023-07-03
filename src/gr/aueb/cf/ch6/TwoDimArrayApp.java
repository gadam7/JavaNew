package gr.aueb.cf.ch6;

/**
 * Defines a 2D array and populates it.
 * 2D arrays are defined as [rowCount][colCount]
 */
public class TwoDimArrayApp {

    public static void main(String[] args) {
        int[][] grid = new int[2][2];

        grid[0][0] = 0;     // 1st row, 1st column
        grid[0][1] = 1;     // 1st row, 2nd column
        grid[1][0] = 2;     // 2nd row, 1st column
        grid[1][1] = 3;     // 2nd row. 2nd column

        for (int[] row : grid) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
