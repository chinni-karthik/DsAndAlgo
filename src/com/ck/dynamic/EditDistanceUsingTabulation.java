package com.ck.dynamic;

public class EditDistanceUsingTabulation {
	public static void main(String[] args) {
		String s1 = "CAT";
		String s2 = "MBT";
		int insertCost = 1;
		int deleteCost = 1;
		int replaceCost = 1;
		int[][] table = new int[s1.length() + 1][s2.length() + 1];

		// Filling table
		for (int i = 0; i <= s1.length(); i++) {
			for (int j = 0; j <= s2.length(); j++) {
				
				// filling first column
				if (i == 0) {
					table[i][j] = j;
				}
				
				// filling first row
				else if (j == 0) {
					table[i][j] = i;
				} 
				// filling rest to the table
				else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					table[i][j] = table[i - 1][j - 1];// Just copy.. hence no cost associated!
				} else {
					table[i][j] = min(table[i - 1][j - 1] + replaceCost, table[i - 1][j] + insertCost,
							table[i][j - 1] + deleteCost);
				}
			}
		}

		System.out.println("Edit distance value: " + table[s1.length()][s2.length()]);
	}

	public static int min(int a, int b, int c) {
		int min = a;
		if (min > b)
			min = b;
		if (min > c)
			min = c;
		return min;
	}
}
