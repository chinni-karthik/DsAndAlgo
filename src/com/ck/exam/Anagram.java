package com.ck.exam;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numberOfTestCases = in.nextInt();

		// for each test case
		for (int i = 0; i <= numberOfTestCases; i++) {
			String inputString = in.next();
			int count = 0;
			if (inputString.length() % 2 != 0) {
				System.out.println(-1);
				continue;
			} else {
				int mid = inputString.length() / 2;
				String str1 = inputString.substring(0, mid);
				String str2 = inputString.substring(mid);

				int[] charArray = new int[26];// All initialized by default to zeros
				for (int j = 0; j < str1.length(); j++) {
					charArray[str1.charAt(j) - 97]++;
				}
				for (int j = 0; j < str2.length(); j++) {
					if (charArray[str2.charAt(j) - 97] != 0) {
						charArray[str2.charAt(j) - 97]--;
					} else {
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}
