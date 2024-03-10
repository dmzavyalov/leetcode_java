package medium.array.Q0049GroupAnagrams;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*

https://leetcode.com/problems/group-anagrams/description/

Topics: Array, Hash Table, String, Sorting

Time: O(n)
Space: O(n)

According to the task constraints strs[i].length <= 100
So I've omitted it in the Big-O estimations as a constant factor

 */


public class SolutionTwo {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new LinkedHashMap<>();

        for (String str: strs) {
            map.computeIfAbsent(getCounts(str), k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }

    private String getCounts(String str) {
        int[] counts = new int[26];
        for (char c: str.toCharArray()) {
            counts[c-'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (counts[i] != 0) {
                sb.append('a' + i).append(counts[i]);
            }
        }

        return sb.toString();
    }
}
