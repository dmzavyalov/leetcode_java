package medium.binarySearch.Q0981TimeBasedKeyValueStore;

/*

https://leetcode.com/problems/time-based-key-value-store/description/

Topics: Hash Table, String, Binary Search, Design

Time: set O(1), get O(log num_entries_with_this_key)
Space: no additional space required
besides what is requested by HashMap and ArrayList for maintenance
plus the stored data itself

 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TimeMap {
    private final String DEFAULT_VALUE = "";
    private record TimedValue(String value, int timestamp) {}
    private final Map<String, List<TimedValue>> map = new HashMap<>();

    //Task constraint guarantees that timestamp values come in increasing order
    //So the array is automatically sorted by timestamp
    public void set(String key, String value, int timestamp) {
        map
            .computeIfAbsent(key, k -> new ArrayList<>())
            .add(new TimedValue(value, timestamp));
    }

    public String get(String key, int timestamp) {
        String result = DEFAULT_VALUE;

        var values = map.get(key);
        if (values == null) {
            return result;
        }

        int l = 0, r = values.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (values.get(m).timestamp <= timestamp) {
                //Assign, because so far the value timestamp is the closest to the target timestamp from below
                result = values.get(m).value;
                l = m + 1;
            } else {
                //Do not assign, we're not allowed to return values with timestamp greater than the target one
                r = m - 1;
            }
        }

        return result;
    }
}

