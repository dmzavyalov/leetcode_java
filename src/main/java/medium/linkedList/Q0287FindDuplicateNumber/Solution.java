package medium.linkedList.Q0287FindDuplicateNumber;

/*

https://leetcode.com/problems/reorder-list/description/

Topics: Array, Two Pointers, Binary Search, Bit Manipulation

Time: O(n)
Space: O(1)

 */

public class Solution {
    public int findDuplicate(int[] nums) {
        int fast = 0, slow = 0;

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (fast != slow);

        int slow2 = 0;
        do {
            slow = nums[slow];
            slow2 = nums[slow2];
        } while (slow2 != slow);

        return slow;
    }
}
