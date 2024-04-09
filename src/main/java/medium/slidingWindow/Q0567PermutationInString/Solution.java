package medium.slidingWindow.Q0567PermutationInString;

/*

https://leetcode.com/problems/permutation-in-string/description/

Topics: Hash Table, Two Pointers, String, Sliding Window

Time: O(n)
Space: O(1)

 */

import java.util.Arrays;

public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        //Get counts for the characters in the initial sliding window
        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        int l = 0;
        for (int r =  l + s1.length(); r < s2.length(); r++) {
            if (Arrays.equals(s1Count, s2Count)) {
                return true;
            }

            s2Count[s2.charAt(r) - 'a']++;
            s2Count[s2.charAt(l) - 'a']--;
            l++;
        }

        return Arrays.equals(s1Count, s2Count);
    }
}
