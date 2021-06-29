package com.ck.interview.questions;

public class VolatileExmaple extends Thread {
	volatile boolean isRunning = true;
	@Override
	public void run() {
		long count = 0;
		while (isRunning) {
			count++;
		}
		System.out.println("Thread terminated with count= " + count);
	}

	public static void main(String[] args) throws InterruptedException {
		VolatileExmaple t = new VolatileExmaple();
		t.start();
		Thread.sleep(2000);
		t.isRunning = false;
		t.join();
		System.out.println("isRunning set to " + t.isRunning);
	}
}