package medium.array.Q0049GroupAnagrams;

import java.util.*;

/*

https://leetcode.com/problems/group-anagrams/description/

Topics: Array, Hash Table, String, Sorting

Time: O(n)
Space: O(n)

According to the task constraints strs[i].length <= 100
So I've omitted it in the Big-O estimations as a constant factor

 */



public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //The requirements say that solution may return results in any order
        //Nevertheless I've used LinkedHashMap to bring consistent order to simplify testing

        //Two lists are equal if they contain same elements in the same order
        //So it's ok to use List as hash map key

        //Alternative: use String keys, instead of List of counts
        //For example: a1c1t1
        //Use char array to calculate counts and then convert it to string key to placed in the hash map

        Map<List<Integer>, List<String>> map = new LinkedHashMap<>();

        for (String str: strs) {
            List<Integer> counts = getCounts(str);

            var anagramGroup = map.get(counts);
            if (null == anagramGroup) {
                anagramGroup = new ArrayList<>();
                anagramGroup.add(str);
                map.put(counts, anagramGroup);
            } else {
                anagramGroup.add(str);
            }
        }

        return map.values().stream().toList();
    }

    private List<Integer> getCounts(String str) {
        List<Integer> counts = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            counts.add(0);
        }

        for (char c: str.toCharArray()) {
            int index = c - 'a';
            counts.set(index, counts.get(index) + 1);
        }
        return counts;
    }
}
