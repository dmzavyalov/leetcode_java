package medium.linkedList.Q0002AddTwoNumbers;

import helper.ListHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertArrayEquals(
            new int[] {7,0,8},
            ListHelper.listToArray(new Solution().addTwoNumbers(
                ListHelper.arrayToList(new int[] {2,4,3}),
                ListHelper.arrayToList(new int[] {5,6,4})
            ))
        );
    }

    @Test
    void testTwo() {
        assertArrayEquals(
            new int[] {0},
            ListHelper.listToArray(new Solution().addTwoNumbers(
                ListHelper.arrayToList(new int[] {0}),
                ListHelper.arrayToList(new int[] {0})
            ))
        );
    }

    @Test
    void testThree() {
        assertArrayEquals(
            new int[] {8,9,9,9,0,0,0,1},
            ListHelper.listToArray(new Solution().addTwoNumbers(
                ListHelper.arrayToList(new int[] {9,9,9,9,9,9,9}),
                ListHelper.arrayToList(new int[] {9,9,9,9})
            ))
        );
    }
}