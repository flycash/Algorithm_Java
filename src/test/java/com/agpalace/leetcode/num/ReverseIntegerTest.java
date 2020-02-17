package com.agpalace.leetcode.num;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseIntegerTest {

    @Test
    public void reverse() {
        ReverseInteger ri = new ReverseInteger();
        assertEquals(321, ri.reverse(123));
        assertEquals(-321, ri.reverse(-123));
        assertEquals(1, ri.reverse(10));
        assertEquals(-1, ri.reverse(-10));
    }
}