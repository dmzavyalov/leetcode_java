package medium.interval.Q0253MeetingRoomsII;

/*

https://www.lintcode.com/problem/919

 */

import java.util.Arrays;

public class Solution {
    public int minMeetingRooms(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        int len = intervals.length;

        //The idea is to keep track of start and end times separately
        int[] start = new int[len];
        int[] end = new int[len];

        for (int i = 0; i < len; i++) {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }

        //In their chronological order
        Arrays.sort(start);
        Arrays.sort(end);

        int result = 0;
        //And count the number of simultaneous meetings
        int count = 0;
        int s = 0, e = 0;
        while (s < len) {
            //If start and end time of some meetings coincide, such meetings are treated as non-overlapping
            if (start[s] < end[e]) {
                //Each time a new meeting is started, increment the count
                s++;
                count++;
            } else {
                //And decrement it each time the meeting ends, doesn't matter what meeting
                e++;
                count--;
            }
            result = Math.max(result, count);
        }

        return result;
    }
}
