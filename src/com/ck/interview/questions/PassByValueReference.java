package com.ck.interview.questions;

import java.util.ArrayList;
import java.util.List;

public class PassByValueReference {
	public static void main(String[] args) {
		int data = 10;
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("grapes");
		System.out.println("Before processing pass by value");
		System.out.println(data);
		System.out.println("After processing pass by value");
		System.out.println(data);
		System.out.println("Before processing pass by ref");
		System.out.println(fruits);
		System.out.println("After processing pass by ref");
		processPassByRef(fruits);
		System.out.println(fruits);
	}

	public static void processPassByValue(int data) {
		data = data * 10;
	}

	public static void processPassByRef(List<String> fruitsRef) {
		fruitsRef = new ArrayList<>();
		fruitsRef.add("Banana");
	}
}
