package com.ck.train;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlatformProblem {
	public static int findMinPlatformsNeeded(List<TrainTime> trainsArrAndDepList) {
		System.out.println(trainsArrAndDepList);
		trainsArrAndDepList.sort((TrainTime obj1, TrainTime obj2) -> obj1.getTime().compareTo(obj2.getTime()));
		Integer arrival = 0;
		Integer departure = 0;
		System.out.println(trainsArrAndDepList);
		List<Integer> minPlatformsNeeded = new ArrayList<>();
		for (TrainTime trainTime : trainsArrAndDepList) {
			if (trainTime.isArrival()) {
				arrival++;
			} else {
				departure++;
			}
			minPlatformsNeeded.add(arrival - departure);
		}
		return Collections.max(minPlatformsNeeded);
	}
}

