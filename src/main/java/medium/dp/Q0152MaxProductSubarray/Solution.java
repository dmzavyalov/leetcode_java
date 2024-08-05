package medium.dp.Q0152MaxProductSubarray;

/*

https://leetcode.com/problems/maximum-product-subarray/

Array, Dynamic Programming

Time: O(n)
Space: O(1)

 */

import java.math.BigInteger;

public class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        BigInteger maxSoFar = BigInteger.valueOf(nums[0]);
        BigInteger minSoFar = BigInteger.valueOf(nums[0]);

        BigInteger result = maxSoFar;

        for (int i = 1; i < nums.length; i++) {
            //The trick is to keep track of both max and min products so far
            //For each step the updated maximum may be one of three values:
            //the number itself (sequence of length one)
            //the number multiplied by the previous max (extend the sequence)
            //the number multiplied by the previous min (extend the sequence)
            BigInteger n = BigInteger.valueOf(nums[i]);
            BigInteger tmpMax = n.max(maxSoFar.multiply(n).max(minSoFar.multiply(n)));
            minSoFar = n.min(maxSoFar.multiply(n).min(minSoFar.multiply(n)));
            maxSoFar = tmpMax;
            result = result.max(maxSoFar);
        }

        return result.intValue();
    }
}
