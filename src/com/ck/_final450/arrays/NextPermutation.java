package com.ck._final450.arrays;

import java.util.Arrays;

public class NextPermutation {
    public static boolean findNextPermutation(int data[]) {
        //Base Case
        if (data.length <= 1)
            return false;

        int last = data.length - 2;

        while (last >= 0) {
            if (data[last] < data[last + 1]) {
                break;
            }
            last--;
        }

        // If there is no increasing pair there is no higher order permutation
        if (last < 0)
            return false;

        int nextGreater = data.length - 1;

        // Find the rightmost successor to the pivot
        for (int i = data.length - 1; i > last; i--) {
            if (data[i] > data[last]) {
                nextGreater = i;
                break;
            }
        }

        // Swap the successor and the pivot
        data = swap(data, nextGreater, last);

        // Reverse the suffix
        data = reverse(data, last + 1, data.length - 1);

        return true;
    }

    public static int[] swap(int data[], int left, int right) {
        int temp = data[left];
        data[left] = data[right];
        data[right] = temp;
        return data;
    }

    public static int[] reverse(int data[], int left, int right) {
        while (left < right) {
            int temp = data[left];
            data[left++] = data[right];
            data[right--] = temp;
        }
        return data;
    }

    public static void main(String args[]) {
        int data[] = {1, 5, 8, 4, 7, 6, 5, 3, 1};
        if (!findNextPermutation(data))
            System.out.println("There is no higher order permutation for input");
        else {
            System.out.println(Arrays.toString(data));
        }
    }
}