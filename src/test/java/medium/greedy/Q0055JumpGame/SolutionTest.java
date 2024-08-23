package medium.greedy.Q0055JumpGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertTrue(new Solution().canJump(new int[] {2,3,1,1,4}));
    }

    @Test
    void testTwo() {
        assertFalse(new Solution().canJump(new int[] {3,2,1,0,4}));
    }
}