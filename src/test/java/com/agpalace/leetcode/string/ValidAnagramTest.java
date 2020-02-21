package com.agpalace.leetcode.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidAnagramTest {

    @Test
    public void isAnagram() {
        ValidAnagram anagram = new ValidAnagram();
        assertFalse(anagram.isAnagram("a", "b"));
    }
}