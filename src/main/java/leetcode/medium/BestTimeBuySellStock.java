package main.java.leetcode.medium;

public class BestTimeBuySellStock {

    //https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
    public int maxProfit(int[] prices) {

        int buyPrice = prices[0];
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            if(buyPrice > prices[i]){
                buyPrice = prices[i];
            } else {

                   int profit = prices[i] - buyPrice;
                   maxProfit = Math.max(profit, maxProfit);
            }
        }
        return maxProfit;
    }

}
