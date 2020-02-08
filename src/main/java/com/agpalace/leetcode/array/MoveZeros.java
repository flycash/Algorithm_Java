package com.agpalace.leetcode.array;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/567/
 */
public class MoveZeros {
    public void moveZeroes(int[] nums) {
        moveZero(0, 0, nums);
    }

    private void moveZero(int is, int js, int[] nums) {
        if (is > nums.length || js > nums.length) {
            return;
        }
        while (is < nums.length && nums[is] != 0) {
            is ++;
        }
        js = Math.max(js, is + 1);
        while (js < nums.length && nums[js] == 0) {
            js ++;
        }

        if (js < nums.length) {
            nums[is] = nums[is] ^ nums[js];
            nums[js] = nums[is] ^ nums[js];
            nums[is] = nums[is] ^ nums[js];
        }
        moveZero(is+1, js +1 , nums);
    }
}
