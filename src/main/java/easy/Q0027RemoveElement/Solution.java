package easy.Q0027RemoveElement;

/*

https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150

Topics: Array, Two Pointers

Time: O(n)
Space: O(1)

 */


public class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int p = 0; p < nums.length; p++) {
            if (nums[p] != val) {
                nums[k++] = nums[p];
            }
        }

        return k;
    }
}
