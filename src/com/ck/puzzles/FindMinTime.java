package com.ck.puzzles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FindMinTime {
	public static int calculateMinTime(List<Person> inputList) {
		if (inputList == null) {
			System.out.println("Invalid Input");
			return -1;
		}
		List<Person> sortedPersonsByTime = sortPerson(inputList);
		if (sortedPersonsByTime.size() == 2) {
			return sortedPersonsByTime.get(1).getTime();
		}
		int minTimeNeeded = 0;
		if (sortedPersonsByTime.size() > 3) {
			minTimeNeeded = sortedPersonsByTime.get(1).getTime() + sortedPersonsByTime.get(0).getTime();
		}
		int count = 2;
		int minTimeToReturnTorch = sortedPersonsByTime.get(0).getTime();
		int nextMinTimeToReturnTorch = sortedPersonsByTime.get(1).getTime();
		while (count < inputList.size() - 2) {
			minTimeNeeded = minTimeNeeded
					+ Math.max(sortedPersonsByTime.get(count).getTime(), sortedPersonsByTime.get(count + 1).getTime());
			minTimeNeeded = minTimeNeeded + nextMinTimeToReturnTorch;
			count = count + 2;
			// Swapping two values as per algorithm.
			int temp = minTimeToReturnTorch;
			minTimeToReturnTorch = nextMinTimeToReturnTorch;
			nextMinTimeToReturnTorch = temp;
		}
		// Handling last case
		minTimeNeeded = minTimeNeeded + sortedPersonsByTime.get(count).getTime();
		return minTimeNeeded;
	}

	public static List<Person> sortPerson(List<Person> inputList) {
		Comparator<Person> byTime = (Person p1, Person p2) -> p1.getTime().compareTo(p2.getTime());
		List<Person> personListSorted = new ArrayList<Person>();
		for (Person person : inputList) {
			personListSorted.add(person);
		}
		Collections.sort(personListSorted, byTime);
		return personListSorted;
	}

	public static void main(String[] args) {
		List<Person> inputList = new ArrayList<Person>();
		Person personA = new Person("A", 1);
		Person personB = new Person("B", 2);
		Person personC = new Person("C", 7);
		Person personD = new Person("D", 10);
		inputList.add(personA);
		inputList.add(personB);
		inputList.add(personC);
		inputList.add(personD);
		System.out.println("Min time needed = " + calculateMinTime(inputList));
	}
}
