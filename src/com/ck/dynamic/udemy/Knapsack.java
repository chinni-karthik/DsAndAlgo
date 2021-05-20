package com.ck.dynamic.udemy;

public class Knapsack {
	private int numOfItems;
	private int capacityOfKnapsack;
	private int[][] knapsackTable;
	private int[] weights;
	private int[] values;
	private int totalBenefit;

	public Knapsack(int numOfItems, int capacityOfKnapsack, int[] weights, int[] values) {
		this.numOfItems = numOfItems;
		this.capacityOfKnapsack = capacityOfKnapsack;
		this.weights = weights;
		this.values = values;
		// +1 as we need to handle base case.
		// First row and column are 0’s as we are initializing here.
		this.knapsackTable = new int[numOfItems + 1][capacityOfKnapsack + 1];
	}

	public void solve() {
		// time complexity: O(N*W) 
		// first column and row should be 0's. So, starting with index 1.
		for (int i = 1; i < numOfItems + 1; i++) {
			for (int w = 1; w < capacityOfKnapsack + 1; w++) {
				// Same column just above the Row
				int notTakingItem = knapsackTable[i - 1][w];
				int takingItem = 0;

				if (weights[i] <= w) {
					// Same column above Row - weight + value
					takingItem = values[i] + knapsackTable[i - 1][w - weights[i]];
				}

				knapsackTable[i][w] = Math.max(notTakingItem, takingItem);
			}
		}
		totalBenefit = knapsackTable[numOfItems][capacityOfKnapsack];
	}

	public void showResult() {
		System.out.println("Total benefit: " + totalBenefit);

		// Start from bottom right.
		for (int n = numOfItems, w = capacityOfKnapsack; n > 0; n--) {
			// If above item is not equal, then move left in above row by values times.
			if (knapsackTable[n][w] != 0 && knapsackTable[n][w] != knapsackTable[n - 1][w]) {
				System.out.println("We take item: #" + n);
				w = w - weights[n];
			}
		}
	}
}
