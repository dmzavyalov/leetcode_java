package hard.linkedList.Q0025ReverseNodesInKGroup;

import helper.ListHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        var solution = new Solution();
        assertArrayEquals(
            new int[] {3,2,1,4,5},
            ListHelper.listToArray(solution.reverseKGroup(ListHelper.arrayToList(new int[] {1,2,3,4,5}), 3))
        );
    }
}