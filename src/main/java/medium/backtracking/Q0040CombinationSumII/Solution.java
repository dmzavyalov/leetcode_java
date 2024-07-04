package medium.backtracking.Q0040CombinationSumII;

/*

https://leetcode.com/problems/combination-sum-ii/description/

Array, Backtracking

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    private List<List<Integer>> result;
    private int[] candidates;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        this.candidates = candidates;

        result = new ArrayList<>();

        backtrack(new ArrayList<>(), 0, target);

        return result;
    }

    private void backtrack(List<Integer> cur, int startPos, int target) {
        if (target == 0) {  //Found new result
            result.add(new ArrayList<>(cur));
        }

        if (target < 0) {  //Current time exceed the target value
            return;
        }

        int prev = -1;
        for (int i = startPos; i < candidates.length; i++) {
            if (candidates[i] == prev) {
                continue;
            }
            cur.add(candidates[i]);
            backtrack(cur, i + 1, target - candidates[i]);
            cur.removeLast();
            prev = candidates[i];
        }
    }
}
