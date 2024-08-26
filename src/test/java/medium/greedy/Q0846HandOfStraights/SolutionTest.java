package medium.greedy.Q0846HandOfStraights;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertTrue(new Solution().isNStraightHand(new int[] {1,2,3,6,2,3,4,7,8}, 3));
    }

    @Test
    void testTwo() {
        assertFalse(new Solution().isNStraightHand(new int[] {1,2,3,4,5}, 4));
    }

    @Test
    void testThree() {
        assertTrue(new Solution().isNStraightHand(new int[] {1,1,2,2,3,3}, 3));
    }
}