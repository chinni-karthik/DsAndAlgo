package com.ck.misc;

import java.util.ArrayList;
import java.util.Comparator;

public class MinimumPlatormsRequired {
	public static void main(String[] args) {
		int[] arr 											= { 900, 915, 1030, 1045 };
		int[] dep 											= { 930, 1300, 1100, 1145 };
		int[] counterArray 									= new int[arr.length + dep.length];
		int maxPlatforms 									= 0;
		ArrayList<ArrivalOrDeparture> trainScheduleList 	= new ArrayList<>(arr.length + dep.length);
		
		//Filling trainScheduleList
		for (int i = 0; i < arr.length; i++) {
			trainScheduleList.add(new ArrivalOrDeparture(true, arr[i]));
		}
		//Filling trainScheduleList
		for (int i = 0; i < dep.length; i++) {
			trainScheduleList.add(new ArrivalOrDeparture(false, dep[i]));
		}
		//Sorting trainScheduleList with respect to time
		trainScheduleList.sort(new MyComparator());

		//Filling counter array
		for (int i = 0; i < counterArray.length; i++) {
			if (trainScheduleList.get(i).isArrival) {
				if (i > 0) {
					counterArray[i] = counterArray[i - 1];
					counterArray[i]++;
				} else {
					counterArray[i]++;
				}
			} else {
				counterArray[i] = counterArray[i - 1];
				counterArray[i]--;
			}
		}

		//Finding maxPlatforms required!
		for (int i = 0; i < counterArray.length; i++) {
			if (maxPlatforms < counterArray[i]) {
				maxPlatforms = counterArray[i];
			}
		}
		System.out.println("Maximum platmorms required are : " + maxPlatforms);
	}
}

class ArrivalOrDeparture {
	boolean isArrival;
	Integer time;

	public ArrivalOrDeparture(boolean isArrival, int time) {
		super();
		this.isArrival = isArrival;
		this.time = time;
	}

}

class MyComparator implements Comparator<ArrivalOrDeparture> {

	@Override
	public int compare(ArrivalOrDeparture obj1, ArrivalOrDeparture obj2) {
		return obj1.time.compareTo(obj2.time);
	}
}