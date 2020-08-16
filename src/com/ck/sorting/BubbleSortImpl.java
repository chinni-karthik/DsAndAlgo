package com.ck.sorting;

public class BubbleSortImpl {
	static int[] bubbleSort(int[] inputDataArr) {
		for (int i = 0; i < inputDataArr.length - 1; i++) {
			for (int j = 0; j < inputDataArr.length - i - 1; j++) {
				if (inputDataArr[j] > inputDataArr[j + 1]) {
					SortUtil.swap(inputDataArr, j, j + 1);
				}
			}
		}
		return inputDataArr;
	}
}
