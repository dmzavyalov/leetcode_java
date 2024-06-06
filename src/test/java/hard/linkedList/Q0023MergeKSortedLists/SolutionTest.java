package hard.linkedList.Q0023MergeKSortedLists;

import dataStructures.ListNode;
import helper.ListHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void testOne() {
        Solution solution = new Solution();
        var lists = new ListNode[]{
            ListHelper.arrayToList(new int[]{1, 4, 5}),
            ListHelper.arrayToList(new int[]{1, 3, 4}),
            ListHelper.arrayToList(new int[]{2, 6})
        };

        assertArrayEquals(
            new int[] {1,1,2,3,4,4,5,6},
            ListHelper.listToArray(solution.mergeKLists(lists))
        );
    }

    @Test
    void testTwo() {
        Solution solution = new Solution();
        var lists = new ListNode[] {};

        assertArrayEquals(
            new int[] {},
            ListHelper.listToArray(solution.mergeKLists(lists))
        );
    }

    @Test
    void testThree() {
        Solution solution = new Solution();
        var lists = new ListNode[]{
            ListHelper.arrayToList(new int[]{})
        };

        assertArrayEquals(
            new int[] {},
            ListHelper.listToArray(solution.mergeKLists(lists))
        );
    }
}