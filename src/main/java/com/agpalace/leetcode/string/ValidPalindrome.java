package com.agpalace.leetcode.string;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/883/
 */
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }
        int i = 0, j = s.length() - 1;

        while (i < j) {

            char x = format(s.charAt(i));


            if (x == 0) {
                i++;
                continue;
            }

            char y = format(s.charAt(j));

            if (y == 0) {
                j--;
                continue;
            }

            if (x != y) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    private char format(char x) {
        if ((x >= 48 && x <= 57) || (x >= 97 && x <= 122)) {
            return x;
        }

        if (x >= 65 && x <= 90) {
            return (char) (x + 32);
        }

        return 0;
    }
}
