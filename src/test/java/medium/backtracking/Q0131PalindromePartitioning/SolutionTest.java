package medium.backtracking.Q0131PalindromePartitioning;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(
            Set.of(
                List.of("a", "a", "b"),
                List.of("aa", "b")),
            new HashSet<>(new Solution().partition("aab"))
        );
    }

    @Test
    void testTwo() {
        assertEquals(
            Set.of(List.of("a")),
            new HashSet<>(new Solution().partition("a"))
        );
    }
}