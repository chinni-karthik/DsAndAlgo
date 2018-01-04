package com.ck.greedy;

import java.util.ArrayList;

public class WordWrap {
	public static void main(String[] args) {
		ArrayList<String> wordsList = new ArrayList<>();
		wordsList.add("aaa");
		wordsList.add("bb");
		wordsList.add("cc");
		wordsList.add("ddddd");
		int maxLineLength = 6;
		int cost = 0;
		int lengthRemaining = maxLineLength;
		for (int i = 0; i < wordsList.size(); i++) {
			if (wordsList.get(i).length() <= lengthRemaining) {
				lengthRemaining = lengthRemaining - wordsList.get(i).length() - 1;
			} else {
				cost = cost + lengthRemaining + 1;
				lengthRemaining = maxLineLength;// resetting
				lengthRemaining = lengthRemaining - wordsList.get(i).length() - 1;
			}
		}
		//Adding lengthRemaining value for last line!
		cost = cost + lengthRemaining + 1;
		System.out.println(cost);
	}
}
