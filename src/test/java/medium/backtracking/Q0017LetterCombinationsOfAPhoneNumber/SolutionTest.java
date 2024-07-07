package medium.backtracking.Q0017LetterCombinationsOfAPhoneNumber;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(
            Set.of("ad","ae","af","bd","be","bf","cd","ce","cf"),
            new HashSet<>(new Solution().letterCombinations("23"))
        );
    }

    @Test
    void testTwo() {
        assertEquals(
            Set.of(),
            new HashSet<>(new Solution().letterCombinations(""))
        );
    }

    @Test
    void testThree() {
        assertEquals(
            Set.of("a", "b", "c"),
            new HashSet<>(new Solution().letterCombinations("2"))
        );
    }
}