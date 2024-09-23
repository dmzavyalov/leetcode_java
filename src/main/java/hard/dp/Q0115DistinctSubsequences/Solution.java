package hard.dp.Q0115DistinctSubsequences;

/*

https://leetcode.com/problems/distinct-subsequences/

 */

import java.util.Arrays;

public class Solution {
    public int numDistinct(String s, String t) {
        int n = s.length() + 1;
        int m = t.length() + 1;

        int[][] memo = new int[n][m];

        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        return recursion(s, t, 0, 0, memo);
    }

    private int recursion(String s, String t, int sIdx, int tIdx, int[][] memo) {
        if (memo[sIdx][tIdx] != -1) {
            return memo[sIdx][tIdx];
        }

        if (tIdx >= t.length()) {
            return 1;   //We've successfully completed the string to reach the target
        }

        if (sIdx >= s.length()) {
            return 0;   //We've exhausted all characters in the input string, but haven't reached the target
        }

        memo[sIdx][tIdx] = t.charAt(tIdx) == s.charAt(sIdx) ?
                //If the characters are equal, there are two options
                recursion(s, t, sIdx + 1, tIdx + 1, memo) + //Advance both indexes
                recursion(s, t, sIdx + 1, tIdx, memo) : //Skip the current character in s

                //If the characters not equal, we skip the current character in s
                recursion(s, t, sIdx + 1, tIdx, memo);

        return memo[sIdx][tIdx];
    }
}
