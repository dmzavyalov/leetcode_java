package medium.twoPointers.Q0015ThreeSum;

/*

https://leetcode.com/problems/3sum/description/

Topics: Array, Two Pointers, Sorting

Time: O(n^2)
Space: O(log n) from sorting. Java uses quicksort

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        //Sorting is useful to eliminate duplicates from the response
        Arrays.sort(nums);

        var result = new ArrayList<List<Integer>>();

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;   //Skip duplicates
            }

            //Now, use two sum for sorted array
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum > 0) {
                    r--; //Too high, move the right pointer
                } else if (sum < 0) {
                    l++; //Too low, move the left pointer
                } else {
                    //Found one of the solutions
                    result.add(List.of(nums[i], nums[l], nums[r]));
                    l++;
                    while (nums[l] == nums[l-1] && l < r) {
                        l++;    //Again, skip duplicates
                    }
                }
            }
        }

        return result;
    }
}
