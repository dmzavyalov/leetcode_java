package medium.stack.Q0853CarFleet;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;

/*

https://leetcode.com/problems/car-fleet/description/

Topics: Array, Stack, Sorting, Monotonic Stack

Time: O(n log n)
Space: O(n)

 */

public class Solution {
    private record Car(int position, int speed) {}

    public int carFleet(int target, int[] position, int[] speed) {
        var n = position.length;
        var cars = new Car[n];

        for (int i = 0; i < n; i++) {
            cars[i] = new Car(position[i], speed[i]);
        }

        Arrays.sort(cars, Comparator.comparing(Car::position).reversed());

        ArrayDeque<Double> stack = new ArrayDeque<>();

        for (var car: cars) {
            stack.addLast((double)(target - car.position) / car.speed);
            if (stack.size() >= 2) {
                var iterator = stack.descendingIterator();
                var last = iterator.next();
                var beforeLast = iterator.next();
                //If one car catches up with another, remove the one that is behind
                if (last <= beforeLast) {
                    stack.removeLast();
                }
            }
        }

        return stack.size();
    }
}
