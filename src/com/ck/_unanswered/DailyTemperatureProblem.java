package com.ck._unanswered;// Java program for the above approach

import java.util.*;
import java.lang.*;

class DailyTemperatureProblem {
    static void dailyTemperatures(int[] temperatureArray) {
        int n = temperatureArray.length;

        // To store the answer
        int[] daysOfWait = new int[n];
        Arrays.fill(daysOfWait, -1);

        Stack<Integer> s = new Stack<>();

        // Traverse all the temperatures
        for (int i = 0; i < n; i++) {
            // Check if current index is the next warmer temperature of any previous indexes
            while (!s.isEmpty() && temperatureArray[s.peek()] < temperatureArray[i]) {
                daysOfWait[s.peek()] = i - s.peek();
            s.pop();
            }
            s.push(i);
        }

        // Print waiting days
        for (int i = 0; i < n; i++) {
            System.out.print(daysOfWait[i] + " ");
        }
    }

    // Driver Code
    public static void main(String[] args) {
        // Given temperatures
        int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};
        // Function call
        dailyTemperatures(arr);
    }
}