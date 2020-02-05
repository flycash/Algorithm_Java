package com.agpalace.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingleNumberTest {

    @Test
    public void singleNumber() {
        SingleNumber number = new SingleNumber();
        assertEquals(1, number.singleNumber(new int[]{2, 2, 1}));
        assertEquals(4, number.singleNumber(new int[]{4, 1, 2, 1, 2}));
    }
}