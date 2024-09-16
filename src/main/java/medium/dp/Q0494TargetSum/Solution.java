package medium.dp.Q0494TargetSum;

/*

https://leetcode.com/problems/target-sum/

 */

import java.util.HashMap;
import java.util.Map;

public class Solution {
    Map<String, Integer> dp;

    public int findTargetSumWays(int[] nums, int target) {
        dp = new HashMap<>();
        return calculate(nums, 0, 0, target);
    }

    private int calculate(int[] nums, int i, int sum, int target) {
        //Cache the solution for the position + the current sum
        String key = i + "," + sum;

        if (i == nums.length) {
            return sum == target ? 1 : 0;
        }

        if (dp.containsKey(key)) {
            return dp.get(key);
        }

        //On each decision tree branching we may either add or subtract the next number
        int res = calculate(nums, i + 1, sum + nums[i], target) +
                calculate(nums, i + 1, sum - nums[i], target);
        dp.put(key, res);
        return res;
    }
}
