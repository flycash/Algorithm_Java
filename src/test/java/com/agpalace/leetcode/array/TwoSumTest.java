package com.agpalace.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {

    @Test
    public void twoSum() {
        TwoSum twoSum = new TwoSum();
        assertArrayEquals(new int[] {1, 2}, twoSum.twoSum(new int[]{3, 2, 4}, 6));
    }
}