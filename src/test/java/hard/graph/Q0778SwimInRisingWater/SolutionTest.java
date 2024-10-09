package hard.graph.Q0778SwimInRisingWater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(3, new Solution().swimInWater(new int[][]{{0,2},{1,3}}));
    }

    @Test
    void testTwo() {
        assertEquals(16, new Solution().swimInWater(new int[][]{{0,1,2,3,4},{24,23,22,21,5},{12,13,14,15,16},{11,17,18,19,20},{10,9,8,7,6}}));
    }
}