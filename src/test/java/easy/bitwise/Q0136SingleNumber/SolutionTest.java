package easy.bitwise.Q0136SingleNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(1, new Solution().singleNumber(new int[]{2,2,1}));
    }

    @Test
    void testTwo() {
        assertEquals(4, new Solution().singleNumber(new int[]{4, 1,2,1,2}));
    }

    @Test
    void testThree() {
        assertEquals(1, new Solution().singleNumber(new int[]{1}));
    }
}