package medium.twoPointers.Q0167TwoSumII;

/*

https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

Topics: Array, Two Pointers, Binary Search

Time: O(n)
Space: O(1)

 */


public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;

        //Take advantage of the fact that number array is sorted in non-decreasing order
        while (l < r) {
            int sum = numbers[l] + numbers[r];

            if (sum > target) { //Moving right pointer reduces the sum
                r--;
            } else if (sum < target) {  //Moving left pointer increases the sum
                l++;
            } else {
                break;  //Solution found
            }
        }

        return new int[] {l + 1, r + 1};
    }
}
