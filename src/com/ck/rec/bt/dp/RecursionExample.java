package com.ck.rec.bt.dp;

public class RecursionExample {
	public static void main(String[] args) {
		int result = recursionSum(3);
		System.out.println(result);
	}

	private static int recursionSum(int n) {
		// Base case
		if (n == 1) {
			return 1;
		}
		return n + recursionSum(n - 1);
	}
}
