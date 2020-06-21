package com.ck.general;

public class FactorialIterative {
	public static void main(String[] args) {
		System.out.println(fact(5));
	}

	static int fact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		int result = 1;
		for (int i = 2; i <= n; i++) {
			result *= i;
		}
		return result;
	}
}
