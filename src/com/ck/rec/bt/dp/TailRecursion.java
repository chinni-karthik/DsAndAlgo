package com.ck.rec.bt.dp;

public class TailRecursion {
	public static void main(String[] args) {
		tail(10);
	}
	private static void tail(int n) {
		// Base Case
		if (n == 0) {
			return;
		}
		// Do some operations
		System.out.print(n + " ");
		// Call method Recursively
		tail(n - 1);
	}
}
