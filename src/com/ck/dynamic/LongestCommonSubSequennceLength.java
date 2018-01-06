package com.ck.dynamic;

public class LongestCommonSubSequennceLength {
	public static void main(String[] args) {
		String str1 = "AGGTAB";
		String str2 = "GXTXAYB";

		// Construct table to avoid re-computations
		int[][] table = new int[str1.length() + 1][str2.length() + 1];

		for (int i = 0; i <= str1.length(); i++) {
			for (int j = 0; j <= str2.length(); j++) {

				// Filling initial condition for first row
				if (i == 0) {
					table[i][j] = 0;
				}
				// Filling initial condition for first collumn
				else if (j == 0) {
					table[i][j] = 0;
				}

				else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
					table[i][j] = table[i - 1][j - 1] + 1;
				} else {
					table[i][j] = max(table[i - 1][j], table[i][j - 1]);
				}

			}
		}
		System.out.println(table[str1.length()][str2.length()]);
	}

	static int max(int a, int b) {
		int max = a > b ? a : b;
		return max;
	}
}