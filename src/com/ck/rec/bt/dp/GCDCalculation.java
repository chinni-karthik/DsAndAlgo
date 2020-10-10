package com.ck.rec.bt.dp;

public class GCDCalculation {
	private static int calculateGCDUUsingIteraion(int num1, int num2) {
		while (num2 != 0) {
			int temp = num2;
			num2 = num1 % num2;
			num1 = temp;
		}
		return num1;
	}

	private static int calculateGCDUUsingRecursion(int num1, int num2) {
		if (num2 == 0) {
			return num1;
		}
		return calculateGCDUUsingIteraion(num2, num1 % num2);
	}

	public static void main(String[] args) {
		System.out.println(calculateGCDUUsingIteraion(10, 20));
		System.out.println(calculateGCDUUsingRecursion(10, 20));
	}
}
