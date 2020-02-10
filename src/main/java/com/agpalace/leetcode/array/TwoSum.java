package com.agpalace.leetcode.array;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/546/
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Set<Integer> ns = new HashSet<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            ns.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            int rest = target - nums[i];
            if (ns.contains(rest)) {
                for (int j = 0; j < nums.length; j++) {
                    if (rest == nums[j] && i != j) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return new int[]{-1, -1};
    }
}
