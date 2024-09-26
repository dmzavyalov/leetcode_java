package hard.dp.Q0010RegularExpressionMatching;

/*

https://leetcode.com/problems/regular-expression-matching/

 */

public class Solution {
    public boolean isMatch(String s, String p) {
        boolean[][] cache = new boolean[s.length() + 1][p.length() + 1];
        return dfs(cache, s, p, 0, 0);
    }

    private boolean dfs(boolean[][] cache, String s, String p, int i, int j) {
        if (cache[i][j]) {
            return cache[i][j];
        }

        if (i >= s.length() && j >= p.length()) {
            return true;
        }

        if (j >= p.length()) {
            return false;
        }

        boolean match = i < s.length() &&
            (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');

        if (j + 1 < p.length() && p.charAt(j + 1) == '*') { //If the next char is asterisk
            //There are two options: use or don't use the asterisk
            cache[i][j] = dfs(cache, s, p, i, j + 2) ||
                (match && dfs(cache, s, p, i + 1, j));
        } else {    //If the next char is not asterisk
            //We check the current char and move on to the next if there is a match
            cache[i][j] = match && dfs(cache, s, p, i + 1, j + 1);
        }

        return cache[i][j];
    }
}
