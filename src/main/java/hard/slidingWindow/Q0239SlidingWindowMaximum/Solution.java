package hard.slidingWindow.Q0239SlidingWindowMaximum;

/*

https://leetcode.com/problems/sliding-window-maximum/description/

Topics: Array, Queue, Sliding Window, Heap (Priority Queue), Monotonic Queue

Time: O(n)
Space: O(k)

 */

import java.util.ArrayDeque;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];

        int l = 0, r = 0;
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        while (r < nums.length) {
            while (!queue.isEmpty() && nums[queue.peekLast()] < nums[r]) {
                queue.pollLast();
            }
            queue.offerLast(r);

            if (l > queue.peekFirst()) {
                queue.pollFirst();
            }

            if (r + 1 >= k) {
                result[l] = nums[queue.peekFirst()];
                l++;
            }

            r++;
        }

        return result;
    }
}
