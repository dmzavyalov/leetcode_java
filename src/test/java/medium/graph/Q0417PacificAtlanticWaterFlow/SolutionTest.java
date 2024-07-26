package medium.graph.Q0417PacificAtlanticWaterFlow;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testOne() {
        assertEquals(
            List.of(
                List.of(0,4),
                List.of(1,3),
                List.of(1,4),
                List.of(2,2),
                List.of(3,0),
                List.of(3,1),
                List.of(4,0)
            ),
            new Solution().pacificAtlantic(new int[][] {
                {1,2,2,3,5},
                {3,2,3,4,4},
                {2,4,5,3,1},
                {6,7,1,4,5},
                {5,1,1,2,4}
            })
        );
    }

    @Test
    void testTwo() {
        assertEquals(
            List.of(List.of(0,0)),
            new Solution().pacificAtlantic(new int[][] {{1}})
        );
    }
}