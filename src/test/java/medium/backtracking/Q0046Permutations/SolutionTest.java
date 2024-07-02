package medium.backtracking.Q0046Permutations;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void testOne() {
        var result = new Solution().permute(new int[] {1,2,3});
        assertEquals(
            Set.of(
                List.of(1,2,3),
                List.of(1,3,2),
                List.of(2,1,3),
                List.of(2,3,1),
                List.of(3,1,2),
                List.of(3,2,1)
            ),
            new HashSet<>(result));
    }

    @Test
    void testTwo() {
        var result = new Solution().permute(new int[] {0,1});
        assertEquals(
            Set.of(
                List.of(0,1),
                List.of(1,0)
            ),
            new HashSet<>(result));
    }

    @Test
    void testThree() {
        var result = new Solution().permute(new int[] {1});
        assertEquals(List.of(List.of(1)), result);
    }
}