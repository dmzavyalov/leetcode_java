package medium.dp.Q0198HouseRobber;

/*

https://leetcode.com/problems/house-robber/

Array, Dynamic Programming

Time: O(n)

 */

public class Solution {
    public int rob(int[] nums) {
        //Optimal solution for the steps depends on solutions for the two previous steps
        //There is not need to keep the entire DP solution array
        int rob1 = 0, rob2 = 0;

        for (int n: nums) {
            //[rob1, rob2, n, n+1, ...]
            //Solution for step N is the maximum of two possible cases
            //a) The value of house N + the best sum we've calculated for the step N-2 (we are not allowed rob the house at N-1)
            //b) The best sum we've calculated for the step N-1 (we skip house N)
            int tmp = Math.max(n + rob1, rob2);
            rob1 = rob2;
            rob2 = tmp;
        }

        return rob2;
    }
}
