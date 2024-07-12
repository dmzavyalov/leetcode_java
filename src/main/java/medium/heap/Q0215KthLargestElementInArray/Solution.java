package medium.heap.Q0215KthLargestElementInArray;

/*

https://leetcode.com/problems/kth-largest-element-in-an-array/

Array, Divide and Conquer, Sorting, Heap (Priority Queue), Quickselect

Sorting solution is O(n * log n)

Quick select is O(n) average, O(n^2) worst case
In the average case we expect what each partition divides the array equally
First pass - n elements, second pass n / 2, third n / 4, etc
This sequence adds up to 2 * n
 */

import java.util.Arrays;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];

//        return quickselect(nums, nums.length - k, 0, nums.length - 1);
    }

    /**
     * @param ik index of the k-th largest element
     * @return k-th largest element
     */
    private int quickselect(int[] nums, int ik, int l, int r) {
        var p = l;  //p is the pointer to the element that divides the array into partitions
        var pivot = nums[r];    //Choose the rightmost element as the pivot
        for (int i = l; i < r; i++) {   //Do not include the pivot element in iteration
            if (nums[i] <= pivot) { //Keep the element in the left partition
                var temp = nums[p];
                nums[p] = nums[i];
                nums[i] = temp;
                p++;    //Shift partition boundary one element to the right
            }
        }
        //By this point all elements that are less or equal than pivot are in the left partition
        //Now we move the pivot element to the partition divide
        var temp = nums[p];
        nums[p] = nums[r];
        nums[r] = temp;

        //Now we see where the partition divider stands in relation to the k-th element we're looking for
        if (p > ik) {
            return quickselect(nums, ik, l, p - 1);    //Look in the left portion of the partitioned array
        } else if (p < ik) {
            return quickselect(nums, ik, p + 1, r);     //Look on the right side
        } else {
            return nums[p]; //Found k-th element
        }
    }
}
