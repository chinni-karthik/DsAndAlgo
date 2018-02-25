package com.ck.general;

public class FibonacciSeriesIterative {
	public static int fib(int n) {
		int a=0;
		int b=0;
		int c=1;
		for (int i = 1; i < n; i++) {//Iteration starts form 1 and not 0.
			a=b;
			b=c;
			c=a+b;
		}
		return c;
	}
	public static void main(String[] args) {
		System.out.println(fib(6));
	}
}
