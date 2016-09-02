package com.agpalace.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by dengming on 16/9/1.
 */
public class PerfectRectangleTest {

    private PerfectRectangle rectangle=new PerfectRectangle();

    @Test
    public void test1(){
        int[][] array={
                {1,1,3,3},
                {3,1,4,2},
                {3,2,4,4},
                {1,3,2,4},
                {2,3,3,4}
        };
        Assert.assertTrue(rectangle.isRectangleCover(array));
    }

    @Test
    public void test2(){
        int[][] array={
                {1,1,2,3},
                {1,3,2,4},
                {3,1,4,2},
                {3,2,4,4}
        };
        Assert.assertTrue(!rectangle.isRectangleCover(array));
    }

    @Test
    public void test3(){
        int[][] array={
                {1,1,3,3},
                {3,1,4,2},
                {1,3,2,4},
                {3,2,4,4}
        };
        Assert.assertTrue(!rectangle.isRectangleCover(array));
    }

    @Test
    public void test4(){
        int[][] array={
                {1,1,3,3},
                {3,1,4,2},
                {1,3,2,4},
                {2,2,4,4}
        };
        Assert.assertTrue(!rectangle.isRectangleCover(array));
    }
    
    @Test
    public void test5(){
        int [][] array={
                {0,0,4,1},
                {7,0,8,2},
                {6,2,8,3},
                {5,1,6,3},
                {4,0,5,1},
                {6,0,7,2},
                {4,2,5,3},
                {2,1,4,3},
                {0,1,2,2},
                {0,2,2,3},
                {4,1,5,2},
                {5,0,6,1}
        };
        Assert.assertTrue(!rectangle.isRectangleCover(array));
    }


}
