package easy.heap.Q1046LastStoneWeight;

/*
https://leetcode.com/problems/last-stone-weight/

Array, Heap (Priority Queue)

Time: O(n * log n)
 */


import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public int lastStoneWeight(int[] stones) {
        var maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int stone : stones) {
            maxHeap.add(stone);
        }

        while (maxHeap.size() > 1) {
            var first = maxHeap.poll();
            var second = maxHeap.poll();
            if (second < first) {
                maxHeap.add(first - second);
            }
        }

        return maxHeap.size() == 1 ? maxHeap.peek() : 0;
    }
}
