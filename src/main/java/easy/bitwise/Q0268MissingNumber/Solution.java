package easy.bitwise.Q0268MissingNumber;

/*

https://leetcode.com/problems/missing-number/description/

 */

public class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int total = nums.length * (nums.length + 1) / 2;
        for (int num: nums) {
            sum += num;
        }
        return total - sum;
    }
}
