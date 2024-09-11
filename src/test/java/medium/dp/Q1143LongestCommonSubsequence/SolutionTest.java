package medium.dp.Q1143LongestCommonSubsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(3, new Solution().longestCommonSubsequence("abcde", "ace"));
    }

    @Test
    void testTwo() {
        assertEquals(3, new Solution().longestCommonSubsequence("abc", "abc"));
    }

    @Test
    void testThree() {
        assertEquals(0, new Solution().longestCommonSubsequence("abc", "def"));
    }
}