package medium.greedy.Q0045JumpGameII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(2, new Solution().jump(new int[] {2,3,1,1,4}));
    }

    @Test
    void testTwo() {
        assertEquals(2, new Solution().jump(new int[] {2,3,0,1,4}));
    }
}