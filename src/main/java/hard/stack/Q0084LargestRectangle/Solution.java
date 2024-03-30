package hard.stack.Q0084LargestRectangle;

/*

https://leetcode.com/problems/car-fleet/description/

Topics: Array, Stack, Monotonic Stack

Time: O(n)
Space: O(n)

 */

import java.util.ArrayDeque;

public class Solution {
    record Bar(int index, int height) {}
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;

        ArrayDeque<Bar> stack = new ArrayDeque<>();

        for (int i = 0; i < heights.length; i++) {
            int start = i;
            //While next bar is higher than the previous one on stack
            while (!stack.isEmpty() && stack.peekLast().height > heights[i]) {
                //It means that the rectangle can't continue
                var bar = stack.pollLast();
                //We pop it and calculate the area
                maxArea = Math.max(maxArea, bar.height * (i - bar.index));
                start = bar.index;
            }
            //When we get down to the height rectangle may continue again, we push a record on the stack
            stack.addLast(new Bar(start, heights[i]));
        }

        //Handle the rectangles that run up to the end of the input array and are not closed yet
        while (!stack.isEmpty()) {
            var bar = stack.pollLast();
            maxArea = Math.max(maxArea, bar.height * (heights.length - bar.index));
        }

        return maxArea;
    }
}
