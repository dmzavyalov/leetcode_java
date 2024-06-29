package medium.backtracking.Q0078Subsets;

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
                List.of(),
                List.of(1),
                List.of(2),
                List.of(1,2),
                List.of(3),
                List.of(1,3),
                List.of(2,3),
                List.of(1,2,3)
            ),
            new HashSet<>(new Solution().subsets(new int[]{1, 2, 3}))
        );
    }

    @Test
    void testTwo() {
        assertEquals(
            Set.of(
                List.of(),
                List.of(0)
            ),
            new HashSet<>(new Solution().subsets(new int[]{0}))
        );
    }
}