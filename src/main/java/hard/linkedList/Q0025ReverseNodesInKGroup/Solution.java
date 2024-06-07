package hard.linkedList.Q0025ReverseNodesInKGroup;

import dataStructures.ListNode;

/*

https://leetcode.com/problems/reverse-nodes-in-k-group/

Topics: Linked List, Recursion

Time: O(N)
Space: O(1)

 */

public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0, head);
        ListNode groupPrev = dummy;

        while (true) {
            var kth = getKth(groupPrev, k);
            if (kth == null) {
                break;
            }
            var groupNext = kth.next;

            //Reverse group
            ListNode prev = kth.next, curr = groupPrev.next;

            while (curr != groupNext) {
                var tmp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = tmp;
            }

            var tmp = groupPrev.next;
            groupPrev.next = kth;
            groupPrev = tmp;
        }

        return dummy.next;
    }

    private ListNode getKth(ListNode curr, int k) {
        while (curr != null && k-- > 0) {
            curr = curr.next;
        }
        return curr;
    }
}
