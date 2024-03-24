package medium.stack.Q0739DailyTemperatures;

/*

https://leetcode.com/problems/daily-temperatures/description/

Topics: Array, Stack, Monotonic Stack

Time: O(n)
Space: O(n)

 */

import java.util.ArrayDeque;

public class Solution {
    private record TemperatureRecord(Integer temperature, Integer index) {}

    public int[] dailyTemperatures(int[] temperatures) {
        var result = new int[temperatures.length];
        ArrayDeque<TemperatureRecord> stack = new ArrayDeque<>();

        for (int i = 0; i < temperatures.length; i++) {
            //If the temperature is increasing
            while (!stack.isEmpty() && temperatures[i] > stack.peekLast().temperature ) {
                //Remove record from stack and fill result for that index
                var temperatureRecord = stack.removeLast();
                result[temperatureRecord.index] = (i - temperatureRecord.index);
            }
            //First step or the temperature is decreasing
            stack.addLast(new TemperatureRecord(temperatures[i], i));
        }

        return result;
    }
}
