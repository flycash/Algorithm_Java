package com.agpalace.leetcode.string;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ReverseStringTest {

    @Test
    public void reverseString() {
        ReverseString str = new ReverseString();
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
        str.reverseString(s);
        assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, s);
        s = new char[]{'a', 's', 'd', 'f'};
        str.reverseString(s);
        assertArrayEquals(new char[]{'f', 'd', 's', 'a'}, s);
    }
}