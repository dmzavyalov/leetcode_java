package medium.binarySearch.Q0153FindMinimumInRotatedSortedArray;


/*

https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

Topics: Array, Binary Search

Time: O(log n)
Space: O(1)

 */


public class Solution {
    public int findMin(int[] nums) {
        int min = nums[0];

        int l = 0, r = nums.length - 1;
        while (l <= r) {
            //If we've found continuously increasing range
            if (nums[l] < nums[r]) {
                //Then the minimum is the leftmost element in it
                min = Math.min(min, nums[l]);
                break;
            }

            int m = l + (r - l) / 2;
            min = Math.min(min, nums[m]);
            if (nums[m] >= nums[l]) {
                //The left part of the range is in increasing order
                //It means that pivot is located on the right side of the range
                l = m + 1;
            } else {
                //The pivot is on the left side of the range
                r = m - 1;
            }
        }

        return min;
    }
}
