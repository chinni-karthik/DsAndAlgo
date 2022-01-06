package com.ck._final450.arrays;

public class AlternatePositiveNegative {
    private static int[] getAlternatePositiveNegative(int[] input) {
        int j = 0, wrongIndex = 0;
        for (int i = 0; i < input.length; i++) {
            if ((i % 2 == 0 && input[j] < 0) || (i % 2 == 1 && input[j] > 0)) {
                //correct position
                j++;
            } else {
                //wrong position
                wrongIndex = j;
                if (input[wrongIndex] > 0) {
                    while (input[wrongIndex] > 0) {
                        wrongIndex++;
                    }
                } else {
                    while (input[wrongIndex] < 0) {
                        wrongIndex++;
                    }
                }

                rightRotateArray(input, j, wrongIndex);
                i = wrongIndex;
                j = wrongIndex + 1;
            }
        }
        return input;
    }

    private static int[] rightRotateArray(int[] input, int from, int to) {
        int temp = input[to];
        for (int i = to; i > from; i--) {
            input[i] = input[i - 1];
        }
        input[from] = temp;
        return input;
    }

    public static void main(String[] args) {
        int[] input = {-1, 1, 2, 3, -3};
        input = getAlternatePositiveNegative(input);
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }
}
