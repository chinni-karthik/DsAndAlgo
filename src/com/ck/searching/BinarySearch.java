package com.ck.searching;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		boolean result = binarySearch(arr, 60, 0, arr.length - 1);
		System.out.println(result);
	}

	private static boolean binarySearch(int[] arr, int x, int start, int end) {
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == x) {
				return true;
			} else if (arr[mid] < x) {
				start = mid + 1;
			} else if (arr[mid] > x) {
				end = mid - 1;
			}
		}
		return false;
	}
}
