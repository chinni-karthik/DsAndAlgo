package com.ck.mathematics;

import java.util.Scanner;

public class ArmyGame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int result = 0;
		// Base conditions
		if (n == 0 || m == 0) {
			System.out.println(0);
			return;
		} else {
			result = ((n + n % 2) * (m + m % 2)) / 4;
		}
		System.out.println(result);
	}
}
