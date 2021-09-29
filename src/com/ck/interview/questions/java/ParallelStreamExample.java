package com.ck.interview.questions.java;

import java.util.Arrays;
import java.util.List;

class ParallelStreamExample {
	public static void main(String[] args) {
		// create a list
		List<String> list = Arrays.asList("Hello ", "G", "E", "E", "K", "S!");

		list.parallelStream().forEach(System.out::print);
	}
}