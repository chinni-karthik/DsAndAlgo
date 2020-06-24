package com.ck.general;

public class FibonacciSeriesIterative {
	public static int fib(int n) {
		int a = 0;
		int b = 1;
		int c = 1;
		System.out.print(a + "," + b);
		for (int i = 2; i < n; i++) {// Iteration starts form 1 and not 0.
			a = b;
			b = c;
			c = a + b;
			System.out.print("," + c);
		}
		return c;
	}

	public static void main(String[] args) {
		fib(8);
	}
}
