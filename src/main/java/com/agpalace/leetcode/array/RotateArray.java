package com.agpalace.leetcode.array;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        if (nums.length == 0 || k == 0) {
            return;
        }

        k = k % nums.length;
        int count = 0;
        for (int j = 0; j < k && count < nums.length ; j++) {
            int i = j;
            int current = nums[i];
            do {
                int next = (i + k) % nums.length;
                int tmp = nums[next];
                nums[next] = current;
                current = tmp;
                i = next;
                count ++;
            } while (i != j);
        }
    }

    public void rotate2(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length -1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public void reverse(int[] nums, int left, int right) {
        while (left <= right) {
            swap(nums, left ++, right --);
        }
    }
}
