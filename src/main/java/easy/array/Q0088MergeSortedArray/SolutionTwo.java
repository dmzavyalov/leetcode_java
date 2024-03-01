package easy.array.Q0088MergeSortedArray;

/*

https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150

Topics: Array, Two Pointers, Sorting

Time: O(m+n)
Space: O(1)

Iterate backwards

 */

public class SolutionTwo {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pos1 = m - 1;
        int pos2 = n - 1;
        int insertPos = m + n - 1;

        while (pos2 >= 0) {
            if (pos1 >= 0 && nums1[pos1] > nums2[pos2]) {
                nums1[insertPos--] = nums1[pos1--];
            } else {
                nums1[insertPos--] = nums2[pos2--];
            }
        }
    }
}
