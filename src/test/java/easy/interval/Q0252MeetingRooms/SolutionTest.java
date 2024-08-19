package easy.interval.Q0252MeetingRooms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertFalse(new Solution().canAttendMeetings(new int[][] {{0,30},{5,10},{15,20}}));
    }

    @Test
    void testTwo() {
        assertTrue(new Solution().canAttendMeetings(new int[][] {{5,8},{9,15}}));
    }
}