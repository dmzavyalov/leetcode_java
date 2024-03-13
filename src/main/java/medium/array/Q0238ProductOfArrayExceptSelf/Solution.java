package medium.array.Q0238ProductOfArrayExceptSelf;

/*
 * https://leetcode.com/problems/product-of-array-except-self/
 *
 * Topics: Array, Prefix Sum
 *
 * Time: O(n)
 * Space: O(1)
 *
 */

import java.util.Arrays;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        var result = new int[nums.length];

        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }

        int postfix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= postfix;
            postfix *= nums[i];
        }

        return result;
    }
}
