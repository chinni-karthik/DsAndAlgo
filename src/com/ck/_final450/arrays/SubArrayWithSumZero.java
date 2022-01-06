package com.ck._final450.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class SubArrayWithSumZero {
    private static boolean isSubArrayWithSumZeroPresent(int[] input) {
        List<Integer> inputList = Arrays.stream(input).boxed().collect(Collectors.toList());
        List<Integer> prefixSumList = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();
        boolean isSubArrayWithSumZeroPresent = false;
        if (inputList.contains(0)) {//case 1
            isSubArrayWithSumZeroPresent = true;
        } else {
            prefixSumList.add(0, inputList.get(0));
            countMap.put(prefixSumList.get(0), 1);
            for (int i = 1; i < inputList.size(); i++) {
                int prefixSum = inputList.get(i) + prefixSumList.get(i - 1);
                prefixSumList.add(i, inputList.get(i) + prefixSumList.get(i - 1));
                if (prefixSum == 0) {//case 2
                    isSubArrayWithSumZeroPresent = true;
                }
                if (countMap.containsKey(prefixSum)) {//case 3
                    int count = countMap.get(prefixSum);
                    countMap.put(prefixSum, count++);
                }
            }
            for (int count : countMap.values()) {
                if (count > 1) {
                    isSubArrayWithSumZeroPresent = true;
                }
            }
        }
        return isSubArrayWithSumZeroPresent;
    }

    public static void main(String[] args) {
        int[] input = {4, 2, -14, 1, 6};
        System.out.println(isSubArrayWithSumZeroPresent(input));
    }
}
