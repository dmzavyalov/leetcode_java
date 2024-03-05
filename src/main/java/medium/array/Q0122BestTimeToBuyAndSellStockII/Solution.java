package medium.array.Q0122BestTimeToBuyAndSellStockII;

/*

https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/?envType=study-plan-v2&envId=top-interview-150

Topics: Array, Dynamic Programming, Greedy

Time: O(n)
Space: O(1)

The solution implements greedy algorithm

 */

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }

        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                maxProfit += prices[i] - prices[i-1];
            }
        }

        return maxProfit;
    }
}
