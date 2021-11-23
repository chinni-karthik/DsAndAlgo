package com.ck._final450.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class KthSmallestNumber {
    // Function to find the k'th smallest element in an array using min-heap
    public static int findKthSmallest(List<Integer> input, int k) {
        // base case
        if (input == null || input.size() < k) {
            System.exit(-1);
        }

        // create an empty min-heap and initialize it with all input elements
        PriorityQueue<Integer> pq = new PriorityQueue<>(input);

        // pop from min-heap exactly `k-1` times
        while (--k > 0) {
            pq.poll();
        }

        // return the root of min-heap
        return pq.peek();
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(7, 4, 6, 3, 9, 1);
        int k = 3;
        System.out.println("k'th smallest array element is " + findKthSmallest(input, k));
    }
}
