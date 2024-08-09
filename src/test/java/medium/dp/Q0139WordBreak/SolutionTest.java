package medium.dp.Q0139WordBreak;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertTrue(new Solution().wordBreak("leetcode", List.of("leet","code")));
    }

    @Test
    void testTwo() {
        assertTrue(new Solution().wordBreak("applepenapple", List.of("apple","pen")));
    }

    @Test
    void testThree() {
        assertFalse(new Solution().wordBreak("catsandog", List.of("cats","dog","sand","and","cat")));
    }
}