package com.agpalace.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BestTimeToBuyAndSellStock2Test {

    @Test
    public void maxProfit() {
        BestTimeToBuyAndSellStock2 stock2 = new BestTimeToBuyAndSellStock2();
        int[] prices = new int[]{1};
        int result = stock2.maxProfit(prices);
        assertEquals(result, 0);
        assertEquals(1, stock2.maxProfit(new int[]{1, 2}));
        assertEquals(8, stock2.maxProfit(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
        assertEquals(0, stock2.maxProfit(new int[]{3, 1}));
        assertEquals(0, stock2.maxProfit(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1}));
        assertEquals(7, stock2.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}