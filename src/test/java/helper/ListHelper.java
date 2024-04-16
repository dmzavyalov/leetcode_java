package helper;


import dataStructures.ListNode;

import java.util.ArrayList;
import java.util.List;

public class ListHelper {
    public static ListNode arrayToList(int[] values) {
        ListNode head = null, current = null;
        for (int v: values) {
            var next = new ListNode(v);
            if (current == null) {
                head = next;
            } else {
                current.next = next;
            }
            current = next;
        }
        return head;
    }

    public static int[] listToArray(ListNode head) {
        List<Integer> result = new ArrayList<>();
        while (head != null) {
            result.add(head.val);
            head = head.next;
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
