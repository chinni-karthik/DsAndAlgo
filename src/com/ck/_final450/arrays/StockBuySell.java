package com.ck._final450.arrays;

public class StockBuySell {
    private static int getMaxProfit(int[] stockPriceArray) {
        int maxProfit = 0;
        int currentProfit = 0;
        int minSoFar = stockPriceArray[0];
        for (int i = 0; i < stockPriceArray.length; i++) {
            minSoFar = Math.min(minSoFar, stockPriceArray[i]);
            currentProfit = stockPriceArray[i] - minSoFar;
            maxProfit = Math.max(currentProfit, maxProfit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] stockPriceArray = {5, 2, 6, 1, 4};
        System.out.println(getMaxProfit(stockPriceArray));
    }
}
