package easy.array.Q0001TwoSum;

import java.util.HashMap;
import java.util.Map;

/*

https://leetcode.com/problems/two-sum/description/

Topics: Array, Hash Table

Time: O(n)
Space: O(n)

 */

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer pos = map.get(target - nums[i]);
            if (null != pos) {
              return new int[] {pos, i};
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[] {-1, -1};
    }
}
