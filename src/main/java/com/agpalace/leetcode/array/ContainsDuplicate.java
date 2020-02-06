package com.agpalace.leetcode.array;

import java.util.Arrays;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        return Arrays.stream(nums).distinct().count() != nums.length;
    }

}
