package medium.dp.Q0300LongestIncreasingSubsequence;

/*

https://leetcode.com/problems/longest-increasing-subsequence/description/

Time: O(n^2)

 */

import java.util.Arrays;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0)  {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }

        int[] lis = new int[nums.length];
        Arrays.fill(lis, 1);
        int max = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    lis[i] = Math.max(lis[i], 1 + lis[j]);
                }
            }
            max = Math.max(max, lis[i]);
        }

        return max;
    }
}
