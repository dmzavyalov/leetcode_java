package medium.binarySearch.Q0033SearchInRotatedSortedArray;

/*

https://leetcode.com/problems/search-in-rotated-sorted-array/

Topics: Array, Binary Search

Time: O(log n)
Space: O(1)

 */

public class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                return mid;
            }

            if (nums[left] <= nums[mid]) {  //The middle belong to the left sorted portion
                if (target > nums[mid] || target < nums[left]) {
                    left = mid + 1; //Go right
                } else {
                    right = mid - 1; //Go left
                }
            } else {    //The middle belong to the right sorted portion
                if (target < nums[mid] || target > nums[right]) {
                    right = mid - 1; //Go left
                } else {
                    left = mid + 1; //Go right
                }
            }
        }
        return -1;
    }
}
