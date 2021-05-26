package com.ck.dynamic.udemy;

import java.util.Arrays;
import java.util.List;

public class BinPackingApp {
	public static void main(String[] args) {

		List<Integer> items = Arrays.asList(5, 5, 5);
		int binCapacity = 10;

		FirstFitDecreasingAlgorithm algorithm = new FirstFitDecreasingAlgorithm(items, binCapacity);
		algorithm.solveBinPackingProblem();
		algorithm.showResults();

	}
}
