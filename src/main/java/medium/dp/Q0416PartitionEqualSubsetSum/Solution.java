package medium.dp.Q0416PartitionEqualSubsetSum;

/*

https://leetcode.com/problems/partition-equal-subset-sum/

Time: O(n * sum)
Space: O(sum)

 */

import java.util.Arrays;

public class Solution {
    public boolean canPartition(int[] nums) {
        //If there is a partition, it's sum would be half of the entire nums sum
        int sum = Arrays.stream(nums).sum();
        if (sum % 2 != 0) {
            return false;
        }
        int target = sum / 2;
        //The size of dp array is the target sum
        //So the larger the numbers in the input array the more memory we're going to need
        boolean[] dp = new boolean[target];
        dp[0] = true;

        for (int no: nums) {    //For each number in the input
            for (int i = target; i >= no; i--) {    //We're looking for a complementing number. So together they add up to target
                if (dp[i - no]) {
                    if (i == target) {
                        return true;
                    }
                    dp[i] = true;
                }
            }
        }
        return false;
    }
}
