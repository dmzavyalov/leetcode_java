package medium.dp.Q0062UniquePaths;

/*

https://leetcode.com/problems/unique-paths/

 */

public class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        //Last row
        for (int j  = 0; j < n; j++) {
            dp[m-1][j] = 1;
        }

        //Last column
        for (int i = 0; i < m; i++) {
            dp[i][n-1] = 1;
        }

        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                //The robot can only move right or down
                //The solution for each cell is the sum of solutions for two adjacent cells
                dp[i][j] = dp[i+1][j] + dp[i][j+1];
            }
        }

        return dp[0][0];
    }
}
