package easy.array.Q0121BestTimeToBuyAndSellStock;

/*

https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=study-plan-v2&envId=top-interview-150

Topics: Array, Dynamic Programming

Time: O(n)
Space: O(1)

The solution implements greedy algorithm

 */

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int buy = prices[0], maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] <= buy) {
                buy = prices[i];
            } else if (prices[i] - buy > maxProfit) {
                maxProfit = prices[i] - buy;
            }
        }

        return maxProfit;
    }
}
