package com.ck.general;

public class FactorialIterative {
	public static void main(String[] args) {
		System.out.println(fact(6));
	}

	static int fact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		int result = 1;
		for (int i = n; i >= 2; i--) {
			result *= i;
		}
		return result;
	}
}
