package easy.stack.Q0020ValidParentheses;


/*

https://leetcode.com/problems/valid-parentheses/description/

Topics: String, Stack

Time: O(n)
Space: O(n)

 */


import java.util.ArrayDeque;
import java.util.Map;

public class Solution {
    public boolean isValid(String s) {
        var stack = new ArrayDeque<Character>();
        var closingToOpening = Map.of(')', '(', ']', '[', '}', '{');

        for (char c: s.toCharArray()) {
            if (closingToOpening.containsKey(c)) {
                var last = stack.pollLast();
                if (null == last || !last.equals(closingToOpening.get(c))) {
                    return false;
                }
            } else {
                stack.addLast(c);
            }
        }

        return stack.isEmpty();
    }
}