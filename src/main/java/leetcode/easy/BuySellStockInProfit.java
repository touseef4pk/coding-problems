package main.java.leetcode.easy;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class BuySellStockInProfit {

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        int profit = maxProfit(prices);
        System.out.println(profit);

        int maxProfit = maximumProfit(prices);
        System.out.println(maxProfit);
    }

    //This is not efficient codes, see second solution for optimal solution
    public static int maxProfit(int[] prices) {

        int profit = 0;
        for (int i = 0; i < prices.length; i++) {

            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] > prices[i]) {
                   int currentProfit = prices[j] - prices[i];
                   profit = Math.max(profit, currentProfit);

                   //or you can use following if condtion instead of above Match.max line
             /*       if(currentProfit > profit){
                        profit = currentProfit;
                    }*/

                }
            }
        }
       return profit;
    }


    public static int maximumProfit(int[] prices) {

        int profit = 0;

        int buyPrice = prices[0];

        for (int i = 0; i < prices.length; i++) {

             if(buyPrice > prices[i]){
                buyPrice = prices[i];
             } else {
                 int currentProfit = prices[i] - buyPrice;
                 if(currentProfit > profit){
                     profit = currentProfit;
                 }
             }
        }
        return profit;
    }

}
