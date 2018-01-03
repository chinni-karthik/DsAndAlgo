package com.ck.sorting;

public class CountingSort {
	public static void main(String[] args) {
		int[] arr 				= { 9, 6, 3, 0, 1, 2, 5, 2, 3, 5, 8, 9, 9, 9 };
		int[] countArray 		= new int[arr.length];
		int[] cumulativeArray 	= new int[arr.length];//Can be done even without this array!
		int[] result			= new int[arr.length];
		
		//Filling countArray
		for (int i = 0; i < arr.length; i++) {
			countArray[arr[i]]++;
		}
		
		//Filling cumulativeArray
		cumulativeArray[0]=countArray[0];
		for (int i = 1; i < countArray.length; i++) {
			cumulativeArray[i]=cumulativeArray[i-1]+countArray[i];
		}
		
		//Finding where every element in input array should be placed
		for (int i = 0; i < arr.length; i++) {
			result[cumulativeArray[arr[i]]-1]=arr[i];
			cumulativeArray[arr[i]]--;
		}
		
		//Printing result array
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+"  ");
		}
	}
}
