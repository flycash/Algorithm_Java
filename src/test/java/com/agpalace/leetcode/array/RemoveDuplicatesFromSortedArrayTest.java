package com.agpalace.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesFromSortedArrayTest {
    @Test
    public void removeDuplicates() {
        RemoveDuplicatesFromSortedArray array = new RemoveDuplicatesFromSortedArray();
        int[] nums = null;
        assertEquals(0, array.removeDuplicates(nums));

        nums = new int[]{1};
        assertEquals(1, array.removeDuplicates(nums));

        nums = new int[]{1, 1, 1, 2, 2, 2, 4, 5, 7, 10, 10, 11, 11, 12, 13};
        assertEquals(9, array.removeDuplicates(nums));
        assertEquals(1, nums[0]);
        assertEquals(2, nums[1]);
        assertEquals(4, nums[2]);
        assertEquals(5, nums[3]);
        assertEquals(7, nums[4]);
        assertEquals(10, nums[5]);
        assertEquals(11, nums[6]);
        assertEquals(12, nums[7]);
        assertEquals(13, nums[8]);
    }
}