package com.ck.arrays;

public class UrlifyUsingJava {
	public static String getUrlifiedString(String input) {
		return input.replaceAll("\\s", "%20");
	}
	public static void main(String[] args) {
		String input = "Hello Wrold!";
		System.out.println(getUrlifiedString(input));
	}
}
