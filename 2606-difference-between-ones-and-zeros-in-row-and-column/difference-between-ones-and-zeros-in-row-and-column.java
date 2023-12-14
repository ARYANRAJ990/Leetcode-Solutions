

class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int row = grid.length; // Get the number of rows in the grid
        int col = grid[0].length; // Get the number of columns in the grid

        int[][] diff = new int[row][col]; // Create a matrix to store differences

        int[] r = new int[row]; // Create an array to store counts of ones in each row
        int[] c = new int[col]; // Create an array to store counts of ones in each column

        // Calculate counts of ones in rows and columns
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                r[i] += grid[i][j]; // Sum the elements in each row
                c[j] += grid[i][j]; // Sum the elements in each column
            }
        }

        // Calculate the difference between the count of ones and zeros in rows and columns
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // Calculate the difference using the formula: 2 * (count of ones in row i + count of ones in column j) - (total row count + total column count)
                diff[i][j] = 2 * (r[i] + c[j]) - row - col;
            }
        }

        return diff; // Return the matrix containing differences
    }
}

