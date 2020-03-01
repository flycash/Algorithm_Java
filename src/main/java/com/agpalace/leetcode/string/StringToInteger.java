package com.agpalace.leetcode.string;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/884/
 */
public class StringToInteger {

    public int myAtoi(String str) {
        long result = 0;
        int i = 0;

        boolean positive = true;
        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }

        if (i == str.length()) {
            return 0;
        }

        if (str.charAt(i) == '+') {
            i++;
        } else if (str.charAt(i) == '-') {
            i++;
            positive = false;
        }

        if (i == str.length()) {
            return 0;
        }

        while (i < str.length()
                && str.charAt(i) <= '9'
                && str.charAt(i) >= '0') {
            result = result * 10 + (str.charAt(i) - '0');
            if (positive && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (!positive && result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }

        if (!positive) {
            result = -result;
        }

        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) result;
    }
}
