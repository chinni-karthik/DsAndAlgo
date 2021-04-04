package com.ck.rec.bt.dp;

public class FibTailRecursion {
	public static void main(String[] args) {
		System.out.println(fibTail(10, 0, 1));
	}

	private static int fibTail(int n, int acc1, int acc2) {
		// Base Case
		if (n == 0) {
			return acc1;
		}
		if (n == 1) {
			return acc2;
		}
		return fibTail(n - 1, acc2, acc1 + acc2);
	}
}
