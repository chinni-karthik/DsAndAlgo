package com.ck._final450.matrix;

public class RotateMatrix {
    // Takes Matrix and Size of Matrix and performs Clockwise or Right Rotation by 90 degrees.
    static void rightRotate(int matrix[][], int n) {

        //Find transpose of Matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Then we reverse the elements of each row.
        for (int i = 0; i < n; i++) {
            // Two pointer solution to reverse array
            int low = 0;
            int high = n - 1;

            while (low < high) {
                int temp = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high] = temp;
                low++;
                high--;
            }
        }

        System.out.println("The Right Rotated Matrix is: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 3;
        // Creating a 3 X 3 matrix.
        int matrix[][] = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("The Original Matrix is: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        rightRotate(matrix, n);
    }
}
