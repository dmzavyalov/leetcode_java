package easy.math.Q0202HappyNumber;

/*

https://leetcode.com/problems/happy-number/

 */


import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isHappy(int n) {
        if (n == 1 || n == -1) {
            return true;
        }

        Set<Integer> visited = new HashSet<>();

        while (!visited.contains(n)) {
            visited.add(n);
            n = sumOfSquares(n);
            if (n == 1) {
                return true;
            }
        }

        return false;
    }

    private int sumOfSquares(int n) {
        int res = 0;

        while (n != 0) {
            int digit = n % 10;
            digit = digit * digit;
            res += digit;
            n /= 10;
        }

        return res;
    }
}
