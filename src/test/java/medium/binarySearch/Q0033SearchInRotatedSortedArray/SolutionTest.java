package medium.binarySearch.Q0033SearchInRotatedSortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testOne() {
        assertEquals(4, new Solution().search(new int[]{4,5,6,7,0,1,2}, 0));
    }

    @Test
    void testTwo() {
        assertEquals(-1, new Solution().search(new int[]{4,5,6,7,0,1,2}, 3));
    }

    @Test
    void testThree() {
        assertEquals(-1, new Solution().search(new int[]{1}, 0));
    }
}
