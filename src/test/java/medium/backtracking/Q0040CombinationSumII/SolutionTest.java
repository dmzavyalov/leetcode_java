package medium.backtracking.Q0040CombinationSumII;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        var result = new Solution().combinationSum2(new int[] {10,1,2,7,6,1,5}, 8);
        assertEquals(
            Set.of(
                List.of(1,1,6),
                List.of(1,2,5),
                List.of(1,7),
                List.of(2,6)
            ),
            new HashSet<>(result)
        );
    }

    @Test
    void testTwo() {
        var result = new Solution().combinationSum2(new int[] {2,5,2,1,2}, 5);
        assertEquals(
            Set.of(
                List.of(1,2,2),
                List.of(5)
            ),
            new HashSet<>(result)
        );
    }
}