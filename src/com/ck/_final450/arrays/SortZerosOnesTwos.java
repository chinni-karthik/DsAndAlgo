package com.ck._final450.arrays;

public class SortZerosOnesTwos {
    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int arr_size = arr.length;
        sort012(arr, arr_size);
        System.out.println("Array after seggregation ");
        printArray(arr, arr_size);
    }

    static void sort012(int input[], int arr_size) {
        int low = 0, mid = 0;
        int high = arr_size - 1;
        while (mid <= high) {//mid iterates whole array from low to high
            switch (input[mid]) {
                case 0: {
                    input = swap(input, low, mid);
                    low++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    input = swap(input, mid, high);
                    high--;
                    break;
                }
            }
        }
    }

    static void printArray(int arr[], int arr_size) {
        int i;
        for (i = 0; i < arr_size; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    static int[] swap(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        return arr;
    }
}
