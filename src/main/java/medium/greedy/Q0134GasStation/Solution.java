package medium.greedy.Q0134GasStation;

/*

https://leetcode.com/problems/gas-station/

 */

import java.util.Arrays;

public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (Arrays.stream(gas).sum() < Arrays.stream(cost).sum()) {
            return -1;  //There is no solution
        }

        int result = 0, total = 0;
        for (int i = 0; i < gas.length; i++) {
            total += gas[i] - cost[i];
            if (total < 0) {
                total = 0;
                result = i + 1;
            }
        }

        return result;
    }
}
