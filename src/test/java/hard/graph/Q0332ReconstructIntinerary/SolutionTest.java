package hard.graph.Q0332ReconstructIntinerary;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(
            List.of("JFK","MUC","LHR","SFO","SJC"),
            new Solution().findItinerary(List.of(List.of("MUC","LHR"),List.of("JFK","MUC"),List.of("SFO","SJC"),List.of("LHR","SFO")))
        );
    }

    @Test
    void testTwo() {
        assertEquals(
            List.of("JFK","ATL","JFK","SFO","ATL","SFO"),
            new Solution().findItinerary(List.of(List.of("JFK","SFO"),List.of("JFK","ATL"),List.of("SFO","ATL"),List.of("ATL","JFK"), List.of("ATL","SFO")))
        );
    }
}