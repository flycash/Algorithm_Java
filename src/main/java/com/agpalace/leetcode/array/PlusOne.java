package com.agpalace.leetcode.array;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/559/
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0 ; i -- ) {
            if (digits[i] < 9) {
                digits[i] ++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
