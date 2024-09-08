package medium.bitwise.Q0371SumOfTwoIntegers;

/*

https://leetcode.com/problems/sum-of-two-integers/

 */

public class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            int tmp =  (a&b) << 1;  //Carry
            a = a^b;    //Sum
            b = tmp;
        }
        return a;
    }
}
