package com.agpalace.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by dengming on 16/9/6.Î
 */
public class FirstUniqueCharTest {
    private FirstUniqueChar firstUniqueChar=new FirstUniqueChar();
    @Test
    public void test(){
        test("leetcode", 0);
    }

    @Test
    public void test1(){
        test("loveleetcode", 2);
    }

    @Test
    public void test2(){
        test("ss", -1);
    }

    private void test(String s, int target){
        Assert.assertTrue(firstUniqueChar.firstUniqChar(s)==target);
    }

}
