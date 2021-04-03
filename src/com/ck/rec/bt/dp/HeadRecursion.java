package com.ck.rec.bt.dp;

public class HeadRecursion {
	public static void main(String[] args) {
		head(10);
	}
	private static void head(int n) {
		// Base case
		if (n == 0) {
			return;
		}
		// Call method Recursively
		head(n - 1);
		// Do some operations
		System.out.print(n+" ");
	}
}
