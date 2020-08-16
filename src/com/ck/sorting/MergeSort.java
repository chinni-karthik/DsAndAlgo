package com.ck.sorting;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = { 8, 2, 4, 1, 3, 5, 6, 9 };
		int[] helper = new int[arr.length];

		mergeSortHelper(arr, helper, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}

	static void mergeSortHelper(int[] arr, int[] helper, int low, int high) {
		// Base condition
		if (low >= high) {
			return;
		}
		int mid = (low + high) / 2;
		mergeSortHelper(arr, helper, low, mid);
		mergeSortHelper(arr, helper, mid + 1, high);
		merge(arr, helper, low, mid, high);
	}

	static void merge(int[] arr, int[] helper, int low, int mid, int high) {
		// Copy all elements into the helper array for this iteration
		for (int k = low; k <= high; k++) {
			helper[k] = arr[k];
		}
		// This is the only additional assignment you should do and nothing else.
		int i = low;
		int j = mid + 1;
		int k = low;

		while (i <= mid && j <= high) {
			arr[k++] = helper[i] < helper[j] ? helper[i++] : helper[j++];
		}

		while (i <= mid) {
			arr[k++] = helper[i++];
		}
		while (j <= high) {
			arr[k++] = helper[j++];
		}
	}
}
