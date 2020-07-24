package com.ck.arrays;

public class PanagramCheck {
	public static void checkPanagram(String input) {
		// Base case 1
		if (input == null || input.length() == 0) {
			System.out.println("Invalid Input");
		}
		// Base case 2
		if (input.length() < 26) {
			System.out.println("Not Panagram");
			return;
		}
		boolean[] markArray = new boolean[26];
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {// caps
				markArray[input.charAt(i) - 'A'] = true;
			} else if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {// small case
				markArray[input.charAt(i) - 'a'] = true;
			} else {// other char
				continue;
			}
		}
		for (int i = 0; i < markArray.length; i++) {
			if(!markArray[i]) {
				System.out.println("Not panagram");
				return;
			}
		}
		System.out.println("Panagram");
	}

	public static void main(String[] args) {
		checkPanagram("The quick brown fox jumps over the lazy dog");
	}
}
