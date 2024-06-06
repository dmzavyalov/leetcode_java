package hard.linkedList.Q0023MergeKSortedLists;

import dataStructures.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*

https://leetcode.com/problems/merge-k-sorted-lists/

Topics: Linked List, Divide and Conquer, Heap (Priority Queue), Merge Sort

Time: O(n * log k), where k is the number of lists to merge
Space: O(k)

 */

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        List<ListNode> ll = Arrays.asList(lists);

        while (ll.size() > 1) {
            List<ListNode> llMerged = new ArrayList<>();

            for (var i = 0; i < ll.size(); i += 2) {
                ListNode l1 = ll.get(i);
                ListNode l2 = i + 1 < ll.size() ? ll.get(i + 1) : null;
                llMerged.add(mergeTwoLists(l1, l2));
            }

            ll = llMerged;
        }

        return ll.getFirst();
    }

    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        if (list1 != null) {
            tail.next = list1;
        } else if (list2 != null) {
            tail.next = list2;
        }

        return dummy.next;
    }
}
