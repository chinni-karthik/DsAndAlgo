package com.ck.rec.bt.dp;

public class FactorialTailRecursion {
	public static int factorial(int n, int accumulator) {
		// Base Case
		if (n == 1) {
			return accumulator;
		}
		return factorial(n - 1, accumulator * n);
	}

	public static void main(String[] args) {
		System.out.println(factorial(5, 1));
	}
}
