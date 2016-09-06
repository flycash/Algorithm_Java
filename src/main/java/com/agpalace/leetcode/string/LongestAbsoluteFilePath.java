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
    private int lastTNum = Integer.MIN_VALUE;
    private int max;

    public int lengthLongestPath(String input) {
        int index = input.length() - 1;
        while (index >= 0) {
            int nextN = findNextN(input, index);
            if (tNum + 1 != lastTNum) {
                clear(lastTNum+1);
            }
            if (isFile()) {
                handleFile();
            } else {
                handleDir();
            }

            if (tNum==0){
                max=Math.max(get(0), max);
            }

            index = nextN - 1;
        }
        return max;
    }

    private void handleFile() {
        int old=get(tNum);
        longest.put(tNum, Math.max(old, next.length()));
        lastTNum = tNum;
    }

    private void handleDir() {

        int downLevel = get(tNum + 1);
        int old = get(tNum);
        if (downLevel == 0) {
            longest.put(tNum, Math.max(old, 0));
        } else {
            int newL = next.length() + downLevel + 1;
            if (newL > old) {
                longest.put(tNum, newL);
            }

        }
        lastTNum = tNum;
    }

    private void clear(Integer start){
        for (Integer key: longest.keySet()){
            if (key>=start){
                longest.put(key, 0);
            }
        }
    }

    private boolean isFile() {
        return this.next.indexOf(".") != -1;
    }

    private int findNextN(String input, int index) {
        next.setLength(0);
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

    private int get(Integer key) {
        if (longest.get(key) == null) {
            return 0;
        } else {
            return longest.get(key);
        }
    }
}
