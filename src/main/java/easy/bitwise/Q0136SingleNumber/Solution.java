package easy.bitwise.Q0136SingleNumber;

/*

https://leetcode.com/problems/single-number/

 */

public class Solution {
    public int singleNumber(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
