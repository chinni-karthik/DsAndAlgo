package com.ck.train;

import java.util.ArrayList;
import java.util.List;

public class PlatformProblemTest {
	public static void main(String[] args) {
		Integer arr[] = { 100, 140, 150, 200, 215, 400 };
		Integer dep[] = { 110, 300, 220, 230, 315, 600 };
		List<TrainTime> trainTimeList = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			trainTimeList.add(new TrainTime(arr[i], true));
		}
		for (int i = 0; i < dep.length; i++) {
			trainTimeList.add(new TrainTime(dep[i], false));
		}
		int minPlatformsNeeded = PlatformProblem.findMinPlatformsNeeded(trainTimeList);
		System.out.println(minPlatformsNeeded);
	}
}
