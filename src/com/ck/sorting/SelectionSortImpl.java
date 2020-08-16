package com.ck.sorting;

public class SelectionSortImpl {
	public static void selectionSort(int[] inputDataArr) {
		int length = inputDataArr.length;
		int smallestIndex;
		for (int i = 0; i < length; i++) {
			smallestIndex = i;
			for (int j = i + 1; j < length; j++) {
				if (inputDataArr[smallestIndex] > inputDataArr[j]) {
					smallestIndex = j;
				}
			}
			SortUtil.swap(inputDataArr, i, smallestIndex);
		}
	}
}
