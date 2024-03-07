package easy.array.Q0242ValidAnagram;

/*

https://leetcode.com/problems/valid-anagram/

Topics: Hash Table, String, Sorting

Time: O(s+t)
Space: O(1)

The solution takes advantage of the provided constraint that input consists of lowercase English letters
in order to achieve constant space complexity

 */

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
