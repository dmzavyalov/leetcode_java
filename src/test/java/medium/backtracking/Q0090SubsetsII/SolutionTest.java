package medium.backtracking.Q0090SubsetsII;

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
                    List.of(1,2),
                    List.of(1,2,2),
                    List.of(2),
                    List.of(2,2)
            ),
            new HashSet<>(new Solution().subsetsWithDup(new int[]{1, 2, 2}))
        );
    }

    @Test
    void testTwo() {
        assertEquals(
            Set.of(
                List.of(),
                List.of(0)
            ),
            new HashSet<>(new Solution().subsetsWithDup(new int[]{0}))
        );
    }

}