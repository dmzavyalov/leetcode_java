package medium.backtracking.Q0131PalindromePartitioning;

import java.util.ArrayList;
import java.util.List;

/*

https://leetcode.com/problems/palindrome-partitioning/

String, Dynamic Programming, Backtracking

Time: O(2^N)

 */

public class Solution {
    private List<List<String>> result;
    private String s;
    private List<String> partition;

    public List<List<String>> partition(String s) {
        result = new ArrayList<>();
        this.s = s;
        this.partition = new ArrayList<>();
        dfs(0);
        return result;
    }

    private void dfs(int i) {
        //Start at the ith character

        //We've reached the end of the string, add all the discovered partitions to the result
        if (i == s.length()) {
            result.add(new ArrayList<>(partition));
        }

        //Now try extending string starting from ith character
        //First by one character, then by two, etc.
        for (int j = i; j < s.length(); j++) {
            String candidate = s.substring(i, j + 1);
            //If it is a palindrome, we have one more result
            if (isPalindrome(candidate)) {
                partition.add(candidate);
                //Look for all additional partitions after the one we've just found
                dfs(j + 1);
                //Backtrack
                partition.removeLast();
            }
        }
    }

    private boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            //Compare characters ignoring case
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }

            //Advance pointers
            l = l + 1;
            r = r - 1;
        }

        return true;
    }
}
