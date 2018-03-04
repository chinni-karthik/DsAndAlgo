package com.ck.dynamic;

public class CoinChangeProblem {
	public static void main(String[] args) {
		int n = 4;// i
		int[] s = { 1, 2, 3};// j
		// Table to avoid re-computation
		int[][] table = new int[n + 1][s.length + 1];// Matrix of n*m size
		// Filling table
		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < s.length + 1; j++) {
				// Filling first row, when n=0
				if (i == 0) {
					table[i][j] = 1;
				}
				// Filling first column when m=0
				else if (j == 0) {
					table[i][j] = 0;
				}
				else{
					//dead easy logic. Just write again to understand better!
					int a=i-s[j-1]>=0?table[i-s[j-1]][j]:0;
					int b=table[i][j-1];
					table[i][j]=a+b;
				}
			}
		}
		System.out.println(table[n][s.length]);
	}
}
