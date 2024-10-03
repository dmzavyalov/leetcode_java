package medium.math.Q0050Pow;

/*
https://leetcode.com/problems/powx-n/description/

Time: O(log n)

 */

public class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        else if (n < 0) {   //Make the negative n positive
            if (n % 2 == 0) {
                n = n / 2;
                n = -n;
                x = (1 / x) * (1 / x);
            }
            else {
                n = -n;
                x = 1 / x;
            }
        }
        if (n % 2 == 0) {   //Even
            return myPow(x * x, n / 2);
        } else { //Odd
            return x * myPow(x * x, n / 2);
        }
    }
}
