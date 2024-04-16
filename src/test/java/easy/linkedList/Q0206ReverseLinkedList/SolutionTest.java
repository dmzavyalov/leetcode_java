package easy.linkedList.Q0206ReverseLinkedList;

import helper.ListHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testOne() {
        var head = ListHelper.arrayToList(new int[]{1, 2, 3, 4, 5});
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, ListHelper.listToArray(head));
        var reversed = new Solution().reverseList(head);
        assertArrayEquals(new int[]{5,4,3,2,1}, ListHelper.listToArray(reversed));
    }

    @Test
    void testTwo() {
        var head = ListHelper.arrayToList(new int[]{1, 2});
        var reversed = new Solution().reverseList(head);
        assertArrayEquals(new int[]{2,1}, ListHelper.listToArray(reversed));
    }

    @Test
    void testThree() {
        var head = ListHelper.arrayToList(new int[]{});
        var reversed = new Solution().reverseList(head);
        assertArrayEquals(new int[]{}, ListHelper.listToArray(reversed));
    }

}