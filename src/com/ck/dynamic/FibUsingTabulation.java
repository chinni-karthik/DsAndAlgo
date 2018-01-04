package com.ck.dynamic;

public class FibUsingTabulation {
	static int n 		= 7;
	static int[] arrFIB = new int[n + 1];

	public static void main(String[] args) {
		System.out.println(fibUsingTabulation(n));
	}

	static int fibUsingTabulation(int n) {
		arrFIB[0] = 0;
		arrFIB[1] = 1;
		for (int i = 2; i < arrFIB.length; i++) {
			arrFIB[i] = arrFIB[i - 1] + arrFIB[i - 2];
		}
		return arrFIB[n];
	}
}
