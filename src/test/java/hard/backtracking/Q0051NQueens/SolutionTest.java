package hard.backtracking.Q0051NQueens;

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
                List.of(".Q..","...Q","Q...","..Q."),
                List.of("..Q.","Q...","...Q",".Q..")
            ),
            new HashSet<>(new Solution().solveNQueens(4))
        );
    }

    @Test
    void testTwo() {
        assertEquals(
            Set.of(List.of("Q")),
            new HashSet<>(new Solution().solveNQueens(1))
        );
    }
}