package medium.backtracking.Q0039CombinationSum;

/*

https://leetcode.com/problems/combination-sum/description/

Array, Backtracking

 */

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<List<Integer>> result;
    private Integer target;
    private int[] candidates;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.candidates = candidates;
        this.target = target;
        result = new ArrayList<>();

        dfs(0, new ArrayList<>(), 0);

        return result;
    }

    private void dfs(int i, List<Integer> cur, int total) {
        //i is the current position in the list of candidates
        //cur is the current combination
        //total is the current total

        if (total == target) {  //Found a new result
            result.add(new ArrayList<>(cur));
            return;
        }

        //If we've processed all the candidates or current total exceeds target, making it no reason to descend further
        if (i >= candidates.length || total > target ) {
            return;
        }

        //Branch A - we include the candidate number into the current combination
        cur.add(candidates[i]);
        //Note that we do not increment i making it possible to include the same candidate number again
        //as long as the result satisfies search criteria
        dfs(i, cur, total + candidates[i]);
        //Branch B - we do not include the candidate number into the current combination
        cur.removeLast();
        //Note that we increment i, moving to the next candidate (if there are any)
        dfs(i + 1, cur, total);
    }
}
