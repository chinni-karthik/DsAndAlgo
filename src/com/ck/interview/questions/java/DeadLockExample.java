package com.ck.interview.questions.java;

public class DeadLockExample {
    public static void main(String[] args) {
        final String resource1 = "Karthik Chinni";
        final String resource2 = "Chinni Karthik";

        // t1 tries to lock resource1 then resource2
        Runnable r1 = () -> {
                synchronized (resource1) {
                    System.out.println("Thread 1: locked resource 1");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                    synchronized (resource2) {
                        System.out.println("Thread 1: locked resource 2");
                    }
                }
            };

        // t2 tries to lock resource2 then resource1
        Runnable r2 = () -> {
                synchronized (resource2) {
                    System.out.println("Thread 2: locked resource 2");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }
                    synchronized (resource1) {
                        System.out.println("Thread 2: locked resource 1");
                    }
                }
            };

        Thread t1= new Thread(r1);
        Thread t2= new Thread(r2);
        t1.start();
        t2.start();
    }
}   