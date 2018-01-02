package com.ck.Searching;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		boolean result = linearSearch(arr, 50);
		System.out.println(result);
	}

	static boolean linearSearch(int[] arr,int x) {
		boolean isNumberPresent=Boolean.FALSE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==x){
				isNumberPresent= Boolean.TRUE;
			}
		}
		return isNumberPresent;
	}
}
