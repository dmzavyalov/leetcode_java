package medium.linkedList.Q0019RemoveNthNodeFromEndOfList;

import dataStructures.ListNode;

/*

https://leetcode.com/problems/remove-nth-node-from-end-of-list/

Topics: Linked List, Two Pointers

Time: O(n)
Space: O(1)

 */

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode left = dummy, right = head;

        while (n-- > 0 && right != null) {
            right = right.next;
        }

        while (right != null) {
            right = right.next;
            left = left.next;
        }

        left.next = left.next.next;

        return dummy.next;
    }
}
