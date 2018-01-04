package com.ck.dynamic;

public class FibUsingMemoization {
	//Global variables!
	static int n 		= 7;
	static int[] arrFIB = new int[n + 1];

	public static void main(String[] args) {
		// Filling with -1
		for (int i = 0; i < arrFIB.length; i++) {
			arrFIB[i] = -1;
		}
		System.out.println(fibUsingMemoization(n));

	}

	static int fibUsingMemoization(int n) {

		if (arrFIB[n] != -1) {
			return arrFIB[n];
		}  if (n == 0 || n == 1) {
			arrFIB[n] = n;
			return n;
		}  if (arrFIB[n - 1] == -1) {
			arrFIB[n - 1] = fibUsingMemoization(n - 1);
		}  if (arrFIB[n - 2] == -1) {
			arrFIB[n - 2] = fibUsingMemoization(n - 2);
		}
		arrFIB[n] = arrFIB[n - 1] + arrFIB[n - 2];
		return arrFIB[n];
	}
}
