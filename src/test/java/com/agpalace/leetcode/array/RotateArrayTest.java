package com.agpalace.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RotateArrayTest {

    @Test
    public void rotate() {
        RotateArray array = new RotateArray();
        int[] nums = new int[]{1};
        array.rotate(nums, 1);
        assertArrayEquals(new int[]{1}, nums);
        array.rotate(nums, 4);
        assertArrayEquals(new int[]{1}, nums);
        nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        array.rotate(nums, 3);
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, nums);
        array.rotate(nums, 0);
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, nums);
        nums = new int[]{-1, -100, 3, 99};
        array.rotate(nums, 2);
        assertArrayEquals(new int[]{3, 99, -1, -100}, nums);
    }
}