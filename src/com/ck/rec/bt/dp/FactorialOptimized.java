package com.ck.rec.bt.dp;

public class FactorialOptimized {
	public static int factorial(int accumulator, int n) {
		if (n == 1) {
			return accumulator;
		}
		return factorial(accumulator * n, n - 1);
	}

	public static int calculateFactorial(int n) {
		return factorial(1, n);
	}

	public static void main(String[] args) {
		System.out.println(calculateFactorial(5));
	}
}
