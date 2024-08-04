package medium.graph.Q0210CourseScheduleII;

/*

https://leetcode.com/problems/course-schedule-ii/description/

Depth-First Search, Breadth-First Search, Graph, Topological Sort

Time: O(E+V)

 */

import java.util.*;

public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> adjMap = new HashMap<>();
        int[] inDegree = new int[numCourses];
        int[] topologicalOrder = new int[numCourses];

        //Example: the pair {0,1} means that course 0 requires course 1 to be completed
        //On graph one may imagine a directed edge going from node 1 to node 0
        for (var pr: prerequisites) {
            int course = pr[0];
            int requires = pr[1];
            List<Integer> lst = adjMap.getOrDefault(requires, new ArrayList<>());
            lst.add(course);
            adjMap.put(requires, lst);
            inDegree[course]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                q.offer(i); //Start the search from courses that have no dependencies
            }
        }

        int i = 0;
        while (!q.isEmpty()) {
            int course = q.poll();
            //The queue only contains courses that have no remaining dependencies
            //So we may safely add the course to the task solution
            topologicalOrder[i++] = course;
            //Walk through all courses that depends on this course
            if (adjMap.containsKey(course)) {
                for (Integer neighbor: adjMap.get(course)) {
                    //Since we've added the course to solution already
                    //Other courses that depend on it now have one dependency less
                    inDegree[neighbor]--;
                    //And if they have no dependencies remaining, we may place them in the queue to be added to the final solution
                    if (inDegree[neighbor] == 0) {
                        q.offer(neighbor);
                    }
                }
            }
        }

        if (i == numCourses) {
            return topologicalOrder;
        }

        return new int[0];
    }
}
