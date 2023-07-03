package gr.aueb.cf.ch6;

/**
 *
 */
public class TwoDimArray {

    public static void main(String[] args) {
        int[][] grid = new int[3][2];

        grid[0][0] = 0;
        grid[0][1] = 1;
        grid[1][0] = 3;
        grid[1][1] = 4;
        grid[2][0] = 5;
        grid[2][1] = 6;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int[] row : grid) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
