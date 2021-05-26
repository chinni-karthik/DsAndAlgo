package com.ck.interview.questions;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome1("madam"));
		System.out.println(isPalindrome2("madam"));
	}

	/**
	 * Reverse the given String.
	 * Compare original String with reversed String.
	 */
	public static boolean isPalindrome1(String originalString) {
		String reversedString = "";
		for (int i = originalString.length() - 1; i >= 0; i--) {
			reversedString = reversedString + originalString.charAt(i);
		}
		return originalString.equals(reversedString);
	}
	
	/**
	 * Have 3 indexes i->start,j->end,k->middle
	 * Start comparing i and j until they meet k
	 * if i != j in current iteration , return false.
	 */
	public static boolean isPalindrome2(String originalString) {
		int i = 0;
		int j = originalString.length() - 1;
		int k = (i + j) / 2;

		//Using <= so that even length Strings are also handled.
		while (i <= k && j >= k) {
			if (originalString.charAt(i) == originalString.charAt(j)) {
				i++;
				j--;
			} else {
				return false;
			}
		}
		return true;
	}
}
