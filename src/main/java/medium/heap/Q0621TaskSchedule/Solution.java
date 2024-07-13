package medium.heap.Q0621TaskSchedule;

/*

https://leetcode.com/problems/task-scheduler/

Array, Hash Table, Greedy, Sorting, Heap (Priority Queue), Counting

Time: O(n)
Space: O(n)

Usually max heap push is O(log n), but in this case it's log(26) which is constant

*/

import dataStructures.Pair;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Solution {
    public int leastInterval(char[] tasks, int n) {
        var counts = new int[26];
        for (char c : tasks) {
            counts[c - 'A']++;
        }

        //We don't need actual task types for the algorithm, only their counts
        //Start processing tasks with higher count first
        //max heap is for the tasks ready to be executed
        var maxHeap = new PriorityQueue<Integer>(Comparator.reverseOrder());
        for (var i = 0; i < 26; i++) {
            if (counts[i] > 0) {
                maxHeap.add(counts[i]);
            }
        }

        int time = 0;

        //While the queue is for the tasks that are cooling down and may be executed in the future
        //(count, time at which task can be scheduled again)
        var queue = new LinkedList<Pair<Integer, Integer>>();

        //While there are tasks to execute
        while (!maxHeap.isEmpty()|| !queue.isEmpty()) {
            time++;

            if (!maxHeap.isEmpty()) {
                var cnt = maxHeap.poll() - 1;   //Executing task, reduce count
                if (cnt > 0) {
                    queue.addLast(new Pair<>(cnt, time + n));   //Place task in the cooldown queue
                }
            }

            //Because idle time is the same for all task types, the first task in the queue is the one with the lowest time
            if (!queue.isEmpty() && queue.peekFirst().second == time) {
                maxHeap.offer(queue.pollFirst().first);  //There is a task in cooldown queue ready to be executed
            }
        }

        return time;
    }
}
