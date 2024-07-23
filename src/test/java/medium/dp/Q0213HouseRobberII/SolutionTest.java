package medium.dp.Q0213HouseRobberII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testOne() {
        assertEquals(3, new Solution().rob(new int[]{2, 3, 2}));
    }

    @Test
    void testTwo() {
        assertEquals(4, new Solution().rob(new int[]{1, 2, 3, 1}));
    }

    @Test
    void testThree() {
        assertEquals(3, new Solution().rob(new int[]{1, 2, 3}));
    }
}