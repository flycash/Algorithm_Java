package com.agpalace.leetcode.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dengming on 16/9/4.
 * https://leetcode.com/problems/longest-absolute-file-path/
 */
public class LongestAbsoluteFilePath {

    private Map<Integer, Integer> longest = new HashMap<Integer, Integer>();
    private int tNum = 0;
    private StringBuilder next = new StringBuilder();
    private int max = 0;
    private int lastTNum = Integer.MIN_VALUE;

    public int lengthLongestPath(String input) {
        int index = input.length() - 1;
        while (index >= 0) {
            int nextN = findNextN(input, index);
            if (isFile()) {
                setLength(tNum, max(longest.get(tNum), next.length()));
                lastTNum = tNum;
            } else {
                handleDir();
            }
            index = nextN - 1;
        }
        max = max(longest.get(0), max);
        return max;
    }

    private void handleDir() {
        if (tNum+1!=lastTNum){
            clear(tNum+1);
        }
        Integer downLevel = longest.get(tNum + 1);
        Integer old = longest.get(tNum);
        if (downLevel == null || downLevel == 0) {
            int tmp = old == null ? 0 : old;
            longest.put(tNum, tmp);
        } else {
            int newL = next.length() + downLevel + 1;
            if (old == null || old == 0) {
                longest.put(tNum, newL);
            } else {
                if (newL > old) {
                    longest.put(tNum, newL);
                }
            }
        }

        lastTNum = tNum;
        if (tNum == 0) {
            clear();
        }
    }

    private void clear(int i) {
        for (Integer key:longest.keySet()){
            if (key>=i){
                longest.put(key, 0);
            }
        }
    }

    private void clear() {
        Integer new0 = longest.get(0);
        max = max(new0, max);
        longest.clear();
    }

    private boolean isFile() {
        return this.next.indexOf(".") != -1;
    }

    private void setLength(int index, int length) {
        Integer origin = longest.get(index);
        if (origin == null) {
            longest.put(index, length);
        } else {
            int l = length > origin ? length : origin;
            longest.put(index, l);
        }
    }

    private int findNextN(String input, int index) {
        next.delete(0, next.length());
        tNum = 0;
        while (index >= 0) {
            char c = input.charAt(index);
            if (c == '\n') {
                break;
            } else if (c == '\t') {
                tNum++;
            } else {
                next.append(c);
            }
            index--;
        }
        return index;
    }

    private int max(Integer a, int b) {
        int a1 = a == null ? 0 : a;
        return Math.max(a1, b);
    }
}
