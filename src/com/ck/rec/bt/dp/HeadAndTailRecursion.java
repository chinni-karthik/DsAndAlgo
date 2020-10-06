package com.ck.rec.bt.dp;

public class HeadAndTailRecursion {
	public static void buildLayer(int height) {
		if (height == 0) {
			return;
		}
		System.out.println(height);
		// Tail Recursion
		buildLayer(height - 1);
	}

	public static void main(String[] args) {
		buildLayer(4);
	}
}
