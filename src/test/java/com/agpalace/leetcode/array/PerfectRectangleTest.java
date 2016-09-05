package com.agpalace.leetcode.array;

import com.agpalace.util.FileUtil;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

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
        Assert.assertTrue(rectangle.isRectangleCover(array));
    }

    @Test
    public void test6() throws IOException {

        String file="src/test/resources/leetcode/PerfectRectangle.input.txt";
        StringBuilder builder= FileUtil.read(file);
        String[] input=getArray(builder);
        int[][] array=new int[input.length][4];
        for (int i=0; i<input.length; i++){
            array[i]=toArray(input[i]);
        }
        Assert.assertTrue(rectangle.isRectangleCover(array));
    }

    private int[] toArray(String array){
        String[] nums=array.split(",");
        int[] res=new int[nums.length];
        for (int i=0; i<nums.length; i++){
            res[i]=Integer.valueOf(nums[i]);
        }
        return res;
    }


    private String[] getArray(StringBuilder builder){
        builder.deleteCharAt(0);
        builder.deleteCharAt(builder.length()-1);
        String reg="],\\[";
        String[] input=builder.toString().split(reg);
        input[0]=input[0].substring(1);
        input[input.length-1]=input[input.length-1].substring(0,input[input.length-1].length()-1);
        return input;
    }
}
