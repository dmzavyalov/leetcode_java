package medium.greedy.Q0763PartitionLabels;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*

https://leetcode.com/problems/partition-labels/

Time: O(n)
Space: O(26)

 */

public class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();
        //Store last position of each character
        Map<Character, Integer> lastIndex = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            lastIndex.put(s.charAt(i), i);
        }

        int begin = 0, end = 0; //Partition bounds
        while (begin < s.length()) {    //Iterate through the string
            int partitionLength = 0;
            //Look for the last position of the character we're currently at
            //This will be the candidate for the partition ending
            end = Math.max(end, lastIndex.get(s.charAt(begin)));
            //Now look through all characters in the potential partition
            while (begin <= end) {
                //If the last occurrence of the current character is after the current partition ending
                //Then we have to extend the partition bounds
                //Because we can't allow for the character to occur in another partition
                end = Math.max(end, lastIndex.get(s.charAt(begin)));
                begin++;
                partitionLength++;
            }
            result.add(partitionLength);
        }

        return result;
    }
}
