package easy.interval.Q0252MeetingRooms;

/*

https://www.lintcode.com/problem/920/

 */

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0])); //Sort by interval start

        for (int i = 0; i + 1 < intervals.length; i++) {
            if (intervals[i][1] > intervals[i + 1][0]) {
                return false;   //There is an overlap
            }
        }
        return true;
    }
}
