package medium.dp.Q0518CoinChangeII;

/*

https://leetcode.com/problems/coin-change-ii/

 */

public class Solution {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;  //One way to make the sum add up to zero

        for (int coin : coins) {
            for (int i = 1; i <= amount; i++) {
                if (coin <= i) {    //Avoid duplicates
                    dp[i] += dp[i - coin];
                }
            }
        }

        return dp[amount];
    }
}
