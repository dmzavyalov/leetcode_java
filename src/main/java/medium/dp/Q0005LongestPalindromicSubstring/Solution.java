package medium.dp.Q0005LongestPalindromicSubstring;

/*

https://leetcode.com/problems/longest-palindromic-substring/

Two Pointers, String, Dynamic Programming

Time: O(n^2)
Space: O(1)

 */

public class Solution {
    public String longestPalindrome(String s) {
        //One way to find if a string is palindrome is to start at the edges and move towards the center comparing characters
        //Another way is to start at the center and extend outwards
        //In this solution we iterate through the characters and check what the longest palindrome may be
        //if it's center is the currently selected character

        if (s.length() < 2) {
            return s;
        }

        String result = "";
        int resultLen = 0;

        for (int i = 0; i < s.length(); i++) {
            {
                //Look for odd length palindrome
                int left = i, right = i;
                while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                    if (right - left + 1 > resultLen) {
                        result = s.substring(left, right + 1);
                        resultLen = right - left + 1;
                    }
                    left--;
                    right++;
                }
            }

            {
                //Look for even length palindrome
                int left = i, right = i + 1;
                while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                    if (right - left + 1 > resultLen) {
                        result = s.substring(left, right + 1);
                        resultLen = right - left + 1;
                    }
                    left--;
                    right++;
                }
            }
        }

        return result;
    }
}
