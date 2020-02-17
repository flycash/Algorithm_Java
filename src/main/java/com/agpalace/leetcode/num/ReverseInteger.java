package com.agpalace.leetcode.num;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/880/
 */
public class ReverseInteger {
    public int reverse(int x) {
        boolean neg = false;
        if (x < 0) {
            neg = true;
            x = -x;
        }
        long result = 0;
        while (x > 0) {
            int remain = x % 10;
            result = result * 10 + remain % 10;
            x = x / 10;
        }

        if (neg) {
            result = -result;
            if (result < Integer.MIN_VALUE) {
                return 0;
            }
        } else {
            if (result > Integer.MAX_VALUE) {
                return 0;
            }
        }
        return (int) result;
    }
}
