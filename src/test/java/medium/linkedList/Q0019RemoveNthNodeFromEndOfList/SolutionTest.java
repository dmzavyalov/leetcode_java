package medium.linkedList.Q0019RemoveNthNodeFromEndOfList;

import helper.ListHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void testOne() {
        assertArrayEquals(
            new int[] {1,2,3,5},
            ListHelper.listToArray(new Solution().removeNthFromEnd(ListHelper.arrayToList(new int[] {1,2,3,4,5}), 2))
        );
    }

    @Test
    void testTwo() {
        assertArrayEquals(
            new int[] {},
            ListHelper.listToArray(new Solution().removeNthFromEnd(ListHelper.arrayToList(new int[] {1}), 1))
        );
    }

    @Test
    void testThree() {
        assertArrayEquals(
            new int[] {1},
            ListHelper.listToArray(new Solution().removeNthFromEnd(ListHelper.arrayToList(new int[] {1,2}), 1))
        );
    }
}