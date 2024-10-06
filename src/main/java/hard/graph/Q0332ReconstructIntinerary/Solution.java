package hard.graph.Q0332ReconstructIntinerary;

import java.util.*;

/*
https://leetcode.com/problems/reconstruct-itinerary/
Time: O(V+E)^2
Space: O(V+E)
 */

public class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        LinkedList<String> itinerary = new LinkedList<>();
        Map<String, PriorityQueue<String>> graph = new HashMap<>();
        Stack<String> stack = new Stack<>();

        //From -> To1, To2 ...
        for (var ticket : tickets) {
            graph.computeIfAbsent(
                ticket.get(0),
                k -> new PriorityQueue<>()) //To list is ordered alphabetically
            .add(ticket.get(1));
        }

        stack.push("JFK");  //Starting point
        while (!stack.isEmpty()) {
            var nextDestination = stack.peek();

            //If we can get somewhere from the next destination
            if (!graph.getOrDefault(nextDestination, new PriorityQueue<>()).isEmpty()) {
                stack.push(graph.get(nextDestination).poll());  //Let's go there
            } else {
                //Once we have nowhere to go we unwind the stack we've collected
                itinerary.addFirst(stack.pop());
            }
        }

        return itinerary;
    }
}
