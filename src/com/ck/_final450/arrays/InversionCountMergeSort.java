package com.ck._final450.arrays;

import java.util.Arrays;

public class InversionCountMergeSort {
    private static int mergeSortAndCount(int[] arr, int l, int r) {
        int invCount = 0;

        if (l < r) {
            int m = (l + r) / 2;

            // Total inversion count = left subArray count + right subArray count + merge count
            invCount += mergeSortAndCount(arr, l, m);
            invCount += mergeSortAndCount(arr, m + 1, r);
            invCount += mergeAndCount(arr, l, m, r);
        }
        return invCount;
    }

    private static int mergeAndCount(int[] arr, int left, int mid, int right) {
        int[] leftArray = Arrays.copyOfRange(arr, left, mid + 1);
        int[] rightArray = Arrays.copyOfRange(arr, mid + 1, right + 1);

        int i = 0, j = 0, k = left, invCount = 0;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j])
                arr[k++] = leftArray[i++];
            else {
                arr[k++] = rightArray[j++];
                invCount += (mid + 1) - (left + i);
            }
        }
        while (i < leftArray.length)
            arr[k++] = leftArray[i++];
        while (j < rightArray.length)
            arr[k++] = rightArray[j++];
        return invCount;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 8, 6, 4, 9};
        System.out.println(mergeSortAndCount(arr, 0, arr.length - 1));
    }
}