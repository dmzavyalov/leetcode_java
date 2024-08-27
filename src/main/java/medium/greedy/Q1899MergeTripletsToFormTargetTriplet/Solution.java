package medium.greedy.Q1899MergeTripletsToFormTargetTriplet;

/*

https://leetcode.com/problems/merge-triplets-to-form-target-triplet/

 */

public class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        boolean[] greedy = new boolean[3];

        for (int[] triplet : triplets) {
            boolean tripletHasValueLargerThanTarget = false;
            for (int i = 0; i < 3; i++) {
                if (triplet[i] > target[i]) {
                    tripletHasValueLargerThanTarget = true;
                }
            }

            if (tripletHasValueLargerThanTarget) {
                continue;   //Skip this triplet, it's not going to be included in the solution, if there is any
            }

            for (int i = 0; i < 3; i++) {
                if (triplet[i] == target[i]) {
                    greedy[i] = true;   //We may use this triplet to reach target in at least one position
                }
            }
        }

        return greedy[0] && greedy[1] && greedy[2];
    }
}
