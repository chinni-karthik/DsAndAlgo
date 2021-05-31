package com.ck.interview.questions;

public class ReverseInteger {
	public static void main(String[] args) {
		System.out.println(getIntegerReverse(12345678));
	}

	private static int getIntegerReverse(int n) {
		int reversedNumber = 0;
		int reminder = 0;
		while (n > 0) {
			reminder = n % 10;
			reversedNumber = (reversedNumber * 10) + reminder;
			n = n / 10;
		}
		return reversedNumber;
	}
}
