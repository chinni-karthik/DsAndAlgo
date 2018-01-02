package com.ck.searching;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		boolean result = binarySearch(arr, 50, 0, arr.length - 1);
		System.out.println(result);
	}

	private static boolean binarySearch(int[] arr, int x, int low, int high) {
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == x) {
				return Boolean.TRUE;
			} else if (arr[mid] < x) {
				low = mid + 1;
			} else if (arr[mid] > x) {
				high = mid - 1;
			}
		}
		return Boolean.FALSE;
	}
}
