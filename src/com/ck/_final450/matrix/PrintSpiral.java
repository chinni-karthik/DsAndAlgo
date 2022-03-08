package com.ck._final450.matrix;

public class PrintSpiral {
    private static void printSpiralOrder(int[][] mat) {
        // base case
        if (mat == null || mat.length == 0) {
            return;
        }

        int top = 0, bottom = mat.length - 1;
        int left = 0, right = mat[0].length - 1;
        int dir = 0;

        StringBuilder answer = new StringBuilder();

        while (top <= bottom && left <= right) {
            if (dir == 0) {
                //Move right and print
                for (int i = left; i <= right; i++) {
                    answer.append(mat[top][i]);
                    answer.append(" ");
                }
                top++;

            } else if (dir == 1) {
                //Move down and print
                for (int i = top; i <= bottom; i++) {
                    answer.append(mat[i][right]);
                    answer.append(" ");
                }
                right--;

            } else if (dir == 2) {
                //Move right and print
                for (int i = right; i >= left; i--) {
                    answer.append(mat[bottom][i]);
                    answer.append(" ");
                }
                bottom--;
            } else if (dir == 3) {
                //Move top and print
                for (int i = bottom; i >= top; i--) {
                    answer.append(mat[i][left]);
                    answer.append(" ");
                }
                left++;
            }
            dir = (dir + 1) % 4;
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        int[][] mat =
                {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16},

                };

        printSpiralOrder(mat);
    }
}