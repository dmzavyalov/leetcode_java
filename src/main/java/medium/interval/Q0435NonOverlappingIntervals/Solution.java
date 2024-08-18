package medium.interval.Q0435NonOverlappingIntervals;

/*

https://leetcode.com/problems/non-overlapping-intervals/

 */

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int result = 0;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        int[] firstInterval = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            int[] secondInterval = intervals[i];
            //Compare pairs of intervals
            //If the first interval end is the same as the second interval start, these interval are treated as non-overlapping
            if (secondInterval[0] < firstInterval[1]) { //Overlapping
                result++;
                if (firstInterval[1] > secondInterval[1]) { //Remove the interval that ends last
                    firstInterval = secondInterval;
                }
            } else { //Non-overlapping
                firstInterval = secondInterval;
            }
        }

        return result;
    }
}
