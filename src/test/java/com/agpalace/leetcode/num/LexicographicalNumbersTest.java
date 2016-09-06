package com.agpalace.leetcode.num;

import org.junit.Test;

import java.util.List;

/**
 * Created by dengming on 16/9/6.
 */
public class LexicographicalNumbersTest {
    private LexicographicalNumbers numbers=new LexicographicalNumbers();

    @Test
    public void test(){
        List<Integer> res=numbers.lexicalOrder(200);
        System.out.println(res);
    }

}
