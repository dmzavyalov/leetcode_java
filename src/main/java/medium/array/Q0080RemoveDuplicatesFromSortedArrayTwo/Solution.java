package medium.array.Q0080RemoveDuplicatesFromSortedArrayTwo;

/*

https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/?envType=study-plan-v2&envId=top-interview-150

Topics: Array, Two Pointers

Time: O(n)
Space: O(1)

 */


public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 3) {
            return nums.length; //No need to do anything
        }

        int p1 = 2;

        for (int p2 = 2; p2 < nums.length; p2++) {
            if (nums[p2] != nums[p1-2]) {
                nums[p1++] = nums[p2];
            }
        }

        return p1;
    }
}
