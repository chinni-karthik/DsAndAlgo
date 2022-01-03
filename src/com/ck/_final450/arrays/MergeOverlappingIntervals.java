package com.ck._final450.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class MergeOverlappingIntervals {
    public static void mergeIntervals(Interval[] intervalArray) {
        // Base Case
        if (intervalArray.length <= 0)
            return;

        // Create an empty stack of intervals
        Stack<Interval> stack = new Stack<>();

        // sort the intervals in increasing order of start time
        Arrays.sort(intervalArray, new Comparator<Interval>() {
            public int compare(Interval i1, Interval i2) {
                return i1.start - i2.start;
            }
        });

        System.out.println("Interval Array after sorting...");
        printArray(intervalArray);

        // push the first interval to stack
        stack.push(intervalArray[0]);

        // Start from the next interval and merge if necessary
        for (int i = 1; i < intervalArray.length; i++) {
            //get interval from stack top.
            //peek() Looks at the object at the top of this stack without removing it.
            Interval top = stack.peek();

            // if current interval is not overlapping , push it.
            if (top.end < intervalArray[i].start)
                stack.push(intervalArray[i]);

            // Otherwise update the ending time of top if ending of current interval is more
            else if (top.end < intervalArray[i].end) {
                top.end = intervalArray[i].end;
                stack.pop();
                stack.push(top);
            }
        }

        System.out.print("The Merged Intervals are: ");
        while (!stack.isEmpty()) {
            Interval t = stack.pop();
            System.out.print("[" + t.start + "," + t.end + "] ");
        }
    }

    public static void main(String args[]) {
        Interval arr[] = new Interval[4];
        arr[0] = new Interval(1, 3);
        arr[1] = new Interval(6, 8);
        arr[2] = new Interval(2, 4);
        arr[3] = new Interval(5, 7);

        System.out.println("Interval Array initially...");
        printArray(arr);
        mergeIntervals(arr);
    }

    private static void printArray(Interval arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}

class Interval {
    int start, end;

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Interval{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}