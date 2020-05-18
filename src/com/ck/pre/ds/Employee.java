package com.ck.pre.ds;

public class Employee {
	int a;
	static int b;

	public static void main(String[] args) {
		Employee e = new Employee();
		e.a = 10;
	}

int fib(int n) {
	int a = 0, b = 1, c;
	if (n == 0 || n == 1) {
		return n;
	}

	for (int i = 2; i <= n; i++) {
		c = a + b;
		a = b;
		b = c;
	}
	return b;
}
}
