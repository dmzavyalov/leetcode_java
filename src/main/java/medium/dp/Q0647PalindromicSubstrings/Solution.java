package medium.dp.Q0647PalindromicSubstrings;

/*

https://leetcode.com/problems/palindromic-substrings/

Two Pointers, String, Dynamic Programming

Time: O(n^2)

 */

public class Solution {
    public int countSubstrings(String s) {
        if (s == null)  {
            return 0;
        }

        if (s.length() < 2) {
            return s.length();
        };

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result += countPalindromicSubstrings(s, i, i);  //Count palindromes of odd length
            result += countPalindromicSubstrings(s, i, i + 1);  //Same for even length
        }

        return result;
    }

    private int countPalindromicSubstrings(String s, int l, int r) {
        int result = 0;

        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            result++;
            l--;
            r++;
        }

        return result;
    }
}
