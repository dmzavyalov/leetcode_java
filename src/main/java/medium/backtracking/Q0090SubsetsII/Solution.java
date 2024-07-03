package medium.backtracking.Q0090SubsetsII;

/*

https://leetcode.com/problems/subsets-ii/description/

Array, Backtracking, Bit Manipulation

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    private List<List<Integer>> result;
    private int[] nums;
    private List<Integer> subset;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        result = new ArrayList<>();
        this.nums = nums;
        Arrays.sort(this.nums); //Will help us to eliminate duplicates later on

        subset = new ArrayList<>();
        backtrack(0);

        return result;
    }

    private void backtrack(int i) {
        //Base case
        if (i >= nums.length) {
            result.add(new ArrayList<>(subset));    //Make a copy
            return;
        }

        //There are two options: include or not include nums[i]

        //Include
        subset.add(nums[i]);
        backtrack(i + 1);

        //Not include
        //If there are two equal adjacent items in the sorted input we need to skip the duplicates
        while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
            i++;
        }

        subset.removeLast();
        backtrack(i + 1);
    }
}
