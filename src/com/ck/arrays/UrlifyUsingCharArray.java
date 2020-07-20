package com.ck.arrays;

public class UrlifyUsingCharArray {
	public static void urlifyString(char[] inputCharArray, int trueLength) {
		int noOfSpaces = getSpaceCount(inputCharArray);
		int index = inputCharArray.length + noOfSpaces * 2;// *2 because we already have one space
		if (trueLength < inputCharArray.length) {
			inputCharArray[trueLength] = '\0';
		}
		for (int i = trueLength - 1; i >= 0; i--) {
			if (inputCharArray[i] == ' ') {
				inputCharArray[index - 1] = '0';
				inputCharArray[index - 2] = '2';
				inputCharArray[index - 3] = '%';
				index = index - 3;
			} else {
				inputCharArray[index - 1] = inputCharArray[i];
				index--;
			}
		}
		String result = new String(inputCharArray);
		System.out.println(result);
	}

	static int getSpaceCount(char[] inputCharArray) {
		int count = 0;
		for (int i = 0; i < inputCharArray.length; i++) {
			if (inputCharArray[i] == ' ') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String input = "Hello World!";
		urlifyString(input.toCharArray(), input.length() + getSpaceCount(input.toCharArray()));
	}
}
