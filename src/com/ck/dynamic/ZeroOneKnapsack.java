package com.ck.dynamic;

public class ZeroOneKnapsack {
	public static void main(String[] args) {
		int[] profitPerItem = { 60, 100, 120 };// m
		int[] numberOfItems = { 10, 20, 30 };// items
		int maxWeightAllowed = 50;

		// Table to avoid recalculations
		int[][] table = new int[maxWeightAllowed + 1][numberOfItems.length + 1];

		// Filling table
		for (int i = 0; i < maxWeightAllowed + 1; i++) {
			for (int j = 0; j < numberOfItems.length + 1; j++) {
				// Filling first row
				if (i == 0) {
					table[i][j] = 0;
				}
				// Filling first column
				else if (j == 0) {
					table[i][j] = 0;

				}
				// Filling rest of the matrix
				else {
					// pick the item
					int a = table[i][j - 1];// Weight is the same and item count is decreased!
					// ignore the item
					int b = maxWeightAllowed - numberOfItems[j - 1] < 0 ? 0
							: table[maxWeightAllowed - numberOfItems[j - 1]][j - 1] + profitPerItem[j - 1];
					table[i][j] = max(a, b);
				}
			}
		}
		System.out.println(table[maxWeightAllowed][numberOfItems.length]);
	}

	static int max(int a, int b) {
		int max = a > b ? a : b;
		return max;
	}
}
