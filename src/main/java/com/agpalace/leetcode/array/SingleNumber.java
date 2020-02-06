package com.agpalace.leetcode.array;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }
}
