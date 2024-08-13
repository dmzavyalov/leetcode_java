package hard.graph.Q0127WordLadder;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(5, new Solution().ladderLength("hit", "cog", new ArrayList<>(List.of("hot","dot","dog","lot","log","cog"))));
    }

    @Test
    void testTwo() {
        assertEquals(0, new Solution().ladderLength("hit", "cog", new ArrayList<>(List.of("hot","dot","dog","lot","log"))));
    }
}