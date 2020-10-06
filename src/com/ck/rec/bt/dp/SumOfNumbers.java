package com.ck.rec.bt.dp;

public class SumOfNumbers {
	static int result = 0;

	public static int sumUsingIterative(int n) {
		for (int i = 1; i <= n; i++) {
			result += i;
		}
		return result;
	}

	public static int sumUsingRecursion(int n) {
		if (n == 1) {
			return 1;
		}
		return n + sumUsingRecursion(n - 1);
	}
}
