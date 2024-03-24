package medium.stack.Q0022GenerateParentheses;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*

https://leetcode.com/problems/generate-parentheses/

Topics: String, Dynamic Programming, Backtracking

 */

public class Solution {
    private int n;
    private List<String> result;
    private List<String> stack;

    public List<String> generateParenthesis(int n) {
        this.n = n;
        result = new ArrayList<>();
        stack = new LinkedList<>();
        backtrack(0,0);
        return result;
    }

    private void backtrack(int numOpen, int numClose) {
        if (numOpen == n && numClose == n) {
            //We've reached a valid solution
            result.add(String.join("", stack));
            return;
        }
        if (numOpen < n) {
            //It's possible to add open parentheses
            stack.add("(");
            backtrack(numOpen + 1, numClose);
            stack.removeLast();
        }
        if (numClose < numOpen) {
            //It's possible to add close parentheses
            stack.add(")");
            backtrack(numOpen, numClose + 1);
            stack.removeLast();
        }
    }
}
