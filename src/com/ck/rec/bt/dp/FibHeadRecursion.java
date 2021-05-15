package com.ck.rec.bt.dp;

public class FibHeadRecursion {
	public static void main(String[] args) {
		System.out.println(fibHead(8));
	}

	private static int fibHead(int n) {
		// Base Case
		if (n == 0 || n == 1) {
			return n;
		}

		// Make recursive calls
		int fib1 = fibHead(n - 1);
		int fib2 = fibHead(n - 2);
		// Make some operations
		int result = fib1 + fib2;
		return result;
	}
}
