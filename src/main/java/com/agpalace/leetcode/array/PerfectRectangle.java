package com.agpalace.leetcode.array;

import java.util.HashSet;

/**
 * Created by flycash on 16/9/1.
 * question url:https://leetcode.com/problems/perfect-rectangle/
 * discuss: https://discuss.leetcode.com/topic/55923/o-n-solution-by-counting-corners-with-detailed-explaination
 *  and http://blog.csdn.net/mebiuw/article/details/52354018
 *
 */
public class PerfectRectangle {

    public boolean isRectangleCover(int[][] rectangles) {
        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;
        int top = Integer.MIN_VALUE;
        int bottom = Integer.MAX_VALUE;
        int n = rectangles.length;
        HashSet<String> flags = new HashSet<String>();
        int totalArea = 0;
        for(int i=0;i<n;i++){
            left = Math.min(left,rectangles[i][0]);
            bottom = Math.min(bottom,rectangles[i][1]);
            right = Math.max(right,rectangles[i][2]);
            top = Math.max(top,rectangles[i][3]);
            totalArea += (rectangles[i][3]-rectangles[i][1])*(rectangles[i][2]-rectangles[i][0]);
            String pointLT = rectangles[i][0] + " "+ rectangles[i][3];
            String pointLB = rectangles[i][0] + " "+ rectangles[i][1];
            String pointRT = rectangles[i][2] + " "+ rectangles[i][3];
            String pointRB = rectangles[i][2] + " "+ rectangles[i][1];
            if (!flags.contains(pointLT)) flags.add(pointLT); else flags.remove(pointLT);
            if (!flags.contains(pointLB)) flags.add(pointLB); else flags.remove(pointLB);
            if (!flags.contains(pointRT)) flags.add(pointRT); else flags.remove(pointRT);
            if (!flags.contains(pointRB)) flags.add(pointRB); else flags.remove(pointRB);
        }
        if(flags.size()==4 && flags.contains(left+" "+top) && flags.contains(left+" "+bottom) && flags.contains(right+" "+bottom) && flags.contains(right+" "+top)){
            return totalArea == (right - left) * (top - bottom);
        }
        return false;
    }
}

/**
 * this solution work, but exceeding time limit, my solution
 */
class PerfectRectangleSolution1{
    private boolean[][] region;
    private int[] vertex=new int[4];

    public boolean isRectangleCover(int[][] rectangles) {
        init(rectangles);
        for (int[] rec : rectangles) {
            if (!coverSquare(rec)) {
                return false;
            }
        }
        return validatedSquare();
    }

    private boolean validatedSquare() {
        for (boolean[] a : region) {
            for (boolean b : a) {
                if (!b) {
                    return false;
                }
            }
        }
        return true;
    }

    private void init(int[][] rectangles) {
        initSquare(rectangles);
        region = new boolean[vertex[3] - vertex[1]][vertex[2] - vertex[0]];
    }

    private void initSquare(int[][] rectangles) {
        vertex[0] = rectangles[0][0];
        vertex[1] = rectangles[0][1];
        vertex[2] = rectangles[0][2];
        vertex[3] = rectangles[0][3];
        for (int i = 0; i < rectangles.length; i++) {
            int[] rec = rectangles[i];
            if (vertex[0] >= rec[0] && vertex[1] >= rec[1]) {
                vertex[0] = rec[0];
                vertex[1] = rec[1];
            }

            if (vertex[2] <= rec[2] && vertex[3] <= rec[3]) {
                vertex[2] = rec[2];
                vertex[3] = rec[3];
            }
        }

    }

    private boolean coverSquare(int[] rect) {
        if (validatedRec(rect)) {
            int[] relatedIndex = translate(rect);
            return cover(relatedIndex);
        }
        return false;
    }

    private boolean cover(int[] relatedIndex) {
        for (int i = relatedIndex[0]; i < relatedIndex[2]; i++) {
            for (int j = relatedIndex[1]; j < relatedIndex[3]; j++) {
                if (region[j][i]) {
                    return false;
                } else {
                    region[j][i] = true;
                }
            }
        }
        return true;
    }

    //using the leftBtm as the origin point
    private int[] translate(int[] rect) {
        int[] res = new int[rect.length];
        res[0] = rect[0] - vertex[0];
        res[1] = rect[1] - vertex[1];
        res[2] = rect[2] - vertex[0];
        res[3] = rect[3] - vertex[1];
        return res;
    }

    private boolean validatedRec(int[] rect) {
        return rect[0] >= vertex[0]
                && rect[1] >= vertex[1]
                && rect[2] <= vertex[2]
                && rect[3] <= vertex[3];
    }
}