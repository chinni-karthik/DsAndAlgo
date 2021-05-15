package com.ck.dynamic.udemy;

import java.util.HashMap;
import java.util.Map;

public class FibUsingDP {
	public static void main(String[] args) {
		Map<Integer, Integer> table = new HashMap<>();
		table.put(0, 0);
		table.put(1, 1);

		// This has exponential T.C.
		System.out.println(fibRecursion(9));
		// They have linear T.C.
		System.out.println(fibMemoization(9, table));
		System.out.println(fibTabulation(9, table));
	}

	private static int fibRecursion(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		return fibRecursion(n - 1) + fibRecursion(n - 2);
	}

	// Top-Down Approach (imagine a recursion tree)
	private static int fibMemoization(int n, Map<Integer, Integer> table) {
		if (!table.containsKey(n)) {
			table.put(n, fibMemoization(n - 1, table) + fibMemoization(n - 2, table));
		}
		// O(1) Constant Time Complexity
		return table.get(n);
	}

	// Bottom-Up Approach (imagine a recursion tree - Order is just opposite)
	private static int fibTabulation(int n, Map<Integer, Integer> table) {
		for (int i = 2; i < n; i++) {
			table.put(i, table.get(i - 1) + table.get(i - 2));
		}
		// O(1) Constant Time Complexity
		return table.get(n);
	}
}
