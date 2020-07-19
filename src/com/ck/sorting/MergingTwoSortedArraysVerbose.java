package com.ck.sorting;

public class MergingTwoSortedArraysVerbose {
	static int[] merge(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length + arr2.length];
		// Base case 1
		if (arr1.length == 0 && arr2.length == 0) {
			return result;
		}
		// Base case 2
		if (arr1.length == 0) {
			return arr2;
		}
		// Base case 3
		if (arr2.length == 0) {
			return arr1;
		}
		int i, j, k;
		i = j = k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				result[k] = arr1[i];
				i++;
				k++;
			} else if (arr1[i] > arr2[j]) {
				result[k] = arr2[j];
				j++;
				k++;
			}
		}
		while (i < arr1.length) {
			result[k++] = arr1[i++];
		}
		while (j < arr2.length) {
			result[k++] = arr2[j++];
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7, 9, 20, 30, 40 };
		int[] arr2 = { 2, 4, 6, 8 };
		int[] result = merge(arr1, arr2);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
