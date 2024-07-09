package easy.heap.Q0703KThLargestElementInStream;

/*
 * https://leetcode.com/problems/kth-largest-element-in-a-stream/description/
 *
 * Tree, Design, Binary Search Tree, Heap (Priority Queue), Binary Tree, Data Stream
 *
 * Time: add is O(log n), the constructor is O(n log n)
 */

import java.util.PriorityQueue;

public class KthLargest {
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;

        //I have used the library implementation, but it might be that the question implies building implementation from scratch
        for (int i: nums) {
            minHeap.offer(i);
        }

        //Get the heap down to size k
        while (minHeap.size() > k) {
            minHeap.poll();
        }
    }

    public int add(int val) {
        minHeap.offer(val);
        if (minHeap.size() > k) {
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
