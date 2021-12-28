package com.ck._final450.arrays;

class FindDuplicate {
    void printRepeating(int arr[], int size) {
        int i;
        System.out.println("The repeating elements are : ");
        for (i = 0; i < size; i++) {
            int j = Math.abs(arr[i]);
            if (arr[j] >= 0)
                arr[j] = -arr[j];
            else
                System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        FindDuplicate duplicate = new FindDuplicate();
        int arr[] = {1, 2, 2, 4, 4};
        int arr_size = arr.length;

        duplicate.printRepeating(arr, arr_size);
    }
}