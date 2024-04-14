package hard.slidingWindow.Q0076MinimumWindowSubstring;

/*

https://leetcode.com/problems/minimum-window-substring/
Topics: Hash Table, String, Sliding Window

Time: O(m + n)
Space: O(1)

 */

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String minWindow(String s, String t) {
        if (t.isEmpty()) {
            return "";
        }

        Map<Character, Integer> countT = new HashMap<>();
        for (var c : t.toCharArray()) {
            countT.compute(c, (k, v) -> v == null ? 1 : v + 1);
        }

        int have = 0, need = countT.size();

        Map<Character, Integer> window = new HashMap<>();
        int resL = -1, resR = -1, resLen = Integer.MAX_VALUE;
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            window.compute(c, (k, v) -> v == null ? 1 : v + 1);

            //If we have equal counts of character for the window and the target string
            //Skip characters that are not in the target string
            if (countT.containsKey(c) && countT.get(c).equals(window.get(c))){
                have++;
            }

            while (have == need) {
                //We have a new shorter, improved result
                if (r - l + 1 < resLen) {
                    resL = l;
                    resR = r;
                    resLen = r - l + 1;
                }
                //Advance left side of the window
                window.compute(s.charAt(l), (k,v) -> v - 1 );
                //If by advancing we drop a character that we need in t
                if (countT.containsKey(s.charAt(l)) &&
                    window.get(s.charAt(l)) < countT.get(s.charAt(l))) {
                    have--;
                }
                l++;
            }
        }

        return resLen != Integer.MAX_VALUE ? s.substring(resL, resR + 1) : "";
    }
}
