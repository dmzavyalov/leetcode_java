package medium.stack.Q0155MinStack;

import java.util.ArrayDeque;

/*

https://leetcode.com/problems/min-stack/description/

Topics: Stack, Design

Time: O(1)
Space: O(n)

ArrayDeque offers amortized constant time implementation of the operations used in this solution

 */
public class MinStack {
    private final ArrayDeque<Integer> stack = new ArrayDeque<>();
    private final ArrayDeque<Integer> minStack = new ArrayDeque<>();

    public void push(int val) {
        stack.addFirst(val);
        var min = minStack.isEmpty() ? val : Math.min(val, minStack.peekFirst());
        minStack.addFirst(min);
    }

    public void pop() {
        stack.removeFirst();
        minStack.removeFirst();
    }

    public int top() {
        return stack.peekFirst();
    }

    public int getMin() {
        return minStack.peekFirst();
    }
}
