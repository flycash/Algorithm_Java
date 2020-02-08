package com.agpalace.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoveZerosTest {

    @Test
    public void moveZeroes() {
        MoveZeros zeros = new MoveZeros();
        int[] nums = new int[]{1};
        zeros.moveZeroes(nums);
        assertArrayEquals(new int[]{1}, nums);

        nums = new int[]{0};
        zeros.moveZeroes(nums);
        assertArrayEquals(new int[]{0}, nums);

        nums = new int[]{1, 2, 3, 4, 5};
        zeros.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, nums);

        nums = new int[]{0, 0, 0, 0};
        zeros.moveZeroes(nums);
        assertArrayEquals(new int[]{0, 0, 0, 0}, nums);

        nums = new int[]{0, 0, 1, 2, 3};
        zeros.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 2, 3, 0, 0}, nums);

        nums = new int[]{1, 2, 3, 0, 0};
        zeros.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 2, 3, 0, 0}, nums);

        nums = new int[]{0,1,0,3,12};
        zeros.moveZeroes(nums);
        assertArrayEquals(new int[]{1,3,12,0,0}, nums);
    }
}