package Q0026RemoveDuplicatesFromSortedArray;

/*

https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150

Topics: Array, Two Pointers

Time: O(n)
Space: O(1)

 */

public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        int p1 = 1;

        for (int p2 = 1; p2 < nums.length; p2++) {
            if (nums[p2] != nums[p1 - 1]) {
                nums[p1++] = nums[p2];
            }
        }

        return p1;
    }
}
