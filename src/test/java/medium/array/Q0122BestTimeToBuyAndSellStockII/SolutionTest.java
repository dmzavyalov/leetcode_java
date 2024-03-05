package medium.array.Q0122BestTimeToBuyAndSellStockII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testOne() {
        var prices = new int[] {7,1,5,3,6,4};
        var solution = new Solution();
        var actual = solution.maxProfit(prices);
        assertEquals(7, actual);
    }

    @Test
    void testTwo() {
        var prices = new int[] {1,2,3,4,5};
        var solution = new Solution();
        var actual = solution.maxProfit(prices);
        assertEquals(4, actual);
    }

    @Test
    void testThree() {
        var prices = new int[] {7,6,4,3,1};
        var solution = new Solution();
        var actual = solution.maxProfit(prices);
        assertEquals(0, actual);
    }
}