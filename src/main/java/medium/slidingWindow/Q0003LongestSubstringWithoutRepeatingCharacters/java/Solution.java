package medium.slidingWindow.Q0003LongestSubstringWithoutRepeatingCharacters.java;

/*

https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

Topics: Hash Table, String, Sliding Window

Time: O(n)
Space: O(n)

 */

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int maxLen = 0;
        int l = 0;
        //Expand the right bound of the sliding window
        for (int r = 0; r < s.length(); r++) {
            //Contract the left bound of the sliding window the character on the right already belongs to the sequence
            while (charSet.contains(s.charAt(r))) {
                charSet.remove(s.charAt(l));
                l += 1;
            }
            charSet.add(s.charAt(r));
            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }
}
