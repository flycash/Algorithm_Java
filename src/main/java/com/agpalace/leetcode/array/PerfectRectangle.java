package com.agpalace.leetcode.array;

/**
 * Created by flycash on 16/9/1.
 * question url:https://leetcode.com/problems/perfect-rectangle/
 */
public class PerfectRectangle {
    private boolean[][] region;
    private int[] leftBtm;
    private int[] rightTop;

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
        region = new boolean[rightTop[2] - leftBtm[0]][rightTop[3] - leftBtm[1]];
    }

    private void initSquare(int[][] rectangles) {
        int minX = rectangles[0][0];
        int minY = rectangles[0][1];
        int maxX = rectangles[0][2];
        int maxY = rectangles[0][3];
        for (int i = 0; i < rectangles.length; i++) {
            int[] rec = rectangles[i];
            if (minX >= rec[0] && minY >= rec[1]) {
                minX = rec[0];
                minY = rec[1];
                leftBtm = rec;
            }

            if (maxX <= rec[2] && maxY <= rec[3]) {
                maxX = rec[2];
                maxY = rec[3];
                rightTop = rec;
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
                if (region[i][j]) {
                    return false;
                } else {
                    region[i][j] = true;
                }
            }
        }
        return true;
    }

    //using the leftBtm as the origin point
    private int[] translate(int[] rect) {
        int[] res = new int[rect.length];
        res[0] = rect[0] - leftBtm[0];
        res[1] = rect[1] - leftBtm[1];
        res[2] = rect[2] - leftBtm[0];
        res[3] = rect[3] - leftBtm[1];
        return res;
    }

    private boolean validatedRec(int[] rect) {
        return rect[0] >= leftBtm[0]
                && rect[1] >= leftBtm[1]
                && rect[2] <= rightTop[2]
                && rect[3] <= rightTop[3];
    }
}
