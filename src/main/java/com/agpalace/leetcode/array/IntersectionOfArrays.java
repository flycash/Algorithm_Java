package com.agpalace.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/
 */
public class IntersectionOfArrays {

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> result = new ArrayList<>(nums1.length * 2);
        int idx1 = 0;
        int idx2 = 0;
        while (idx1 < nums1.length && idx2 < nums2.length) {
            int x = nums1[idx1];
            int y = nums2[idx2];
            if (x == y) {
                result.add(x);
                idx1++;
                idx2++;
            } else if (x < y) {
                idx1++;
            } else {
                idx2++;
            }

        }

        int[] ret = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ret[i] = result.get(i);
        }
        return ret;
    }
}
