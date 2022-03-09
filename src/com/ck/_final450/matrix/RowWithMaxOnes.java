package com.ck._final450.matrix;

public class RowWithMaxOnes {
    public static int findRowIndex(int[][] mat) {
        // base case
        if (mat == null || mat.length == 0) {
            return 0;
        }
        // stores row number with maximum index
        int row = -1;

        // start from the top-rightmost cell of the matrix
        int i = 0, j = mat[0].length - 1;

        while (i <= mat.length - 1 && j >= 0) {
            // move left if the current cell has value 1
            if (mat[i][j] == 1) {
                j--;
                row = i;    // update row number
            } else {
                //move down
                i++;
            }
        }
        return row + 1;
    }

    public static void main(String[] args) {
        int[][] mat =
                {
                        {0, 0, 0, 1, 1},
                        {0, 0, 1, 1, 1},
                        {0, 0, 0, 0, 0},
                        {0, 1, 1, 1, 1},
                        {0, 0, 0, 0, 1}
                };

        int rowIndex = findRowIndex(mat);

        // rowIndex = 0 means no 1's are present in the matrix
        if (rowIndex != 0) {
            System.out.print("The maximum 1's are present in the row " + rowIndex);
        }
    }
}
