package com.ck.misc;

import java.util.ArrayList;
import java.util.Comparator;

public class FractionalKnapsack {

	public static void main(String[] args) {
		int[] weight 					= { 10, 20, 30 };
		int[] profit 					= { 60, 100, 120 };
		int totalProfit 				= 0;
		int weightLeft 					= 50;
		ArrayList<Items> itemsArrayList = new ArrayList<>();

		//Filling Items list
		for (int i = 0; i < weight.length; i++) {
			itemsArrayList.add(new Items(weight[i], profit[i]));
		}

		//Sorting based on p/w ratio
		itemsArrayList.sort(new MyComparatorFractionalKnapsack());
		
		
		for (int i = 0; i < itemsArrayList.size(); i++) {
			int p = itemsArrayList.get(i).profit;
			int w = itemsArrayList.get(i).weight;

			if (w <= weightLeft) {//take full
				totalProfit += p;
				weightLeft 	-= w;
			} else {//take partial as weight left is less
				totalProfit += (p / w) * weightLeft;
			}
		}
		//Printing result
		System.out.println(totalProfit);
	}

}

class Items {
	int weight;
	int profit;

	public Items(int weight, int profit) {
		this.weight = weight;
		this.profit = profit;
	}

}

class MyComparatorFractionalKnapsack implements Comparator<Items> {

	@Override
	public int compare(Items item1, Items item2) {
		Integer pwRation1 = item1.profit / item1.weight;
		Integer pwRation2 = item2.profit / item2.weight;

		return pwRation2.compareTo(pwRation1);//Sorting in descending order!
	}

}
