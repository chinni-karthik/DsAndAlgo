package com.ck.interview.questions.java;

public class PrintNumbersUsingThreeThreads {
    final static int MAX_NUMBERS = 10;

    public static void main(String[] args) {
        // shared object
        PrintNumbersUsingThreeThreads obj = new PrintNumbersUsingThreeThreads();
        // Creating 3 threads
        Thread t1 = new Thread(new NumberRunnable(obj, 0), "T1");
        Thread t2 = new Thread(new NumberRunnable(obj, 1), "T2");
        Thread t3 = new Thread(new NumberRunnable(obj, 2), "T3");
        t1.start();
        t2.start();
        t3.start();
    }
}

class NumberRunnable implements Runnable {
    PrintNumbersUsingThreeThreads obj;
    int threadNumber;
    static volatile int number = 0;

    NumberRunnable(PrintNumbersUsingThreeThreads obj, int threadNumber) {
        this.obj = obj;
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        synchronized (obj) {
            while (number < PrintNumbersUsingThreeThreads.MAX_NUMBERS-2) {
                while (number % 3 != threadNumber) {
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " - " + ++number);
                obj.notifyAll();
            }
        }
    }
}