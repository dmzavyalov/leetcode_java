package easy.array.Q0088MergeSortedArray;

/*

https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150

Topics: Array, Two Pointers, Sorting

Time: O(m+n)
Space: O(m+n)

 */

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merged = new int[m+n];
        int insertPos = 0, pos1 = 0, pos2 = 0;

        while(insertPos < m + n) {
            if (pos1 >= m) {
                merged[insertPos++] = nums2[pos2++];
            } else if (pos2 >= n) {
                merged[insertPos++] = nums1[pos1++];
            } else {
                merged[insertPos++] = nums2[pos2] < nums1[pos1] ?
                    nums2[pos2++] : nums1[pos1++];
            }
        }

        System.arraycopy(merged, 0, nums1, 0, m + n);
    }
}
