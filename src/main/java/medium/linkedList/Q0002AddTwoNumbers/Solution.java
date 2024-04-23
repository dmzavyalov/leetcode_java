package medium.linkedList.Q0002AddTwoNumbers;

import dataStructures.ListNode;

/*

https://leetcode.com/problems/add-two-numbers/

Topics: Linked List, Math, Recursion

Time: O(n)
Space: O(1)

 */

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();

        var cur = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry > 0) {
            int v1 = l1 != null ? l1.val : 0;
            int v2 = l2 != null ? l2.val : 0;

            int sum = v1 + v2 + carry;
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);

            cur = cur.next;
            if (l1 != null) { l1 = l1.next; }
            if (l2 != null) { l2 = l2.next; }
        }

        return dummy.next;
    }
}
