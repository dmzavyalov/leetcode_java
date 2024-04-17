package medium.linkedList.Q0143ReorderList;

/*

https://leetcode.com/problems/reorder-list/description/

Topics: Linked List, Two Pointers, Stack, Recursion

Time: O(n)
Space: O(1)

 */

import dataStructures.ListNode;

public class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return; //No need to do anything
        }

        //Use fast and slow pointer to find the middle
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        //Cut the list in two
        ListNode second = slow.next;
        slow.next = null;

        //Reverse the second half of the list
        ListNode prev = null;
        while (second != null) {
            ListNode next = second.next;
            second.next = prev;
            prev = second;
            second = next;
        }

        //Merge the two halfs
        ListNode firstHalf = head, secondHalf = prev;
        while (secondHalf != null) {
            ListNode tmp1 = firstHalf.next, tmp2 = secondHalf.next;
            firstHalf.next = secondHalf;
            secondHalf.next = tmp1;
            firstHalf = tmp1;
            secondHalf = tmp2;
        }
    }
}
