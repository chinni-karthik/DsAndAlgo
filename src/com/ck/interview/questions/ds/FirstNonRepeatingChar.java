package com.ck.interview.questions.ds;

public class FirstNonRepeatingChar {

    // this function return the index of first non-repeating character if found, or else it returns -1
    public static int firstNonRepeating(String inputString) {
        int[] asciiCharArray = new int[26]; // array to store First Index
        // initializing all elements to -1
        for (int i = 0; i < 91-'A'; i++)
            asciiCharArray[i] = -1;

        System.out.println("After Step 1");
        for (int i = 0; i < 91-'A'; i++) {
            System.out.print(asciiCharArray[i]);
        }

        int currentIndex = 0;

        // sets all repeating characters to -2 and
        // non-repeating characters contain the index where they occur
        for (int i = 0; i < inputString.length(); i++) {
            currentIndex =  inputString.charAt(i)-'A';
            if (asciiCharArray[currentIndex] == -1) {
                asciiCharArray[currentIndex] = i;
            } else {
                asciiCharArray[currentIndex] = -2;
            }
        }

        System.out.println("After Step 2");
        for (int i = 0; i < 91-'A'; i++) {
            System.out.print(asciiCharArray[i]);
        }
        System.out.println();
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < 91-'A'; i++) {
            // If this character is not -1 or -2 --> this character occurred only once
            // so find the min index of all characters that occur only once,
            // that's our first index
            if (asciiCharArray[i] >= 0)
                result = Math.min(result, asciiCharArray[i]);
        }

        // if res remains  Integer.MAX_VALUE, --> no characters that repeat only once
        // or the string is empty
        if (result == Integer.MAX_VALUE) {
            return -1;
        } else {
            return result;
        }
    }

    public static void main(String args[]) {
        String str;
        str = "ABBACHA";
        int firstIndex = firstNonRepeating(str);
        System.out.println();
        if (firstIndex == -1)
            System.out.println("Either all characters are repeating or string is empty");
        else
            System.out.println("First non-repeating character is " + str.charAt(firstIndex));
    }
}