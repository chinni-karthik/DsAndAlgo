package com.ck.sorting;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr = { 4, 1, 6, 2, 3, 5, 7 };
		quicikSortHelper(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}

	private static void quicikSortHelper(int[] arr, int low, int high) {

		if (low > high) {
			return;
		}
		int pivotIndex = partition(arr, low, high);
		quicikSortHelper(arr, low, pivotIndex - 1);
		quicikSortHelper(arr, pivotIndex + 1, high);

	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[low];
		int left = low + 1;
		int right = high;

		while (left < right) {
			while (arr[left] < pivot) {
				left++;
			}
			while (arr[right] > pivot) {
				right--;
			}
			if (left <= right) {// Exception without this condition.
				swap(arr, left, right);
			}
		}
		swap(arr, low, right);
		return right;
	}

	static int[] swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		return arr;
	}
}
