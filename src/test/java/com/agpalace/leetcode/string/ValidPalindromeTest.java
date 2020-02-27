package com.agpalace.leetcode.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidPalindromeTest {

    @Test
    public void isPalindrome() {
        ValidPalindrome validPalindrome = new ValidPalindrome();

        assertTrue(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(validPalindrome.isPalindrome("race a car"));
    }
}