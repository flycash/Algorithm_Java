package com.agpalace.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class IntersectionOfArraysTest {

    @Test
    public void intersect() {
        IntersectionOfArrays arrays = new IntersectionOfArrays();
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};
        assertArrayEquals(new int[]{2, 2}, arrays.intersect(nums1, nums2));


        nums1 = new int[]{4, 9, 5};
        nums2 = new int[]{9, 4, 9, 8, 4};
        assertArrayEquals(new int[]{4, 9}, arrays.intersect(nums1, nums2));

        nums1 = new int[]{1, 2, 3};
        nums2 = new int[]{};

        assertArrayEquals(new int[]{}, arrays.intersect(nums1, nums2));
    }
}