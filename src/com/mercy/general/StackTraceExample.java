package com.mercy.general;

public class StackTraceExample {
	public static void main(String[] args) {
		m1();
	}
	private static void m1() {
		int a;
		m2();
	}
	private static void m2() {
		int b;
		m3();
		m4();
	}
	private static void m4() {
		int c;
	}
	private static void m3() {
		int d;
	}
}
