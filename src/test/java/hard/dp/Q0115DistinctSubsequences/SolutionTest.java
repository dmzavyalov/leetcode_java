package hard.dp.Q0115DistinctSubsequences;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(3, new Solution().numDistinct("rabbbit", "rabbit"));
    }

    @Test
    void testTwo() {
        assertEquals(5, new Solution().numDistinct("babgbag", "bag"));
    }
}