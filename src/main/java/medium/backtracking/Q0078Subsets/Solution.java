package medium.backtracking.Q0078Subsets;

import java.util.ArrayList;
import java.util.List;

/*

https://leetcode.com/problems/subsets/

Array, Backtracking, Bit Manipulation

Time: O(n * 2^n)

 */

public class Solution {
    private int[] nums;
    private List<List<Integer>> result = new ArrayList<>();
    private List<Integer> subset = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        this.nums = nums;
        dfs(0);
        return result;
    }

    private void dfs(int i) {
        if (i >= nums.length) {
            result.add(new ArrayList<>(subset));    //Make a copy
            return;
        }

        //There are two options: include or not include nums[i]

        //Include
        subset.add(nums[i]);
        dfs(i + 1);

        //Not include
        subset.removeLast();
        dfs(i + 1);
    }
}
