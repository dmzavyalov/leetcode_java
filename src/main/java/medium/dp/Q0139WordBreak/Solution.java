package medium.dp.Q0139WordBreak;

/*

https://leetcode.com/problems/word-break/description/


 */

import java.util.List;

public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[s.length()] = true;

        for (int i = s.length() - 1; i >= 0; i--) {
            for (String word: wordDict) {
                //If the word fits at position i
                if (i + word.length() <= s.length() && s.startsWith(word, i)) {
                    //Then the solution for the position i depends on the
                    //previously calculated solution
                    dp[i] = dp[i + word.length()];
                }
                if (dp[i]) {
                    break;
                }
            }
        }

        return dp[0];
    }
}
