package com.ck.general;

import java.util.*;

public class FibonacciSeriesRecursive {
	public static int fibonacci(int n) {
		if (n <= 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		//Can be optimized by memoization.
		return fibonacci(n - 1) + fibonacci(n - 2);

	}
	public static void main(String[] args) {
		System.out.println(fibonacci(4));
	}
}
