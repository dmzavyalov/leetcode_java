package medium.dp.Q0072EditDistance;

/*

https://leetcode.com/problems/edit-distance/

 */

import java.util.Arrays;

public class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length() - 1;
        int n = word2.length() - 1;
        int[][] dp = new int[m + 2][n + 2];
        for (int[] d: dp) {
            Arrays.fill(d, -1);
        }
        //Start at the end
        return helper(word1, word2, m, n, dp);
    }

    public int helper(String word1, String word2, int m, int n, int[][] dp) {
        if (m + 1 == 0 && n + 1 == 0) {
            //Both strings are empty, no need to do anything
            return 0;
        }

        if (m + 1 == 0 || n + 1 == 0) {
            //One of the strings is empty. Insert all character from the target string,
            //or delete all characters in the input string
            //Both require the number of operations proportional to string length
            return Math.max(m + 1, n + 1);
        }

        if (dp[m][n] != -1) {
            return dp[m][n];    //Return cached value
        }

        if (word1.charAt(m) == word2.charAt(n)) {
            //Both characters are equal, the step requires no additional operations, move diagonally
            dp[m][n] = helper(word1, word2, m - 1, n - 1, dp);
            return dp[m][n];
        } else {
            //If characters are not equal we try all three operations
            //Note that there is no need to do actual string manipulation
            //All the operations increase operation counter
            int delete = 1 + helper(word1, word2, m - 1, n, dp);    //Move horizontally
            int insert = 1 + helper(word1, word2, m, n - 1, dp);    //Move vertically
            int replace = 1 + helper(word1, word2, m - 1, n - 1, dp); //Move diagonally
            //Chose the path that takes fewer operations
            dp[m][n] = Math.min(Math.min(delete, insert), replace);
            return dp[m][n];
        }
    }
}
