package medium.slidingWindow.Q0424LongestRepeatingCharacterReplacement;

/*

https://leetcode.com/problems/longest-repeating-character-replacement/description/

Topics: Hash Table, String, Sliding Window

Time: O(n)
Space: O(1)

 */

public class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int res = 0;
        int l = 0;

        for (int r = 0; r < s.length(); r++) {
            //Extend sliding window right
            count[s.charAt(r) - 'A']++;

            //Calculate current window length
            //Then find out count of the character which is most frequent
            //When see if we have enough replacement attempts
            //to substitute the remaining characters with the most frequent one
            if (r - l + 1 - max(count) > k) {
                //If no, shorten the sliding window
                count[s.charAt(l) - 'A']--;
                l++;
            }

            res = Math.max(res, r - l + 1);
        }
        return res;
    }

    private int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int a: arr) {
            if (a > max) {
                max = a;
            }
        }
        return max;
    }
}
