package medium.interval.Q0057InsertInterval;

/*

https://leetcode.com/problems/insert-interval/

 */

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();

        for (int[] interval : intervals) {
            if (newInterval == null || interval[1] < newInterval[0]) {
                //New interval comes after the current interval
                res.add(interval);
            } else if (interval[0] > newInterval[1]) {
                //New interval comes before the current interval
                res.add(newInterval);
                res.add(interval);
                //We've inserted the new interval and are done with the changes
                newInterval = null;
                //Copy the remaining intervals into result as is
            } else {
                //New interval overlaps with existing interval
                //Make the union of two intervals
                newInterval[0] = Math.min(newInterval[0], interval[0]);
                newInterval[1] = Math.max(newInterval[1], interval[1]);
                //And continue processing. Maybe the updated interval overlaps with another interval
            }
        }

        //In case interval list is empty
        if (newInterval != null) {
            res.add(newInterval);
        }

        return res.toArray(new int[res.size()][]);
    }
}
