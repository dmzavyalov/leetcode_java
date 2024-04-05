package medium.binarySearch.Q0705KokoEatingBananas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    void testOne() {
        assertEquals(4, new Solution().minEatingSpeed(new int[] {3,6,7,11}, 8));
    }

    @Test
    void testTwo() {
        assertEquals(30, new Solution().minEatingSpeed(new int[] {30,11,23,4,20}, 5));
    }

    @Test
    void testThree() {
        assertEquals(23, new Solution().minEatingSpeed(new int[] {30,11,23,4,20}, 6));
    }
}
