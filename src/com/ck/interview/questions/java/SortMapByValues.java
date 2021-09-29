package com.ck.interview.questions.java;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValues {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Math", 98);
		hm.put("Data Structure", 85);
		hm.put("Database", 91);
		hm.put("Java", 95);
		Map<String, Integer> hm1 = sortByValueLambdaSteam(hm);
		for (Map.Entry<String, Integer> en : hm1.entrySet()) {
			System.out.println("Key = " + en.getKey() + ", Value = " + en.getValue());
		}
	}

	public static HashMap<String, Integer> sortByValueOld(HashMap<String, Integer> hm) {
		// Create a list from elements of HashMap
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());

		// Sort the list
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> obj1, Map.Entry<String, Integer> obj2) {
				return (obj1.getValue()).compareTo(obj2.getValue());
			}
		});

		// put data from sorted list to LinkedHashMap so insertion order is preserved
		HashMap<String, Integer> valueSortedMap = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> currentEntry : list) {
			valueSortedMap.put(currentEntry.getKey(), currentEntry.getValue());
		}
		return valueSortedMap;
	}

	public static HashMap<String, Integer> sortByValueLambda(HashMap<String, Integer> inputMap) {
		// Create a list from elements of HashMap
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(inputMap.entrySet());

		// Sort the list using lambda expression
		Collections.sort(list, (i1, i2) -> i1.getValue().compareTo(i2.getValue()));

		// put data from sorted list to HashMap
		HashMap<String, Integer> valueSortedMap = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> aa : list) {
			valueSortedMap.put(aa.getKey(), aa.getValue());
		}
		return valueSortedMap;
	}

	public static HashMap<String, Integer> sortByValueLambdaSteam(HashMap<String, Integer> hm) {
		HashMap<String, Integer> valueSortedMap = hm.entrySet()
				.stream()
				.sorted((i1, i2) -> i1.getValue().compareTo(i2.getValue()))
				.collect(Collectors.toMap(
						Map.Entry::getKey,
						Map.Entry::getValue,
						(e1, e2) -> e1, 
						LinkedHashMap::new));

		return valueSortedMap;
	}

}
