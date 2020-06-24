package com.ck.searching;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		boolean result = linearSearch(arr, 50);
		System.out.println(result);
	}
	static boolean linearSearch(int[] arr, int x) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				return true;
			}
		}
		return false;
	}
}
