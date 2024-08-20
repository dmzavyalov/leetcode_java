package medium.interval.Q0253MeetingRoomsII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(2, new Solution().minMeetingRooms(new int[][]{{0,30},{5,10},{15,20}}));
    }

    @Test
    void testTwo() {
        assertEquals(1, new Solution().minMeetingRooms(new int[][]{{2,7}}));
    }
}