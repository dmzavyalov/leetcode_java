package medium.greedy.Q0045JumpGameII;

/*

https://leetcode.com/problems/jump-game-ii/

 */

public class Solution {
    public int jump(int[] nums) {
        int res = 0, l = 0, r = 0, furthest = 0;
        while(r < nums.length - 1) {
            furthest = 0;
            for (int i = l; i <= r; i++) {
                //The idea resembles BFS
                //We identify the interval we can reach from the starting point
                //Then for each point in this interval we identify how far we can reach
                //It determines the boundaries of the next interval
                furthest = Math.max(furthest, i + nums[i]);
            }
            l = r + 1;
            r = furthest;
            res++;
        }
        return res;
    }
}
