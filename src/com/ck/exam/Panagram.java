package com.ck.exam;

import java.util.Scanner;

public class Panagram {
	public static void main(String args[]) throws Exception {
		Scanner scn = new Scanner(System.in).useDelimiter("\\n");
		String inputString = scn.next();
		boolean[] boolArray = new boolean[26];
		char[] charArray = inputString.toCharArray();
		for (int i = 0; i < charArray.length - 1; i++) {
			int currentAsciiValue = charArray[i];
			if (currentAsciiValue == 32) {
				continue;
			} else if (currentAsciiValue < 97 && currentAsciiValue > 64) {
				boolArray[currentAsciiValue - 65] = true;
			} else {
				boolArray[currentAsciiValue - 97] = true;
			}
		}
		for (int i = 0; i < boolArray.length; i++) {
			if (boolArray[i] == false) {
				System.out.println("not pangram");
				return;
			}

		}
		System.out.println("pangram");
	}
}
