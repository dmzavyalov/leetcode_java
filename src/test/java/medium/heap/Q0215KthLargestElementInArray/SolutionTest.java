package medium.heap.Q0215KthLargestElementInArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testOne() {
        assertEquals(5, new Solution().findKthLargest(new int[]{3,2,1,5,6,4}, 2));
    }

    @Test
    void testTwo() {
        assertEquals(4, new Solution().findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4));
    }
}