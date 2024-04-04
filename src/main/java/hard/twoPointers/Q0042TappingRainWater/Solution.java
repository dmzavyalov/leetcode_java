package hard.twoPointers.Q0042TappingRainWater;

/*

https://leetcode.com/problems/trapping-rain-water/description/

Topics: Array, Two Pointers, Dynamic Programming, Stack, Monotonic Stack

Time: O(n)
Space: O(1)

 */

public class Solution {
    public int trap(int[] height) {
        if (height.length == 0) {
            return 0;
        }

        int l = 0, r = height.length - 1;
        int maxL = height[l], maxR = height[r];

        int trap = 0;

        while (l < r) {
            //Advance the pointer to the lower of the two bounding walls
            if (maxL < maxR) {
                l++;
                //Among two walls the lower one determines max amount of water the map can trap
                maxL = Math.max(maxL, height[l]);
                //The amount of water that the column can trap depends on:
                //- The height of the walls bounding it from the left and the right
                //- The height of the terrain of this column
                trap += maxL - height[l];
            } else {
                r--;
                maxR = Math.max(maxR, height[r]);
                trap += maxR - height[r];
            }
        }
        return trap;
    }

}
