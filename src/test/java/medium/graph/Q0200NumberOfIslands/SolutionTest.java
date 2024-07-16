package medium.graph.Q0200NumberOfIslands;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(
            1,
            new Solution().numIslands(new char[][]{
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        }));
    }

    @Test
    void testTwo() {
        assertEquals(
            3,
            new Solution().numIslands(new char[][]{
                    {'1','1','0','0','0'},
                    {'1','1','0','0','0'},
                    {'0','0','1','0','0'},
                    {'0','0','0','1','1'}
            }));
    }

}