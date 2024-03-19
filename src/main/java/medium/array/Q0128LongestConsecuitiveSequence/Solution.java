package medium.array.Q0128LongestConsecuitiveSequence;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/*

https://leetcode.com/problems/longest-consecutive-sequence/description/

Topics: Array, Hash Table, Union Find

Time: O(n)
Space: O(n)

 */


public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int longest = 0;

        for (int i: nums) {
            if (!set.contains(i - 1)) {
                int length = 1;
                while (set.contains(i+length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}
