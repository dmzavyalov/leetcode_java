package easy.array.Q0121BestTimeToBuyAndSellStock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    void testOne() {
        var prices = new int[] {7,1,5,3,6,4};
        var solution = new Solution();
        var actual = solution.maxProfit(prices);
        assertEquals(5, actual);
    }

    @Test
    void testTwo() {
        var prices = new int[] {7,6,4,3,1};
        var solution = new Solution();
        var actual = solution.maxProfit(prices);
        assertEquals(0, actual);
    }
}
