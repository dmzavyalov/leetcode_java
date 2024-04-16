package easy.linkedList.Q0206ReverseLinkedList;

/*

https://leetcode.com/problems/reverse-linked-list/description/

Topics: Linked List, Recursion

Time: O(n)
Space: O(1)

 */

import dataStructures.ListNode;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
