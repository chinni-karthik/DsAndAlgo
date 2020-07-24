package com.ck.recursion;

public class PrintSequential {
	public static void main(String[] args) {
		printN(10);
	}
	public static int printN(int n) {
		// Base condition
		if (n == 1) {
			System.out.println(n);
			return 1;
		}
		System.out.println(n + " ");
		int numberToBePrinted = printN(n - 1);
		
		return numberToBePrinted;
	}
}
