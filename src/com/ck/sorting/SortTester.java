package com.ck.sorting;

public class SortTester {
	public static void main(String[] args) {
		int[] inputDataArr = { 6, 4, 2, 1, 3, 5 };
		for (int i = 0; i < inputDataArr.length; i++) {
			System.out.print(inputDataArr[i] + "  ");
		}
		BubbleSortImpl.bubbleSort(inputDataArr);
		System.out.println();
		for (int i = 0; i < inputDataArr.length; i++) {
			System.out.print(inputDataArr[i] + "  ");
		}
	}
}
