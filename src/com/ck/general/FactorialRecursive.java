package com.ck.general;

public class FactorialRecursive {
	public static void main(String[] args) {
		System.out.println(fact(50));
	}

	static int fact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * fact(n - 1);
	}
}
