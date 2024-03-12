package medium.array.Q0347TopKFrequentElements;

/*
 * https://leetcode.com/problems/top-k-frequent-elements/
 *
 * Topics: Array, Hash Table, Counting, Bucket Sort
 *
 * Time: O(n)
 * Space: O(n)
 *
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Compute element counts
        //O(n) time, O(n) space
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num: nums) {
            counts.compute(num, (key, value) ->  value == null ? 1 : value + 1);
        }

        //Bucket sort. Track elements for each distinct count
        //Transform num => count hash map into count => list of nums
        //O(n) time, O(n) space
        var freq = new ArrayList[nums.length];
        counts.forEach((num, count) -> {
            if (freq[count - 1] == null) {
                freq[count - 1] = new ArrayList();
            }
            freq[count - 1].add(num);
        });

        //Return Top-K. O(k) time
        List<Integer> result = new ArrayList<>();
        for (int i = nums.length - 1; i >=0; i--) {
            if (result.size() >=k) {
                break;
            }
            if (freq[i] != null) {
                result.addAll(freq[i]);
            }
        }

        return result.subList(0, k).stream().mapToInt(Integer::intValue).toArray();
    }
}
