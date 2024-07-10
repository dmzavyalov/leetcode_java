package easy.heap.Q1046LastStoneWeight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testOne() {
        assertEquals(1, new Solution().lastStoneWeight(new int[] {2,7,4,1,8,1}));
    }

    @Test
    void testTwo() {
        assertEquals(1, new Solution().lastStoneWeight(new int[] {1}));
    }

}