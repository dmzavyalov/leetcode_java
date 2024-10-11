package medium.graph.Q0787CheapestFlightWithKStops;

/*
https://leetcode.com/problems/cheapest-flights-within-k-stops/
Time: O(E*K)
 */

import java.util.Arrays;

public class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] prices = new int[n];
        Arrays.fill(prices, Integer.MAX_VALUE);

        prices[src] = 0;    //From source to source

        for (int i = 0; i <= k; i++) {  //BFS k+1 layers
            //We keep a temporary so that not to spoil the calculation while iterating through the layer
            int[] tmp = Arrays.copyOf(prices, prices.length);

            for (int j = 0; j < flights.length; j++) {
                int s = flights[j][0];  //from
                int d = flights[j][1];  //to
                int p = flights[j][2];  //price

                if (prices[s] == Integer.MAX_VALUE) {
                    continue;   //Source is not yet reachable
                }

                if (prices[s] + p < tmp[d]) {   //We've found a shorter path to destination
                    tmp[d] = prices[s] + p;
                }
            }

            prices = tmp;
        }

        return prices[dst] != Integer.MAX_VALUE ? prices[dst] : -1;
    }
}
