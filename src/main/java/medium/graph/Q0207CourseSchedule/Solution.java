package medium.graph.Q0207CourseSchedule;

/*

https://leetcode.com/problems/course-schedule/

Depth-First Search, Breadth-First Search, Graph, Topological Sort

 */

import java.util.*;

public class Solution {
    Map<Integer, List<Integer>> map = new HashMap<>();
    Set<Integer> visited = new HashSet<>();

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //Convert adjacency list into hash table for a fast lookup
        for (int i = 0; i < numCourses; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int[] pre: prerequisites) {
           map.get(pre[0]).add(pre[1]);
        }

        //Graph may consist of multiple parts not connected with each other
        for (int i = 0; i < numCourses; i++) {
            if (!canBeCompleted(i)) {
                return false;
            }
        }

        return true;
    }

    private boolean canBeCompleted(int course) {
        if (visited.contains(course)) {
            return false;   //Cycle detected
        }
        if (map.get(course).isEmpty()) {
            return true;    //Course has no remaining prerequisites
        }

        //Check all course prerequisites if they can be completed
        visited.add(course);
        for (int pre : map.get(course)) {
            if (!canBeCompleted(pre)) {
                return false;
            }
        }
        visited.remove(course);
        //If yes, mark the course as one that no longer has prerequisites in the map
        map.get(course).clear();

        return true;
    }
}
