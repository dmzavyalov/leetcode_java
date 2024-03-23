package medium.stack.Q0150EvaluateReversePolishNotation;

/*

https://leetcode.com/problems/evaluate-reverse-polish-notation/

Topics: Array, Math, Stack

Time: O(n)
Space: O(n)

 */

import java.util.ArrayDeque;

public class Solution {
    public int evalRPN(String[] tokens) {
        var stack = new ArrayDeque<Integer>();

        for (var token: tokens) {
            switch (token) {
                case "+", "-", "*", "/" -> {
                    var a = stack.pollLast();
                    var b = stack.pollLast();
                    switch (token) {
                        case "+" -> stack.addLast(b + a);
                        case "-" -> stack.addLast(b - a);
                        case "*" -> stack.addLast(b * a);
                        default -> stack.addLast(b / a);
                    }
                }
                default -> stack.addLast(Integer.valueOf(token));
            }
        }

        return stack.pollLast();
    }
}
