package com.agpalace.leetcode.array;

/**
 * Created by flycash on 16/9/1.
 * question url:https://leetcode.com/problems/perfect-rectangle/
 */
public class PerfectRectangle {

    public boolean isRectangleCover(int[][] rectangles) {
        if (correectArea(rectangles)){
            //TODO
        }
        return false;
    }

    //whether the total areas can be square
    private boolean correectArea(int[][] rectangles){
        int area=calcaulateTotalArea(rectangles);
        return isSquare(area);
    }

    private boolean isSquare(int area) {
        for (int i=1; area>0; i+=2){
            area-=i;
        }
        return area==0;
    }

    private int calcaulateTotalArea(int[][] rectangles) {
        int total=0;
        for (int[] rectl: rectangles){
            total+=calcaulateArea(rectl);
        }
        return total;
    }

    private int calcaulateArea(int[] rectl) {
        return (rectl[3]-rectl[1])*(rectl[2]-rectl[0]);
    }
}
