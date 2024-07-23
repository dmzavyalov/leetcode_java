package medium.dp.Q0213HouseRobberII;

/*

https://leetcode.com/problems/house-robber-ii/

Array, Dynamic Programming

Time: O(n)

 */

public class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        //We solve House Robber I problem twice: without first house and without last house
        //Because these two can't go together
        //And then return the max
        return Math.max(
            rob1(nums, 0, nums.length - 2),
            rob1(nums, 1, nums.length - 1)
        );
    }

    //This is the solution to House Robber I problem
    private int rob1(int[] nums, int start, int end) {
        int rob1 = 0, rob2 = 0;
        for (int i = start; i <= end; i++) {
            int temp = Math.max(rob1 + nums[i], rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        return rob2;
    }
}
