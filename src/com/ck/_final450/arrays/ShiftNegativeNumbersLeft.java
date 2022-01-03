package com.ck._final450.arrays;

public class ShiftNegativeNumbersLeft {
    static void shiftAll(int[] arr, int left, int right) {
        // Loop to iterate over the array from left to the right
        while (left <= right) {
            if (arr[left] < 0 && arr[right] < 0)
                left++;
            else if (arr[left] > 0 && arr[right] < 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            } else if (arr[left] > 0 && arr[right] > 0)
                right--;
            else {
                left++;
                right--;
            }
        }
    }

    static void display(int[] arr, int right) {
        for (int i = 0; i <= right; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, 11};
        int arr_size = arr.length;
        shiftAll(arr, 0, arr_size - 1);
        display(arr, arr_size - 1);
    }
}
