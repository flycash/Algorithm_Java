package com.agpalace.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by dengming on 16/9/4.
 */
public class FindDifferenceTest {
    private FindDifference findDifference=new FindDifference();
    @Test
    public void test(){
        String s="abc";
        String t="abcs";
        Assert.assertTrue(findDifference.findTheDifference(s, t)=='s');
    }

    @Test
    public void test1(){
        String s="abc";
        String t="sabc";
        Assert.assertTrue(findDifference.findTheDifference(s, t)=='s');
    }

    @Test
    public void test2(){
        String s="abc";
        String t="asbc";
        Assert.assertTrue(findDifference.findTheDifference(s, t)=='s');
    }

    @Test
    public void test3(){
        String s="abcde";
        String t="deasbc";
        Assert.assertTrue(findDifference.findTheDifference(s, t)=='s');
    }
}
