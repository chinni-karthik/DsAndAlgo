package com.ck.threads;

public class MyThreadSleep{
	public static void main(String[] args) throws InterruptedException {
		System.out.println("J");
		Thread.sleep(5000);
		System.out.println("A");
		Thread.sleep(5000);
		System.out.println("V");
		Thread.sleep(5000);
		System.out.println("A");
	}
}
