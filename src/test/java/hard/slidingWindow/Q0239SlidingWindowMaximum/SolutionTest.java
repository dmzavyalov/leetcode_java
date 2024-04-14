package hard.slidingWindow.Q0239SlidingWindowMaximum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testOne() {
        assertArrayEquals(
            new int[] {3,3,5,5,6,7},
            new Solution().maxSlidingWindow(new int[] {1,3,-1,-3,5,3,6,7}, 3)
        );
    }

    @Test
    void testTwo() {
        assertArrayEquals(
            new int[] {1},
            new Solution().maxSlidingWindow(new int[] {1}, 1)
        );
    }
}