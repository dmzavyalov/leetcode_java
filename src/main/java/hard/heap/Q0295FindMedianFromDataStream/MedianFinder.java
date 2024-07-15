package hard.heap.Q0295FindMedianFromDataStream;

/*

https://leetcode.com/problems/find-median-from-data-stream/

Two Pointers, Design, Sorting, Heap (Priority Queue), Data Stream

Time: addNum is O(log n), findMedian is O(1)
Space: O(n)
 */

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MedianFinder {
    //The trick is to have two heaps
    //All values in the small heap are less or equal to all values in the large heap
    private Queue<Integer> smallHeap = new PriorityQueue<>(Comparator.reverseOrder());  //max heap
    private Queue<Integer> largeHeap = new PriorityQueue<>();   //min heap

    public void addNum(int num) {
        smallHeap.add(num);

        //The invariant is that the size of the heaps should differ by no more than one element
        //And the smallest value in the large heap should be greater or equal than the largest value in the small heap
        //If the invariant doesn't hold, move element from one heap to another

        if (smallHeap.size() - largeHeap.size() > 1 ||
            !largeHeap.isEmpty() && smallHeap.peek() > largeHeap.peek()) {
            largeHeap.add(smallHeap.poll());    //small -> large
        }

        if (largeHeap.size() - smallHeap.size() > 1) {
            smallHeap.add(largeHeap.poll());    //large -> small
        }
    }

    public double findMedian() {
        if (smallHeap.size() == largeHeap.size()) {
            return (double) (largeHeap.peek() + smallHeap.peek()) / 2;
        } else if (smallHeap.size() > largeHeap.size()) {
            return smallHeap.peek();
        } else {
            return largeHeap.peek();
        }
    }
}
