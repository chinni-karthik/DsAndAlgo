package com.ck.interview.questions.java;

import java.util.Arrays;
import java.util.List;

class SequentialStreamDemo {
	public static void main(String[] args) {
		// create a list
		List<String> list = Arrays.asList("Hello ", "G", "E", "E", "K", "S!");

		list.stream().forEach(System.out::print);
	}
}