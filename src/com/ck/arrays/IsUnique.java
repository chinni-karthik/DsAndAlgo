package com.ck.arrays;

public class IsUnique {
	public static boolean isUnique(String input) {
		char[] charArray = input.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[j] == charArray[i]) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String input = "Helo Hai";
		System.out.println(input+"  "+isUnique(input));
	}
}
