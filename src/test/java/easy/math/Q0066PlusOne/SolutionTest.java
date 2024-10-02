package easy.math.Q0066PlusOne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertArrayEquals(new int[]{1,2,4}, new Solution().plusOne(new int[]{1,2,3}));
    }

    @Test
    void testTwo() {
        assertArrayEquals(new int[]{4,3,2,2}, new Solution().plusOne(new int[]{4,3,2,1}));
    }

    @Test
    void testThree() {
        assertArrayEquals(new int[]{1,0}, new Solution().plusOne(new int[]{9}));
    }
}