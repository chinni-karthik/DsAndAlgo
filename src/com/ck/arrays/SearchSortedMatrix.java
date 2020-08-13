package com.ck.arrays;

public class SearchSortedMatrix {
	private static void search(int[][] matrix, int n, int x) {
		// Base Condition.
		if (matrix.length == 0) {
			System.out.print("Invalid Input!");
			return;
		}
		int i = 0, j = n - 1;
		while (i < n && j >= 0) {
			if (matrix[i][j] == x) {
				System.out.print("Found number at Column: " + i + " Row: " + j);
				return;
			}
			if (matrix[i][j] > x) {
				j--;
			} else {
				i++;
			}
		}
		System.out.print("Number not found");
	}

	public static void main(String[] args) {
		int mat[][] = { { 10, 20, 30, 40 }, 
						{ 15, 25, 35, 45 }, 
						{ 27, 29, 37, 48 }, 
						{ 32, 33, 39, 50 } };
		// mat = new int[0][0];
		search(mat, 4, 29);
	}
}
