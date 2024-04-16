package easy.linkedList.Q0021MergeTwoSortedLists;

import helper.ListHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testOne() {
        var l1 = ListHelper.arrayToList(new int[] {1,2,4});
        var l2 = ListHelper.arrayToList(new int[] {1,3,4});
        assertArrayEquals(
            new int[] {1,1,2,3,4,4},
            ListHelper.listToArray(new Solution().mergeTwoLists(l1, l2))
        );
    }

    @Test
    void testTwo() {
        var l1 = ListHelper.arrayToList(new int[] {});
        var l2 = ListHelper.arrayToList(new int[] {});
        assertArrayEquals(
            new int[] {},
            ListHelper.listToArray(new Solution().mergeTwoLists(l1, l2))
        );
    }

    @Test
    void testThree() {
        var l1 = ListHelper.arrayToList(new int[] {});
        var l2 = ListHelper.arrayToList(new int[] {0});
        assertArrayEquals(
            new int[] {0},
            ListHelper.listToArray(new Solution().mergeTwoLists(l1, l2))
        );
    }
}