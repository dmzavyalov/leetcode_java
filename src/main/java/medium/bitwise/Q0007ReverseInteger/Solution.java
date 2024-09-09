package medium.bitwise.Q0007ReverseInteger;

/*

https://leetcode.com/problems/reverse-integer/

 */

public class Solution {
    public int reverse(int x) {
        boolean isNegative = x < 0;
        x = Math.abs(x);
        int num = 0;
        while (x > 0) {
            if (num > Integer.MAX_VALUE / 10) {
                return 0;
            }
            num = 10 * num + x % 10;
            x /= 10;
        }
        return isNegative ? -num : num;
    }
}
