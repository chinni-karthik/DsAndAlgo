package com.ck.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 6, 4, 2, 1, 3, 5 };
		insertionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}

	static int[] insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {// For each card
			int value = arr[i];
			int j = i - 1;// Where to start
			while (j >= 0 && arr[j] > value) {
				arr[j + 1] = arr[j];// shifting cards
				j--;
			}
			arr[j + 1] = value;
		}
		return arr;
	}

}
