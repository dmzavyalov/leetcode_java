package medium.greedy.Q0053MaximumSubarray;

/*

https://leetcode.com/problems/maximum-subarray/

 */

public class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int sum = 0;
        int max = nums[0];

        for (int n: nums) {
            sum += n;
            max = Math.max(max, sum);
            if (sum < 0) {
                sum = 0;
            }
        }

        return max;
    }
}
