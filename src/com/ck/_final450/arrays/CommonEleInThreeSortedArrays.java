package com.ck._final450.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonEleInThreeSortedArrays {
    private static int[] getCommonElements(int[] input1, int[] input2, int[] input3) {
        List<Integer> inputList1 = Arrays.stream(input1).boxed().collect(Collectors.toList());
        List<Integer> inputList2 = Arrays.stream(input2).boxed().collect(Collectors.toList());
        List<Integer> inputList3 = Arrays.stream(input3).boxed().collect(Collectors.toList());
        int[] output = new int[inputList1.size()];
        int count = 0;
        for (int i : inputList1) {
            if (inputList2.contains(i) && inputList3.contains(i)) {
                output[count] = i;
                count++;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 5, 10, 20, 40, 80};
        int[] input2 = {6, 7, 20, 80, 100};
        int[] input3 = {3, 4, 15, 20, 30, 70, 80, 120};
        int[] output = getCommonElements(input1, input2, input3);
        for (int i = 0; i < output.length; i++) {
            if (output[i] != 0) {
                System.out.print(output[i] + " ");
            }
        }
    }
}
