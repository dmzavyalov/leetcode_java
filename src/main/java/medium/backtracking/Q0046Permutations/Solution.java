package medium.backtracking.Q0046Permutations;

import java.util.ArrayList;
import java.util.List;

/*

https://leetcode.com/problems/permutations/

Array, Backtracking

 */

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums == null || nums.length == 0)  {
            return result;
        }

        //Base case
        if (nums.length == 1) {
            List<Integer> singleNumList = new ArrayList<>();
            singleNumList.add(nums[0]);
            result.add(singleNumList);
            return result;
        }

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            //Copy all the numbers except the ith
            var remainingNums = new int[nums.length - 1];
            int idx = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    remainingNums[idx++] = nums[j];
                }
            }
            //Recurse
            var permutations = permute(remainingNums);

            //Append the ith number to each of the discovered permutations
            for (List<Integer> perm : permutations) {
                perm.add(n);
                result.add(new ArrayList<>(perm));
            }
        }

        return result;
    }
}
