package algorithms.problems;


import org.junit.Test;

import java.util.Arrays;

/*
https://www.hellointerview.com/learn/code/intervals/can-attend-meetings
Write a function to check if a person can attend all the meetings scheduled without any time conflicts. Given an array
intervals, where each element [s1, e1] represents a meeting starting at time s1 and ending at time e1, determine if
there are any overlapping meetings. If there is no overlap between any meetings, return true; otherwise, return false.




 */
public class CanAttendMeetings {


    public Boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals,      (a, b) -> Integer.compare(a[0], b[0]));
        for(int i = 0; i < intervals.length-1; i++){
            if(intervals[i][0] == intervals[i+1][1]) return false;
            if(intervals[i][1] > intervals[i+1][0]) return false;
        }
        return true;
    }


    @Test
    public void testCanAttendMeetings() {
        int[][] intervals1 = {{0, 3}, {2, 5}, {15, 20}};
        assert(!canAttendMeetings(intervals1)); // Expected output: false

        int[][] intervals2 = {{7, 10}, {2, 4}};
        assert(canAttendMeetings(intervals2)); // Expected output: true

        int[][] intervals3 = {{0, 3}, {0, 4}, {15, 20}};
        assert(!canAttendMeetings(intervals1)); // Expected output: false

    }
}
