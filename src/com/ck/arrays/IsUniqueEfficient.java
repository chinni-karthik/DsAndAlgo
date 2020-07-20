package com.ck.arrays;

public class IsUniqueEfficient {
	public static boolean isUnique(String input) {
		boolean[] chars = new boolean[256];
		char[] charArray = input.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			int value = charArray[i];
			if (chars[value]) {
				return false;
			}
			chars[value] = true;
		}
		return true;
	}
	public static void main(String[] args) {
		String input = "Helo hai";
		System.out.println(input+"  "+isUnique(input));
	}
}
