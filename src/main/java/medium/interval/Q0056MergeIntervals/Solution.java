package medium.interval.Q0056MergeIntervals;

/*

https://leetcode.com/problems/merge-intervals/description/

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> merged = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        merged.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int curStart = intervals[i][0];
            int prevEnd = merged.get(merged.size() - 1)[1];
            if (curStart <= prevEnd) {
                merged.get(merged.size() - 1)[1] =
                    Math.max(prevEnd, intervals[i][1]);
            } else {
                merged.add(intervals[i]);
            }
        }

        int[][] result = new int[merged.size()][2];
        merged.toArray(result);
        return result;
    }
}
