package easy.dp.Q0070ClimbingStairs;

/*

https://leetcode.com/problems/climbing-stairs/

Math, Dynamic Programming, Memoization

Time: DP solution is O(n)

Brute-force approach is O(2^n)

 */

public class Solution {
    public int climbStairs(int n) {
        //Bottom-up DP

        //Base case, at the goal, one way to lend there
        //Same for the case right before the base. One step forward moves to base case, if we take two steps we overstep the goal
        int one = 1, two = 1;

        for (int i = 0; i < n - 1; i++) {
            var temp = one;
            //For all the subsequent steps the result is the sum of the two previous steps
            //Remember, we can take only one or two steps
            //Because of this condition we don't have to keep entire DP array, keeping results of the two latest steps is sufficient
            one = one + two;
            two = temp;
        }

        return one;
    }
}
