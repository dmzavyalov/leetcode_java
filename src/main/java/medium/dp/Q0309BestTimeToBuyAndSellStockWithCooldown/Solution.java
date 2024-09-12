package medium.dp.Q0309BestTimeToBuyAndSellStockWithCooldown;

/*

https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/description/

 */

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maxProfit(int[] prices) {
        Map<String, Integer> cache = new HashMap<>();
        return dfs(prices, cache, 0, true);
    }

    private int dfs(int[] prices, Map<String, Integer> cache, int index, boolean buying) {
        if (index >= prices.length) {
            return 0;
        }

        //Cache key includes not only position, but if we're buying or selling
        String key = index + "-" + buying;

        if (cache.containsKey(key)) {
            return cache.get(key);
        }

        //As we move down the decision tree, cooldown (do nothing) is always an option
        int cooldown = dfs(prices, cache, index + 1, buying);

        //Buy or sell are two mutually exclusive alternatives
        int buyOrSell = buying ?
            dfs(prices, cache, index + 1, !buying) - prices[index] :
            dfs(prices, cache, index + 2, !buying) + prices[index]  //There is a forced cooldown after sell
        ;

        cache.put(key, Math.max(buyOrSell, cooldown));

        return cache.get(key);
    }
}
