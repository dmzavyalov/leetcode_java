package medium.backtracking.Q0017LetterCombinationsOfAPhoneNumber;

import java.util.ArrayList;
import java.util.List;

/*

https://leetcode.com/problems/letter-combinations-of-a-phone-number/

Hash Table, String, Backtracking

Time: O(N * 4^N)

 */

public class Solution {
    private final char[][] map = new char[][]{
        {},                     // 0
        {},                     // 1
        {'a', 'b', 'c'},        // 2
        {'d', 'e', 'f'},        // 3
        {'g', 'h', 'i'},        // 4
        {'j', 'k', 'l'},        // 5
        {'m', 'n', 'o'},        // 6
        {'p', 'q', 'r', 's'},   // 7
        {'t', 'u', 'v'},        // 8
        {'w', 'x', 'y', 'z'}    // 9
    };

    private List<String> result;
    private String digits;

    public List<String> letterCombinations(String digits) {
        result = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return result;
        }

        this.digits = digits;

        backtrack(0, new StringBuilder());

        return result;
    }

    private void backtrack(int i, StringBuilder curStr) {
        if (curStr.length() == digits.length()) {   //Base case, mapped all digits
            result.add(curStr.toString());
            return;
        }

        var mappingsForDigit = this.map[this.digits.charAt(i) - '0'];
        for (char c: mappingsForDigit) {
            curStr.append(c);
            backtrack(i + 1, curStr);
            curStr.deleteCharAt(curStr.length() - 1);
        }
    }
}
