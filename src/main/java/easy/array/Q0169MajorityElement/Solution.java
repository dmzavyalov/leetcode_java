package easy.array.Q0169MajorityElement;

/*

https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/?envType=study-plan-v2&envId=top-interview-150

Topics: Array, Counting

Time: O(n)
Space: O(1)

The solution implements Boyer-Moore voting algorithm.
It's a counting algorithm, based on the fact that if count for element equals sum of counts of other elements,
then the element is not the majority.

 */


public class Solution {
    public int majorityElement(int[] nums) {
        int count = 0, candidate = -1;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {   //Another candidate takes over
                candidate = nums[i];
                count = 1;
            } else {
                if (nums[i] == candidate) {
                    count++;
                } else {
                    count--;
                }
            }
        }

        return candidate;
    }
}
