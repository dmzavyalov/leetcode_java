package medium.twoPointers.Q0011ContainerWithMostWater;

/*

https://leetcode.com/problems/container-with-most-water/

Topics: Array, Two Pointers, Greedy

Time: O(n)
Space: O(1)

 */

public class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;

        int l = 0, r = height.length - 1;   //Start with max width
        while (l < r) {
            int area = (r - l) * Math.min(height[l], height[r]);
            maxArea = Math.max(maxArea, area);
            if (height[l] > height[r]) { //Keep the higher wall
                r--;
            } else {
                l++;
            }
        }

        return maxArea;
    }
}
