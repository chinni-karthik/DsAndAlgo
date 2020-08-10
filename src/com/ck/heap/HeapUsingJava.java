package com.ck.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class HeapUsingJava {
	static PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
}
