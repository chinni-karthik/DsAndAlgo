package com.ck._final450.arrays;

import java.util.HashMap;
import java.util.Map;

public class CountPairsForGivenSum {
    private static int getPairsCount(int[] input, int expectedSum) {
        Map<Integer, Integer> inputMap = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            inputMap.put(input[i], input[i]);
        }
        int pairsCount = 0;
        System.out.println("Pairs are :");
        for (int key : inputMap.keySet()) {
            if ((inputMap.get(expectedSum - key)) != null) {
                pairsCount++;
                System.out.println(key + " " + inputMap.get(expectedSum - key));
            }
        }
        return pairsCount / 2;
    }

    public static void main(String[] args) {
        int[] input = {8, 7, 2, 5, 3, 1};
        System.out.println(getPairsCount(input, 9));
    }
}
