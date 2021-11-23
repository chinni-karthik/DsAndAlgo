package com.ck._final450.arrays;

public class MinMaxOfArray {
    static class Pair {
        int min;
        int max;
    }

    static Pair getMinMax(int arr[], int low, int high) {
        Pair minMax = new Pair();
        Pair mmLeft = new Pair();
        Pair mmRight = new Pair();
        int mid;

        // If there is only one element
        if (low == high) {
            minMax.max = arr[low];
            minMax.min = arr[low];
            return minMax;
        }

        /* If there are two elements */
        if (high == low + 1) {
            if (arr[low] > arr[high]) {
                minMax.max = arr[low];
                minMax.min = arr[high];
            } else {
                minMax.max = arr[high];
                minMax.min = arr[low];
            }
            return minMax;
        }

        /* If there are more than 2 elements */
        mid = (low + high) / 2;
        mmLeft = getMinMax(arr, low, mid);
        mmRight = getMinMax(arr, mid + 1, high);

        /* compare minimums of two parts*/
        if (mmLeft.min < mmRight.min) {
            minMax.min = mmLeft.min;
        } else {
            minMax.min = mmRight.min;
        }

        /* compare maximums of two parts*/
        if (mmLeft.max > mmRight.max) {
            minMax.max = mmLeft.max;
        } else {
            minMax.max = mmRight.max;
        }
        return minMax;
    }

    public static void main(String args[]) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        int arr_size = 6;
        Pair minmax = getMinMax(arr, 0, arr_size - 1);
        System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);
    }
}
