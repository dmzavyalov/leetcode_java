package easy.dp.Q0746MinCostClimbingStairs;

/*

https://leetcode.com/problems/min-cost-climbing-stairs/

Array, Dynamic Programming

 */

public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int one = 0, two = 0;

        //Start at the end and move to the beginning
        for (int i = cost.length - 1; i >= 0; i--) {
            cost[i] += Math.min(one, two);   //We can move one or two steps
            two = one;
            one = cost[i];
        }

        return Math.min(cost[0], cost[1]);  //We're allowed to start from steps zero and one
    }
}
