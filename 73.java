class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length; // Number of rows
        int m = matrix[0].length; // Number of columns
        int[] r = new int[n]; // Row marker
        int[] c = new int[m]; // Column marker

        // First pass: Identify rows and columns to be set to zero
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    r[i] = 1; // Mark the row
                    c[j] = 1; // Mark the column
                }
            }
        }

        // Second pass: Set the rows and columns to zero
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (r[i] == 1 || c[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}