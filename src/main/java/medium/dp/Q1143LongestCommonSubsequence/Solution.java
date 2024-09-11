package medium.dp.Q1143LongestCommonSubsequence;

/*

https://leetcode.com/problems/longest-common-subsequence/description/

 */

public class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        //Add additional row and column at the borders filled with zeroes to simplify calculation
        int [][] dp = new int[text1.length() + 1][text2.length() + 1];
        //Solve sub-problems bottom-up
        for (int i = text1.length() - 1; i >= 0; i--) {
            for (int j = text2.length() - 1; j >= 0; j--) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    dp[i][j] = 1  + dp[i + 1][j + 1];   //Move diagonally
                } else {
                    dp[i][j] = Math.max(dp[i][j+1], dp[i+1][j]); //Move sideways
                }
            }
        }
        return dp[0][0];
    }
}
