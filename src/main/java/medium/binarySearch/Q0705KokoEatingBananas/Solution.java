package medium.binarySearch.Q0705KokoEatingBananas;

/*

https://leetcode.com/problems/koko-eating-bananas/

Topics: Array, Binary Search

Time: O(log(max(piles)) * len(piles))
Space: O(1)

 */

public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (var p: piles) {
            if (p > max) {
                max = p;
            }
        }

        //A safe bet to start with
        //We can definitely finish in h hours if we eat a pile each hour
        //The task constraint guarantees that h >= piles.length
        var minK = max;

        int l = 0, r = max;
        while (l <= r) {
            int k = l + (r - l) / 2;
            int hours = 0;
            for (var p: piles) {
                //Koko needs at least an hour to eat a pile, round up
                hours += Math.ceil((double) p / k);
            }

            if (hours <= h) {
                minK = Math.min(minK, k);
                r = k - 1;
            } else {
                l = k + 1;
            }
        }

        return minK;
    }
}
