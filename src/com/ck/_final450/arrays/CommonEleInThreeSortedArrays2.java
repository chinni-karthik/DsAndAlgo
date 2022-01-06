package com.ck._final450.arrays;

import java.util.ArrayList;
import java.util.List;

public class CommonEleInThreeSortedArrays2 {
    private static List<Integer> getCommonElements(int[] input1, int[] input2, int[] input3) {
        int i = 0, j = 0, k = 0;
        List<Integer> outputList = new ArrayList<>();
        while (i < input1.length && j < input2.length && k < input3.length) {
            if (input1[i] == input2[j] && input1[i] == input3[k]) {
                outputList.add(input1[i]);
                i++;
                j++;
                k++;
            } else if(input1[i]<input2[j]){
                i++;
            } else if(input2[j]<input3[k]){
                j++;
            } else {
                k++;
            }
        }
        return outputList;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 5, 10, 20, 40, 80};
        int[] input2 = {6, 7, 20, 80, 100};
        int[] input3 = {3, 4, 15, 20, 30, 70, 80, 120};
        List<Integer> output = getCommonElements(input1, input2, input3);
        for (int i = 0; i < output.size(); i++) {
            System.out.print(output.get(i) + " ");
        }
    }
}
