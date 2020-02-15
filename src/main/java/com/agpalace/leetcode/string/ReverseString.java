package com.agpalace.leetcode.string;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/879/
 */
public class ReverseString {
    public void reverseString(char[] s) {
        int i = 0, j = s.length -1;
        while (i < j) {
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            i ++;
            j --;
        }
    }
}
