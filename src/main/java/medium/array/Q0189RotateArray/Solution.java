package medium.array.Q0189RotateArray;

/*
 * https://leetcode.com/problems/rotate-array/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * Topics: Array, Math, Two Pointers
 *
 * Time: O(n)
 * Space: O(1)
 *
 */

public class Solution {
    public void rotate(int[] nums, int k) {
        if (k > nums.length) {
            k = k % nums.length;
        }

        reverse(nums,0,  nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int begin, int end) {
        for (int i = begin, j = end; i < j; i++, j--) {
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
    }
}
