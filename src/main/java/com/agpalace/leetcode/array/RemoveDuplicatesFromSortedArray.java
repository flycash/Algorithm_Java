package com.agpalace.leetcode.array;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int index = 1;
        int current = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int next = nums[i];
            if (next != current) {
                nums[index ++ ] = next;
                current = next;
            }

        }
        return index;
    }
}
