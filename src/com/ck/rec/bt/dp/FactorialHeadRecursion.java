package com.ck.rec.bt.dp;

public class FactorialHeadRecursion {
	public static int factorial(int n) {
		// Base Case
		if (n == 1) {
			return 1;
		}
		// Do some operations
		int res = factorial(n - 1);
		int result = n * res;
		return result;
	}
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
}
