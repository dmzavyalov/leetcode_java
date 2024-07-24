package medium.graph.Q0994RottenOranges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(4, new Solution().orangesRotting(new int[][]{{2,1,1},{1,1,0},{0,1,1}}));
    }

    @Test
    void testTwo() {
        assertEquals(-1, new Solution().orangesRotting(new int[][]{{2,1,1},{0,1,1},{1,0,1}}));
    }


    @Test
    void testThree() {
        assertEquals(0, new Solution().orangesRotting(new int[][]{{0,2}}));
    }

    @Test
    void testFour() {
        assertEquals(1, new Solution().orangesRotting(new int[][]{{1},{2}}));
    }

}