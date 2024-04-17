package medium.linkedList.Q0143ReorderList;

import helper.ListHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        var input = ListHelper.arrayToList(new int[]{1, 2, 3, 4});
        new Solution().reorderList(input);
        assertArrayEquals(new int[] {1,4,2,3}, ListHelper.listToArray(input));
    }

    @Test
    void testTwo() {
        var input = ListHelper.arrayToList(new int[]{1,2,3,4,5});
        new Solution().reorderList(input);
        assertArrayEquals(new int[] {1,5,2,4,3}, ListHelper.listToArray(input));
    }
}