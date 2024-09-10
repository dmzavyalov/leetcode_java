package medium.dp.Q0062UniquePaths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(28, new Solution().uniquePaths(3, 7));
    }

    @Test
    void testTwo() {
        assertEquals(3, new Solution().uniquePaths(3, 2));
    }
}