package com.ck.sorting;

public class InsertionSortImpl {
	public static void insertionSort(int[] inputDataArr) {
		int length = inputDataArr.length;
		// i=>for cards iteration of cards till end
		// j=>where to start?
		for (int i = 1; i < length; i++) {
			for (int j = i; j > 0; j--) {
				if (inputDataArr[j] < inputDataArr[j - 1]) {
					SortUtil.swap(inputDataArr, j, j-1);
				}
			}
		}
	}
}
