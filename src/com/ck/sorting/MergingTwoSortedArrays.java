package com.ck.sorting;

public class MergingTwoSortedArrays {
	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7 };
		int[] arr2 = { 2, 4, 6, 8 };
		int[] result = new int[arr1.length + arr2.length];
		int i, j, k;
		i = j = k = 0;

		while (i < arr1.length && j < arr2.length) {
			result[k++] = arr1[i] < arr2[j] ? arr1[i++] : arr2[j++];
		}
		while (i < arr1.length) {
			result[k++] = arr1[i++];
		}
		while (j < arr2.length) {
			result[k++] = arr2[j++];
		}
		
		for (int k2 = 0; k2 < result.length; k2++) {
			System.out.print(result[k2] + "  ");
		}
	}
}
